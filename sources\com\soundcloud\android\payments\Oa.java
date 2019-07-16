package com.soundcloud.android.payments;

/* compiled from: TransactionState */
class Oa {
    private final IPa<String> a;
    private final IPa<Ea> b;

    Oa(IPa<String> iPa, IPa<Ea> iPa2) {
        this.a = iPa;
        this.b = iPa2;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.b != null;
    }

    /* access modifiers changed from: 0000 */
    public boolean b() {
        return (this.b == null && this.a == null) ? false : true;
    }

    public IPa<String> c() {
        return this.a;
    }

    public IPa<Ea> d() {
        return this.b;
    }
}
