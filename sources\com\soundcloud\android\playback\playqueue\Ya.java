package com.soundcloud.android.playback.playqueue;

import android.content.Context;
import android.content.res.Resources;

/* compiled from: PlayQueueUIItemMapper_Factory */
public final class Ya implements C4961HMa<Xa> {
    private final C7054oVa<Context> a;
    private final C7054oVa<C3814lca> b;
    private final C7054oVa<Resources> c;

    public static Xa a(Context context, C3814lca lca, Resources resources) {
        return new Xa(context, lca, resources);
    }

    public Xa get() {
        return new Xa((Context) this.a.get(), (C3814lca) this.b.get(), (Resources) this.c.get());
    }
}
