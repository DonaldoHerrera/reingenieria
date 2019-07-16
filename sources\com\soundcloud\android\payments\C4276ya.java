package com.soundcloud.android.payments;

/* renamed from: com.soundcloud.android.payments.ya reason: case insensitive filesystem */
/* compiled from: ProductChoiceScrollView_Factory */
public final class C4276ya implements C4961HMa<C4274xa> {
    private final C7054oVa<Ba> a;

    public C4276ya(C7054oVa<Ba> ova) {
        this.a = ova;
    }

    public static C4276ya a(C7054oVa<Ba> ova) {
        return new C4276ya(ova);
    }

    public C4274xa get() {
        return new C4274xa((Ba) this.a.get());
    }
}
