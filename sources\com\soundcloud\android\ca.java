package com.soundcloud.android;

import com.soundcloud.android.view.Y;

/* compiled from: ApplicationModule_ProvidesWebViewMonitorFactory */
public final class ca implements C4961HMa<Y> {
    private final C2933l a;

    public static Y a(C2933l lVar) {
        Y l = lVar.l();
        C5023JMa.a(l, "Cannot return null from a non-@Nullable @Provides method");
        return l;
    }

    public Y get() {
        return a(this.a);
    }
}
