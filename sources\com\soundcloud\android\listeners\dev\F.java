package com.soundcloud.android.listeners.dev;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import androidx.fragment.app.FragmentActivity;

/* compiled from: DevDrawerFragment.kt */
final class F implements OnClickListener {
    final /* synthetic */ DevDrawerFragment a;
    final /* synthetic */ String b;

    F(DevDrawerFragment devDrawerFragment, String str) {
        this.a = devDrawerFragment;
        this.b = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (C5206PKa.b(this.b)) {
            this.a.Tb().a(this.b);
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
}
