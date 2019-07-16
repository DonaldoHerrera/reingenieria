package com.soundcloud.android.fcm;

import com.soundcloud.android.collections.data.L;

/* renamed from: com.soundcloud.android.fcm.b reason: case insensitive filesystem */
/* compiled from: CollectionUpdateMessageListener_Factory */
public final class C3536b implements C4961HMa<C3535a> {
    private final C7054oVa<Nea> a;
    private final C7054oVa<L> b;

    public C3536b(C7054oVa<Nea> ova, C7054oVa<L> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C3536b a(C7054oVa<Nea> ova, C7054oVa<L> ova2) {
        return new C3536b(ova, ova2);
    }

    public C3535a get() {
        return new C3535a((Nea) this.a.get(), (L) this.b.get());
    }
}
