package com.soundcloud.android.image;

import android.content.SharedPreferences;

/* renamed from: com.soundcloud.android.image.p reason: case insensitive filesystem */
/* compiled from: ImageConfigurationStorage_Factory */
public final class C3735p implements C4961HMa<C3734o> {
    private final C7054oVa<SharedPreferences> a;

    public C3735p(C7054oVa<SharedPreferences> ova) {
        this.a = ova;
    }

    public static C3735p a(C7054oVa<SharedPreferences> ova) {
        return new C3735p(ova);
    }

    public C3734o get() {
        return new C3734o((SharedPreferences) this.a.get());
    }
}
