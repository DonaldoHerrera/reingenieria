package com.soundcloud.android.upsell;

/* compiled from: InlineUpsellOperations_Factory */
public final class b implements C4961HMa<a> {
    private final C7054oVa<c> a;
    private final C7054oVa<C2436_U> b;

    public b(C7054oVa<c> ova, C7054oVa<C2436_U> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static b a(C7054oVa<c> ova, C7054oVa<C2436_U> ova2) {
        return new b(ova, ova2);
    }

    public a get() {
        return new a((c) this.a.get(), (C2436_U) this.b.get());
    }
}
