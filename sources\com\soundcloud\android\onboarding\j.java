package com.soundcloud.android.onboarding;

import com.facebook.GraphRequest;
import com.facebook.GraphRequest.b;
import com.facebook.login.E;
import com.soundcloud.android.onboarding.h.a;
import java.lang.ref.WeakReference;

/* compiled from: FacebookUserDetailsRequest.kt */
public final class j {
    /* access modifiers changed from: private */
    public final WeakReference<a> a;

    public j(WeakReference<a> weakReference) {
        C7471uYa.b(weakReference, "facebookLoginCallbacks");
        this.a = weakReference;
    }

    public j(a aVar) {
        this(new WeakReference<>(aVar));
    }

    public final void a(E e) {
        C7471uYa.b(e, "loginResult");
        GraphRequest.a(e.a(), "/me?fields=id,name,birthday,gender", (b) new i(this, e)).c();
    }
}
