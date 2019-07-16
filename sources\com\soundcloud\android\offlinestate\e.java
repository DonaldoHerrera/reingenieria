package com.soundcloud.android.offlinestate;

/* compiled from: OfflineStateHelper.kt */
final class e implements Runnable {
    final /* synthetic */ c a;
    final /* synthetic */ C3823mda b;

    e(c cVar, C3823mda mda) {
        this.a = cVar;
        this.b = mda;
    }

    public final void run() {
        this.a.e.a(this.b);
        this.a.c = C4928GKa.a();
    }
}
