package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.soundcloud.android.foundation.events.F;
import com.soundcloud.android.properties.a;

/* renamed from: fua reason: default package and case insensitive filesystem */
/* compiled from: CrashlyticsAppConfigurationReporter_Factory */
public final class C6472fua implements C4961HMa<C6404eua> {
    private final C7054oVa<C2137KU> a;
    private final C7054oVa<C6834lGa> b;
    private final C7054oVa<a> c;
    private final C7054oVa<C3814lca> d;
    private final C7054oVa<C7181qKa> e;
    private final C7054oVa<PowerManager> f;
    private final C7054oVa<F> g;
    private final C7054oVa<Context> h;

    public C6472fua(C7054oVa<C2137KU> ova, C7054oVa<C6834lGa> ova2, C7054oVa<a> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C7181qKa> ova5, C7054oVa<PowerManager> ova6, C7054oVa<F> ova7, C7054oVa<Context> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C6472fua a(C7054oVa<C2137KU> ova, C7054oVa<C6834lGa> ova2, C7054oVa<a> ova3, C7054oVa<C3814lca> ova4, C7054oVa<C7181qKa> ova5, C7054oVa<PowerManager> ova6, C7054oVa<F> ova7, C7054oVa<Context> ova8) {
        C6472fua fua = new C6472fua(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return fua;
    }

    public C6404eua get() {
        C6404eua eua = new C6404eua((C2137KU) this.a.get(), (C6834lGa) this.b.get(), (a) this.c.get(), C4930GMa.a(this.d), (C7181qKa) this.e.get(), (PowerManager) this.f.get(), (F) this.g.get(), (Context) this.h.get());
        return eua;
    }
}
