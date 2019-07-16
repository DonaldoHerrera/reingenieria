package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.bc reason: case insensitive filesystem */
final class C0929bc extends C0922ac {
    private C0929bc() {
        super();
    }

    private static <E> Ob<E> c(Object obj, long j) {
        return (Ob) C0937cd.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final <L> List<L> a(Object obj, long j) {
        Ob c = c(obj, j);
        if (c.K()) {
            return c;
        }
        int size = c.size();
        Ob d = c.d(size == 0 ? 10 : size << 1);
        C0937cd.a(obj, j, (Object) d);
        return d;
    }

    /* access modifiers changed from: 0000 */
    public final void b(Object obj, long j) {
        c(obj, j).J();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        Ob c = c(obj, j);
        Ob c2 = c(obj2, j);
        int size = c.size();
        int size2 = c2.size();
        if (size > 0 && size2 > 0) {
            if (!c.K()) {
                c = c.d(size2 + size);
            }
            c.addAll(c2);
        }
        if (size > 0) {
            c2 = c;
        }
        C0937cd.a(obj, j, (Object) c2);
    }
}
