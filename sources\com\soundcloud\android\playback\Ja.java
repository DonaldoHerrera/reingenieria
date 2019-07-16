package com.soundcloud.android.playback;

/* compiled from: MediaController_Factory */
public final class Ja implements C4961HMa<Fa> {
    private final C7054oVa<Ha> a;

    public Ja(C7054oVa<Ha> ova) {
        this.a = ova;
    }

    public static Ja a(C7054oVa<Ha> ova) {
        return new Ja(ova);
    }

    public Fa get() {
        return new Fa((Ha) this.a.get());
    }
}
