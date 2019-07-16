package defpackage;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import com.facebook.internal.T;
import java.util.TimerTask;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: wk reason: default package and case insensitive filesystem */
/* compiled from: ViewIndexer */
class C1816wk extends TimerTask {
    final /* synthetic */ Activity a;
    final /* synthetic */ String b;
    final /* synthetic */ Ak c;

    C1816wk(Ak ak, Activity activity, String str) {
        this.c = ak;
        this.a = activity;
        this.b = str;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006d */
    public void run() {
        String str;
        try {
            View rootView = this.a.getWindow().getDecorView().getRootView();
            if (Pk.o()) {
                if (T.b()) {
                    Gk.a();
                    return;
                }
                FutureTask futureTask = new FutureTask(new a(rootView));
                this.c.c.post(futureTask);
                String str2 = "";
                try {
                    str = (String) futureTask.get(1, TimeUnit.SECONDS);
                } catch (Exception e) {
                    Log.e(Ak.a, "Failed to take screenshot.", e);
                    str = str2;
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("screenname", this.b);
                jSONObject.put("screenshot", str);
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(Hk.c(rootView));
                jSONObject.put("view", jSONArray);
                Log.e(Ak.a, "Failed to create JSONObject");
                this.c.a(jSONObject.toString());
            }
        } catch (Exception e2) {
            Log.e(Ak.a, "UI Component tree indexing failure!", e2);
        }
    }
}
