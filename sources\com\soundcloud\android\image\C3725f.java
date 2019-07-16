package com.soundcloud.android.image;

import android.content.res.Resources;

/* renamed from: com.soundcloud.android.image.f reason: case insensitive filesystem */
/* compiled from: CircularPlaceholderGenerator_Factory */
public final class C3725f implements C4961HMa<C3724e> {
    private final C7054oVa<Resources> a;

    public C3725f(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static C3725f a(C7054oVa<Resources> ova) {
        return new C3725f(ova);
    }

    public static C3724e a(Resources resources) {
        return new C3724e(resources);
    }

    public C3724e get() {
        return new C3724e((Resources) this.a.get());
    }
}
