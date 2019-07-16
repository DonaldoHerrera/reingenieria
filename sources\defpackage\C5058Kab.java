package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Kab reason: default package and case insensitive filesystem */
/* compiled from: KTypeImpl.kt */
final class C5058Kab extends C7540vYa implements PXa<List<? extends JZa>> {
    final /* synthetic */ C5120Mab a;

    C5058Kab(C5120Mab mab) {
        this.a = mab;
        super(0);
    }

    public final List<JZa> d() {
        JZa jZa;
        List ya = this.a.b().ya();
        if (ya.isEmpty()) {
            return C6918mWa.a();
        }
        C7744yVa a2 = BVa.a(DVa.PUBLICATION, new C5027Jab(this));
        DZa dZa = C5120Mab.a[3];
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) ya, 10));
        int i = 0;
        for (Object next : ya) {
            int i2 = i + 1;
            if (i >= 0) {
                Stb stb = (Stb) next;
                if (stb.a()) {
                    jZa = JZa.b.a();
                } else {
                    C7706xtb type = stb.getType();
                    C7471uYa.a((Object) type, "typeProjection.type");
                    C5120Mab mab = new C5120Mab(type, new C4995Iab(i, this, a2, dZa));
                    int i3 = C4964Hab.a[stb.b().ordinal()];
                    if (i3 == 1) {
                        jZa = JZa.b.c(mab);
                    } else if (i3 == 2) {
                        jZa = JZa.b.a(mab);
                    } else if (i3 == 3) {
                        jZa = JZa.b.b(mab);
                    } else {
                        throw new FVa();
                    }
                }
                arrayList.add(jZa);
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList;
    }
}
