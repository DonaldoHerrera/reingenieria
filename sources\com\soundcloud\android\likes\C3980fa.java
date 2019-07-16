package com.soundcloud.android.likes;

import android.os.Bundle;

/* renamed from: com.soundcloud.android.likes.fa reason: case insensitive filesystem */
/* compiled from: TrackLikesUniflowFragment.kt */
final class C3980fa<T> implements C6776kQa<U> {
    final /* synthetic */ TrackLikesUniflowFragment a;

    C3980fa(TrackLikesUniflowFragment trackLikesUniflowFragment) {
        this.a = trackLikesUniflowFragment;
    }

    /* renamed from: a */
    public final void accept(U u) {
        Bundle arguments = this.a.getArguments();
        if (arguments != null) {
            arguments.remove("auto_play");
        }
    }
}
