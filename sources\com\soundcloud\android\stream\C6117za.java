package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.upsell.a;

/* renamed from: com.soundcloud.android.stream.za reason: case insensitive filesystem */
/* compiled from: StreamOperations_Factory */
public final class C6117za implements C4961HMa<C6115ya> {
    private final C7054oVa<HPa> a;
    private final C7054oVa<C3700b> b;
    private final C7054oVa<C6097p> c;
    private final C7054oVa<a> d;

    public C6117za(C7054oVa<HPa> ova, C7054oVa<C3700b> ova2, C7054oVa<C6097p> ova3, C7054oVa<a> ova4) {
        this.a = ova;
        this.b = ova2;
        this.c = ova3;
        this.d = ova4;
    }

    public static C6117za a(C7054oVa<HPa> ova, C7054oVa<C3700b> ova2, C7054oVa<C6097p> ova3, C7054oVa<a> ova4) {
        return new C6117za(ova, ova2, ova3, ova4);
    }

    public C6115ya get() {
        return new C6115ya((HPa) this.a.get(), (C3700b) this.b.get(), (C6097p) this.c.get(), (a) this.d.get());
    }
}
