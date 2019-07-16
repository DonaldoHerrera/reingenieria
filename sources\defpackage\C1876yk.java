package defpackage;

import android.util.Log;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.GraphRequest;
import com.facebook.L;
import com.facebook.O;
import com.facebook.internal.W;
import com.facebook.internal.ia;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: yk reason: default package and case insensitive filesystem */
/* compiled from: ViewIndexer */
class C1876yk implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ Ak b;

    C1876yk(Ak ak, String str) {
        this.b = ak;
        this.a = str;
    }

    public void run() {
        String str = "is_app_indexing_enabled";
        String c = ia.c(this.a);
        AccessToken c2 = AccessToken.c();
        if (c == null || !c.equals(this.b.f)) {
            GraphRequest a2 = Ak.a(this.a, c2, B.f(), "app_indexing");
            if (a2 != null) {
                L b2 = a2.b();
                try {
                    JSONObject b3 = b2.b();
                    if (b3 != null) {
                        if ("true".equals(b3.optString("success"))) {
                            W.a(O.APP_EVENTS, Ak.a, "Successfully send UI component tree to server");
                            this.b.f = c;
                        }
                        if (b3.has(str)) {
                            Pk.c(Boolean.valueOf(b3.getBoolean(str)));
                        }
                    } else {
                        String a3 = Ak.a;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error sending UI component tree to Facebook: ");
                        sb.append(b2.a());
                        Log.e(a3, sb.toString());
                    }
                } catch (JSONException e) {
                    Log.e(Ak.a, "Error decoding server response.", e);
                }
            }
        }
    }
}
