package com.soundcloud.android.stream;

import com.soundcloud.android.stream.C6074da.a;

/* renamed from: com.soundcloud.android.stream.ca reason: case insensitive filesystem */
/* compiled from: StreamDepthConsumer_Factory */
public final class C6072ca implements C4961HMa<C6070ba> {
    private final C7054oVa<a> a;

    public C6072ca(C7054oVa<a> ova) {
        this.a = ova;
    }

    public static C6072ca a(C7054oVa<a> ova) {
        return new C6072ca(ova);
    }

    public C6070ba get() {
        return new C6070ba((a) this.a.get());
    }
}
