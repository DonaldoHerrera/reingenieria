package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.core.d;

/* compiled from: PlayerModule_ProvideExoPlayerKitFactory */
public final class Mc implements C4961HMa<C3789iba> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3781hba> b;
    private final C7054oVa<C6834lGa> c;
    private final C7054oVa<C5694cGa> d;
    private final C7054oVa<d> e;

    public Mc(C7054oVa<Context> ova, C7054oVa<C3781hba> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<C5694cGa> ova4, C7054oVa<d> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static Mc a(C7054oVa<Context> ova, C7054oVa<C3781hba> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<C5694cGa> ova4, C7054oVa<d> ova5) {
        Mc mc = new Mc(ova, ova2, ova3, ova4, ova5);
        return mc;
    }

    public static C3789iba a(Context context, C3781hba hba, C6834lGa lga, C5694cGa cga, d dVar) {
        C3789iba a2 = Kc.a(context, hba, lga, cga, dVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3789iba get() {
        return a((Context) this.a.get(), (C3781hba) this.b.get(), (C6834lGa) this.c.get(), (C5694cGa) this.d.get(), (d) this.e.get());
    }
}
