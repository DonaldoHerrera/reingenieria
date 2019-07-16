package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: z_a reason: default package and case insensitive filesystem */
/* compiled from: KClassImpl.kt */
final class C7818z_a extends C7540vYa implements PXa<List<? extends I_a<? extends Object>>> {
    final /* synthetic */ a a;

    C7818z_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<I_a<? extends Object>> d() {
        Collection a2 = a.a(this.a.h().H(), null, null, 3, null);
        ArrayList<C5272Rcb> arrayList = new ArrayList<>();
        for (Object next : a2) {
            if (!C6531gpb.n((C5272Rcb) next)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C5272Rcb rcb : arrayList) {
            if (rcb != null) {
                Class a3 = C6312dbb.a((C5029Jcb) rcb);
                Object i_a = a3 != null ? new I_a(a3) : null;
                if (i_a != null) {
                    arrayList2.add(i_a);
                }
            } else {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return arrayList2;
    }
}
