package com.soundcloud.android.accounts;

import android.accounts.AccountManager;
import android.content.Context;

/* compiled from: ScAccountManager_Factory */
public final class K implements C4961HMa<J> {
    private final C7054oVa<AccountManager> a;
    private final C7054oVa<Context> b;

    public K(C7054oVa<AccountManager> ova, C7054oVa<Context> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static K a(C7054oVa<AccountManager> ova, C7054oVa<Context> ova2) {
        return new K(ova, ova2);
    }

    public J get() {
        return new J((AccountManager) this.a.get(), (Context) this.b.get());
    }
}
