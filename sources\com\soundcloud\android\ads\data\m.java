package com.soundcloud.android.ads.data;

/* compiled from: VideoAdStorage.kt */
final class m<T> implements C6776kQa<C4928GKa<h>> {
    final /* synthetic */ t a;

    m(t tVar) {
        this.a = tVar;
    }

    /* renamed from: a */
    public final void accept(C4928GKa<h> gKa) {
        C7471uYa.a((Object) gKa, "it");
        if (gKa.c()) {
            v d = this.a.b;
            Object b = gKa.b();
            if (b != null) {
                d.a((h) b);
                return;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }
}
