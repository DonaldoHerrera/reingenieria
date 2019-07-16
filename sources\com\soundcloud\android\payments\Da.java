package com.soundcloud.android.payments;

/* compiled from: ProductStatus */
final class Da {
    private final Aa a;

    private Da(Aa aa) {
        this.a = aa;
    }

    static Da a(Aa aa) {
        return new Da(aa);
    }

    public Aa b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }

    static Da a() {
        return new Da(null);
    }
}
