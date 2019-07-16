package com.soundcloud.android.sync;

/* compiled from: SyncOperations_Factory */
public final class da implements C4961HMa<ca> {
    private final C7054oVa<T> a;
    private final C7054oVa<la> b;
    private final C7054oVa<oa> c;

    public da(C7054oVa<T> ova, C7054oVa<la> ova2, C7054oVa<oa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static da a(C7054oVa<T> ova, C7054oVa<la> ova2, C7054oVa<oa> ova3) {
        return new da(ova, ova2, ova3);
    }

    public ca get() {
        return new ca((T) this.a.get(), (la) this.b.get(), (oa) this.c.get());
    }
}
