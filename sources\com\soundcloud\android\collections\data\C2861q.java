package com.soundcloud.android.collections.data;

/* renamed from: com.soundcloud.android.collections.data.q reason: case insensitive filesystem */
/* compiled from: CollectionsStateProvider_Factory */
public final class C2861q implements C4961HMa<C2860p> {
    private final C7054oVa<K> a;

    public C2861q(C7054oVa<K> ova) {
        this.a = ova;
    }

    public static C2861q a(C7054oVa<K> ova) {
        return new C2861q(ova);
    }

    public C2860p get() {
        return new C2860p((K) this.a.get());
    }
}
