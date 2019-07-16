package com.soundcloud.android.onboarding;

import com.soundcloud.android.foundation.events.C3700b;

/* compiled from: OnboardingTracker_Factory */
public final class t implements C4961HMa<s> {
    private final C7054oVa<C3700b> a;

    public t(C7054oVa<C3700b> ova) {
        this.a = ova;
    }

    public static t a(C7054oVa<C3700b> ova) {
        return new t(ova);
    }

    public s get() {
        return new s((C3700b) this.a.get());
    }
}
