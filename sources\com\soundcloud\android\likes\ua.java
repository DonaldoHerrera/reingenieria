package com.soundcloud.android.likes;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class ua<T> implements C6776kQa<Boolean> {
    final /* synthetic */ ma a;
    final /* synthetic */ Ha b;

    ua(ma maVar, Ha ha) {
        this.a = maVar;
        this.b = ha;
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
