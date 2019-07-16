package com.soundcloud.android.listeners.dev;

import android.widget.Toast;
import com.soundcloud.android.listeners.dev.U.p;

/* compiled from: DevDrawerFragment.kt */
final class z extends C7540vYa implements PXa<RVa> {
    final /* synthetic */ DevDrawerFragment a;

    z(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
        super(0);
    }

    public final void d() {
        this.a.ac();
        Toast.makeText(this.a.getActivity(), p.dev_oauth_token_copied, 1).show();
    }
}
