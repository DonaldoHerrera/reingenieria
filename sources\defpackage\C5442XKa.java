package defpackage;

/* renamed from: XKa reason: default package and case insensitive filesystem */
/* compiled from: PropellerDatabase */
class C5442XKa extends a {
    final /* synthetic */ C5236QKa b;
    final /* synthetic */ String c;
    final /* synthetic */ C5054KLa d;
    final /* synthetic */ int e;
    final /* synthetic */ C5500ZKa f;

    C5442XKa(C5500ZKa zKa, C5236QKa qKa, String str, C5054KLa kLa, int i) {
        this.f = zKa;
        this.b = qKa;
        this.c = str;
        this.d = kLa;
        this.e = i;
    }

    public void b(C5500ZKa zKa) {
        while (!this.b.b()) {
            long nanoTime = System.nanoTime();
            this.f.a.a(this.c, this.d);
            C5413WKa a = this.f.a(this.b.a(), this.c, this.d, this.e);
            a(a);
            this.f.a.a(this.c, this.d, a.b(), System.nanoTime() - nanoTime);
            zKa.b();
        }
    }
}
