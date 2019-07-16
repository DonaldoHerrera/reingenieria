package defpackage;

import android.content.res.Resources;
import com.soundcloud.android.accounts.C2526g;

/* renamed from: LN reason: default package and case insensitive filesystem */
/* compiled from: EventLoggerV1JsonDataBuilder_Factory */
public final class C2149LN implements C4961HMa<C2130KN> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<C6699jHa> b;
    private final C7054oVa<C6834lGa> c;
    private final C7054oVa<C2526g> d;
    private final C7054oVa<Nea> e;
    private final C7054oVa<C2436_U> f;
    private final C7054oVa<C2137KU> g;
    private final C7054oVa<C5628bIa> h;

    public C2149LN(C7054oVa<Resources> ova, C7054oVa<C6699jHa> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<C2526g> ova4, C7054oVa<Nea> ova5, C7054oVa<C2436_U> ova6, C7054oVa<C2137KU> ova7, C7054oVa<C5628bIa> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static C2149LN a(C7054oVa<Resources> ova, C7054oVa<C6699jHa> ova2, C7054oVa<C6834lGa> ova3, C7054oVa<C2526g> ova4, C7054oVa<Nea> ova5, C7054oVa<C2436_U> ova6, C7054oVa<C2137KU> ova7, C7054oVa<C5628bIa> ova8) {
        C2149LN ln = new C2149LN(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return ln;
    }

    public C2130KN get() {
        C2130KN kn = new C2130KN((Resources) this.a.get(), (C6699jHa) this.b.get(), (C6834lGa) this.c.get(), (C2526g) this.d.get(), (Nea) this.e.get(), (C2436_U) this.f.get(), (C2137KU) this.g.get(), (C5628bIa) this.h.get());
        return kn;
    }
}
