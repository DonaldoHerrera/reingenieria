package com.soundcloud.android;

import com.soundcloud.android.foundation.playqueue.r;

/* compiled from: ApplicationModule_ProvidePlayQueueUpdatesFactory */
public final class M implements C4961HMa<r> {
    private final C7054oVa<C3814lca> a;

    public M(C7054oVa<C3814lca> ova) {
        this.a = ova;
    }

    public static M a(C7054oVa<C3814lca> ova) {
        return new M(ova);
    }

    public static r a(C3814lca lca) {
        C2933l.a(lca);
        C5023JMa.a(lca, "Cannot return null from a non-@Nullable @Provides method");
        return lca;
    }

    public r get() {
        return a((C3814lca) this.a.get());
    }
}
