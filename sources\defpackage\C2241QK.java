package defpackage;

import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.properties.a;

/* renamed from: QK reason: default package and case insensitive filesystem */
/* compiled from: AdAnalyticsModule_ProvidesOMAdViewabilityControllerFactory */
public final class C2241QK implements C4961HMa<C3678e> {
    private final C2165MK a;
    private final C7054oVa<a> b;
    private final C7054oVa<C3050iJ> c;

    public C2241QK(C2165MK mk, C7054oVa<a> ova, C7054oVa<C3050iJ> ova2) {
        this.a = mk;
        this.b = ova;
        this.c = ova2;
    }

    public static C2241QK a(C2165MK mk, C7054oVa<a> ova, C7054oVa<C3050iJ> ova2) {
        return new C2241QK(mk, ova, ova2);
    }

    public static C3678e a(C2165MK mk, a aVar, C7054oVa<C3050iJ> ova) {
        C3678e a2 = mk.a(aVar, ova);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3678e get() {
        return a(this.a, (a) this.b.get(), this.c);
    }
}
