package com.soundcloud.android.image;

import android.content.res.Resources;

/* compiled from: PlaceholderGenerator_Factory */
public final class ra implements C4961HMa<qa> {
    private final C7054oVa<Resources> a;

    public ra(C7054oVa<Resources> ova) {
        this.a = ova;
    }

    public static ra a(C7054oVa<Resources> ova) {
        return new ra(ova);
    }

    public static qa a(Resources resources) {
        return new qa(resources);
    }

    public qa get() {
        return new qa((Resources) this.a.get());
    }
}
