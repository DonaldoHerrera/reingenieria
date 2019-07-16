package com.soundcloud.android.playback;

import android.content.Context;

/* renamed from: com.soundcloud.android.playback.rc reason: case insensitive filesystem */
/* compiled from: PlaybackNotificationProvider_Factory */
public final class C4417rc implements C4961HMa<C4413qc> {
    private final C7054oVa<Context> a;
    private final C7054oVa<Fma> b;

    public C4417rc(C7054oVa<Context> ova, C7054oVa<Fma> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4417rc a(C7054oVa<Context> ova, C7054oVa<Fma> ova2) {
        return new C4417rc(ova, ova2);
    }

    public C4413qc get() {
        return new C4413qc((Context) this.a.get(), (Fma) this.b.get());
    }
}
