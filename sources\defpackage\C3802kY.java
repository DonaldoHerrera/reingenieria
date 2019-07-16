package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: kY reason: default package and case insensitive filesystem */
/* compiled from: DiscoveryCardViewModelMapper.kt */
public class C3802kY {
    private boolean b(List<? extends C3503cY> list) {
        if (C7676xWa.f((List) list) instanceof c) {
            return true;
        }
        if (list.size() <= 1 || !(list.get(1) instanceof c)) {
            return false;
        }
        return true;
    }

    private boolean c(List<? extends C3503cY> list) {
        return C7676xWa.f((List) list) instanceof e;
    }

    public List<C3794jY> a(C3890vY vYVar) {
        boolean z;
        C7471uYa.b(vYVar, "discoveryResult");
        List c = C7676xWa.c(vYVar.a());
        ArrayList arrayList = new ArrayList();
        int i = 10;
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) c, 10));
        int i2 = 0;
        for (Object next : c) {
            int i3 = i2 + 1;
            if (i2 >= 0) {
                C3503cY cYVar = (C3503cY) next;
                int a = a(c);
                if (cYVar instanceof b) {
                    b bVar = (b) cYVar;
                    List<C3418EY> d = bVar.d();
                    ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) d, i));
                    for (C3418EY ey : d) {
                        arrayList3.add(new C3445NY(ey, C3442MY.b.a(ey, cYVar, i2 + a)));
                    }
                    z = arrayList.add(new b(bVar, arrayList3));
                } else if (cYVar instanceof d) {
                    d dVar = (d) cYVar;
                    C3418EY d2 = dVar.d();
                    z = arrayList.add(new d(dVar, new C3445NY(d2, C3442MY.b.a(d2, cYVar, i2 + a))));
                } else if (cYVar instanceof c) {
                    z = arrayList.add(new c((c) cYVar));
                } else if (cYVar instanceof a) {
                    z = arrayList.add(new a(((a) cYVar).b()));
                } else if (cYVar instanceof e) {
                    z = arrayList.add(e.b);
                } else {
                    throw new FVa();
                }
                arrayList2.add(Boolean.valueOf(z));
                i2 = i3;
                i = 10;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList;
    }

    private int a(List<? extends C3503cY> list) {
        int i = -1;
        int i2 = b(list) ? -1 : 0;
        if (!c(list)) {
            i = 0;
        }
        return i2 + i;
    }
}
