package defpackage;

import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.ads.C2594la;
import com.soundcloud.android.properties.a;

/* renamed from: SO reason: default package and case insensitive filesystem */
/* compiled from: ApiModule_ProvideApiClientFactory */
public final class C2283SO implements C4961HMa<dfa> {
    private final C7054oVa<C7440tyb> a;
    private final C7054oVa<C2961dP> b;
    private final C7054oVa<Nea> c;
    private final C7054oVa<C6699jHa> d;
    private final C7054oVa<C2594la> e;
    private final C7054oVa<C2322UP> f;
    private final C7054oVa<C3218qP> g;
    private final C7054oVa<C2526g> h;
    private final C7054oVa<C5018JHa> i;
    private final C7054oVa<C7181qKa> j;
    private final C7054oVa<C2137KU> k;
    private final C7054oVa<a> l;

    public C2283SO(C7054oVa<C7440tyb> ova, C7054oVa<C2961dP> ova2, C7054oVa<Nea> ova3, C7054oVa<C6699jHa> ova4, C7054oVa<C2594la> ova5, C7054oVa<C2322UP> ova6, C7054oVa<C3218qP> ova7, C7054oVa<C2526g> ova8, C7054oVa<C5018JHa> ova9, C7054oVa<C7181qKa> ova10, C7054oVa<C2137KU> ova11, C7054oVa<a> ova12) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
        this.i = ova9;
        this.j = ova10;
        this.k = ova11;
        this.l = ova12;
    }

    public static C2283SO a(C7054oVa<C7440tyb> ova, C7054oVa<C2961dP> ova2, C7054oVa<Nea> ova3, C7054oVa<C6699jHa> ova4, C7054oVa<C2594la> ova5, C7054oVa<C2322UP> ova6, C7054oVa<C3218qP> ova7, C7054oVa<C2526g> ova8, C7054oVa<C5018JHa> ova9, C7054oVa<C7181qKa> ova10, C7054oVa<C2137KU> ova11, C7054oVa<a> ova12) {
        C2283SO so = new C2283SO(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12);
        return so;
    }

    public static dfa a(C4806CMa<C7440tyb> cMa, C7054oVa<C2961dP> ova, C4806CMa<Nea> cMa2, C6699jHa jha, C2594la laVar, C2322UP up, C3218qP qPVar, C2526g gVar, C5018JHa jHa, C7181qKa qka, C2137KU ku, a aVar) {
        dfa a2 = C2264RO.a(cMa, ova, cMa2, jha, laVar, up, qPVar, gVar, jHa, qka, ku, aVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public dfa get() {
        return a(C4930GMa.a(this.a), this.b, C4930GMa.a(this.c), (C6699jHa) this.d.get(), (C2594la) this.e.get(), (C2322UP) this.f.get(), (C3218qP) this.g.get(), (C2526g) this.h.get(), (C5018JHa) this.i.get(), (C7181qKa) this.j.get(), (C2137KU) this.k.get(), (a) this.l.get());
    }
}
