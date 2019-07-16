package defpackage;

import java.util.List;

/* renamed from: zrb reason: default package and case insensitive filesystem */
/* compiled from: MemberDeserializer.kt */
final class C7840zrb extends C7540vYa implements PXa<List<? extends C6315deb>> {
    final /* synthetic */ Crb a;
    final /* synthetic */ Wnb b;
    final /* synthetic */ Yqb c;

    C7840zrb(Crb crb, Wnb wnb, Yqb yqb) {
        this.a = crb;
        this.b = wnb;
        this.c = yqb;
        super(0);
    }

    public final List<C6315deb> d() {
        Crb crb = this.a;
        Frb a2 = crb.a(crb.b.c());
        List<C6315deb> b2 = a2 != null ? this.a.b.a().b().b(a2, this.b, this.c) : null;
        return b2 != null ? b2 : C6918mWa.a();
    }
}
