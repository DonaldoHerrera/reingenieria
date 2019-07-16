package com.soundcloud.android.listeners.dev;

import androidx.fragment.app.FragmentActivity;

/* compiled from: DevDrawerFragment.kt */
final class B extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    B(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        C4581ija Wb = this.a.Wb();
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            C7471uYa.a((Object) activity, "activity!!");
            Wb.f(activity);
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
