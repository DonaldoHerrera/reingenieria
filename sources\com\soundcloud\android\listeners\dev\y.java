package com.soundcloud.android.listeners.dev;

import android.content.Intent;
import com.soundcloud.android.ads.injector.AdInjectionPreferencesActivity;

/* compiled from: DevDrawerFragment.kt */
final class y extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    y(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        this.a.requireActivity().startActivity(new Intent(this.a.getActivity(), AdInjectionPreferencesActivity.class));
    }
}
