package defpackage;

/* renamed from: cpb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorEquivalenceForOverrides.kt */
final class C6259cpb implements a {
    final /* synthetic */ C4904Fcb a;
    final /* synthetic */ C4904Fcb b;

    C6259cpb(C4904Fcb fcb, C4904Fcb fcb2) {
        this.a = fcb;
        this.b = fcb2;
    }

    /* renamed from: b */
    public final boolean a(Ptb ptb, Ptb ptb2) {
        C7471uYa.b(ptb, "c1");
        C7471uYa.b(ptb2, "c2");
        if (C7471uYa.a((Object) ptb, (Object) ptb2)) {
            return true;
        }
        C5122Mcb c = ptb.c();
        C5122Mcb c2 = ptb2.c();
        if (!(c instanceof C4905Fdb) || !(c2 instanceof C4905Fdb)) {
            return false;
        }
        return C6395epb.a.a((C4905Fdb) c, (C4905Fdb) c2, (C6308dYa<? super C5272Rcb, ? super C5272Rcb, Boolean>) new C5663bpb<Object,Object,Boolean>(this));
    }
}
