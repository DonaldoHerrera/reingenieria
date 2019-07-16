package defpackage;

import com.soundcloud.android.ads._c;

/* renamed from: xY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryWritableStorage_Factory */
public final class C3906xY implements C4961HMa<C3898wY> {
    private final C7054oVa<C3826nY> a;
    private final C7054oVa<_c> b;

    public C3906xY(C7054oVa<C3826nY> ova, C7054oVa<_c> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3906xY a(C7054oVa<C3826nY> ova, C7054oVa<_c> ova2) {
        return new C3906xY(ova, ova2);
    }

    public C3898wY get() {
        return new C3898wY((C3826nY) this.a.get(), (_c) this.b.get());
    }
}
