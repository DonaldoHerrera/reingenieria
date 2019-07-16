package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: Zj reason: default package */
/* compiled from: AppEventQueue */
class Zj implements Runnable {
    final /* synthetic */ Qj a;
    final /* synthetic */ Uj b;

    Zj(Qj qj, Uj uj) {
        this.a = qj;
        this.b = uj;
    }

    public void run() {
        C0495bk.b.a(this.a, this.b);
        if (C1237dk.b() != a.EXPLICIT_ONLY && C0495bk.b.a() > 100) {
            C0495bk.b(C1360hk.EVENT_THRESHOLD);
        } else if (C0495bk.d == null) {
            C0495bk.d = C0495bk.c.schedule(C0495bk.e, 15, TimeUnit.SECONDS);
        }
    }
}
