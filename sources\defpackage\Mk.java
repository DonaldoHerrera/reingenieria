package defpackage;

/* renamed from: Mk reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Mk implements Runnable {
    final /* synthetic */ Nk a;

    Mk(Nk nk) {
        this.a = nk;
    }

    public void run() {
        if (Pk.e.get() <= 0) {
            C0527cl.a(this.a.b, Pk.f, Pk.h);
            C0496bl.a();
            Pk.f = null;
        }
        synchronized (Pk.d) {
            Pk.c = null;
        }
    }
}
