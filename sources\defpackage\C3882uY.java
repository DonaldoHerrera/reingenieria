package defpackage;

import com.soundcloud.android.ads._c;

/* renamed from: uY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryReadableStorage_Factory */
public final class C3882uY implements C4961HMa<C3874tY> {
    private final C7054oVa<C3826nY> a;
    private final C7054oVa<_c> b;

    public C3882uY(C7054oVa<C3826nY> ova, C7054oVa<_c> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3882uY a(C7054oVa<C3826nY> ova, C7054oVa<_c> ova2) {
        return new C3882uY(ova, ova2);
    }

    public C3874tY get() {
        return new C3874tY((C3826nY) this.a.get(), (_c) this.b.get());
    }
}
