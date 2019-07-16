package com.soundcloud.android.accounts;

import android.content.Context;
import com.facebook.login.D;
import com.soundcloud.android.foundation.ads.J;
import com.soundcloud.android.offline.C4168tb;
import com.soundcloud.android.playback.C4421sb;

/* renamed from: com.soundcloud.android.accounts.h reason: case insensitive filesystem */
/* compiled from: AccountOperations_Factory */
public final class C2527h implements C4961HMa<C2526g> {
    private final C7054oVa<Context> a;
    private final C7054oVa<J> b;
    private final C7054oVa<L> c;
    private final C7054oVa<C5327TLa> d;
    private final C7054oVa<C4421sb> e;
    private final C7054oVa<C2325UT> f;
    private final C7054oVa<C4596kia> g;
    private final C7054oVa<C2523d> h;
    private final C7054oVa<C4168tb> i;
    private final C7054oVa<D> j;
    private final C7054oVa<C7730yHa> k;
    private final C7054oVa<HPa> l;
    private final C7054oVa<C2529j> m;
    private final C7054oVa<J> n;

    public C2527h(C7054oVa<Context> ova, C7054oVa<J> ova2, C7054oVa<L> ova3, C7054oVa<C5327TLa> ova4, C7054oVa<C4421sb> ova5, C7054oVa<C2325UT> ova6, C7054oVa<C4596kia> ova7, C7054oVa<C2523d> ova8, C7054oVa<C4168tb> ova9, C7054oVa<D> ova10, C7054oVa<C7730yHa> ova11, C7054oVa<HPa> ova12, C7054oVa<C2529j> ova13, C7054oVa<J> ova14) {
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
        this.m = ova13;
        this.n = ova14;
    }

    public static C2527h a(C7054oVa<Context> ova, C7054oVa<J> ova2, C7054oVa<L> ova3, C7054oVa<C5327TLa> ova4, C7054oVa<C4421sb> ova5, C7054oVa<C2325UT> ova6, C7054oVa<C4596kia> ova7, C7054oVa<C2523d> ova8, C7054oVa<C4168tb> ova9, C7054oVa<D> ova10, C7054oVa<C7730yHa> ova11, C7054oVa<HPa> ova12, C7054oVa<C2529j> ova13, C7054oVa<J> ova14) {
        C2527h hVar = new C2527h(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8, ova9, ova10, ova11, ova12, ova13, ova14);
        return hVar;
    }

    public C2526g get() {
        C2526g gVar = new C2526g((Context) this.a.get(), (J) this.b.get(), (L) this.c.get(), (C5327TLa) this.d.get(), (C4421sb) this.e.get(), C4930GMa.a(this.f), (C4596kia) this.g.get(), C4930GMa.a(this.h), C4930GMa.a(this.i), C4930GMa.a(this.j), (C7730yHa) this.k.get(), (HPa) this.l.get(), (C2529j) this.m.get(), (J) this.n.get());
        return gVar;
    }
}
