package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: uH reason: default package and case insensitive filesystem */
public class C3290uH implements defpackage.C2461bH.a {
    private static C3290uH a = new C3290uH();
    private static Handler b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */
    public static Handler c = null;
    /* access modifiers changed from: private */
    public static final Runnable d = new C3250sH();
    /* access modifiers changed from: private */
    public static final Runnable e = new C3270tH();
    private List<a> f = new ArrayList();
    private int g;
    private C2480cH h = new C2480cH();
    private C1947BH i = new C1947BH();
    /* access modifiers changed from: private */
    public C1967CH j = new C1967CH(new C3350xH());
    private double k;

    /* renamed from: uH$a */
    public interface a {
        void a(int i, long j);
    }

    C3290uH() {
    }

    private void a(long j2) {
        if (this.f.size() > 0) {
            for (a a2 : this.f) {
                a2.a(this.g, j2);
            }
        }
    }

    private void a(View view, C2461bH bHVar, JSONObject jSONObject, C1987DH dh) {
        bHVar.a(view, jSONObject, this, dh == C1987DH.PARENT_VIEW);
    }

    private boolean a(View view, JSONObject jSONObject) {
        String a2 = this.i.a(view);
        if (a2 == null) {
            return false;
        }
        C3010gH.a(jSONObject, a2);
        this.i.e();
        return true;
    }

    private void b(View view, JSONObject jSONObject) {
        ArrayList b2 = this.i.b(view);
        if (b2 != null) {
            C3010gH.a(jSONObject, (List<String>) b2);
        }
    }

    public static C3290uH h() {
        return a;
    }

    /* access modifiers changed from: private */
    public void i() {
        j();
        d();
        k();
    }

    private void j() {
        this.g = 0;
        this.k = C3048iH.a();
    }

    private void k() {
        a((long) (C3048iH.a() - this.k));
    }

    private void l() {
        if (c == null) {
            c = new Handler(Looper.getMainLooper());
            c.post(d);
            c.postDelayed(e, 200);
        }
    }

    private void m() {
        Handler handler = c;
        if (handler != null) {
            handler.removeCallbacks(e);
            c = null;
        }
    }

    public void a() {
        l();
    }

    public void a(View view, C2461bH bHVar, JSONObject jSONObject) {
        if (C3086kH.d(view)) {
            C1987DH c2 = this.i.c(view);
            if (c2 != C1987DH.UNDERLYING_VIEW) {
                JSONObject a2 = bHVar.a(view);
                C3010gH.a(jSONObject, a2);
                if (!a(view, a2)) {
                    b(view, a2);
                    a(view, bHVar, a2, c2);
                }
                this.g++;
            }
        }
    }

    public void b() {
        c();
        this.f.clear();
        b.post(new C3230rH(this));
    }

    public void c() {
        m();
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        this.i.c();
        double a2 = C3048iH.a();
        C2461bH a3 = this.h.a();
        if (this.i.b().size() > 0) {
            this.j.b(a3.a(null), this.i.b(), a2);
        }
        if (this.i.a().size() > 0) {
            JSONObject a4 = a3.a(null);
            a(null, a3, a4, C1987DH.PARENT_VIEW);
            C3010gH.a(a4);
            this.j.a(a4, this.i.a(), a2);
        } else {
            this.j.a();
        }
        this.i.d();
    }
}
