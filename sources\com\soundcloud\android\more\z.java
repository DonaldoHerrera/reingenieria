package com.soundcloud.android.more;

import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.H;

/* compiled from: MoreNavigationTarget */
public class z extends H {
    public z() {
        super(p.tab_more, h.tab_more);
    }

    public Yca Ta() {
        return Yca.MORE;
    }

    public Fragment Ua() {
        return new MoreFragment();
    }
}
