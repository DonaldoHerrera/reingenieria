package com.google.android.gms.internal.firebase-perf;

final class Pb extends Ob {
    private Pb() {
        super();
    }

    private static <E> Ab<E> b(Object obj, long j) {
        return (Ab) Qc.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, long j) {
        b(obj, j).M();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        Ab b = b(obj, j);
        Ab b2 = b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.L()) {
                b = b.i(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        Qc.a(obj, j, (Object) b2);
    }
}
