package com.soundcloud.android;

import com.soundcloud.android.view.U;

/* compiled from: ApplicationModule_ProvidesViewPagerMonitorFactory */
public final class ba implements C4961HMa<U> {
    private final C2933l a;

    public static U a(C2933l lVar) {
        U k = lVar.k();
        C5023JMa.a(k, "Cannot return null from a non-@Nullable @Provides method");
        return k;
    }

    public U get() {
        return a(this.a);
    }
}
