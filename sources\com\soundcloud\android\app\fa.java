package com.soundcloud.android.app;

import com.soundcloud.android.main.ea;
import com.soundcloud.android.properties.a;

/* compiled from: FeaturesModule_ProvidePlayerProviderFactory */
public final class fa implements C4961HMa<ea> {
    private final C7054oVa<a> a;

    public static ea a(a aVar) {
        ea a2 = ea.a(aVar);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public ea get() {
        return a((a) this.a.get());
    }
}
