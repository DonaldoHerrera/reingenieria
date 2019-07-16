package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.gc reason: case insensitive filesystem */
/* compiled from: DownloadOperations.kt */
final class C4092gc<T> implements C7256rQa<Long> {
    public static final C4092gc a = new C4092gc();

    C4092gc() {
    }

    /* renamed from: a */
    public final boolean test(Long l) {
        C7471uYa.b(l, "entriesRemoved");
        return l.longValue() > 0;
    }
}
