package com.soundcloud.android.payments;

/* compiled from: WebPaymentOperations_Factory */
public final class ab implements C4961HMa<_a> {
    private final C7054oVa<efa> a;
    private final C7054oVa<HPa> b;

    public ab(C7054oVa<efa> ova, C7054oVa<HPa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static ab a(C7054oVa<efa> ova, C7054oVa<HPa> ova2) {
        return new ab(ova, ova2);
    }

    public _a get() {
        return new _a((efa) this.a.get(), (HPa) this.b.get());
    }
}
