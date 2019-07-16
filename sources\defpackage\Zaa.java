package defpackage;

import com.soundcloud.android.ads.Hc;

/* renamed from: Zaa reason: default package */
/* compiled from: UrlWithPlaceholderBuilder_Factory */
public final class Zaa implements C4961HMa<Yaa> {
    private final C7054oVa<C5694cGa> a;
    private final C7054oVa<C3844paa> b;
    private final C7054oVa<Hc> c;
    private final C7054oVa<C5495ZFa> d;
    private final C7054oVa<C3469VY> e;

    public Zaa(C7054oVa<C5694cGa> ova, C7054oVa<C3844paa> ova2, C7054oVa<Hc> ova3, C7054oVa<C5495ZFa> ova4, C7054oVa<C3469VY> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Zaa a(C7054oVa<C5694cGa> ova, C7054oVa<C3844paa> ova2, C7054oVa<Hc> ova3, C7054oVa<C5495ZFa> ova4, C7054oVa<C3469VY> ova5) {
        Zaa zaa = new Zaa(ova, ova2, ova3, ova4, ova5);
        return zaa;
    }

    public Yaa get() {
        Yaa yaa = new Yaa((C5694cGa) this.a.get(), (C3844paa) this.b.get(), (Hc) this.c.get(), (C5495ZFa) this.d.get(), (C3469VY) this.e.get());
        return yaa;
    }
}
