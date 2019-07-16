package com.soundcloud.android.playback.players;

/* compiled from: PlaybackStateCompatFactory_Factory */
public final class n implements C4961HMa<l> {
    private final C7054oVa<q> a;

    public n(C7054oVa<q> ova) {
        this.a = ova;
    }

    public static n a(C7054oVa<q> ova) {
        return new n(ova);
    }

    public l get() {
        return new l((q) this.a.get());
    }
}
