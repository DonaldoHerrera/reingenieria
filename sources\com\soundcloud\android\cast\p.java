package com.soundcloud.android.cast;

import android.content.SharedPreferences;

/* compiled from: CastModule_ProviderReceiverOverrideIdFactory */
public final class p implements C4961HMa<C7648wza<String>> {
    private final C7054oVa<SharedPreferences> a;

    public p(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static p a(C7054oVa<SharedPreferences> ova) {
        return new p(ova);
    }

    public static C7648wza<String> a(SharedPreferences sharedPreferences) {
        C7648wza<String> a2 = l.a(sharedPreferences);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C7648wza<String> get() {
        return a((SharedPreferences) this.a.get());
    }
}
