package com.soundcloud.android.settings;

import com.soundcloud.android.offline.C4088fe;
import com.soundcloud.android.offline.C4165se;

/* renamed from: com.soundcloud.android.settings.v reason: case insensitive filesystem */
/* compiled from: OfflineUsage_Factory */
public final class C5989v implements C4961HMa<C5988u> {
    private final C7054oVa<C4165se> a;
    private final C7054oVa<C4088fe> b;

    public C5989v(C7054oVa<C4165se> ova, C7054oVa<C4088fe> ova2) {
        this.a = ova;
        this.b = ova2;
    }

    public static C5989v a(C7054oVa<C4165se> ova, C7054oVa<C4088fe> ova2) {
        return new C5989v(ova, ova2);
    }

    public C5988u get() {
        return new C5988u((C4165se) this.a.get(), (C4088fe) this.b.get());
    }
}
