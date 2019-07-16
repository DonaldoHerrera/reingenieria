package com.soundcloud.android.playback;

/* compiled from: PlaybackItemRepository_Factory */
public final class Vb implements C4961HMa<Ub> {
    private final C7054oVa<Jb> a;

    public Vb(C7054oVa<Jb> ova) {
        this.a = ova;
    }

    public static Vb a(C7054oVa<Jb> ova) {
        return new Vb(ova);
    }

    public Ub get() {
        return new Ub((Jb) this.a.get());
    }
}
