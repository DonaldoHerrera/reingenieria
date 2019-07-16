package defpackage;

import com.soundcloud.android.properties.a;

/* renamed from: Bca reason: default package */
/* compiled from: UpsellHeaderFeature_Factory */
public final class Bca implements C4961HMa<Aca> {
    private final C7054oVa<a> a;
    private final C7054oVa<C2436_U> b;

    public Bca(C7054oVa<a> ova, C7054oVa<C2436_U> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static Bca a(C7054oVa<a> ova, C7054oVa<C2436_U> ova2) {
        return new Bca(ova, ova2);
    }

    public Aca get() {
        return new Aca((a) this.a.get(), (C2436_U) this.b.get());
    }
}
