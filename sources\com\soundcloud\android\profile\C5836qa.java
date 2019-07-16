package com.soundcloud.android.profile;

import android.content.res.Resources;
import com.soundcloud.android.ia.e;

/* renamed from: com.soundcloud.android.profile.qa reason: case insensitive filesystem */
/* compiled from: ProfileConfig */
class C5836qa {
    private final Resources a;

    C5836qa(Resources resources) {
        this.a = resources;
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.a.getBoolean(e.profile_banner);
    }
}
