package defpackage;

import com.soundcloud.android.accounts.C2526g;

/* renamed from: vwa reason: default package and case insensitive filesystem */
/* compiled from: SearchSuggestionOperations_Factory */
public final class C7573vwa implements C4961HMa<C7504uwa> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;
    private final C7054oVa<C6884lwa> c;
    private final C7054oVa<C2526g> d;
    private final C7054oVa<C7228qwa> e;

    public C7573vwa(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C6884lwa> ova3, C7054oVa<C2526g> ova4, C7054oVa<C7228qwa> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C7573vwa a(C7054oVa<efa> ova, C7054oVa<HPa> ova2, C7054oVa<C6884lwa> ova3, C7054oVa<C2526g> ova4, C7054oVa<C7228qwa> ova5) {
        C7573vwa vwa = new C7573vwa(ova, ova2, ova3, ova4, ova5);
        return vwa;
    }

    public C7504uwa get() {
        C7504uwa uwa = new C7504uwa((efa) this.a.get(), (HPa) this.b.get(), (C6884lwa) this.c.get(), (C2526g) this.d.get(), (C7228qwa) this.e.get());
        return uwa;
    }
}
