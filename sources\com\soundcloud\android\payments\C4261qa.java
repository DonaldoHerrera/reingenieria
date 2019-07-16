package com.soundcloud.android.payments;

/* renamed from: com.soundcloud.android.payments.qa reason: case insensitive filesystem */
/* compiled from: ProductChoicePagerView_Factory */
public final class C4261qa implements C4961HMa<C4259pa> {
    private final C7054oVa<C4255na> a;
    private final C7054oVa<Ba> b;

    public C4261qa(C7054oVa<C4255na> ova, C7054oVa<Ba> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4261qa a(C7054oVa<C4255na> ova, C7054oVa<Ba> ova2) {
        return new C4261qa(ova, ova2);
    }

    public C4259pa get() {
        return new C4259pa((C4255na) this.a.get(), (Ba) this.b.get());
    }
}
