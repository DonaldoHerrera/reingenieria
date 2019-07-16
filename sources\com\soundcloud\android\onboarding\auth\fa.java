package com.soundcloud.android.onboarding.auth;

import com.google.android.gms.common.Scopes;

/* compiled from: RecoverPasswordOperations.kt */
public final class fa {
    private final efa a;

    public fa(efa efa) {
        C7471uYa.b(efa, "apiClient");
        this.a = efa;
    }

    public final C6979nPa a(String str) {
        C7471uYa.b(str, Scopes.EMAIL);
        C6979nPa a2 = this.a.a(hfa.c(C2226PO.RESET_PASSWORD.a()).c().a((Object) C4674tka.a(str)).b());
        C7471uYa.a((Object) a2, "apiClient.ignoreResultRe…           .build()\n    )");
        return a2;
    }
}
