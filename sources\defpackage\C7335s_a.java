package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: s_a reason: default package and case insensitive filesystem */
/* compiled from: KClassImpl.kt */
final class C7335s_a extends C7540vYa implements PXa<List<? extends C7679xZa<? extends T>>> {
    final /* synthetic */ a a;

    C7335s_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<C7679xZa<T>> d() {
        Collection<C5242Qcb> d = I_a.this.d();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
        for (C5242Qcb w_a : d) {
            arrayList.add(new W_a(I_a.this, w_a));
        }
        return arrayList;
    }
}
