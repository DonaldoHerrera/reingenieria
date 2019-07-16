package com.soundcloud.android.listeners.dev;

import androidx.fragment.app.FragmentActivity;

/* renamed from: com.soundcloud.android.listeners.dev.g reason: case insensitive filesystem */
/* compiled from: DevDrawerFragment.kt */
final class C4008g extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    C4008g(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        C3194pK Rb = this.a.Rb();
        FragmentActivity activity = this.a.getActivity();
        if (activity != null) {
            C7471uYa.a((Object) activity, "activity!!");
            Rb.b(activity).g();
            return;
        }
        C7471uYa.a();
        throw null;
    }
}
