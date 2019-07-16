package com.google.android.gms.internal.firebase-perf;

abstract class Ob {
    private static final Ob a = new Qb();
    private static final Ob b = new Pb();

    private Ob() {
    }

    static Ob a() {
        return a;
    }

    static Ob b() {
        return b;
    }

    /* access modifiers changed from: 0000 */
    public abstract void a(Object obj, long j);

    /* access modifiers changed from: 0000 */
    public abstract <L> void a(Object obj, Object obj2, long j);
}
