package com.soundcloud.android.features.discovery;

import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.H;

/* renamed from: com.soundcloud.android.features.discovery.h reason: case insensitive filesystem */
/* compiled from: DiscoveryNavigationTarget */
public class C3550h extends H {
    public C3550h() {
        super(p.tab_discovery, h.tab_home);
    }

    public Yca Ta() {
        return Yca.DISCOVER;
    }

    public Fragment Ua() {
        return new DiscoveryFragment();
    }
}
