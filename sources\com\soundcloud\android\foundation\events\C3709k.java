package com.soundcloud.android.foundation.events;

/* renamed from: com.soundcloud.android.foundation.events.k reason: case insensitive filesystem */
/* compiled from: EntityType.kt */
public enum C3709k {
    SOUNDCLOUD("soundcloud"),
    AUDIO_AD("ad_audio"),
    VIDEO_AD("ad_video");
    
    private final String e;

    private C3709k(String str) {
        this.e = str;
    }

    public final String a() {
        return this.e;
    }
}
