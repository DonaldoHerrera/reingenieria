package com.soundcloud.android.profile;

import android.content.res.Resources;

/* renamed from: com.soundcloud.android.profile.ra reason: case insensitive filesystem */
/* compiled from: ProfileConfig_Factory */
public final class C5840ra implements C4961HMa<C5836qa> {
    private final C7054oVa<Resources> a;

    public static C5836qa a(Resources resources) {
        return new C5836qa(resources);
    }

    public C5836qa get() {
        return new C5836qa((Resources) this.a.get());
    }
}
