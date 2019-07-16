package com.soundcloud.android.features.library.likes;

import android.os.Bundle;

/* renamed from: com.soundcloud.android.features.library.likes.k reason: case insensitive filesystem */
/* compiled from: TrackLikesFragment.kt */
final class C3597k<T> implements C6776kQa<y> {
    final /* synthetic */ TrackLikesFragment a;

    C3597k(TrackLikesFragment trackLikesFragment) {
        this.a = trackLikesFragment;
    }

    /* renamed from: a */
    public final void accept(y yVar) {
        Bundle arguments = this.a.getArguments();
        if (arguments != null) {
            arguments.remove("auto_play");
        }
    }
}
