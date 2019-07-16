package com.soundcloud.android.collection;

import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.H;

/* compiled from: CollectionNavigationTarget.kt */
public final class G extends H {
    public G() {
        super(p.tab_library, h.ic_library_24_white);
    }

    public Yca Ta() {
        return Yca.COLLECTIONS;
    }

    public CollectionFragment Ua() {
        return new CollectionFragment();
    }
}
