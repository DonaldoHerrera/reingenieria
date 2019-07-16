package defpackage;

import java.util.List;

/* renamed from: yrb reason: default package and case insensitive filesystem */
/* compiled from: MemberDeserializer.kt */
final class C7771yrb extends C7540vYa implements PXa<List<? extends C6315deb>> {
    final /* synthetic */ Crb a;
    final /* synthetic */ boolean b;
    final /* synthetic */ Olb c;

    C7771yrb(Crb crb, boolean z, Olb olb) {
        this.a = crb;
        this.b = z;
        this.c = olb;
        super(0);
    }

    public final List<C6315deb> d() {
        Crb crb = this.a;
        Frb a2 = crb.a(crb.b.c());
        List<C6315deb> list = a2 != null ? this.b ? C7676xWa.q(this.a.b.a().b().b(a2, this.c)) : C7676xWa.q(this.a.b.a().b().a(a2, this.c)) : null;
        return list != null ? list : C6918mWa.a();
    }
}
