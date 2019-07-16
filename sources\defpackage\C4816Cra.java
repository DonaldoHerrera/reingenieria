package defpackage;

import com.soundcloud.android.likes.C3989m;

/* renamed from: Cra reason: default package and case insensitive filesystem */
/* compiled from: PlaylistItemRepository_Factory */
public final class C4816Cra implements C4961HMa<C4785Bra> {
    private final C7054oVa<Fda> a;
    private final C7054oVa<C5425Wta> b;
    private final C7054oVa<C3989m> c;
    private final C7054oVa<C2210OR> d;
    private final C7054oVa<C3815lda> e;

    public C4816Cra(C7054oVa<Fda> ova, C7054oVa<C5425Wta> ova2, C7054oVa<C3989m> ova3, C7054oVa<C2210OR> ova4, C7054oVa<C3815lda> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C4816Cra a(C7054oVa<Fda> ova, C7054oVa<C5425Wta> ova2, C7054oVa<C3989m> ova3, C7054oVa<C2210OR> ova4, C7054oVa<C3815lda> ova5) {
        C4816Cra cra = new C4816Cra(ova, ova2, ova3, ova4, ova5);
        return cra;
    }

    public C4785Bra get() {
        C4785Bra bra = new C4785Bra((Fda) this.a.get(), (C5425Wta) this.b.get(), (C3989m) this.c.get(), (C2210OR) this.d.get(), (C3815lda) this.e.get());
        return bra;
    }
}
