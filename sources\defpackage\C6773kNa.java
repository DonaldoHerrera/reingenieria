package defpackage;

/* renamed from: kNa reason: default package and case insensitive filesystem */
/* compiled from: AdvertisingInfoProvider */
class C6773kNa extends C7253rNa {
    final /* synthetic */ C6705jNa a;
    final /* synthetic */ C6841lNa b;

    C6773kNa(C6841lNa lna, C6705jNa jna) {
        this.b = lna;
        this.a = jna;
    }

    public void a() {
        C6705jNa a2 = this.b.e();
        if (!this.a.equals(a2)) {
            C5328TMa.e().d("Fabric", "Asychronously getting Advertising Info and storing it to preferences");
            this.b.c(a2);
        }
    }
}
