package com.soundcloud.android.activities;

import com.soundcloud.android.sync.T;

/* compiled from: ActivitiesOperations_Factory */
public final class m implements C4961HMa<l> {
    private final C7054oVa<w> a;
    private final C7054oVa<T> b;
    private final C7054oVa<HPa> c;

    public m(C7054oVa<w> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
    }

    public static m a(C7054oVa<w> ova, C7054oVa<T> ova2, C7054oVa<HPa> ova3) {
        return new m(ova, ova2, ova3);
    }

    public l get() {
        return new l((w) this.a.get(), (T) this.b.get(), (HPa) this.c.get());
    }
}
