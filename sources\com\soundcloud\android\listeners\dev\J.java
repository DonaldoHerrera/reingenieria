package com.soundcloud.android.listeners.dev;

import androidx.preference.Preference;
import androidx.preference.Preference.b;

/* compiled from: DevDrawerFragment.kt */
final class J implements b {
    final /* synthetic */ DevDrawerFragment a;

    J(DevDrawerFragment devDrawerFragment) {
        this.a = devDrawerFragment;
    }

    public final boolean a(Preference preference, Object obj) {
        DevDrawerFragment devDrawerFragment = this.a;
        if (obj != null) {
            devDrawerFragment.f(((Boolean) obj).booleanValue());
            return true;
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Boolean");
    }
}
