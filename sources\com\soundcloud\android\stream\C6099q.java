package com.soundcloud.android.stream;

/* renamed from: com.soundcloud.android.stream.q reason: case insensitive filesystem */
/* compiled from: MarkPromotedItemAsStaleCommand_Factory */
public final class C6099q implements C4961HMa<C6097p> {
    private final C7054oVa<C5500ZKa> a;

    public C6099q(C7054oVa<C5500ZKa> ova) {
        this.a = ova;
    }

    public static C6099q a(C7054oVa<C5500ZKa> ova) {
        return new C6099q(ova);
    }

    public C6097p get() {
        return new C6097p((C5500ZKa) this.a.get());
    }
}
