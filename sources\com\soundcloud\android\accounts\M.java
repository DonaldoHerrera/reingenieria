package com.soundcloud.android.accounts;

import android.accounts.AccountManager;

/* compiled from: SoundCloudTokenOperations_Factory */
public final class M implements C4961HMa<L> {
    private final C7054oVa<AccountManager> a;

    public M(C7054oVa<AccountManager> ova) {
        this.a = ova;
    }

    public static M a(C7054oVa<AccountManager> ova) {
        return new M(ova);
    }

    public L get() {
        return new L((AccountManager) this.a.get());
    }
}
