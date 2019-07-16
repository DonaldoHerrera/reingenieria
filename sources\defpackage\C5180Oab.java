package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Oab reason: default package and case insensitive filesystem */
/* compiled from: KTypeParameterImpl.kt */
final class C5180Oab extends C7540vYa implements PXa<List<? extends C5120Mab>> {
    final /* synthetic */ C5210Pab a;

    C5180Oab(C5210Pab pab) {
        this.a = pab;
        super(0);
    }

    public final List<C5120Mab> d() {
        List<C7706xtb> upperBounds = this.a.b().getUpperBounds();
        C7471uYa.a((Object) upperBounds, "descriptor.upperBounds");
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) upperBounds, 10));
        for (C7706xtb xtb : upperBounds) {
            C7471uYa.a((Object) xtb, "kotlinType");
            arrayList.add(new C5120Mab(xtb, new C5150Nab(this)));
        }
        return arrayList;
    }
}
