package com.soundcloud.android.sync;

/* compiled from: SingleJobRequestFactory_Factory */
public final class B implements C4961HMa<A> {
    private final C7054oVa<C5327TLa> a;

    public B(C7054oVa<C5327TLa> ova) {
        this.a = ova;
    }

    public static B a(C7054oVa<C5327TLa> ova) {
        return new B(ova);
    }

    public A get() {
        return new A(this.a);
    }
}
