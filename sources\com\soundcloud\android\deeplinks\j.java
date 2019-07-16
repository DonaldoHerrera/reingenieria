package com.soundcloud.android.deeplinks;

import android.content.Context;

/* compiled from: ShortcutController_Factory */
public final class j implements C4961HMa<i> {
    private final C7054oVa<Context> a;

    public j(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static j a(C7054oVa<Context> ova) {
        return new j(ova);
    }

    public i get() {
        return new i((Context) this.a.get());
    }
}
