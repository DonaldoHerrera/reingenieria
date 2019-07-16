package com.soundcloud.android.offline;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.offline.ge reason: case insensitive filesystem */
/* compiled from: OfflineSettingsStorage_Factory */
public final class C4094ge implements C4961HMa<C4088fe> {
    private final C7054oVa<SharedPreferences> a;
    private final C7054oVa<Context> b;

    public C4094ge(C7054oVa<SharedPreferences> ova, C7054oVa<Context> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C4094ge a(C7054oVa<SharedPreferences> ova, C7054oVa<Context> ova2) {
        return new C4094ge(ova, ova2);
    }

    public C4088fe get() {
        return new C4088fe((SharedPreferences) this.a.get(), (Context) this.b.get());
    }
}
