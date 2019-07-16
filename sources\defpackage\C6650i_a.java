package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: i_a reason: default package and case insensitive filesystem */
/* compiled from: KCallableImpl.kt */
final class C6650i_a extends C7540vYa implements PXa<ArrayList<CZa>> {
    final /* synthetic */ C6922m_a a;

    C6650i_a(C6922m_a m_a) {
        this.a = m_a;
        super(0);
    }

    public final ArrayList<CZa> d() {
        int i;
        C4935Gcb i2 = this.a.i();
        ArrayList<CZa> arrayList = new ArrayList<>();
        int i3 = 0;
        if (!this.a.k()) {
            C7615wdb a2 = C6312dbb.a((C4904Fcb) i2);
            if (a2 != null) {
                arrayList.add(new C6923mab(this.a, 0, a.INSTANCE, new C6446f_a(a2)));
                i = 1;
            } else {
                i = 0;
            }
            C7615wdb l = i2.l();
            if (l != null) {
                int i4 = i + 1;
                arrayList.add(new C6923mab(this.a, i, a.EXTENSION_RECEIVER, new C6514g_a(l)));
                i = i4;
            }
        } else {
            i = 0;
        }
        List f = i2.f();
        C7471uYa.a((Object) f, "descriptor.valueParameters");
        int size = f.size();
        while (i3 < size) {
            int i5 = i + 1;
            arrayList.add(new C6923mab(this.a, i, a.VALUE, new C6582h_a(i2, i3)));
            i3++;
            i = i5;
        }
        if (this.a.j() && (i2 instanceof Ngb) && arrayList.size() > 1) {
            C7262rWa.a(arrayList, new C6378e_a());
        }
        arrayList.trimToSize();
        return arrayList;
    }
}
