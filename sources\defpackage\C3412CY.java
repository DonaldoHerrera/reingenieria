package defpackage;

/* renamed from: CY reason: default package and case insensitive filesystem */
/* compiled from: PromotedTrackCardMapper.kt */
public final class C3412CY {
    public static final C3412CY a = new C3412CY();

    private C3412CY() {
    }

    @NXa
    public static final c a(C3409BY by, C3509cea cea, C3784hea hea, boolean z) {
        C7471uYa.b(by, "entity");
        C7471uYa.b(cea, "track");
        c cVar = new c(by.c(), by.a(), cea.w(), cea.f(), cea.g(), cea.k(), new C3879tda(by.e(), by.d(), hea != null ? a.a(hea) : null, z));
        return cVar;
    }

    private final C3895vda a(C3784hea hea) {
        return new C3895vda(hea.a, hea.c, hea.l);
    }
}
