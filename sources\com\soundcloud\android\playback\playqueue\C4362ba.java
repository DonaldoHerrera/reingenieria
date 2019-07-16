package com.soundcloud.android.playback.playqueue;

/* renamed from: com.soundcloud.android.playback.playqueue.ba reason: case insensitive filesystem */
/* compiled from: ArtworkPresenter.kt */
final class C4362ba<T> implements C6776kQa<Nna> {
    final /* synthetic */ C4364ca a;

    C4362ba(C4364ca caVar) {
        this.a = caVar;
    }

    /* renamed from: a */
    public final void accept(Nna nna) {
        ArtworkView a2 = this.a.b;
        if (a2 != null) {
            C7471uYa.a((Object) nna, "it");
            a2.setState(nna);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
