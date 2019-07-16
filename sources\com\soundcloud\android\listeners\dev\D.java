package com.soundcloud.android.listeners.dev;

import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.Preference.b;
import com.soundcloud.android.properties.j;

/* compiled from: DevDrawerFragment.kt */
final class D implements b {
    final /* synthetic */ DevDrawerFragment a;

    D(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
    }

    public final boolean a(Preference preference, Object obj) {
        if (j.e()) {
            C7250rKa Yb = this.a.Yb();
            if (obj != null) {
                Yb.a(Integer.parseInt((String) obj));
            } else {
                throw new OVa("null cannot be cast to non-null type kotlin.String");
            }
        } else {
            Toast.makeText(this.a.getActivity(), "Nightmode not supported on non debug builds yet", 1).show();
        }
        return true;
    }
}
