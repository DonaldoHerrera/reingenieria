package com.soundcloud.android.stream;

/* renamed from: com.soundcloud.android.stream.v reason: case insensitive filesystem */
/* compiled from: RemoveStalePromotedItemsCommand_Factory */
public final class C6108v implements C4961HMa<C6106u> {
    private final C7054oVa<C5500ZKa> a;
    private final C7054oVa<C5694cGa> b;

    public C6108v(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C6108v a(C7054oVa<C5500ZKa> ova, C7054oVa<C5694cGa> ova2) {
        return new C6108v(ova, ova2);
    }

    public C6106u get() {
        return new C6106u((C5500ZKa) this.a.get(), (C5694cGa) this.b.get());
    }
}
