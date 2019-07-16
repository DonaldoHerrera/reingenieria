package com.soundcloud.android.listeners.dev;

import android.content.Intent;
import com.soundcloud.android.properties.AppFeaturesPreferencesActivity;

/* compiled from: DevDrawerFragment.kt */
final class x extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    x(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        this.a.requireActivity().startActivity(new Intent(this.a.getActivity(), AppFeaturesPreferencesActivity.class));
    }
}
