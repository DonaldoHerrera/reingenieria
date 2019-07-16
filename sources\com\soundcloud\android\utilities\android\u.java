package com.soundcloud.android.utilities.android;

import android.content.Context;

/* compiled from: WebViewHelper_Factory */
public final class u implements C4961HMa<t> {
    private final C7054oVa<Context> a;
    private final C7054oVa<n> b;

    public u(C7054oVa<Context> ova, C7054oVa<n> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static u a(C7054oVa<Context> ova, C7054oVa<n> ova2) {
        return new u(ova, ova2);
    }

    public t get() {
        return new t((Context) this.a.get(), (n) this.b.get());
    }
}
