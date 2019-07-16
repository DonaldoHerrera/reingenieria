package com.soundcloud.android.playback;

/* compiled from: PlayerModule_ProvideMediaPlayerAdapterFactory */
public final class Rc implements C4961HMa<C4685uma> {
    private final C7054oVa<C4703wma> a;

    public Rc(C7054oVa<C4703wma> ova) {
        this.a = ova;
    }

    public static Rc a(C7054oVa<C4703wma> ova) {
        return new Rc(ova);
    }

    public static C4685uma a(C4703wma wma) {
        C4685uma a2 = Kc.a(wma);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4685uma get() {
        return a((C4703wma) this.a.get());
    }
}
