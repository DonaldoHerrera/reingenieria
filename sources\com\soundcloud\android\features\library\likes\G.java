package com.soundcloud.android.features.library.likes;

/* compiled from: TrackLikesPresenter.kt */
final class G<T> implements C6776kQa<Boolean> {
    final /* synthetic */ z a;
    final /* synthetic */ T b;

    G(z zVar, T t) {
        this.a = zVar;
        this.b = t;
    }

    /* renamed from: a */
    public final void accept(Boolean bool) {
        C7471uYa.a((Object) bool, "enabled");
        if (bool.booleanValue()) {
            this.a.c(this.b);
        } else {
            this.a.b(this.b);
        }
    }
}
