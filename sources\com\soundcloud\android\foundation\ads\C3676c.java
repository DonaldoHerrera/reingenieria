package com.soundcloud.android.foundation.ads;

@EVa(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0018B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0016\u001a\u00020\u0017R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0012\u0010\u0012\u001a\u00020\u0013X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/soundcloud/android/foundation/ads/AdData;", "", "()V", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "monetizableCreator", "", "getMonetizableCreator", "()Ljava/lang/String;", "setMonetizableCreator", "(Ljava/lang/String;)V", "monetizableTitle", "getMonetizableTitle", "setMonetizableTitle", "monetizableTrackUrn", "getMonetizableTrackUrn", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "hasMonetizableTitleAndCreator", "", "MonetizationType", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.c reason: case insensitive filesystem */
/* compiled from: AdData.kt */
public abstract class C3676c {
    private final C3508cda a = C3508cda.a;
    private String b;
    private String c;

    /* renamed from: com.soundcloud.android.foundation.ads.c$a */
    /* compiled from: AdData.kt */
    public enum a {
        PROMOTED("promoted"),
        INTERSTITIAL("interstitial"),
        LEAVE_BEHIND("leave_behind"),
        HTML_LEAVE_BEHIND("html_leave_behind"),
        AUDIO("audio_ad"),
        ERROR_VIDEO_AD("error_video_ad"),
        ERROR_AUDIO_AD("error_audio_ad"),
        VIDEO("video_ad"),
        INLAY("mobile_inlay"),
        PRESTITIAL("prestitial"),
        SPONSORED_SESSION("sponsored_session");
        
        private final String m;

        private a(String str) {
            this.m = str;
        }

        public final String a() {
            return this.m;
        }
    }

    public final void a(String str) {
        this.c = str;
    }

    public final void b(String str) {
        this.b = str;
    }

    public abstract C3508cda f();

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.b;
    }

    public C3508cda i() {
        return this.a;
    }

    public abstract a k();

    public final boolean l() {
        String str = this.b;
        if (str == null || str.length() == 0) {
            return false;
        }
        String str2 = this.c;
        return !(str2 == null || str2.length() == 0);
    }
}
