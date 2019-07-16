package com.soundcloud.android;

import com.soundcloud.android.playback.ui.C4454gb;

/* compiled from: ApplicationModule_ProvideLikeButtonPresenterFactory */
public final class H implements C4961HMa<C4454gb> {
    private final C7054oVa<C5408WFa> a;

    public H(C7054oVa<C5408WFa> ova) {
        this.a = ova;
    }

    public static H a(C7054oVa<C5408WFa> ova) {
        return new H(ova);
    }

    public static C4454gb a(C5408WFa wFa) {
        C4454gb a2 = C2933l.a(wFa);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public C4454gb get() {
        return a((C5408WFa) this.a.get());
    }
}
