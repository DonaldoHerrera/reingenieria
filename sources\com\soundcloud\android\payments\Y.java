package com.soundcloud.android.payments;

/* compiled from: NativePaymentOperations */
class Y implements C7118pQa<C4657rla, IPa<Ea>> {
    final /* synthetic */ Z a;

    Y(Z z) {
        this.a = z;
    }

    /* renamed from: a */
    public IPa<Ea> apply(C4657rla rla) {
        String str = "ScBilling";
        if (rla.c()) {
            SDb.a(str).a("About to verify subscription", new Object[0]);
            this.a.d.a(rla.b());
            return this.a.a(rla.a());
        }
        SDb.a(str).a("Verify subscription : not subscribed", new Object[0]);
        return IPa.a(Ea.NONE);
    }
}
