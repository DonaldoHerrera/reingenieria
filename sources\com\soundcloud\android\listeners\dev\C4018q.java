package com.soundcloud.android.listeners.dev;

import android.content.Intent;
import com.soundcloud.android.listeners.dev.playback.PlaybackDevActivity;

/* renamed from: com.soundcloud.android.listeners.dev.q reason: case insensitive filesystem */
/* compiled from: DevDrawerFragment.kt */
final class C4018q extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    C4018q(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        this.a.requireActivity().startActivity(new Intent(this.a.getActivity(), PlaybackDevActivity.class));
    }
}
