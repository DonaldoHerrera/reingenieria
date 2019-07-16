package com.soundcloud.android.stream;

import androidx.fragment.app.Fragment;
import com.soundcloud.android.ia.h;
import com.soundcloud.android.ia.p;
import com.soundcloud.android.main.H;

/* renamed from: com.soundcloud.android.stream.xa reason: case insensitive filesystem */
/* compiled from: StreamNavigationTarget */
public class C6113xa extends H {
    public C6113xa() {
        super(p.tab_stream, h.tab_stream);
    }

    public Yca Ta() {
        return Yca.STREAM;
    }

    public Fragment Ua() {
        return new StreamFragment();
    }
}
