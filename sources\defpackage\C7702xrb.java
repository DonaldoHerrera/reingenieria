package defpackage;

import java.util.List;

/* renamed from: xrb reason: default package and case insensitive filesystem */
/* compiled from: MemberDeserializer.kt */
final class C7702xrb extends C7540vYa implements PXa<List<? extends C6315deb>> {
    final /* synthetic */ Crb a;
    final /* synthetic */ Wnb b;
    final /* synthetic */ Yqb c;

    C7702xrb(Crb crb, Wnb wnb, Yqb yqb) {
        this.a = crb;
        this.b = wnb;
        this.c = yqb;
        super(0);
    }

    public final List<C6315deb> d() {
        Crb crb = this.a;
        Frb a2 = crb.a(crb.b.c());
        List<C6315deb> q = a2 != null ? C7676xWa.q(this.a.b.a().b().a(a2, this.b, this.c)) : null;
        return q != null ? q : C6918mWa.a();
    }
}
