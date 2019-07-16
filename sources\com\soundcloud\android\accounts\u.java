package com.soundcloud.android.accounts;

/* compiled from: DefaultSessionProvider_Factory */
public final class u implements C4961HMa<C2529j> {
    private final C7054oVa<J> a;
    private final C7054oVa<HPa> b;

    public u(C7054oVa<J> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static u a(C7054oVa<J> ova, C7054oVa<HPa> ova2) {
        return new u(ova, ova2);
    }

    public C2529j get() {
        return new C2529j((J) this.a.get(), (HPa) this.b.get());
    }
}
