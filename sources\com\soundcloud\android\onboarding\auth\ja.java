package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.onboarding.g;
import com.soundcloud.android.onboarding.s;

/* compiled from: SignInOperations_Factory */
public final class ja implements C4961HMa<ia> {
    private final C7054oVa<Context> a;
    private final C7054oVa<dfa> b;
    private final C7054oVa<C2322UP> c;
    private final C7054oVa<C2325UT> d;
    private final C7054oVa<s> e;
    private final C7054oVa<C2526g> f;
    private final C7054oVa<C5018JHa> g;
    private final C7054oVa<g> h;

    public ja(C7054oVa<Context> ova, C7054oVa<dfa> ova2, C7054oVa<C2322UP> ova3, C7054oVa<C2325UT> ova4, C7054oVa<s> ova5, C7054oVa<C2526g> ova6, C7054oVa<C5018JHa> ova7, C7054oVa<g> ova8) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
        this.e = ova5;
        this.f = ova6;
        this.g = ova7;
        this.h = ova8;
    }

    public static ja a(C7054oVa<Context> ova, C7054oVa<dfa> ova2, C7054oVa<C2322UP> ova3, C7054oVa<C2325UT> ova4, C7054oVa<s> ova5, C7054oVa<C2526g> ova6, C7054oVa<C5018JHa> ova7, C7054oVa<g> ova8) {
        ja jaVar = new ja(ova, ova2, ova3, ova4, ova5, ova6, ova7, ova8);
        return jaVar;
    }

    public ia get() {
        ia iaVar = new ia((Context) this.a.get(), (dfa) this.b.get(), (C2322UP) this.c.get(), (C2325UT) this.d.get(), (s) this.e.get(), (C2526g) this.f.get(), (C5018JHa) this.g.get(), (g) this.h.get());
        return iaVar;
    }
}
