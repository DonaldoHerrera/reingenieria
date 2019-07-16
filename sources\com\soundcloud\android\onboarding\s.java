package com.soundcloud.android.onboarding;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.C0096d.a;
import java.util.Map;

/* compiled from: OnboardingTracker.kt */
public class s {
    private final C3700b a;

    public s(C3700b bVar) {
        C7471uYa.b(bVar, "analytics");
        this.a = bVar;
    }

    public C3700b a() {
        return this.a;
    }

    public void a(Baa baa) {
        C7471uYa.b(baa, "onboardingEvent");
        C3700b a2 = a();
        String g = baa.g();
        C7471uYa.a((Object) g, "onboardingEvent.kindString");
        Map f = baa.f();
        C7471uYa.a((Object) f, "onboardingEvent.attributes");
        a2.a((C3702d) new a(g, f));
    }
}
