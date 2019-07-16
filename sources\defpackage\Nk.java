package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: Nk reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Nk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ String b;

    Nk(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public void run() {
        if (Pk.f == null) {
            Pk.f = new C0496bl(Long.valueOf(this.a), null);
        }
        Pk.f.a(Long.valueOf(this.a));
        if (Pk.e.get() <= 0) {
            Mk mk = new Mk(this);
            synchronized (Pk.d) {
                Pk.c = Pk.b.schedule(mk, (long) Pk.r(), TimeUnit.SECONDS);
            }
        }
        long b2 = Pk.i;
        long j = 0;
        if (b2 > 0) {
            j = (this.a - b2) / 1000;
        }
        Uk.a(this.b, j);
        Pk.f.j();
    }
}
