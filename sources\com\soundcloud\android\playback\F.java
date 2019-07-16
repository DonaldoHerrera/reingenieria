package com.soundcloud.android.playback;

import android.media.AudioManager;

/* compiled from: AudioPortTracker_Factory */
public final class F implements C4961HMa<E> {
    private final C7054oVa<AudioManager> a;
    private final C7054oVa<C5467YGa> b;

    public F(C7054oVa<AudioManager> ova, C7054oVa<C5467YGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static F a(C7054oVa<AudioManager> ova, C7054oVa<C5467YGa> ova2) {
        return new F(ova, ova2);
    }

    public E get() {
        return new E((AudioManager) this.a.get(), (C5467YGa) this.b.get());
    }
}
