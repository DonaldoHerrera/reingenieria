package defpackage;

import java.util.Map;

/* renamed from: jhb reason: default package and case insensitive filesystem */
/* compiled from: resolvers.kt */
public final class C6726jhb implements C6998nhb {
    /* access modifiers changed from: private */
    public final Map<_ib, Integer> a;
    private final Nsb<_ib, C6863lib> b = this.c.e().a((_Xa<? super K, ? extends V>) new C6658ihb<Object,Object>(this));
    /* access modifiers changed from: private */
    public final C6590hhb c;
    /* access modifiers changed from: private */
    public final C5272Rcb d;
    /* access modifiers changed from: private */
    public final int e;

    public C6726jhb(C6590hhb hhb, C5272Rcb rcb, C5588ajb ajb, int i) {
        C7471uYa.b(hhb, "c");
        C7471uYa.b(rcb, "containingDeclaration");
        C7471uYa.b(ajb, "typeParameterOwner");
        this.c = hhb;
        this.d = rcb;
        this.e = i;
        this.a = C7089ovb.a((Iterable<? extends K>) ajb.getTypeParameters());
    }

    public C4905Fdb a(_ib _ib) {
        C7471uYa.b(_ib, "javaTypeParameter");
        C6863lib lib = (C6863lib) this.b.invoke(_ib);
        return lib != null ? lib : this.c.f().a(_ib);
    }
}
