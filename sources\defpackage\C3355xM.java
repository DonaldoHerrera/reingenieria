package defpackage;

import com.soundcloud.android.foundation.events.J;

/* renamed from: xM reason: default package and case insensitive filesystem */
/* compiled from: ScreenPublisher_Factory */
public final class C3355xM implements C4961HMa<C3315vM> {
    private final C7054oVa<C2168MN> a;
    private final C7054oVa<C2350WH<J>> b;

    public C3355xM(C7054oVa<C2168MN> ova, C7054oVa<C2350WH<J>> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3355xM a(C7054oVa<C2168MN> ova, C7054oVa<C2350WH<J>> ova2) {
        return new C3355xM(ova, ova2);
    }

    public C3315vM get() {
        return new C3315vM((C2168MN) this.a.get(), (C2350WH) this.b.get());
    }
}
