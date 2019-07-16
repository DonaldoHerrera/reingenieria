package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.image.va;

/* compiled from: ArtworkPresenter.kt */
final class T<T> implements C6776kQa<C3509cea> {
    final /* synthetic */ C4364ca a;

    T(C4364ca caVar) {
        this.a = caVar;
    }

    /* renamed from: a */
    public final void accept(C3509cea cea) {
        ArtworkView a2 = this.a.b;
        if (a2 != null) {
            va a3 = va.a(cea.y(), C4928GKa.b(cea.k()));
            C7471uYa.a((Object) a3, "SimpleImageResource.crea…ble(it.imageUrlTemplate))");
            a2.a((Vca) a3);
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
