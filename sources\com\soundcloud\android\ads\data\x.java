package com.soundcloud.android.ads.data;

/* compiled from: VideoAdsDaoModule_ProvideVideoAdsDaoFactory */
public final class x implements C4961HMa<v> {
    private final C7054oVa<VideoAdsDatabase> a;

    public x(C7054oVa<VideoAdsDatabase> ova) {
        this.a = ova;
    }

    public static x a(C7054oVa<VideoAdsDatabase> ova) {
        return new x(ova);
    }

    public static v a(VideoAdsDatabase videoAdsDatabase) {
        v a2 = w.a(videoAdsDatabase);
        C5023JMa.a(a2, "Cannot return null from a non-@Nullable @Provides method");
        return a2;
    }

    public v get() {
        return a((VideoAdsDatabase) this.a.get());
    }
}
