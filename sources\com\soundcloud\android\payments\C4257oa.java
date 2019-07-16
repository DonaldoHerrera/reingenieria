package com.soundcloud.android.payments;

/* renamed from: com.soundcloud.android.payments.oa reason: case insensitive filesystem */
/* compiled from: ProductChoiceAdapter_Factory */
public final class C4257oa implements C4961HMa<C4255na> {
    private final C7054oVa<Ba> a;

    public C4257oa(C7054oVa<Ba> ova) {
        this.a = ova;
    }

    public static C4257oa a(C7054oVa<Ba> ova) {
        return new C4257oa(ova);
    }

    public C4255na get() {
        return new C4255na((Ba) this.a.get());
    }
}
