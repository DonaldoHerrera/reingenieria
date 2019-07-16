package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: prb reason: default package and case insensitive filesystem */
/* compiled from: DeserializedPackageFragmentImpl.kt */
final class C7150prb extends C7540vYa implements PXa<List<? extends C7694xnb>> {
    final /* synthetic */ C7219qrb a;

    C7150prb(C7219qrb qrb) {
        this.a = qrb;
        super(0);
    }

    public final List<C7694xnb> d() {
        Collection a2 = this.a.ta().a();
        ArrayList<C7280rnb> arrayList = new ArrayList<>();
        for (Object next : a2) {
            C7280rnb rnb = (C7280rnb) next;
            if (!rnb.h() && !C6467frb.b.a().contains(rnb)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) arrayList, 10));
        for (C7280rnb f : arrayList) {
            arrayList2.add(f.f());
        }
        return arrayList2;
    }
}
