package com.soundcloud.android.settings;

import com.soundcloud.android.playback.Kc.b;

/* renamed from: com.soundcloud.android.settings.m reason: case insensitive filesystem */
/* compiled from: DevImmediatelySkippableAds.kt */
public class C5956m {
    private final C7648wza<Boolean> a;

    public C5956m(@b C7648wza<Boolean> wza) {
        C7471uYa.b(wza, "skipAdsForDev");
        this.a = wza;
    }

    public boolean a() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }
}
