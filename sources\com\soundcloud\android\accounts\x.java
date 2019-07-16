package com.soundcloud.android.accounts;

import com.facebook.login.D;

/* compiled from: FacebookModule_ProvidesFacebookLoginManagerFactory */
public final class x implements C4961HMa<D> {
    private final v a;

    public x(v vVar) {
        this.a = vVar;
    }

    public static x a(v vVar) {
        return new x(vVar);
    }

    public static D b(v vVar) {
        D b = vVar.b();
        C5023JMa.a(b, "Cannot return null from a non-@Nullable @Provides method");
        return b;
    }

    public D get() {
        return b(this.a);
    }
}
