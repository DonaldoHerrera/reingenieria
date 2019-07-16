package com.soundcloud.android.foundation.ads;

@EVa(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001c\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003!\"#B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\bXT¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/soundcloud/android/foundation/ads/AdConstants;", "", "()V", "APP_STATE", "", "CONNECTION_TYPE", "CORRELATOR_PARAM", "DEFAULT_UNSKIPPABLE_TIME_SECS", "", "DEVICE_TYPE", "FORCE_AD_TESTING_CREATIVE_ID", "FORCE_AD_TESTING_LINE_ID", "IAB_UNIVERSAL_MED_HEIGHT", "IAB_UNIVERSAL_MED_MAX_SCALE", "IAB_UNIVERSAL_MED_WIDTH", "KRUX_SEGMENT_PARAM", "MAX_BITRATE_KBPS_2G", "MAX_BITRATE_KBPS_4G", "MAX_BITRATE_KBPS_WIFI", "MAX_BITRATE_KPBS_3G", "MAX_INLAYS_ON_SCREEN", "MIME_TYPE_AVC", "MIME_TYPE_HLS", "MIME_TYPE_MP3", "MIME_TYPE_MP4", "ORIENTATION", "PLAYER_STATE", "REQUIRES_AD_TIMER_DURATION", "RESOLUTION_PX_1080P", "RESOLUTION_PX_360P", "RESOLUTION_PX_480P", "RESOLUTION_PX_720P", "SPONSORED_SESSION_UNSKIPPABLE_TIME_SECS", "AdTypes", "ClientAdErrorCode", "PlayerState", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.b reason: case insensitive filesystem */
/* compiled from: AdConstants.kt */
public final class C3675b {
    public static final C3675b a = new C3675b();

    /* renamed from: com.soundcloud.android.foundation.ads.b$a */
    /* compiled from: AdConstants.kt */
    public enum a {
        VIDEO_AD("video_ad"),
        AUDIO_AD("audio_ad"),
        INTERSTITIAL_AD("interstitial"),
        APP_INSTALL_AD("app_install"),
        DISPLAY_AD("display"),
        SPONSORED_SESSION_AD("sponsored_session"),
        ERROR_AUDIO_AD("error_audio_ad"),
        ERROR_VIDEO_AD("error_video_ad");
        
        private final String j;

        private a(String str) {
            this.j = str;
        }

        public final String a() {
            return this.j;
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.b$b reason: collision with other inner class name */
    /* compiled from: AdConstants.kt */
    public enum C0090b {
        GENERAL_LINEAR_FAIL(400),
        GENERAL_COMPANION_FAIL(600),
        GENERAL_ERROR_CODE(900),
        LINEAR_TIMEOUT(402);
        
        private final int f;

        private C0090b(int i) {
            this.f = i;
        }

        public String toString() {
            return String.valueOf(this.f);
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.b$c */
    /* compiled from: AdConstants.kt */
    public enum c {
        UNKNOWN("unknown"),
        EXPANDED("expanded"),
        COLLAPSED("collapsed");
        
        private final String e;

        private c(String str) {
            this.e = str;
        }

        public final String a() {
            return this.e;
        }
    }

    private C3675b() {
    }
}
