package com.soundcloud.android.listeners.dev;

import android.app.Activity;
import androidx.fragment.app.FragmentActivity;

/* compiled from: DevDrawerFragment.kt */
final class E extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    E(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        C3194pK Rb = this.a.Rb();
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            C7471uYa.a((Object) activity, "activity!!");
            Rb.a((Activity) activity).g();
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
