package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.playqueue.ra reason: case insensitive filesystem */
/* compiled from: PlayQueueDataProvider_Factory */
public final class C4393ra implements C4961HMa<C4392qa> {
    private final C7054oVa<Ma> a;
    private final C7054oVa<Xa> b;
    private final C7054oVa<r> c;

    public static C4392qa a(Ma ma, Object obj, r rVar) {
        return new C4392qa(ma, (Xa) obj, rVar);
    }

    public C4392qa get() {
        return new C4392qa((Ma) this.a.get(), (Xa) this.b.get(), (r) this.c.get());
    }
}
