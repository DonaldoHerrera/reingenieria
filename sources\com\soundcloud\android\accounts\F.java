package com.soundcloud.android.accounts;

/* compiled from: MeOperations.kt */
public class F {
    private final efa a;
    private final HPa b;

    public F(efa efa, HPa hPa) {
        C7471uYa.b(efa, "apiClientRx");
        C7471uYa.b(hPa, "scheduler");
        this.a = efa;
        this.b = hPa;
    }

    public C6979nPa a() {
        C6979nPa b2 = this.a.a(hfa.c(C2226PO.RESEND_EMAIL_CONFIRMATION.a()).c().b()).b(this.b);
        C7471uYa.a((Object) b2, "apiClientRx.ignoreResult…t).subscribeOn(scheduler)");
        return b2;
    }
}
