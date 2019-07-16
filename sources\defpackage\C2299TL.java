package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: TL reason: default package and case insensitive filesystem */
/* compiled from: DefaultScreenProvider_Factory */
public final class C2299TL implements C4961HMa<C2280SL> {
    private final C7054oVa<C2350WH<J>> a;

    public C2299TL(C7054oVa<C2350WH<J>> ova) {
        this.a = ova;
    }

    public static C2299TL a(C7054oVa<C2350WH<J>> ova) {
        return new C2299TL(ova);
    }

    public C2280SL get() {
        return new C2280SL((C2350WH) this.a.get());
    }
}
