package com.soundcloud.android.listeners.dev;

import com.soundcloud.android.playback.C4431ub;

/* compiled from: DevDrawerFragment.kt */
final class L<T> implements C6776kQa<C4431ub> {
    final /* synthetic */ DevDrawerFragment a;

    L(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
    }

    /* renamed from: a */
    public final void accept(C4431ub ubVar) {
        DevDrawerFragment devDrawerFragment = this.a;
        String a2 = ubVar.a();
        if (a2 == null) {
            a2 = "not available";
        }
        devDrawerFragment.c(a2);
    }
}
