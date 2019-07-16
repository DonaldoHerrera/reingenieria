package com.soundcloud.android.tracks;

/* compiled from: TrackPolicyStorage_Factory */
public final class Ua implements C4961HMa<Pa> {
    private final C7054oVa<C4898FLa> a;

    public Ua(C7054oVa<C4898FLa> ova) {
        this.a = ova;
    }

    public static Ua a(C7054oVa<C4898FLa> ova) {
        return new Ua(ova);
    }

    public Pa get() {
        return new Pa((C4898FLa) this.a.get());
    }
}
