package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.stream.C6074da.a;

/* renamed from: com.soundcloud.android.stream.ea reason: case insensitive filesystem */
/* compiled from: StreamDepthPublisher_Factory_Factory */
public final class C6076ea implements C4961HMa<a> {
    private final C7054oVa<C5327TLa> a;
    private final C7054oVa<C3700b> b;

    public C6076ea(C7054oVa<C5327TLa> ova, C7054oVa<C3700b> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6076ea a(C7054oVa<C5327TLa> ova, C7054oVa<C3700b> ova2) {
        return new C6076ea(ova, ova2);
    }

    public a get() {
        return new a((C5327TLa) this.a.get(), (C3700b) this.b.get());
    }
}
