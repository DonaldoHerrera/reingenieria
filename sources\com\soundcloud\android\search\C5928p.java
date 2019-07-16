package com.soundcloud.android.search;

import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.H;

/* renamed from: com.soundcloud.android.search.p reason: case insensitive filesystem */
/* compiled from: SearchNavigationTarget.kt */
public final class C5928p extends H {
    public C5928p() {
        super(p.tab_search, h.ic_search_24_white);
    }

    public Yca Ta() {
        return Yca.SEARCH_MAIN;
    }

    public Fragment Ua() {
        return new SearchFragment();
    }
}
