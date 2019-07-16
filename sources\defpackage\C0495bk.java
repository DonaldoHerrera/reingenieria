package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.adjust.sdk.Constants;
import com.facebook.AccessToken;
import com.facebook.B;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.b;
import com.facebook.L;
import com.facebook.O;
import com.facebook.internal.A;
import com.facebook.internal.E;
import com.facebook.internal.W;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bk reason: default package and case insensitive filesystem */
/* compiled from: AppEventQueue */
class C0495bk {
    private static final String a = "bk";
    /* access modifiers changed from: private */
    public static volatile Vj b = new Vj();
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService c = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static ScheduledFuture d;
    /* access modifiers changed from: private */
    public static final Runnable e = new Wj();

    public static Set<Qj> e() {
        return b.b();
    }

    public static void f() {
        c.execute(new Xj());
    }

    static void b(C1360hk hkVar) {
        b.a(C0526ck.a());
        try {
            C1421jk a2 = a(hkVar, b);
            if (a2 != null) {
                Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", a2.a);
                intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", a2.b);
                C1600pd.a(B.e()).a(intent);
            }
        } catch (Exception e2) {
            Log.w(a, "Caught unexpected exception while flushing app events: ", e2);
        }
    }

    public static void a(C1360hk hkVar) {
        c.execute(new Yj(hkVar));
    }

    public static void a(Qj qj, Uj uj) {
        c.execute(new Zj(qj, uj));
    }

    private static C1421jk a(C1360hk hkVar, Vj vj) {
        C1421jk jkVar = new C1421jk();
        boolean a2 = B.a(B.e());
        ArrayList<GraphRequest> arrayList = new ArrayList<>();
        for (Qj qj : vj.b()) {
            GraphRequest a3 = a(qj, vj.a(qj), a2, jkVar);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        if (arrayList.size() <= 0) {
            return null;
        }
        W.a(O.APP_EVENTS, a, "Flushing %d events due to %s.", Integer.valueOf(jkVar.a), hkVar.toString());
        for (GraphRequest b2 : arrayList) {
            b2.b();
        }
        return jkVar;
    }

    /* access modifiers changed from: private */
    public static void b(Qj qj, GraphRequest graphRequest, L l, C1545nk nkVar, C1421jk jkVar) {
        String str;
        String str2;
        FacebookRequestError a2 = l.a();
        C1390ik ikVar = C1390ik.SUCCESS;
        boolean z = true;
        if (a2 == null) {
            str = "Success";
        } else if (a2.b() == -1) {
            ikVar = C1390ik.NO_CONNECTIVITY;
            str = "Failed: No Connectivity";
        } else {
            str = String.format("Failed:\n  Response: %s\n  Error %s", new Object[]{l.toString(), a2.toString()});
            ikVar = C1390ik.SERVER_ERROR;
        }
        if (B.a(O.APP_EVENTS)) {
            try {
                str2 = new JSONArray((String) graphRequest.k()).toString(2);
            } catch (JSONException unused) {
                str2 = "<Can't encode events for debug logging>";
            }
            W.a(O.APP_EVENTS, a, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", graphRequest.f().toString(), str, str2);
        }
        if (a2 == null) {
            z = false;
        }
        nkVar.a(z);
        if (ikVar == C1390ik.NO_CONNECTIVITY) {
            B.m().execute(new C0310ak(qj, nkVar));
        }
        if (ikVar != C1390ik.SUCCESS && jkVar.b != C1390ik.NO_CONNECTIVITY) {
            jkVar.b = ikVar;
        }
    }

    private static GraphRequest a(Qj qj, C1545nk nkVar, boolean z, C1421jk jkVar) {
        String b2 = qj.b();
        boolean z2 = false;
        A a2 = E.a(b2, false);
        GraphRequest a3 = GraphRequest.a((AccessToken) null, String.format("%s/activities", new Object[]{b2}), (JSONObject) null, (b) null);
        Bundle i = a3.i();
        if (i == null) {
            i = new Bundle();
        }
        i.putString("access_token", qj.a());
        String d2 = C1452kk.d();
        if (d2 != null) {
            i.putString("device_token", d2);
        }
        String e2 = C1329gk.e();
        if (e2 != null) {
            i.putString(Constants.INSTALL_REFERRER, e2);
        }
        a3.a(i);
        if (a2 != null) {
            z2 = a2.l();
        }
        int a4 = nkVar.a(a3, B.e(), z2, z);
        if (a4 == 0) {
            return null;
        }
        jkVar.a += a4;
        a3.a((b) new _j(qj, a3, nkVar, jkVar));
        return a3;
    }
}
