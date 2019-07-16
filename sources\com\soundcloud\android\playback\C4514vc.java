package com.soundcloud.android.playback;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.soundcloud.android.properties.a;

/* renamed from: com.soundcloud.android.playback.vc reason: case insensitive filesystem */
/* compiled from: PlaybackPlayerPicker_Factory */
public final class C4514vc implements C4961HMa<C4432uc> {
    private final C7054oVa<a> a;
    private final C7054oVa<FirebaseRemoteConfig> b;
    private final C7054oVa<C6699jHa> c;

    public C4514vc(C7054oVa<a> ova, C7054oVa<FirebaseRemoteConfig> ova2, C7054oVa<C6699jHa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C4514vc a(C7054oVa<a> ova, C7054oVa<FirebaseRemoteConfig> ova2, C7054oVa<C6699jHa> ova3) {
        return new C4514vc(ova, ova2, ova3);
    }

    public C4432uc get() {
        return new C4432uc((a) this.a.get(), (FirebaseRemoteConfig) this.b.get(), (C6699jHa) this.c.get());
    }
}
