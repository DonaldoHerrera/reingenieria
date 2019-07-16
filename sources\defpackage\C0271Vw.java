package defpackage;

import java.util.List;

/* renamed from: Vw reason: default package and case insensitive filesystem */
final class C0271Vw extends C0266Uw {
    private C0271Vw() {
        super();
    }

    private static <E> C0213Hw<E> c(Object obj, long j) {
        return (C0213Hw) Ux.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        C0213Hw c = c(obj, j);
        if (c.N()) {
            return c;
        }
        int size = c.size();
        C0213Hw b = c.b(size == 0 ? 10 : size << 1);
        Ux.a(obj, j, (Object) b);
        return b;
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        c(obj, j).O();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        C0213Hw c = c(obj, j);
        C0213Hw c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.N()) {
                c = c.b(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        Ux.a(obj, j, (Object) c2);
    }
}
