package defpackage;

import com.soundcloud.android.accounts.H;

/* renamed from: eBa reason: default package and case insensitive filesystem */
/* compiled from: MeSyncer_Factory */
public final class C6350eBa implements C4961HMa<C5618bBa> {
    private final C7054oVa<dfa> a;
    private final C7054oVa<C5327TLa> b;
    private final C7054oVa<H> c;

    public C6350eBa(C7054oVa<dfa> ova, C7054oVa<C5327TLa> ova2, C7054oVa<H> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C6350eBa a(C7054oVa<dfa> ova, C7054oVa<C5327TLa> ova2, C7054oVa<H> ova3) {
        return new C6350eBa(ova, ova2, ova3);
    }

    public C5618bBa get() {
        return new C5618bBa((dfa) this.a.get(), (C5327TLa) this.b.get(), (H) this.c.get());
    }
}
