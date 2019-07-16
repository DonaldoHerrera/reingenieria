package com.soundcloud.android.cast;

import com.soundcloud.android.accounts.C2526g;

/* compiled from: CastModule_ProvideCastCredentialsFactory */
public final class o implements C4961HMa<C3183oS> {
    private final C7054oVa<C2526g> a;

    public o(C7054oVa<C2526g> ova) {
        this.a = ova;
    }

    public static o a(C7054oVa<C2526g> ova) {
        return new o(ova);
    }

    public static C3183oS a(C2526g gVar) {
        C3183oS a2 = l.a(gVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C3183oS get() {
        return a((C2526g) this.a.get());
    }
}
