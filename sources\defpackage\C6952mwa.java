package defpackage;

import com.soundcloud.android.collections.data.K;

/* renamed from: mwa reason: default package and case insensitive filesystem */
/* compiled from: LocalSearchSuggestionOperations_Factory */
public final class C6952mwa implements C4961HMa<C6884lwa> {
    private final C7054oVa<K> a;
    private final C7054oVa<C4942Gta> b;
    private final C7054oVa<C3760eea> c;
    private final C7054oVa<Fda> d;
    private final C7054oVa<Cba> e;
    private final C7054oVa<C3792iea> f;

    public C6952mwa(C7054oVa<K> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C3760eea> ova3, C7054oVa<Fda> ova4, C7054oVa<Cba> ova5, C7054oVa<C3792iea> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C6952mwa a(C7054oVa<K> ova, C7054oVa<C4942Gta> ova2, C7054oVa<C3760eea> ova3, C7054oVa<Fda> ova4, C7054oVa<Cba> ova5, C7054oVa<C3792iea> ova6) {
        C6952mwa mwa = new C6952mwa(ova, ova2, ova3, ova4, ova5, ova6);
        return mwa;
    }

    public C6884lwa get() {
        C6884lwa lwa = new C6884lwa((K) this.a.get(), (C4942Gta) this.b.get(), (C3760eea) this.c.get(), (Fda) this.d.get(), (Cba) this.e.get(), (C3792iea) this.f.get());
        return lwa;
    }
}
