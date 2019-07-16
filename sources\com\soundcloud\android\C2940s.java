package com.soundcloud.android;

import com.soundcloud.android.image.C3734o;

/* renamed from: com.soundcloud.android.s reason: case insensitive filesystem */
/* compiled from: ApplicationModule_ProvideConfigurationOperationsFactory */
public final class C2940s implements C4961HMa<C2325UT> {
    private final C2933l a;
    private final C7054oVa<dfa> b;
    private final C7054oVa<efa> c;
    private final C7054oVa<C2137KU> d;
    private final C7054oVa<C2436_U> e;
    private final C7054oVa<C3184oU> f;
    private final C7054oVa<C2343VT> g;
    private final C7054oVa<a> h;
    private final C7054oVa<HPa> i;
    private final C7054oVa<C3223qU> j;
    private final C7054oVa<C3041hU> k;
    private final C7054oVa<C3734o> l;
    private final C7054oVa<C3129mM> m;

    public C2940s(C2933l lVar, C7054oVa<dfa> ova, C7054oVa<efa> ova2, C7054oVa<C2137KU> ova3, C7054oVa<C2436_U> ova4, C7054oVa<C3184oU> ova5, C7054oVa<C2343VT> ova6, C7054oVa<a> ova7, C7054oVa<HPa> ova8, C7054oVa<C3223qU> ova9, C7054oVa<C3041hU> ova10, C7054oVa<C3734o> ova11, C7054oVa<C3129mM> ova12) {
        this.a = lVar;
        this.b = ova;
        this.c = ova2;
        this.d = ova3;
        this.e = ova4;
        this.f = ova5;
        this.g = ova6;
        this.h = ova7;
        this.i = ova8;
        this.j = ova9;
        this.k = ova10;
        this.l = ova11;
        this.m = ova12;
    }

    public static C2940s a(C2933l lVar, C7054oVa<dfa> ova, C7054oVa<efa> ova2, C7054oVa<C2137KU> ova3, C7054oVa<C2436_U> ova4, C7054oVa<C3184oU> ova5, C7054oVa<C2343VT> ova6, C7054oVa<a> ova7, C7054oVa<HPa> ova8, C7054oVa<C3223qU> ova9, C7054oVa<C3041hU> ova10, C7054oVa<C3734o> ova11, C7054oVa<C3129mM> ova12) {
        C2940s sVar = new C2940s(lVar, ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12);
        return sVar;
    }

    public static C2325UT a(C2933l lVar, dfa dfa, efa efa, C2137KU ku, C2436_U _u, C3184oU oUVar, C2343VT vt, a aVar, HPa hPa, C3223qU qUVar, C3041hU hUVar, C3734o oVar, C3129mM mMVar) {
        C2325UT a2 = lVar.a(dfa, efa, ku, _u, oUVar, vt, aVar, hPa, qUVar, hUVar, oVar, mMVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C2325UT get() {
        return a(this.a, (dfa) this.b.get(), (efa) this.c.get(), (C2137KU) this.d.get(), (C2436_U) this.e.get(), (C3184oU) this.f.get(), (C2343VT) this.g.get(), (a) this.h.get(), (HPa) this.i.get(), (C3223qU) this.j.get(), (C3041hU) this.k.get(), (C3734o) this.l.get(), (C3129mM) this.m.get());
    }
}
