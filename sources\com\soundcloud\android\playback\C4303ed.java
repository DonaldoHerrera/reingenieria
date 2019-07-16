package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.ed reason: case insensitive filesystem */
/* compiled from: StopReasonProvider_Factory */
public final class C4303ed implements C4961HMa<C4298dd> {
    private final C7054oVa<C3814lca> a;

    public C4303ed(C7054oVa<C3814lca> ova) {
        this.a = ova;
    }

    public static C4303ed a(C7054oVa<C3814lca> ova) {
        return new C4303ed(ova);
    }

    public C4298dd get() {
        return new C4298dd((C3814lca) this.a.get());
    }
}
