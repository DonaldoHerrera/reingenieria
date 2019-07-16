package com.soundcloud.android.offlinestate;

/* compiled from: OfflineStateHelper.kt */
final class d<T> implements C7733yKa<Runnable> {
    final /* synthetic */ c a;

    d(c cVar) {
        this.a = cVar;
    }

    /* renamed from: a */
    public final void accept(Runnable runnable) {
        this.a.d.removeCallbacks(runnable);
        this.a.c = C4928GKa.a();
    }
}
