package defpackage;

import com.soundcloud.android.ads.Na;

/* renamed from: dN reason: default package and case insensitive filesystem */
/* compiled from: AppboyPlaySessionState_Factory */
public final class C2959dN implements C4961HMa<C2486cN> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3814lca> b;
    private final C7054oVa<Na> c;

    public C2959dN(C7054oVa<C5327TLa> ova, C7054oVa<C3814lca> ova2, C7054oVa<Na> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2959dN a(C7054oVa<C5327TLa> ova, C7054oVa<C3814lca> ova2, C7054oVa<Na> ova3) {
        return new C2959dN(ova, ova2, ova3);
    }

    public C2486cN get() {
        return new C2486cN((C5327TLa) this.a.get(), (C3814lca) this.b.get(), (Na) this.c.get());
    }
}
