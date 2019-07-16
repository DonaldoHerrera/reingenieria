package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.kd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4117kd<T, R> implements C7118pQa<T, R> {
    public static final C4117kd a = new C4117kd();

    C4117kd() {
    }

    public final boolean a(Hc hc) {
        C7471uYa.b(hc, "event");
        return hc.a != C3823mda.NOT_OFFLINE;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        return Boolean.valueOf(a((Hc) obj));
    }
}
