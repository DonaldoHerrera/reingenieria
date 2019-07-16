package com.soundcloud.android.playback;

/* compiled from: PlayerModule_ProvideFlipperCacheKeyFactory */
public final class Nc implements C4961HMa<String> {
    private final C7054oVa<C3284tV> a;

    public Nc(C7054oVa<C3284tV> ova) {
        this.a = ova;
    }

    public static Nc a(C7054oVa<C3284tV> ova) {
        return new Nc(ova);
    }

    public static String a(C3284tV tVVar) {
        String a2 = Kc.a(tVVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public String get() {
        return a((C3284tV) this.a.get());
    }
}
