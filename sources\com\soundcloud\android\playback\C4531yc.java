package com.soundcloud.android.playback;

/* renamed from: com.soundcloud.android.playback.yc reason: case insensitive filesystem */
/* compiled from: PlaybackProgressRepository_Factory */
public final class C4531yc implements C4961HMa<C4526xc> {
    private final C7054oVa<C3760eea> a;

    public C4531yc(C7054oVa<C3760eea> ova) {
        this.a = ova;
    }

    public static C4531yc a(C7054oVa<C3760eea> ova) {
        return new C4531yc(ova);
    }

    public C4526xc get() {
        return new C4526xc((C3760eea) this.a.get());
    }
}
