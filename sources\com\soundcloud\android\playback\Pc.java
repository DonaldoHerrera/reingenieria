package com.soundcloud.android.playback;

import android.os.PowerManager;
import com.soundcloud.android.playback.core.d;

/* compiled from: PlayerModule_ProvideFlipperKitFactory */
public final class Pc implements C4961HMa<Yla> {
    private final C7054oVa<Ula> a;
    private final C7054oVa<PowerManager> b;
    private final C7054oVa<d> c;

    public Pc(C7054oVa<Ula> ova, C7054oVa<PowerManager> ova2, C7054oVa<d> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static Pc a(C7054oVa<Ula> ova, C7054oVa<PowerManager> ova2, C7054oVa<d> ova3) {
        return new Pc(ova, ova2, ova3);
    }

    public static Yla a(Ula ula, PowerManager powerManager, d dVar) {
        Yla a2 = Kc.a(ula, powerManager, dVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public Yla get() {
        return a((Ula) this.a.get(), (PowerManager) this.b.get(), (d) this.c.get());
    }
}
