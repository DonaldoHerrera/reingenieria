package com.google.android.gms.internal.firebase-perf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Qb extends Ob {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private Qb() {
        super();
    }

    private static <E> List<E> b(Object obj, long j) {
        return (List) Qc.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) Qc.f(obj, j);
        if (list instanceof Lb) {
            obj2 = ((Lb) list).U();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C0871nc) || !(list instanceof Ab)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Ab ab = (Ab) list;
                if (ab.L()) {
                    ab.M();
                }
                return;
            }
        } else {
            return;
        }
        Qc.a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r2v10 */
    /* JADX WARNING: type inference failed for: r2v15 */
    /* JADX WARNING: type inference failed for: r2v16 */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    public final <E> void a(Object obj, Object obj2, long j) {
        ? r2;
        Object obj3;
        List b = b(obj2, j);
        int size = b.size();
        List b2 = b(obj, j);
        if (b2.isEmpty()) {
            if (b2 instanceof Lb) {
                obj3 = new Mb(size);
            } else if (!(b2 instanceof C0871nc) || !(b2 instanceof Ab)) {
                obj3 = new ArrayList(size);
            } else {
                obj3 = ((Ab) b2).i(size);
            }
            Qc.a(obj, j, obj3);
            b2 = obj3;
        } else {
            if (c.isAssignableFrom(b2.getClass())) {
                ArrayList arrayList = new ArrayList(b2.size() + size);
                arrayList.addAll(b2);
                Qc.a(obj, j, (Object) arrayList);
                r2 = arrayList;
            } else if (b2 instanceof Pc) {
                Mb mb = new Mb(b2.size() + size);
                mb.addAll((Pc) b2);
                Qc.a(obj, j, (Object) mb);
                r2 = mb;
            } else if ((b2 instanceof C0871nc) && (b2 instanceof Ab)) {
                Ab ab = (Ab) b2;
                if (!ab.L()) {
                    List i = ab.i(b2.size() + size);
                    Qc.a(obj, j, (Object) i);
                    b2 = i;
                }
            }
            b2 = r2;
        }
        int size2 = b2.size();
        int size3 = b.size();
        if (size2 > 0 && size3 > 0) {
            b2.addAll(b);
        }
        if (size2 > 0) {
            b = b2;
        }
        Qc.a(obj, j, b);
    }
}
