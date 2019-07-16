package defpackage;

import com.soundcloud.android.sync.C6135s;

/* renamed from: SBa reason: default package and case insensitive filesystem */
/* compiled from: SinglePlaylistSyncerFactory */
public class C5287SBa {
    private final C7054oVa<C7238rBa> a;
    private final dfa b;
    private final Fda c;
    private final Hda d;
    private final C5128Msa e;
    private final C3768fea f;
    private final C6332dsa g;
    private final C5327TLa h;
    private C6135s i;
    private final C7054oVa<C5075LBa> j;

    public C5287SBa(C7054oVa<C7238rBa> ova, dfa dfa, Fda fda, Hda hda, C5128Msa msa, C3768fea fea, C6332dsa dsa, C7054oVa<C5075LBa> ova2, C5327TLa tLa, C6135s sVar) {
        this.a = ova;
        this.b = dfa;
        this.c = fda;
        this.g = dsa;
        this.d = hda;
        this.e = msa;
        this.f = fea;
        this.j = ova2;
        this.h = tLa;
        this.i = sVar;
    }

    public C5257RBa a(C3508cda cda) {
        C5257RBa rBa = new C5257RBa(cda, this.e, (C7238rBa) ((C7238rBa) this.a.get()).a(cda), this.b, this.f, this.c, this.d, ((C5075LBa) this.j.get()).a(cda), this.g, this.h, this.i);
        return rBa;
    }
}
