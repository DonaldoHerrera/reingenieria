package com.soundcloud.android.listeners.dev;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.fragment.app.FragmentActivity;

/* compiled from: DevDrawerFragment.kt */
final class G implements OnClickListener {
    final /* synthetic */ DevDrawerFragment a;

    G(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.a.Tb().b();
        dialogInterface.dismiss();
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
