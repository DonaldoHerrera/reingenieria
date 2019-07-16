package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* renamed from: uhb reason: default package and case insensitive filesystem */
/* compiled from: LazyJavaAnnotationDescriptor.kt */
final class C7481uhb extends C7540vYa implements PXa<Map<C7694xnb, ? extends Npb<?>>> {
    final /* synthetic */ C7688xhb a;

    C7481uhb(C7688xhb xhb) {
        this.a = xhb;
        super(0);
    }

    public final Map<C7694xnb, Npb<?>> d() {
        Collection<Fib> C = this.a.g.C();
        ArrayList arrayList = new ArrayList();
        for (Fib fib : C) {
            C7694xnb name = fib.getName();
            if (name == null) {
                name = C6657igb.c;
            }
            Npb a2 = this.a.a(fib);
            HVa a3 = a2 != null ? NVa.a(name, a2) : null;
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return LWa.a((Iterable<? extends HVa<? extends K, ? extends V>>) arrayList);
    }
}
