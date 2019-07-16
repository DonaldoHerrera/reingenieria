package com.soundcloud.android.foundation.ads;

import java.util.List;

@EVa(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u00013B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u000200J\u000e\u00101\u001a\u0002022\u0006\u0010/\u001a\u000200R\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0018\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\u0018\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u000bR\u0012\u0010\u0016\u001a\u00020\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0018R\u0018\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u000bR\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\u000bR\u0012\u0010$\u001a\u00020%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0018\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u000bR\u0018\u0010*\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010\u000bR\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010\u000b¨\u00064"}, d2 = {"Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "Lcom/soundcloud/android/foundation/ads/AdData;", "()V", "callToActionButtonText", "", "getCallToActionButtonText", "()Ljava/lang/String;", "clickUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "getClickUrls", "()Ljava/util/List;", "displayProperties", "Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "getDisplayProperties", "()Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "finishUrls", "getFinishUrls", "firstQuartileUrls", "getFirstQuartileUrls", "impressionUrls", "getImpressionUrls", "isSkippable", "", "()Z", "pauseUrls", "getPauseUrls", "progressTracking", "Lcom/soundcloud/android/foundation/ads/ApiAdProgressTracking;", "getProgressTracking", "quartileEventsReported", "", "resumeUrls", "getResumeUrls", "secondQuartileUrls", "getSecondQuartileUrls", "skipOffset", "", "getSkipOffset", "()I", "skipUrls", "getSkipUrls", "startUrls", "getStartUrls", "thirdQuartileUrls", "getThirdQuartileUrls", "hasReportedQuartileEvent", "event", "Lcom/soundcloud/android/foundation/ads/PlayableAdData$QuartileEvent;", "setQuartileEventReported", "", "QuartileEvent", "ads_release"}, mv = {1, 1, 15})
/* compiled from: PlayableAdData.kt */
public abstract class U extends C3676c {
    private final boolean[] d = new boolean[a.values().length];

    /* compiled from: PlayableAdData.kt */
    public enum a {
        START,
        FIRST_QUARTILE,
        SECOND_QUARTILE,
        THIRD_QUARTILE,
        FINISH
    }

    public final boolean a(a aVar) {
        C7471uYa.b(aVar, "event");
        return this.d[aVar.ordinal()];
    }

    public final void b(a aVar) {
        C7471uYa.b(aVar, "event");
        this.d[aVar.ordinal()] = true;
    }

    public abstract String m();

    public abstract da n();

    public abstract List<Y> o();

    public abstract List<Y> p();

    public abstract List<Y> q();

    public abstract List<Y> r();

    public abstract List<C3682i> s();

    public abstract List<Y> t();

    public abstract List<Y> u();

    public abstract int v();

    public abstract List<Y> w();

    public abstract List<Y> x();

    public abstract List<Y> y();

    public abstract boolean z();
}
