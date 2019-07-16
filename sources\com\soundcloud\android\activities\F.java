package com.soundcloud.android.activities;

import android.content.res.Resources;
import com.soundcloud.android.image.N;

/* compiled from: ActivityItemRenderer_Factory */
public final class F implements C4961HMa<E> {
    private final C7054oVa<Resources> a;
    private final C7054oVa<N> b;

    public static E a(Resources resources, N n) {
        return new E(resources, n);
    }

    public E get() {
        return new E((Resources) this.a.get(), (N) this.b.get());
    }
}
