package com.soundcloud.android.onboarding.auth;

import android.content.Context;
import com.soundcloud.android.accounts.C2526g;
import com.soundcloud.android.onboarding.auth.AuthenticatorService.a;

/* compiled from: AuthenticatorService_SoundCloudAuthenticator_Factory */
public final class H implements C4961HMa<a> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C2526g> b;

    public a get() {
        return new a((Context) this.a.get(), (C2526g) this.b.get());
    }
}
