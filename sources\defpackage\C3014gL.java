package defpackage;

import android.content.SharedPreferences;
import com.soundcloud.android.foundation.events.J;

/* renamed from: gL reason: default package and case insensitive filesystem */
/* compiled from: AnalyticsModule_ProvideAnalyticsInputsFactory */
public final class C3014gL implements C4961HMa<a> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<C3274tL> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<C2350WH<J>> d;

    public C3014gL(C7054oVa<SharedPreferences> ova, C7054oVa<C3274tL> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<C2350WH<J>> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C3014gL a(C7054oVa<SharedPreferences> ova, C7054oVa<C3274tL> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<C2350WH<J>> ova4) {
        return new C3014gL(ova, ova2, ova3, ova4);
    }

    public static a a(SharedPreferences sharedPreferences, C3274tL tLVar, C5327TLa tLa, C2350WH<J> wh) {
        a a2 = C2995fL.a(sharedPreferences, tLVar, tLa, wh);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public a get() {
        return a((SharedPreferences) this.a.get(), (C3274tL) this.b.get(), (C5327TLa) this.c.get(), (C2350WH) this.d.get());
    }
}
