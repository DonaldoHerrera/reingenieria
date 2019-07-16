package com.soundcloud.android.ads.data;

import android.content.Context;

/* compiled from: VideoAdsDaoModule_ProvidesVideoAdsDatabaseFactory */
public final class y implements C4961HMa<VideoAdsDatabase> {
    private final C7054oVa<Context> a;

    public y(C7054oVa<Context> ova) {
        this.a = ova;
    }

    public static y a(C7054oVa<Context> ova) {
        return new y(ova);
    }

    public static VideoAdsDatabase a(Context context) {
        VideoAdsDatabase a2 = w.a(context);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public VideoAdsDatabase get() {
        return a((Context) this.a.get());
    }
}
