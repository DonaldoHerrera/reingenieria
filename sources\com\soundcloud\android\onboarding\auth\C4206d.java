package com.soundcloud.android.onboarding.auth;

import android.net.Uri.Builder;

/* renamed from: com.soundcloud.android.onboarding.auth.d reason: case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C4206d implements C7733yKa {
    private final /* synthetic */ Builder a;

    public /* synthetic */ C4206d(Builder builder) {
        this.a = builder;
    }

    public final void accept(Object obj) {
        this.a.appendQueryParameter("device_locale", (String) obj);
    }
}
