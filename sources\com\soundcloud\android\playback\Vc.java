package com.soundcloud.android.playback;

import com.soundcloud.android.playback.ui.qc;

/* compiled from: PlayerUIModule_ProvideTrackPageViewFactory */
public final class Vc implements C4961HMa<qc> {
    private static final Vc a = new Vc();

    public static qc a() {
        qc a2 = Tc.a();
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public qc get() {
        return a();
    }
}
