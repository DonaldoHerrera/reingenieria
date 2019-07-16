package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.pd reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4147pd<T, R> implements C7118pQa<Boolean, C7255rPa> {
    final /* synthetic */ C4197yd a;
    final /* synthetic */ C3508cda b;
    final /* synthetic */ C3508cda c;

    C4147pd(C4197yd ydVar, C3508cda cda, C3508cda cda2) {
        this.a = ydVar;
        this.b = cda;
        this.c = cda2;
    }

    /* renamed from: a */
    public final C6979nPa apply(Boolean bool) {
        C7471uYa.b(bool, "it");
        return this.a.b(this.b, this.c);
    }
}
