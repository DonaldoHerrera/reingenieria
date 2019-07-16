package defpackage;

import com.soundcloud.android.foundation.ads.C3678e;

/* renamed from: PK reason: default package and case insensitive filesystem */
/* compiled from: AdAnalyticsModule_ProvidesMoatAdViewabilityControllerFactory */
public final class C2222PK implements C4961HMa<C3678e> {
    private final C7054oVa<C3331wI> a;

    public C2222PK(C7054oVa<C3331wI> ova) {
        this.a = ova;
    }

    public static C2222PK a(C7054oVa<C3331wI> ova) {
        return new C2222PK(ova);
    }

    public static C3678e b(C7054oVa<C3331wI> ova) {
        C3678e a2 = C2165MK.a(ova);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3678e get() {
        return b(this.a);
    }
}
