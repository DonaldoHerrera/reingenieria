package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.id reason: case insensitive filesystem */
/* compiled from: OfflineContentOperations.kt */
final class C4105id<T> implements C6776kQa<Hc> {
    final /* synthetic */ C4197yd a;

    C4105id(C4197yd ydVar) {
        this.a = ydVar;
    }

    /* renamed from: a */
    public final void accept(Hc hc) {
        C5327TLa c = this.a.d;
        C5443XLa<Hc> xLa = C3876taa.u;
        C7471uYa.a((Object) xLa, "EventQueue.OFFLINE_CONTENT_CHANGED");
        c.c(xLa, hc);
    }
}
