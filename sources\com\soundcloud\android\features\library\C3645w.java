package com.soundcloud.android.features.library;

import androidx.fragment.app.Fragment;
import com.soundcloud.android.features.library.aa.h;
import com.soundcloud.android.features.library.aa.p;
import com.soundcloud.android.main.H;

/* renamed from: com.soundcloud.android.features.library.w reason: case insensitive filesystem */
/* compiled from: LibraryNavigationTarget.kt */
public final class C3645w extends H {
    public C3645w() {
        super(p.tab_library, h.ic_library_24_white);
    }

    public Yca Ta() {
        return Yca.COLLECTIONS;
    }

    public Fragment Ua() {
        return new LibraryFragment();
    }
}
