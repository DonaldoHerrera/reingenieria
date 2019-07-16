package com.soundcloud.android.sync;

/* renamed from: com.soundcloud.android.sync.n reason: case insensitive filesystem */
/* compiled from: BackgroundSyncResultReceiverFactory_Factory */
public final class C6131n implements C4961HMa<C6130m> {
    private final C7054oVa<la> a;

    public C6131n(C7054oVa<la> ova) {
        this.a = ova;
    }

    public static C6131n a(C7054oVa<la> ova) {
        return new C6131n(ova);
    }

    public C6130m get() {
        return new C6130m(this.a);
    }
}
