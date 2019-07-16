package defpackage;

import java.util.Collection;
import java.util.Set;

/* renamed from: uqb reason: default package and case insensitive filesystem */
/* compiled from: AbstractScopeAdapter.kt */
public abstract class C7493uqb implements Eqb {
    public Collection<C7684xdb> a(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return c().a(xnb, dfb);
    }

    public C5122Mcb b(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return c().b(xnb, dfb);
    }

    /* access modifiers changed from: protected */
    public abstract Eqb c();

    public Collection<C7408tdb> c(C7694xnb xnb, Dfb dfb) {
        C7471uYa.b(xnb, "name");
        C7471uYa.b(dfb, "location");
        return c().c(xnb, dfb);
    }

    public Collection<C5272Rcb> a(C7700xqb xqb, _Xa<? super C7694xnb, Boolean> _xa) {
        C7471uYa.b(xqb, "kindFilter");
        C7471uYa.b(_xa, "nameFilter");
        return c().a(xqb, _xa);
    }

    public Set<C7694xnb> b() {
        return c().b();
    }

    public Set<C7694xnb> a() {
        return c().a();
    }
}
