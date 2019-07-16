package defpackage;

/* renamed from: Kk reason: default package */
/* compiled from: ActivityLifecycleTracker */
class Kk implements Runnable {
    final /* synthetic */ long a;
    final /* synthetic */ String b;

    Kk(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public void run() {
        if (Pk.f == null) {
            Pk.f = new C0496bl(Long.valueOf(this.a), null);
            C0527cl.a(this.b, (C1238dl) null, Pk.h);
        } else if (Pk.f.e() != null) {
            long longValue = this.a - Pk.f.e().longValue();
            if (longValue > ((long) (Pk.r() * 1000))) {
                C0527cl.a(this.b, Pk.f, Pk.h);
                C0527cl.a(this.b, (C1238dl) null, Pk.h);
                Pk.f = new C0496bl(Long.valueOf(this.a), null);
            } else if (longValue > 1000) {
                Pk.f.i();
            }
        }
        Pk.f.a(Long.valueOf(this.a));
        Pk.f.j();
    }
}
