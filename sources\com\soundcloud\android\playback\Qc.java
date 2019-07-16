package com.soundcloud.android.playback;

import android.content.SharedPreferences;

/* compiled from: PlayerModule_ProvideImmediatelySkippableAdsPrefFactory */
public final class Qc implements C4961HMa<C7648wza<Boolean>> {
    private final C7054oVa<SharedPreferences> a;

    public Qc(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static Qc a(C7054oVa<SharedPreferences> ova) {
        return new Qc(ova);
    }

    public static C7648wza<Boolean> a(SharedPreferences sharedPreferences) {
        C7648wza<Boolean> a2 = Kc.a(sharedPreferences);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7648wza<Boolean> get() {
        return a((SharedPreferences) this.a.get());
    }
}
