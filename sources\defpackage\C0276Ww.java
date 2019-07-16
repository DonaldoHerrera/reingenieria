package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Ww reason: default package and case insensitive filesystem */
final class C0276Ww extends C0266Uw {
    private static final Class<?> c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private C0276Ww() {
        super();
    }

    private static <E> List<E> c(Object obj, long j) {
        return (List) Ux.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        return a(obj, j, 10);
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        Object obj2;
        List list = (List) Ux.f(obj, j);
        if (list instanceof C0249Qw) {
            obj2 = ((C0249Qw) list).b();
        } else if (!c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof C1769ux) || !(list instanceof C0213Hw)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                C0213Hw hw = (C0213Hw) list;
                if (hw.N()) {
                    hw.O();
                }
                return;
            }
        } else {
            return;
        }
        Ux.a(obj, j, obj2);
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
            if (c2 instanceof C0249Qw) {
                list = new C0253Rw<>(i);
            } else if (!(c2 instanceof C1769ux) || !(c2 instanceof C0213Hw)) {
                list = new ArrayList<>(i);
            } else {
                list = ((C0213Hw) c2).b(i);
            }
            Ux.a(obj, j, (Object) list);
            return list;
        }
        if (c.isAssignableFrom(c2.getClass())) {
            ArrayList arrayList = new ArrayList(c2.size() + i);
            arrayList.addAll(c2);
            Ux.a(obj, j, (Object) arrayList);
            r1 = arrayList;
        } else if (c2 instanceof Tx) {
            C0253Rw rw = new C0253Rw(c2.size() + i);
            rw.addAll((Tx) c2);
            Ux.a(obj, j, (Object) rw);
            r1 = rw;
        } else if (!(c2 instanceof C1769ux) || !(c2 instanceof C0213Hw)) {
            return c2;
        } else {
            C0213Hw hw = (C0213Hw) c2;
            if (hw.N()) {
                return c2;
            }
            C0213Hw b = hw.b(c2.size() + i);
            Ux.a(obj, j, (Object) b);
            return b;
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
        Ux.a(obj, j, (Object) c2);
    }
}
