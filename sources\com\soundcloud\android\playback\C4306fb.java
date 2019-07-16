package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.r;

/* renamed from: com.soundcloud.android.playback.fb reason: case insensitive filesystem */
/* compiled from: PlayQueueExtenderProxy_Factory */
public final class C4306fb implements C4961HMa<C4301eb> {
    private final C7054oVa<r> a;
    private final C7054oVa<Ya> b;

    public C4306fb(C7054oVa<r> ova, C7054oVa<Ya> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4306fb a(C7054oVa<r> ova, C7054oVa<Ya> ova2) {
        return new C4306fb(ova, ova2);
    }

    public C4301eb get() {
        return new C4301eb((r) this.a.get(), C4930GMa.a(this.b));
    }
}
