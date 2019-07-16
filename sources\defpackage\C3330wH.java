package defpackage;

import android.os.AsyncTask;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* renamed from: wH reason: default package and case insensitive filesystem */
public abstract class C3330wH extends AsyncTask<Object, Void, String> {
    private a a;
    protected final b b;

    /* renamed from: wH$a */
    public interface a {
        void a(C3330wH wHVar);
    }

    /* renamed from: wH$b */
    public interface b {
        void a(JSONObject jSONObject);

        JSONObject b();
    }

    public C3330wH(b bVar) {
        this.b = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void onPostExecute(String str) {
        a aVar = this.a;
        if (aVar != null) {
            aVar.a(this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        executeOnExecutor(threadPoolExecutor, new Object[0]);
    }

    public void a(a aVar) {
        this.a = aVar;
    }
}
