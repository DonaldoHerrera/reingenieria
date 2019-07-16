package defpackage;

import com.soundcloud.android.foundation.events.C3700b;

/* renamed from: jta reason: default package and case insensitive filesystem */
/* compiled from: PolicyOperations_Factory */
public final class C6742jta implements C4961HMa<C6334dta> {
    private final C7054oVa<C0514cT> a;
    private final C7054oVa<C7636wta> b;
    private final C7054oVa<C5670bta> c;
    private final C7054oVa<HPa> d;
    private final C7054oVa<C6946mta> e;
    private final C7054oVa<C3700b> f;

    public C6742jta(C7054oVa<C0514cT> ova, C7054oVa<C7636wta> ova2, C7054oVa<C5670bta> ova3, C7054oVa<HPa> ova4, C7054oVa<C6946mta> ova5, C7054oVa<C3700b> ova6) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
    }

    public static C6742jta a(C7054oVa<C0514cT> ova, C7054oVa<C7636wta> ova2, C7054oVa<C5670bta> ova3, C7054oVa<HPa> ova4, C7054oVa<C6946mta> ova5, C7054oVa<C3700b> ova6) {
        C6742jta jta = new C6742jta(ova, ova2, ova3, ova4, ova5, ova6);
        return jta;
    }

    public static C6334dta a(C0514cT cTVar, C7636wta wta, Object obj, HPa hPa, C6946mta mta, C3700b bVar) {
        C6334dta dta = new C6334dta(cTVar, wta, (C5670bta) obj, hPa, mta, bVar);
        return dta;
    }

    public C6334dta get() {
        C6334dta dta = new C6334dta((C0514cT) this.a.get(), (C7636wta) this.b.get(), (C5670bta) this.c.get(), (HPa) this.d.get(), (C6946mta) this.e.get(), (C3700b) this.f.get());
        return dta;
    }
}
