package com.google.android.gms.internal.clearcut;

/* renamed from: com.google.android.gms.internal.clearcut.za reason: case insensitive filesystem */
final class C0811za extends C0802wa {
    private C0811za() {
        super();
    }

    private static <E> C0770la<E> b(Object obj, long j) {
        return (C0770la) Ab.f(obj, j);
    }

    /* access modifiers changed from: 0000 */
    public final void a(Object obj, long j) {
        b(obj, j).zzv();
    }

    /* access modifiers changed from: 0000 */
    public final <E> void a(Object obj, Object obj2, long j) {
        C0770la b = b(obj, j);
        C0770la b2 = b(obj2, j);
        int size = b.size();
        int size2 = b2.size();
        if (size > 0 && size2 > 0) {
            if (!b.zzu()) {
                b = b.a(size2 + size);
            }
            b.addAll(b2);
        }
        if (size > 0) {
            b2 = b;
        }
        Ab.a(obj, j, (Object) b2);
    }
}
