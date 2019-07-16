package com.soundcloud.android.search.history;

/* compiled from: SearchHistoryStorage_Factory */
public final class I implements C4961HMa<A> {
    private final C7054oVa<l> a;

    public I(C7054oVa<l> ova) {
        this.a = ova;
    }

    public static I a(C7054oVa<l> ova) {
        return new I(ova);
    }

    public A get() {
        return new A((l) this.a.get());
    }
}
