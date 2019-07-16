package defpackage;

import com.soundcloud.android.utilities.android.k;

/* renamed from: iL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideComScoreProviderFactory */
public final class C3052iL implements C4961HMa<C3035hN> {
    private final C7054oVa<C3054iN> a;
    private final C7054oVa<k> b;
    private final C7054oVa<C5495ZFa> c;
    private final C7054oVa<C3469VY> d;

    public C3052iL(C7054oVa<C3054iN> ova, C7054oVa<k> ova2, C7054oVa<C5495ZFa> ova3, C7054oVa<C3469VY> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3052iL a(C7054oVa<C3054iN> ova, C7054oVa<k> ova2, C7054oVa<C5495ZFa> ova3, C7054oVa<C3469VY> ova4) {
        return new C3052iL(ova, ova2, ova3, ova4);
    }

    public static C3035hN a(C3054iN iNVar, k kVar, C5495ZFa zFa, C3469VY vy) {
        return C2995fL.a(iNVar, kVar, zFa, vy);
    }

    public C3035hN get() {
        return a((C3054iN) this.a.get(), (k) this.b.get(), (C5495ZFa) this.c.get(), (C3469VY) this.d.get());
    }
}
