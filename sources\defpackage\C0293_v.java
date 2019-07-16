package defpackage;

import java.util.Comparator;

/* renamed from: _v reason: default package and case insensitive filesystem */
final class C0293_v implements Comparator<C0289Zv> {
    C0293_v() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        C0289Zv zv = (C0289Zv) obj;
        C0289Zv zv2 = (C0289Zv) obj2;
        C1341gw gwVar = (C1341gw) zv.iterator();
        C1341gw gwVar2 = (C1341gw) zv2.iterator();
        while (gwVar.hasNext() && gwVar2.hasNext()) {
            int compare = Integer.compare(C0289Zv.b(gwVar.nextByte()), C0289Zv.b(gwVar2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zv.size(), zv2.size());
    }
}
