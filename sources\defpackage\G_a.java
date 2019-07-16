package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: G_a reason: default package */
/* compiled from: KClassImpl.kt */
final class G_a extends C7540vYa implements PXa<List<? extends C5120Mab>> {
    final /* synthetic */ a a;

    G_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<C5120Mab> d() {
        boolean z;
        Ptb Q = this.a.h().Q();
        C7471uYa.a((Object) Q, "descriptor.typeConstructor");
        Collection<C7706xtb> b = Q.b();
        C7471uYa.a((Object) b, "descriptor.typeConstructor.supertypes");
        ArrayList arrayList = new ArrayList(b.size());
        for (C7706xtb xtb : b) {
            C7471uYa.a((Object) xtb, "kotlinType");
            arrayList.add(new C5120Mab(xtb, new E_a(xtb, this)));
        }
        if (!C5301Sbb.e(this.a.h())) {
            boolean z2 = true;
            if (!arrayList.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C5029Jcb a2 = C6531gpb.a(((C5120Mab) it.next()).b());
                    C7471uYa.a((Object) a2, "DescriptorUtils.getClassDescriptorForType(it.type)");
                    C5060Kcb g = a2.g();
                    C7471uYa.a((Object) g, "DescriptorUtils.getClass…ptorForType(it.type).kind");
                    if (g == C5060Kcb.INTERFACE || g == C5060Kcb.ANNOTATION_CLASS) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                }
            }
            if (z2) {
                Etb e = C7148pqb.b((C5272Rcb) this.a.h()).e();
                C7471uYa.a((Object) e, "descriptor.builtIns.anyType");
                arrayList.add(new C5120Mab(e, F_a.a));
            }
        }
        return C7089ovb.a(arrayList);
    }
}
