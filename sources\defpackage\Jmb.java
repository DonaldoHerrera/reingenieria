package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: Jmb reason: default package */
/* compiled from: TypeTable.kt */
public final class Jmb {
    private final List<_lb> a;

    public Jmb(C6799kmb kmb) {
        C7471uYa.b(kmb, "typeTable");
        List<_lb> l = kmb.l();
        if (kmb.m()) {
            int j = kmb.j();
            List l2 = kmb.l();
            C7471uYa.a((Object) l2, "typeTable.typeList");
            List<_lb> arrayList = new ArrayList<>(C6986nWa.a((Iterable) l2, 10));
            int i = 0;
            for (Object next : l2) {
                int i2 = i + 1;
                if (i >= 0) {
                    _lb _lb = (_lb) next;
                    if (i >= j) {
                        c b = _lb.b();
                        b.a(true);
                        _lb = b.build();
                    }
                    arrayList.add(_lb);
                    i = i2;
                } else {
                    C6782kWa.c();
                    throw null;
                }
            }
            l = arrayList;
        } else {
            C7471uYa.a((Object) l, "originalTypes");
        }
        this.a = l;
    }

    public final _lb a(int i) {
        return (_lb) this.a.get(i);
    }
}
