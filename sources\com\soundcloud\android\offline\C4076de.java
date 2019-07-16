package com.soundcloud.android.offline;

/* renamed from: com.soundcloud.android.offline.de reason: case insensitive filesystem */
/* compiled from: OfflineSettingsOperations_Factory */
public final class C4076de implements C4961HMa<C4070ce> {
    private final C7054oVa<C4088fe> a;

    public C4076de(C7054oVa<C4088fe> ova) {
        this.a = ova;
    }

    public static C4076de a(C7054oVa<C4088fe> ova) {
        return new C4076de(ova);
    }

    public C4070ce get() {
        return new C4070ce((C4088fe) this.a.get());
    }
}
