package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: l_a reason: default package and case insensitive filesystem */
/* compiled from: KCallableImpl.kt */
final class C6854l_a extends C7540vYa implements PXa<List<? extends C5210Pab>> {
    final /* synthetic */ C6922m_a a;

    C6854l_a(C6922m_a m_a) {
        this.a = m_a;
        super(0);
    }

    public final List<C5210Pab> d() {
        List<C4905Fdb> typeParameters = this.a.i().getTypeParameters();
        C7471uYa.a((Object) typeParameters, "descriptor.typeParameters");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) typeParameters, 10));
        for (C4905Fdb pab : typeParameters) {
            arrayList.add(new C5210Pab(pab));
        }
        return arrayList;
    }
}
