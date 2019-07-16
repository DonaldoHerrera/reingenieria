package defpackage;

import java.util.LinkedHashSet;

/* renamed from: jqb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorUtils.kt */
final class C6737jqb extends C7540vYa implements C6308dYa<Eqb, Boolean, RVa> {
    final /* synthetic */ C5029Jcb a;
    final /* synthetic */ LinkedHashSet b;

    C6737jqb(C5029Jcb jcb, LinkedHashSet linkedHashSet) {
        this.a = jcb;
        this.b = linkedHashSet;
        super(2);
    }

    public final void a(Eqb eqb, boolean z) {
        C7471uYa.b(eqb, "scope");
        for (C5272Rcb rcb : a.a(eqb, C7700xqb.q, null, 2, null)) {
            if (rcb instanceof C5029Jcb) {
                C5029Jcb jcb = (C5029Jcb) rcb;
                if (C6531gpb.a(jcb, this.a)) {
                    this.b.add(rcb);
                }
                if (z) {
                    Eqb H = jcb.H();
                    C7471uYa.a((Object) H, "descriptor.unsubstitutedInnerClassesScope");
                    a(H, z);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        a((Eqb) obj, ((Boolean) obj2).booleanValue());
        return RVa.a;
    }
}
