package defpackage;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: kya reason: default package and case insensitive filesystem */
/* compiled from: DatabaseCleanupController_Factory */
public final class C6820kya implements C4961HMa<C5680bya> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C4797CDa> b;
    private final C7054oVa<C5327TLa> c;
    private final C7054oVa<C3700b> d;
    private final C7054oVa<C5612aya> e;

    public C6820kya(C7054oVa<C5500ZKa> ova, C7054oVa<C4797CDa> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<C3700b> ova4, C7054oVa<C5612aya> ova5) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
    }

    public static C6820kya a(C7054oVa<C5500ZKa> ova, C7054oVa<C4797CDa> ova2, C7054oVa<C5327TLa> ova3, C7054oVa<C3700b> ova4, C7054oVa<C5612aya> ova5) {
        C6820kya kya = new C6820kya(ova, ova2, ova3, ova4, ova5);
        return kya;
    }

    public C5680bya get() {
        C5680bya bya = new C5680bya((C5500ZKa) this.a.get(), (C4797CDa) this.b.get(), (C5327TLa) this.c.get(), (C3700b) this.d.get(), (C5612aya) this.e.get());
        return bya;
    }
}
