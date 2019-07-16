package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.ac reason: case insensitive filesystem */
abstract class C0922ac {
    private static final C0922ac a = new C0936cc();
    private static final C0922ac b = new C0929bc();

    private C0922ac() {
    }

    static C0922ac a() {
        return a;
    }

    static C0922ac b() {
        return b;
    }

    /* access modifiers changed from: 0000 */
    public abstract <L> List<L> a(Object obj, long j);

    /* access modifiers changed from: 0000 */
    public abstract <L> void a(Object obj, Object obj2, long j);

    /* access modifiers changed from: 0000 */
    public abstract void b(Object obj, long j);
}
