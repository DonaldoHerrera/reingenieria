package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.cc reason: case insensitive filesystem */
final class C0936cc extends C0922ac {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C0936cc() {
        super();
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) C0937cd.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) C0937cd.f(obj, j);
        if (list instanceof Yb) {
            obj2 = ((Yb) list).R();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof Bc) || !(list instanceof Ob)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                Ob ob = (Ob) list;
                if (ob.K()) {
                    ob.J();
                }
                return;
            }
        } else {
            return;
        }
        C0937cd.a(obj, j, obj2);
    }

    /* JADX WARNING: type inference failed for: r1v9 */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.util.List<L>] */
    /* JADX WARNING: type inference failed for: r1v14 */
    /* JADX WARNING: type inference failed for: r1v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    private static <L> List<L> a(Object obj, long j, int i) {
        ? r1;
        List<L> list;
        List<L> c2 = c(obj, j);
        if (c2.isEmpty()) {
            if (c2 instanceof Yb) {
                list = new Zb<>(i);
            } else if (!(c2 instanceof Bc) || !(c2 instanceof Ob)) {
                list = new ArrayList<>(i);
            } else {
                list = ((Ob) c2).d(i);
            }
            C0937cd.a(obj, j, (Object) list);
            return list;
        }
        if (c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList = new ArrayList(c2.size() + i);
            arrayList.addAll(c2);
            C0937cd.a(obj, j, (Object) arrayList);
            r1 = arrayList;
        } else if (c2 instanceof C0930bd) {
            Zb zb = new Zb(c2.size() + i);
            zb.addAll((C0930bd) c2);
            C0937cd.a(obj, j, (Object) zb);
            r1 = zb;
        } else if (!(c2 instanceof Bc) || !(c2 instanceof Ob)) {
            return c2;
        } else {
            Ob ob = (Ob) c2;
            if (ob.K()) {
                return c2;
            }
            Ob d = ob.d(c2.size() + i);
            C0937cd.a(obj, j, (Object) d);
            return d;
        }
        return r1;
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        List c2 = c(obj2, j);
        List a = a(obj, j, c2.size());
        int size = a.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            a.addAll(c2);
        }
        if (size > 0) {
            c2 = a;
        }
        C0937cd.a(obj, j, (Object) c2);
    }
}
