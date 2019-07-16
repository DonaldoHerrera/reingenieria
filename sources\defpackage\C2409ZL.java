package defpackage;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: ZL reason: default package and case insensitive filesystem */
/* compiled from: EngagementsTracking_Factory */
public final class C2409ZL implements C4961HMa<C2390YL> {
    private final C7054oVa<C3760eea> a;
    private final C7054oVa<C3792iea> b;
    private final C7054oVa<C3700b> c;

    public C2409ZL(C7054oVa<C3760eea> ova, C7054oVa<C3792iea> ova2, C7054oVa<C3700b> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static C2409ZL a(C7054oVa<C3760eea> ova, C7054oVa<C3792iea> ova2, C7054oVa<C3700b> ova3) {
        return new C2409ZL(ova, ova2, ova3);
    }

    public C2390YL get() {
        return new C2390YL((C3760eea) this.a.get(), (C3792iea) this.b.get(), (C3700b) this.c.get());
    }
}
