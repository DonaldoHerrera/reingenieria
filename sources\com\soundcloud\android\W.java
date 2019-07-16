package com.soundcloud.android;

import com.soundcloud.android.likes.C3971b;
import com.soundcloud.android.likes.C3989m;

/* compiled from: ApplicationModule_ProvidesLikesStateProviderFactory */
public final class W implements C4961HMa<C3971b> {
    private final C7054oVa<C3989m> a;

    public W(C7054oVa<C3989m> ova) {
        this.a = ova;
    }

    public static W a(C7054oVa<C3989m> ova) {
        return new W(ova);
    }

    public static C3971b a(C3989m mVar) {
        C2933l.a(mVar);
        C5023JMa.a(mVar, "Cannot return null from a non-@Nullable @Provides method");
        return mVar;
    }

    public C3971b get() {
        return a((C3989m) this.a.get());
    }
}
