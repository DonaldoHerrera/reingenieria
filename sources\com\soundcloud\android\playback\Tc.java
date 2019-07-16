package com.soundcloud.android.playback;

import android.content.res.Resources;
import com.soundcloud.android.image.N;
import com.soundcloud.android.playback.ui.C4504xb;
import com.soundcloud.android.playback.ui.Ra;
import com.soundcloud.android.playback.ui.qc;

/* compiled from: PlayerUIModule */
public abstract class Tc {
    static qc a() {
        return new qc();
    }

    static C4504xb a(N n, Resources resources, HPa hPa, C6699jHa jha) {
        if (jha.a()) {
            return new C4504xb(n, resources, hPa);
        }
        return new Ra(n, resources, hPa);
    }
}
