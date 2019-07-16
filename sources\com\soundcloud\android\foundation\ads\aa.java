package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@EVa(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0006\b\b\u0018\u0000 \u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0006\u0001\u0001\u0001B\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e\u0012\u0006\u0010\"\u001a\u00020\f\u0012\b\u0010#\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010$\u001a\u00020\b\u0012\u0006\u0010%\u001a\u00020\u001c\u0012\u0006\u0010&\u001a\u00020\b\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000e\u0012\u0006\u0010)\u001a\u00020\f\u0012\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010.\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010/\u001a\u000200\u0012\f\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000e¢\u0006\u0002\u00103J\t\u0010g\u001a\u00020\u0006HÆ\u0003J\u000f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010j\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010k\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010l\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010m\u001a\u00020\u001aHÆ\u0003J\t\u0010n\u001a\u00020\u001cHÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000f\u0010p\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0011\u0010q\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eHÆ\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u00105J\t\u0010s\u001a\u00020\fHÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010u\u001a\u00020\bHÆ\u0003J\t\u0010v\u001a\u00020\u001cHÆ\u0003J\t\u0010w\u001a\u00020\bHÆ\u0003J\u000f\u0010x\u001a\b\u0012\u0004\u0012\u00020(0\u000eHÆ\u0003J\t\u0010y\u001a\u00020\fHÆ\u0003J\u000f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010{\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000f\u0010|\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u0010}\u001a\u00020\nHÆ\u0003J\u000f\u0010~\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u000b\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\n\u0010\u0001\u001a\u000200HÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u0002020\u000eHÆ\u0003J\f\u0010\u0001\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\u0010\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003JÒ\u0003\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000e2\b\b\u0002\u0010\"\u001a\u00020\f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010$\u001a\u00020\b2\b\b\u0002\u0010%\u001a\u00020\u001c2\b\b\u0002\u0010&\u001a\u00020\b2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000e2\b\b\u0002\u0010)\u001a\u00020\f2\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010/\u001a\u0002002\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000eHÆ\u0001¢\u0006\u0003\u0010\u0001J\u0016\u0010\u0001\u001a\u00020\u001a2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0001\u001a\u00020\u001cHÖ\u0001J\n\u0010\u0001\u001a\u00020\fHÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0004¢\u0006\n\n\u0002\u00106\u001a\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0011\u0010)\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b=\u0010:R\u0014\u0010$\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u0010AR\u0011\u0010&\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\bB\u0010?R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u0010<R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u0010<R\u0014\u0010%\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\bE\u0010FR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u0010<R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u0010<R\u0011\u0010I\u001a\u00020(8F¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\bL\u0010<R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u0010<R\u0014\u0010\u0019\u001a\u00020\u001aX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010NR\u0011\u0010O\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\bO\u0010NR\u0016\u0010.\u001a\u0004\u0018\u00010\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\bP\u00108R\u0014\u0010\t\u001a\u00020\nX\u0004¢\u0006\b\n\u0000\u001a\u0004\bQ\u0010RR\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\bS\u0010<R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bT\u0010<R\u0014\u0010/\u001a\u000200X\u0004¢\u0006\b\n\u0000\u001a\u0004\bU\u0010VR\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bW\u0010<R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bX\u0010<R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\bY\u0010<R\u0014\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\bZ\u0010FR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b[\u0010<R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\\\u0010<R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b]\u0010<R\u0013\u0010#\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b^\u0010:R\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b_\u0010<R\u0011\u0010\"\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b`\u0010:R\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\ba\u0010<R\u0011\u0010b\u001a\u00020c8F¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0017\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u000e¢\u0006\b\n\u0000\u001a\u0004\bf\u0010<¨\u0006\u0001"}, d2 = {"Lcom/soundcloud/android/foundation/ads/VideoAd;", "Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "Lcom/soundcloud/android/foundation/ads/ExpirableAd;", "Lcom/soundcloud/android/foundation/ads/PlayBasedAd;", "Lcom/soundcloud/android/foundation/ads/HasVerificationScriptResources;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "adTimerDuration", "", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "callToActionButtonText", "", "impressionUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "startUrls", "finishUrls", "skipUrls", "firstQuartileUrls", "secondQuartileUrls", "thirdQuartileUrls", "pauseUrls", "resumeUrls", "clickUrls", "isSkippable", "", "skipOffset", "", "displayProperties", "Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "errorTrackers", "verificationResources", "Lcom/soundcloud/android/foundation/ads/AdVerificationResource;", "uuid", "title", "createdAt", "expiryInMins", "duration", "videoSources", "Lcom/soundcloud/android/foundation/ads/VideoAdSource;", "clickthroughUrl", "muteUrls", "unmuteUrls", "fullScreenUrls", "exitFullScreenUrls", "monetizableTrackUrn", "priority", "", "progressTracking", "Lcom/soundcloud/android/foundation/ads/ApiAdProgressTracking;", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Long;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JIJLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/domain/Urn;DLjava/util/List;)V", "getAdTimerDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getCallToActionButtonText", "()Ljava/lang/String;", "getClickUrls", "()Ljava/util/List;", "getClickthroughUrl", "getCreatedAt", "()J", "getDisplayProperties", "()Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "getDuration", "getErrorTrackers", "getExitFullScreenUrls", "getExpiryInMins", "()I", "getFinishUrls", "getFirstQuartileUrls", "firstVideoSource", "getFirstVideoSource", "()Lcom/soundcloud/android/foundation/ads/VideoAdSource;", "getFullScreenUrls", "getImpressionUrls", "()Z", "isVerticalVideo", "getMonetizableTrackUrn", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getMuteUrls", "getPauseUrls", "getPriority", "()D", "getProgressTracking", "getResumeUrls", "getSecondQuartileUrls", "getSkipOffset", "getSkipUrls", "getStartUrls", "getThirdQuartileUrls", "getTitle", "getUnmuteUrls", "getUuid", "getVerificationResources", "videoProportion", "", "getVideoProportion", "()F", "getVideoSources", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Long;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;JIJLjava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/domain/Urn;DLjava/util/List;)Lcom/soundcloud/android/foundation/ads/VideoAd;", "equals", "other", "", "hashCode", "toString", "ApiModel", "Companion", "RelatedResources", "ads_release"}, mv = {1, 1, 15})
/* compiled from: VideoAd.kt */
public final class aa extends U implements I, T, L {
    public static final b e = new b(null);
    private final long A;
    private final int B;
    private final long C;
    private final List<ba> D;
    private final String E;
    private final List<Y> F;
    private final List<Y> G;
    private final List<Y> H;
    private final List<Y> I;
    private final C3508cda J;
    private final double K;
    private final List<C3682i> L;
    private final C3508cda f;
    private final Long g;
    private final com.soundcloud.android.foundation.ads.C3676c.a h;
    private final String i;
    private final List<Y> j;
    private final List<Y> k;
    private final List<Y> l;
    private final List<Y> m;
    private final List<Y> n;
    private final List<Y> o;
    private final List<Y> p;
    private final List<Y> q;
    private final List<Y> r;
    private final List<Y> s;
    private final boolean t;
    private final int u;
    private final da v;
    private final List<Y> w;
    private final List<AdVerificationResource> x;
    private final String y;
    private final String z;

