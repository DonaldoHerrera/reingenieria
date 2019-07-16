package com.soundcloud.android.playback;

import android.content.Context;
import com.soundcloud.android.playback.core.d;

/* compiled from: PlayerModule_ProvideMediaPlayerKitFactory */
public final class Sc implements C4961HMa<C4703wma> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C6834lGa> b;
    private final C7054oVa<C5694cGa> c;
    private final C7054oVa<d> d;

    public Sc(C7054oVa<Context> ova, C7054oVa<C6834lGa> ova2, C7054oVa<C5694cGa> ova3, C7054oVa<d> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static Sc a(C7054oVa<Context> ova, C7054oVa<C6834lGa> ova2, C7054oVa<C5694cGa> ova3, C7054oVa<d> ova4) {
        return new Sc(ova, ova2, ova3, ova4);
    }

    public static C4703wma a(Context context, C6834lGa lga, C5694cGa cga, d dVar) {
        C4703wma a2 = Kc.a(context, lga, cga, dVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4703wma get() {
        return a((Context) this.a.get(), (C6834lGa) this.b.get(), (C5694cGa) this.c.get(), (d) this.d.get());
    }
}
