package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: C_a reason: default package */
/* compiled from: KClassImpl.kt */
final class C_a extends C7540vYa implements PXa<List<? extends I_a<? extends T>>> {
    final /* synthetic */ a a;

    C_a(a aVar) {
        this.a = aVar;
        super(0);
    }

    public final List<I_a<? extends T>> d() {
        Collection<C5029Jcb> C = this.a.h().C();
        C7471uYa.a((Object) C, "descriptor.sealedSubclasses");
        ArrayList arrayList = new ArrayList();
        for (C5029Jcb jcb : C) {
            if (jcb != null) {
                Class a2 = C6312dbb.a(jcb);
                I_a i_a = a2 != null ? new I_a(a2) : null;
                if (i_a != null) {
                    arrayList.add(i_a);
                }
            } else {
                throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            }
        }
        return arrayList;
    }
}