    /* compiled from: VideoAd.kt */
    public static final class a implements T, L {
        private final String a;
        private final com.soundcloud.android.foundation.ads.Q.a b;
        private final com.soundcloud.android.foundation.ads.M.a c;
        private final C3508cda d;
        private final int e;
        private final long f;
        private final String g;
        private final String h;
        private final String i;
        private final r j;
        private final List<com.soundcloud.android.foundation.ads.ba.a> k;
        private final C3683j l;
        private final List<C3682i> m;
        private final boolean n;
        private final Integer o;
        private final Long p;
        private final double q;
        private final List<Y> r;
        private final List<AdVerificationResource> s;
        private final c t;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("expiry_in_minutes") int i2, @JsonProperty("duration") long j2, @JsonProperty("title") String str, @JsonProperty("cta_button_text") String str2, @JsonProperty("clickthrough_url") String str3, @JsonProperty("display_properties") r rVar, @JsonProperty("video_sources") List<? extends com.soundcloud.android.foundation.ads.ba.a> list, @JsonProperty("video_tracking") C3683j jVar, @JsonProperty("progress_tracking") List<C3682i> list2, @JsonProperty("skippable") boolean z, @JsonProperty("skip_offset") Integer num, @JsonProperty("frequency_cap_duration") Long l2, @JsonProperty("score") double d2, @JsonProperty("error_trackers") List<Y> list3, @JsonProperty("verification_resources") List<AdVerificationResource> list4, @JsonProperty("_embedded") c cVar) {
            C3508cda cda2 = cda;
            String str4 = str3;
            List<? extends com.soundcloud.android.foundation.ads.ba.a> list5 = list;
            C3683j jVar2 = jVar;
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str3, "clickthroughUrl");
            C7471uYa.b(list5, "videoSources");
            C7471uYa.b(jVar2, "videoTracking");
            this.d = cda2;
            this.e = i2;
            this.f = j2;
            this.g = str;
            this.h = str2;
            this.i = str4;
            this.j = rVar;
            this.k = list5;
            this.l = jVar2;
            this.m = list2;
            this.n = z;
            this.o = num;
            this.p = l2;
            this.q = d2;
            this.r = list3;
            this.s = list4;
            this.t = cVar;
            String uuid = UUID.randomUUID().toString();
            C7471uYa.a((Object) uuid, "UUID.randomUUID().toString()");
            this.a = uuid;
            c cVar2 = this.t;
            com.soundcloud.android.foundation.ads.M.a aVar = null;
            this.b = cVar2 != null ? cVar2.b() : null;
            c cVar3 = this.t;
            if (cVar3 != null) {
                aVar = cVar3.a();
            }
            this.c = aVar;
        }

        @JsonProperty("frequency_cap_duration")
        public Long a() {
            return this.p;
        }

        @JsonProperty("urn")
        public final C3508cda b() {
            return this.d;
        }

        @JsonProperty("progress_tracking")
        public final List<C3682i> c() {
            return this.m;
        }

        @JsonProperty("error_trackers")
        public List<Y> d() {
            return this.r;
        }

        @JsonProperty("clickthrough_url")
        public final String e() {
            return this.i;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.d, (Object) aVar.d)) {
                        if (this.e == aVar.e) {
                            if ((this.f == aVar.f) && C7471uYa.a((Object) this.g, (Object) aVar.g) && C7471uYa.a((Object) this.h, (Object) aVar.h) && C7471uYa.a((Object) this.i, (Object) aVar.i) && C7471uYa.a((Object) this.j, (Object) aVar.j) && C7471uYa.a((Object) this.k, (Object) aVar.k) && C7471uYa.a((Object) this.l, (Object) aVar.l) && C7471uYa.a((Object) this.m, (Object) aVar.m)) {
                                if (!(this.n == aVar.n) || !C7471uYa.a((Object) this.o, (Object) aVar.o) || !C7471uYa.a((Object) a(), (Object) aVar.a()) || Double.compare(j(), aVar.j()) != 0 || !C7471uYa.a((Object) d(), (Object) aVar.d()) || !C7471uYa.a((Object) q(), (Object) aVar.q()) || !C7471uYa.a((Object) this.t, (Object) aVar.t)) {
                                    return false;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @JsonProperty("cta_button_text")
        public final String f() {
            return this.h;
        }

        @JsonProperty("display_properties")
        public final r g() {
            return this.j;
        }

        @JsonProperty("duration")
        public final long h() {
            return this.f;
        }

        public int hashCode() {
            C3508cda cda = this.d;
            int i2 = 0;
            int hashCode = (((cda != null ? cda.hashCode() : 0) * 31) + this.e) * 31;
            long j2 = this.f;
            int i3 = (hashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            String str = this.g;
            int hashCode2 = (i3 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.h;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.i;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            r rVar = this.j;
            int hashCode5 = (hashCode4 + (rVar != null ? rVar.hashCode() : 0)) * 31;
            List<com.soundcloud.android.foundation.ads.ba.a> list = this.k;
            int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
            C3683j jVar = this.l;
            int hashCode7 = (hashCode6 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            List<C3682i> list2 = this.m;
            int hashCode8 = (hashCode7 + (list2 != null ? list2.hashCode() : 0)) * 31;
            boolean z = this.n;
            if (z) {
                z = true;
            }
            int i4 = (hashCode8 + (z ? 1 : 0)) * 31;
            Integer num = this.o;
            int hashCode9 = (i4 + (num != null ? num.hashCode() : 0)) * 31;
            Long a2 = a();
            int hashCode10 = (hashCode9 + (a2 != null ? a2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i5 = (hashCode10 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            List d2 = d();
            int hashCode11 = (i5 + (d2 != null ? d2.hashCode() : 0)) * 31;
            List q2 = q();
            int hashCode12 = (hashCode11 + (q2 != null ? q2.hashCode() : 0)) * 31;
            c cVar = this.t;
            if (cVar != null) {
                i2 = cVar.hashCode();
            }
            return hashCode12 + i2;
        }

        @JsonProperty("expiry_in_minutes")
        public final int i() {
            return this.e;
        }

        @JsonProperty("score")
        public double j() {
            return this.q;
        }

        public final com.soundcloud.android.foundation.ads.M.a k() {
            return this.c;
        }

        public final com.soundcloud.android.foundation.ads.Q.a l() {
            return this.b;
        }

        @JsonProperty("_embedded")
        public final c m() {
            return this.t;
        }

        @JsonProperty("skip_offset")
        public final Integer n() {
            return this.o;
        }

        @JsonProperty("title")
        public final String o() {
            return this.g;
        }

        public final String p() {
            return this.a;
        }

        @JsonProperty("verification_resources")
        public List<AdVerificationResource> q() {
            return this.s;
        }

        @JsonProperty("video_sources")
        public final List<com.soundcloud.android.foundation.ads.ba.a> r() {
            return this.k;
        }

        @JsonProperty("video_tracking")
        public final C3683j s() {
            return this.l;
        }

        @JsonProperty("skippable")
        public final boolean t() {
            return this.n;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiModel(adUrn=");
            sb.append(this.d);
            sb.append(", expiryInMins=");
            sb.append(this.e);
            sb.append(", duration=");
            sb.append(this.f);
            sb.append(", title=");
            sb.append(this.g);
            sb.append(", ctaButtonText=");
            sb.append(this.h);
            sb.append(", clickthroughUrl=");
            sb.append(this.i);
            sb.append(", displayProperties=");
            sb.append(this.j);
            sb.append(", videoSources=");
            sb.append(this.k);
            sb.append(", videoTracking=");
            sb.append(this.l);
            sb.append(", apiAdProgressTracking=");
            sb.append(this.m);
            sb.append(", isSkippable=");
            sb.append(this.n);
            sb.append(", skipOffset=");
            sb.append(this.o);
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", errorTrackers=");
            sb.append(d());
            sb.append(", verificationResources=");
            sb.append(q());
            sb.append(", relatedResources=");
            sb.append(this.t);
            sb.append(")");
            return sb.toString();
        }

        @JsonCreator
        public /* synthetic */ a(C3508cda cda, int i2, long j2, String str, String str2, String str3, r rVar, List list, C3683j jVar, List list2, boolean z, Integer num, Long l2, double d2, List list3, List list4, c cVar, int i3, C7264rYa rya) {
            this(cda, i2, j2, str, str2, str3, rVar, list, jVar, list2, z, num, l2, d2, (i3 & 16384) != 0 ? null : list3, list4, cVar);
        }
    }

    /* compiled from: VideoAd.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public static /* synthetic */ aa a(b bVar, a aVar, long j, com.soundcloud.android.foundation.ads.C3676c.a aVar2, C3508cda cda, int i, Object obj) {
            if ((i & 8) != 0) {
                cda = null;
            }
            return bVar.a(aVar, j, aVar2, cda);
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        @NXa
        public final aa a(a aVar, long j, com.soundcloud.android.foundation.ads.C3676c.a aVar2, C3508cda cda) {
            C7471uYa.b(aVar, "apiModel");
            C7471uYa.b(aVar2, "monetizationType");
            C3683j s = aVar.s();
            C3508cda b = aVar.b();
            Long a = aVar.a();
            String f = aVar.f();
            List f2 = s.f();
            if (f2 == null) {
                f2 = C6918mWa.a();
            }
            List l = s.l();
            if (l == null) {
                l = C6918mWa.a();
            }
            List c = s.c();
            if (c == null) {
                c = C6918mWa.a();
            }
            List k = s.k();
            if (k == null) {
                k = C6918mWa.a();
            }
            List d = s.d();
            if (d == null) {
                d = C6918mWa.a();
            }
            List j2 = s.j();
            if (j2 == null) {
                j2 = C6918mWa.a();
            }
            List m = s.m();
            if (m == null) {
                m = C6918mWa.a();
            }
            List h = s.h();
            if (h == null) {
                h = C6918mWa.a();
            }
            List i = s.i();
            if (i == null) {
                i = C6918mWa.a();
            }
            List a2 = s.a();
            if (a2 == null) {
                a2 = C6918mWa.a();
            }
            boolean t = aVar.t();
            Integer n = aVar.n();
            int intValue = n != null ? n.intValue() : 15;
            r g = aVar.g();
            da a3 = g != null ? da.a.a(g) : null;
            List d2 = aVar.d();
            if (d2 == null) {
                d2 = C6918mWa.a();
            }
            List list = d2;
            List q = aVar.q();
            String p = aVar.p();
            String o = aVar.o();
            int i2 = aVar.i();
            long h2 = aVar.h();
            List<com.soundcloud.android.foundation.ads.ba.a> r = aVar.r();
            List list2 = a2;
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) r, 10));
            for (com.soundcloud.android.foundation.ads.ba.a a4 : r) {
                arrayList.add(ba.a(a4));
            }
            String e = aVar.e();
            List g2 = s.g();
            if (g2 == null) {
                g2 = C6918mWa.a();
            }
            List list3 = g2;
            List n2 = s.n();
            if (n2 == null) {
                n2 = C6918mWa.a();
            }
            List list4 = n2;
            List e2 = s.e();
            if (e2 == null) {
                e2 = C6918mWa.a();
            }
            List list5 = e2;
            List b2 = s.b();
            if (b2 == null) {
                b2 = C6918mWa.a();
            }
            List list6 = b2;
            double j3 = aVar.j();
            List c2 = aVar.c();
            if (c2 == null) {
                c2 = C6918mWa.a();
            }
            aa aaVar = new aa(b, a, aVar2, f, f2, l, c, k, d, j2, m, h, i, list2, t, intValue, a3, list, q, p, o, j, i2, h2, arrayList, e, list3, list4, list5, list6, cda, j3, c2);
            return aaVar;
        }

        public final aa a(a aVar, long j, C3508cda cda) {
            C7471uYa.b(aVar, "apiModel");
            C7471uYa.b(cda, "monetizableTrackUrn");
            return a(aVar, j, com.soundcloud.android.foundation.ads.C3676c.a.VIDEO, cda);
        }
    }

    /* compiled from: VideoAd.kt */
    public static final class c {
        private final com.soundcloud.android.foundation.ads.Q.a a;
        private final com.soundcloud.android.foundation.ads.M.a b;

        @JsonCreator
        public c(@JsonProperty("leave_behind") com.soundcloud.android.foundation.ads.Q.a aVar, @JsonProperty("html_leave_behind") com.soundcloud.android.foundation.ads.M.a aVar2) {
            this.a = aVar;
            this.b = aVar2;
        }

        @JsonProperty("html_leave_behind")
        public final com.soundcloud.android.foundation.ads.M.a a() {
            return this.b;
        }

        @JsonProperty("leave_behind")
        public final com.soundcloud.android.foundation.ads.Q.a b() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            com.soundcloud.android.foundation.ads.Q.a aVar = this.a;
            int i = 0;
            int hashCode = (aVar != null ? aVar.hashCode() : 0) * 31;
            com.soundcloud.android.foundation.ads.M.a aVar2 = this.b;
            if (aVar2 != null) {
                i = aVar2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RelatedResources(leaveBehindAd=");
            sb.append(this.a);
            sb.append(", htmlLeaveBehindAd=");
            sb.append(this.b);
            sb.append(")");
            return sb.toString();
        }
    }

    public aa(C3508cda cda, Long l2, com.soundcloud.android.foundation.ads.C3676c.a aVar, String str, List<Y> list, List<Y> list2, List<Y> list3, List<Y> list4, List<Y> list5, List<Y> list6, List<Y> list7, List<Y> list8, List<Y> list9, List<Y> list10, boolean z2, int i2, da daVar, List<Y> list11, List<AdVerificationResource> list12, String str2, String str3, long j2, int i3, long j3, List<? extends ba> list13, String str4, List<Y> list14, List<Y> list15, List<Y> list16, List<Y> list17, C3508cda cda2, double d, List<C3682i> list18) {
        C3508cda cda3 = cda;
        com.soundcloud.android.foundation.ads.C3676c.a aVar2 = aVar;
        List<Y> list19 = list;
        List<Y> list20 = list2;
        List<Y> list21 = list3;
        List<Y> list22 = list4;
        List<Y> list23 = list5;
        List<Y> list24 = list6;
        List<Y> list25 = list7;
        List<Y> list26 = list8;
        List<Y> list27 = list9;
        List<Y> list28 = list10;
        List<Y> list29 = list11;
        String str5 = str2;
        List<? extends ba> list30 = list13;
        String str6 = str4;
        C7471uYa.b(cda3, "adUrn");
        C7471uYa.b(aVar2, "monetizationType");
        C7471uYa.b(list19, "impressionUrls");
        C7471uYa.b(list20, "startUrls");
        C7471uYa.b(list21, "finishUrls");
        C7471uYa.b(list22, "skipUrls");
        C7471uYa.b(list23, "firstQuartileUrls");
        C7471uYa.b(list24, "secondQuartileUrls");
        C7471uYa.b(list25, "thirdQuartileUrls");
        C7471uYa.b(list26, "pauseUrls");
        C7471uYa.b(list27, "resumeUrls");
        C7471uYa.b(list28, "clickUrls");
        C7471uYa.b(list29, "errorTrackers");
        C7471uYa.b(str5, "uuid");
        C7471uYa.b(list30, "videoSources");
        C7471uYa.b(str4, "clickthroughUrl");
        C7471uYa.b(list14, "muteUrls");
        C7471uYa.b(list15, "unmuteUrls");
        C7471uYa.b(list16, "fullScreenUrls");
        C7471uYa.b(list17, "exitFullScreenUrls");
        C7471uYa.b(list18, "progressTracking");
        String str7 = str4;
        this.f = cda3;
        this.g = l2;
        this.h = aVar2;
        this.i = str;
        this.j = list19;
        this.k = list20;
        this.l = list21;
        this.m = list22;
        this.n = list23;
        this.o = list24;
        this.p = list25;
        this.q = list26;
        this.r = list27;
        this.s = list28;
        this.t = z2;
        this.u = i2;
        this.v = daVar;
        this.w = list29;
        this.x = list12;
        this.y = str5;
        this.z = str3;
        this.A = j2;
        this.B = i3;
        this.C = j3;
        this.D = list13;
        this.E = str7;
        List<Y> list31 = list15;
        this.F = list14;
        this.G = list31;
        List<Y> list32 = list17;
        this.H = list16;
        this.I = list32;
        this.J = cda2;
        this.K = d;
        this.L = list18;
    }

    @NXa
    public static final aa a(a aVar, long j2, com.soundcloud.android.foundation.ads.C3676c.a aVar2) {
        return b.a(e, aVar, j2, aVar2, null, 8, null);
    }

    public List<Y> A() {
        return this.s;
    }

    public final long B() {
        return this.C;
    }

    public final List<Y> C() {
        return this.I;
    }

    public final ba D() {
        return (ba) C7676xWa.f((List) this.D);
    }

    public final List<Y> E() {
        return this.H;
    }

    public final List<Y> F() {
        return this.F;
    }

    public final String G() {
        return this.z;
    }

    public final List<Y> H() {
        return this.G;
    }

    public final String I() {
        return this.y;
    }

    public List<AdVerificationResource> J() {
        return this.x;
    }

    public final float K() {
        ba D2 = D();
        return ((float) D2.b()) / ((float) D2.g());
    }

    public final List<ba> L() {
        return this.D;
    }

    public final boolean M() {
        ba D2 = D();
        return D2.b() > D2.g();
    }

    public Long a() {
        return this.g;
    }

    public long b() {
        return this.A;
    }

    public final String c() {
        return this.E;
    }

    public List<Y> d() {
        return this.w;
    }

    public int e() {
        return this.B;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof aa) {
                aa aaVar = (aa) obj;
                if (C7471uYa.a((Object) f(), (Object) aaVar.f()) && C7471uYa.a((Object) a(), (Object) aaVar.a()) && C7471uYa.a((Object) k(), (Object) aaVar.k()) && C7471uYa.a((Object) m(), (Object) aaVar.m()) && C7471uYa.a((Object) q(), (Object) aaVar.q()) && C7471uYa.a((Object) x(), (Object) aaVar.x()) && C7471uYa.a((Object) o(), (Object) aaVar.o()) && C7471uYa.a((Object) w(), (Object) aaVar.w()) && C7471uYa.a((Object) p(), (Object) aaVar.p()) && C7471uYa.a((Object) u(), (Object) aaVar.u()) && C7471uYa.a((Object) y(), (Object) aaVar.y()) && C7471uYa.a((Object) r(), (Object) aaVar.r()) && C7471uYa.a((Object) t(), (Object) aaVar.t()) && C7471uYa.a((Object) A(), (Object) aaVar.A())) {
                    if (z() == aaVar.z()) {
                        if ((v() == aaVar.v()) && C7471uYa.a((Object) n(), (Object) aaVar.n()) && C7471uYa.a((Object) d(), (Object) aaVar.d()) && C7471uYa.a((Object) J(), (Object) aaVar.J()) && C7471uYa.a((Object) this.y, (Object) aaVar.y) && C7471uYa.a((Object) this.z, (Object) aaVar.z)) {
                            if (b() == aaVar.b()) {
                                if (e() == aaVar.e()) {
                                    if (!(this.C == aaVar.C) || !C7471uYa.a((Object) this.D, (Object) aaVar.D) || !C7471uYa.a((Object) this.E, (Object) aaVar.E) || !C7471uYa.a((Object) this.F, (Object) aaVar.F) || !C7471uYa.a((Object) this.G, (Object) aaVar.G) || !C7471uYa.a((Object) this.H, (Object) aaVar.H) || !C7471uYa.a((Object) this.I, (Object) aaVar.I) || !C7471uYa.a((Object) i(), (Object) aaVar.i()) || Double.compare(j(), aaVar.j()) != 0 || !C7471uYa.a((Object) s(), (Object) aaVar.s())) {
                                        return false;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public C3508cda f() {
        return this.f;
    }

    public int hashCode() {
        C3508cda f2 = f();
        int i2 = 0;
        int hashCode = (f2 != null ? f2.hashCode() : 0) * 31;
        Long a2 = a();
        int hashCode2 = (hashCode + (a2 != null ? a2.hashCode() : 0)) * 31;
        com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
        int hashCode3 = (hashCode2 + (k2 != null ? k2.hashCode() : 0)) * 31;
        String m2 = m();
        int hashCode4 = (hashCode3 + (m2 != null ? m2.hashCode() : 0)) * 31;
        List q2 = q();
        int hashCode5 = (hashCode4 + (q2 != null ? q2.hashCode() : 0)) * 31;
        List x2 = x();
        int hashCode6 = (hashCode5 + (x2 != null ? x2.hashCode() : 0)) * 31;
        List o2 = o();
        int hashCode7 = (hashCode6 + (o2 != null ? o2.hashCode() : 0)) * 31;
        List w2 = w();
        int hashCode8 = (hashCode7 + (w2 != null ? w2.hashCode() : 0)) * 31;
        List p2 = p();
        int hashCode9 = (hashCode8 + (p2 != null ? p2.hashCode() : 0)) * 31;
        List u2 = u();
        int hashCode10 = (hashCode9 + (u2 != null ? u2.hashCode() : 0)) * 31;
        List y2 = y();
        int hashCode11 = (hashCode10 + (y2 != null ? y2.hashCode() : 0)) * 31;
        List r2 = r();
        int hashCode12 = (hashCode11 + (r2 != null ? r2.hashCode() : 0)) * 31;
        List t2 = t();
        int hashCode13 = (hashCode12 + (t2 != null ? t2.hashCode() : 0)) * 31;
        List A2 = A();
        int hashCode14 = (hashCode13 + (A2 != null ? A2.hashCode() : 0)) * 31;
        boolean z2 = z();
        if (z2) {
            z2 = true;
        }
        int v2 = (((hashCode14 + (z2 ? 1 : 0)) * 31) + v()) * 31;
        da n2 = n();
        int hashCode15 = (v2 + (n2 != null ? n2.hashCode() : 0)) * 31;
        List d = d();
        int hashCode16 = (hashCode15 + (d != null ? d.hashCode() : 0)) * 31;
        List J2 = J();
        int hashCode17 = (hashCode16 + (J2 != null ? J2.hashCode() : 0)) * 31;
        String str = this.y;
        int hashCode18 = (hashCode17 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.z;
        int hashCode19 = (hashCode18 + (str2 != null ? str2.hashCode() : 0)) * 31;
        long b2 = b();
        int e2 = (((hashCode19 + ((int) (b2 ^ (b2 >>> 32)))) * 31) + e()) * 31;
        long j2 = this.C;
        int i3 = (e2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        List<ba> list = this.D;
        int hashCode20 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        String str3 = this.E;
        int hashCode21 = (hashCode20 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<Y> list2 = this.F;
        int hashCode22 = (hashCode21 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Y> list3 = this.G;
        int hashCode23 = (hashCode22 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<Y> list4 = this.H;
        int hashCode24 = (hashCode23 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<Y> list5 = this.I;
        int hashCode25 = (hashCode24 + (list5 != null ? list5.hashCode() : 0)) * 31;
        C3508cda i4 = i();
        int hashCode26 = (hashCode25 + (i4 != null ? i4.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(j());
        int i5 = (hashCode26 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        List s2 = s();
        if (s2 != null) {
            i2 = s2.hashCode();
        }
        return i5 + i2;
    }

    public C3508cda i() {
        return this.J;
    }

    public double j() {
        return this.K;
    }

    public com.soundcloud.android.foundation.ads.C3676c.a k() {
        return this.h;
    }

    public String m() {
        return this.i;
    }

    public da n() {
        return this.v;
    }

    public List<Y> o() {
        return this.l;
    }

    public List<Y> p() {
        return this.n;
    }

    public List<Y> q() {
        return this.j;
    }

    public List<Y> r() {
        return this.q;
    }

    public List<C3682i> s() {
        return this.L;
    }

    public List<Y> t() {
        return this.r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VideoAd(adUrn=");
        sb.append(f());
        sb.append(", adTimerDuration=");
        sb.append(a());
        sb.append(", monetizationType=");
        sb.append(k());
        sb.append(", callToActionButtonText=");
        sb.append(m());
        sb.append(", impressionUrls=");
        sb.append(q());
        sb.append(", startUrls=");
        sb.append(x());
        sb.append(", finishUrls=");
        sb.append(o());
        sb.append(", skipUrls=");
        sb.append(w());
        sb.append(", firstQuartileUrls=");
        sb.append(p());
        sb.append(", secondQuartileUrls=");
        sb.append(u());
        sb.append(", thirdQuartileUrls=");
        sb.append(y());
        sb.append(", pauseUrls=");
        sb.append(r());
        sb.append(", resumeUrls=");
        sb.append(t());
        sb.append(", clickUrls=");
        sb.append(A());
        sb.append(", isSkippable=");
        sb.append(z());
        sb.append(", skipOffset=");
        sb.append(v());
        sb.append(", displayProperties=");
        sb.append(n());
        sb.append(", errorTrackers=");
        sb.append(d());
        sb.append(", verificationResources=");
        sb.append(J());
        sb.append(", uuid=");
        sb.append(this.y);
        sb.append(", title=");
        sb.append(this.z);
        sb.append(", createdAt=");
        sb.append(b());
        sb.append(", expiryInMins=");
        sb.append(e());
        sb.append(", duration=");
        sb.append(this.C);
        sb.append(", videoSources=");
        sb.append(this.D);
        sb.append(", clickthroughUrl=");
        sb.append(this.E);
        sb.append(", muteUrls=");
        sb.append(this.F);
        sb.append(", unmuteUrls=");
        sb.append(this.G);
        sb.append(", fullScreenUrls=");
        sb.append(this.H);
        sb.append(", exitFullScreenUrls=");
        sb.append(this.I);
        sb.append(", monetizableTrackUrn=");
        sb.append(i());
        sb.append(", priority=");
        sb.append(j());
        sb.append(", progressTracking=");
        sb.append(s());
        sb.append(")");
        return sb.toString();
    }

    public List<Y> u() {
        return this.o;
    }

    public int v() {
        return this.u;
    }

    public List<Y> w() {
        return this.m;
    }

    public List<Y> x() {
        return this.k;
    }

    public List<Y> y() {
        return this.p;
    }

    public boolean z() {
        return this.t;
    }
}
