package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@EVa(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b\u0007\b\b\u0018\u0000 q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0003pqrB±\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f\u0012\u0006\u0010#\u001a\u00020$\u0012\u000e\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\f\u0012\f\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\f\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0002\u0010+J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010S\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\t\u0010U\u001a\u00020\u0019HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\u000f\u0010X\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010Y\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010Z\u001a\u00020\u0007HÆ\u0003J\u000f\u0010[\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010\\\u001a\b\u0012\u0004\u0012\u00020\"0\fHÆ\u0003J\t\u0010]\u001a\u00020$HÆ\u0003J\u0011\u0010^\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\fHÆ\u0003J\u000f\u0010_\u001a\b\u0012\u0004\u0012\u00020(0\fHÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010*HÆ\u0003J\t\u0010a\u001a\u00020\u0005HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010/J\u000f\u0010c\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010d\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010e\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010f\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010g\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Jì\u0002\u0010h\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u000e\b\u0002\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f2\b\b\u0002\u0010#\u001a\u00020$2\u0010\b\u0002\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\f2\u000e\b\u0002\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\f2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*HÆ\u0001¢\u0006\u0002\u0010iJ\u0013\u0010j\u001a\u00020\u00172\b\u0010k\u001a\u0004\u0018\u00010lHÖ\u0003J\u0006\u0010m\u001a\u00020\u0017J\t\u0010n\u001a\u00020\u0019HÖ\u0001J\t\u0010o\u001a\u00020\u001bHÖ\u0001R\u0013\u0010)\u001a\u0004\u0018\u00010*¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\"0\f¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00104R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b8\u00104R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0004¢\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b<\u00104R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0014\u0010\u0016\u001a\u00020\u0017X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010?R\u0014\u0010\b\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b@\u00102R\u0014\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bC\u00104R\u0014\u0010#\u001a\u00020$X\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010ER\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bF\u00104R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bG\u00104R\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0014\u0010\u0018\u001a\u00020\u0019X\u0004¢\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bL\u00104R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u001c\u0010%\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\bN\u00104¨\u0006s"}, d2 = {"Lcom/soundcloud/android/foundation/ads/AudioAd;", "Lcom/soundcloud/android/foundation/ads/PlayableAdData;", "Lcom/soundcloud/android/foundation/ads/PlayBasedAd;", "Lcom/soundcloud/android/foundation/ads/HasVerificationScriptResources;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "monetizableTrackUrn", "adTimerDuration", "", "impressionUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "startUrls", "finishUrls", "skipUrls", "firstQuartileUrls", "secondQuartileUrls", "thirdQuartileUrls", "pauseUrls", "resumeUrls", "isSkippable", "", "skipOffset", "", "callToActionButtonText", "", "displayProperties", "Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "errorTrackers", "clickUrls", "companionImpressionUrls", "audioSources", "Lcom/soundcloud/android/foundation/ads/AudioAdSource;", "priority", "", "verificationResources", "Lcom/soundcloud/android/foundation/ads/AdVerificationResource;", "progressTracking", "Lcom/soundcloud/android/foundation/ads/ApiAdProgressTracking;", "adCompanion", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILjava/lang/String;Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;)V", "getAdCompanion", "()Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;", "getAdTimerDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getAudioSources", "()Ljava/util/List;", "getCallToActionButtonText", "()Ljava/lang/String;", "getClickUrls", "getCompanionImpressionUrls", "getDisplayProperties", "()Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;", "getErrorTrackers", "getFinishUrls", "getFirstQuartileUrls", "getImpressionUrls", "()Z", "getMonetizableTrackUrn", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getPauseUrls", "getPriority", "()D", "getProgressTracking", "getResumeUrls", "getSecondQuartileUrls", "getSkipOffset", "()I", "getSkipUrls", "getStartUrls", "getThirdQuartileUrls", "getVerificationResources", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;ZILjava/lang/String;Lcom/soundcloud/android/foundation/ads/VisualAdDisplayProperties;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;DLjava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;)Lcom/soundcloud/android/foundation/ads/AudioAd;", "equals", "other", "", "hasCompanion", "hashCode", "toString", "ApiModel", "Companion", "RelatedResources", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.u reason: case insensitive filesystem */
/* compiled from: AudioAd.kt */
public final class C3693u extends U implements T, L {
    public static final b e = new b(null);
    private final double A;
    private final List<AdVerificationResource> B;
    private final List<C3682i> C;
    private final C3688o D;
    private final C3508cda f;
    private final com.soundcloud.android.foundation.ads.C3676c.a g;
    private final C3508cda h;
    private final Long i;
    private final List<Y> j;
    private final List<Y> k;
    private final List<Y> l;
    private final List<Y> m;
    private final List<Y> n;
    private final List<Y> o;
    private final List<Y> p;
    private final List<Y> q;
    private final List<Y> r;
    private final boolean s;
    private final int t;
    private final String u;
    private final da v;
    private final List<Y> w;
    private final List<Y> x;
    private final List<Y> y;
    private final List<C3694v> z;

    /* renamed from: com.soundcloud.android.foundation.ads.u$a */
    /* compiled from: AudioAd.kt */
    public static final class a implements T, L {
        private final com.soundcloud.android.foundation.ads.C3688o.b a;
        private final com.soundcloud.android.foundation.ads.C3688o.a b;
        private final com.soundcloud.android.foundation.ads.Q.a c;
        private final com.soundcloud.android.foundation.ads.M.a d;
        private final C3508cda e;
        private final boolean f;
        private final Integer g;
        private final c h;
        private final List<com.soundcloud.android.foundation.ads.C3694v.a> i;
        private final C3683j j;
        private final List<C3682i> k;
        private final Long l;
        private final double m;
        private final List<Y> n;
        private final List<AdVerificationResource> o;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("skippable") boolean z, @JsonProperty("skip_offset") Integer num, @JsonProperty("_embedded") c cVar, @JsonProperty("audio_sources") List<com.soundcloud.android.foundation.ads.C3694v.a> list, @JsonProperty("audio_tracking") C3683j jVar, @JsonProperty("progress_tracking") List<C3682i> list2, @JsonProperty("frequency_cap_duration") Long l2, @JsonProperty("score") double d2, @JsonProperty("error_trackers") List<Y> list3, @JsonProperty("verification_resources") List<AdVerificationResource> list4) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(cVar, "relatedResources");
            C7471uYa.b(list, "audioSources");
            C7471uYa.b(jVar, "apiAdTracking");
            this.e = cda;
            this.f = z;
            this.g = num;
            this.h = cVar;
            this.i = list;
            this.j = jVar;
            this.k = list2;
            this.l = l2;
            this.m = d2;
            this.n = list3;
            this.o = list4;
            this.a = this.h.a();
            this.b = this.h.b();
            this.c = this.h.d();
            this.d = this.h.c();
        }

        public Long a() {
            return this.l;
        }

        public final C3508cda b() {
            return this.e;
        }

        public final List<C3682i> c() {
            return this.k;
        }

        public List<Y> d() {
            return this.n;
        }

        public final C3683j e() {
            return this.j;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) this.e, (Object) aVar.e)) {
                        if (!(this.f == aVar.f) || !C7471uYa.a((Object) this.g, (Object) aVar.g) || !C7471uYa.a((Object) this.h, (Object) aVar.h) || !C7471uYa.a((Object) this.i, (Object) aVar.i) || !C7471uYa.a((Object) this.j, (Object) aVar.j) || !C7471uYa.a((Object) this.k, (Object) aVar.k) || !C7471uYa.a((Object) a(), (Object) aVar.a()) || Double.compare(j(), aVar.j()) != 0 || !C7471uYa.a((Object) d(), (Object) aVar.d()) || !C7471uYa.a((Object) m(), (Object) aVar.m())) {
                            return false;
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final List<com.soundcloud.android.foundation.ads.C3694v.a> f() {
            return this.i;
        }

        public final com.soundcloud.android.foundation.ads.C3688o.b g() {
            return this.a;
        }

        public final com.soundcloud.android.foundation.ads.C3688o.a h() {
            return this.b;
        }

        public int hashCode() {
            C3508cda cda = this.e;
            int i2 = 0;
            int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
            boolean z = this.f;
            if (z) {
                z = true;
            }
            int i3 = (hashCode + (z ? 1 : 0)) * 31;
            Integer num = this.g;
            int hashCode2 = (i3 + (num != null ? num.hashCode() : 0)) * 31;
            c cVar = this.h;
            int hashCode3 = (hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31;
            List<com.soundcloud.android.foundation.ads.C3694v.a> list = this.i;
            int hashCode4 = (hashCode3 + (list != null ? list.hashCode() : 0)) * 31;
            C3683j jVar = this.j;
            int hashCode5 = (hashCode4 + (jVar != null ? jVar.hashCode() : 0)) * 31;
            List<C3682i> list2 = this.k;
            int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
            Long a2 = a();
            int hashCode7 = (hashCode6 + (a2 != null ? a2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i4 = (hashCode7 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            List d2 = d();
            int hashCode8 = (i4 + (d2 != null ? d2.hashCode() : 0)) * 31;
            List m2 = m();
            if (m2 != null) {
                i2 = m2.hashCode();
            }
            return hashCode8 + i2;
        }

        public final com.soundcloud.android.foundation.ads.M.a i() {
            return this.d;
        }

        public double j() {
            return this.m;
        }

        public final com.soundcloud.android.foundation.ads.Q.a k() {
            return this.c;
        }

        public final Integer l() {
            return this.g;
        }

        public List<AdVerificationResource> m() {
            return this.o;
        }

        public final boolean n() {
            return this.f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiModel(adUrn=");
            sb.append(this.e);
            sb.append(", isSkippable=");
            sb.append(this.f);
            sb.append(", skipOffset=");
            sb.append(this.g);
            sb.append(", relatedResources=");
            sb.append(this.h);
            sb.append(", audioSources=");
            sb.append(this.i);
            sb.append(", apiAdTracking=");
            sb.append(this.j);
            sb.append(", apiAdProgressTracking=");
            sb.append(this.k);
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", errorTrackers=");
            sb.append(d());
            sb.append(", verificationResources=");
            sb.append(m());
            sb.append(")");
            return sb.toString();
        }

        @JsonCreator
        public /* synthetic */ a(C3508cda cda, boolean z, Integer num, c cVar, List list, C3683j jVar, List list2, Long l2, double d2, List list3, List list4, int i2, C7264rYa rya) {
            this(cda, z, num, cVar, list, jVar, list2, l2, d2, (i2 & 512) != 0 ? null : list3, list4);
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.u$b */
    /* compiled from: AudioAd.kt */
    public static final class b {
        private b() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fa, code lost:
            if (r1 != null) goto L_0x0101;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x0109, code lost:
            if (r1 != null) goto L_0x0110;
         */
        /* JADX WARNING: Removed duplicated region for block: B:43:0x00ee  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00f6  */
        /* JADX WARNING: Removed duplicated region for block: B:51:0x0105  */
        /* JADX WARNING: Removed duplicated region for block: B:57:0x012d A[LOOP:0: B:55:0x0127->B:57:0x012d, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:60:0x0150  */
        @NXa
        public final C3693u a(a aVar, C3508cda cda) {
            da daVar;
            List d;
            List list;
            List list2;
            Iterator it;
            List c;
            C7471uYa.b(aVar, "apiModel");
            C7471uYa.b(cda, "monetizableUrn");
            C3688o a = a(aVar);
            C3508cda b = aVar.b();
            com.soundcloud.android.foundation.ads.C3676c.a aVar2 = com.soundcloud.android.foundation.ads.C3676c.a.AUDIO;
            Long a2 = aVar.a();
            List f = aVar.e().f();
            if (f == null) {
                f = C6918mWa.a();
            }
            List list3 = f;
            List l = aVar.e().l();
            if (l == null) {
                l = C6918mWa.a();
            }
            List list4 = l;
            List c2 = aVar.e().c();
            if (c2 == null) {
                c2 = C6918mWa.a();
            }
            List list5 = c2;
            List k = aVar.e().k();
            if (k == null) {
                k = C6918mWa.a();
            }
            List list6 = k;
            List d2 = aVar.e().d();
            if (d2 == null) {
                d2 = C6918mWa.a();
            }
            List list7 = d2;
            List j = aVar.e().j();
            if (j == null) {
                j = C6918mWa.a();
            }
            List list8 = j;
            List m = aVar.e().m();
            if (m == null) {
                m = C6918mWa.a();
            }
            List list9 = m;
            List h = aVar.e().h();
            if (h == null) {
                h = C6918mWa.a();
            }
            List list10 = h;
            List i = aVar.e().i();
            if (i == null) {
                i = C6918mWa.a();
            }
            List list11 = i;
            boolean n = aVar.n();
            Integer l2 = aVar.l();
            int intValue = l2 != null ? l2.intValue() : 15;
            com.soundcloud.android.foundation.ads.C3688o.b g = aVar.g();
            String e = g != null ? g.e() : null;
            com.soundcloud.android.foundation.ads.C3688o.b g2 = aVar.g();
            if (g2 != null) {
                r f2 = g2.f();
                if (f2 != null) {
                    daVar = da.a.a(f2);
                    d = aVar.d();
                    if (d == null) {
                        d = C6918mWa.a();
                    }
                    List list12 = d;
                    if (a != null) {
                        list = a.b();
                    }
                    list = C6918mWa.a();
                    List list13 = list;
                    if (a != null) {
                        list2 = a.c();
                    }
                    list2 = C6918mWa.a();
                    List list14 = list2;
                    List f3 = aVar.f();
                    String str = e;
                    ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) f3, 10));
                    it = f3.iterator();
                    while (it.hasNext()) {
                        Iterator it2 = it;
                        arrayList.add(C3694v.a.a((com.soundcloud.android.foundation.ads.C3694v.a) it.next()));
                        it = it2;
                    }
                    double j2 = aVar.j();
                    List m2 = aVar.m();
                    c = aVar.c();
                    if (c == null) {
                        c = C6918mWa.a();
                    }
                    C3693u uVar = new C3693u(b, aVar2, cda, a2, list3, list4, list5, list6, list7, list8, list9, list10, list11, n, intValue, str, daVar, list12, list13, list14, arrayList, j2, m2, c, a);
                    return uVar;
                }
            }
            daVar = null;
            d = aVar.d();
            if (d == null) {
            }
            List list122 = d;
            if (a != null) {
            }
            list = C6918mWa.a();
            List list132 = list;
            if (a != null) {
            }
            list2 = C6918mWa.a();
            List list142 = list2;
            List f32 = aVar.f();
            String str2 = e;
            ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) f32, 10));
            it = f32.iterator();
            while (it.hasNext()) {
            }
            double j22 = aVar.j();
            List m22 = aVar.m();
            c = aVar.c();
            if (c == null) {
            }
            C3693u uVar2 = new C3693u(b, aVar2, cda, a2, list3, list4, list5, list6, list7, list8, list9, list10, list11, n, intValue, str2, daVar, list122, list132, list142, arrayList2, j22, m22, c, a);
            return uVar2;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }

        private final C3688o a(a aVar) {
            com.soundcloud.android.foundation.ads.C3688o.a h = aVar.h();
            return h != null ? h : aVar.g();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.u$c */
    /* compiled from: AudioAd.kt */
    public static final class c {
        private final com.soundcloud.android.foundation.ads.C3688o.b a;
        private final com.soundcloud.android.foundation.ads.C3688o.a b;
        private final com.soundcloud.android.foundation.ads.Q.a c;
        private final com.soundcloud.android.foundation.ads.M.a d;

        @JsonCreator
        public c(@JsonProperty("visual_ad") com.soundcloud.android.foundation.ads.C3688o.b bVar, @JsonProperty("html_visual_ad") com.soundcloud.android.foundation.ads.C3688o.a aVar, @JsonProperty("leave_behind") com.soundcloud.android.foundation.ads.Q.a aVar2, @JsonProperty("html_leave_behind") com.soundcloud.android.foundation.ads.M.a aVar3) {
            this.a = bVar;
            this.b = aVar;
            this.c = aVar2;
            this.d = aVar3;
        }

        public final com.soundcloud.android.foundation.ads.C3688o.b a() {
            return this.a;
        }

        public final com.soundcloud.android.foundation.ads.C3688o.a b() {
            return this.b;
        }

        public final com.soundcloud.android.foundation.ads.M.a c() {
            return this.d;
        }

        public final com.soundcloud.android.foundation.ads.Q.a d() {
            return this.c;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0033;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof c) {
                    c cVar = (c) obj;
                    if (C7471uYa.a((Object) this.a, (Object) cVar.a)) {
                        if (C7471uYa.a((Object) this.b, (Object) cVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) cVar.c)) {
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            com.soundcloud.android.foundation.ads.C3688o.b bVar = this.a;
            int i = 0;
            int hashCode = (bVar != null ? bVar.hashCode() : 0) * 31;
            com.soundcloud.android.foundation.ads.C3688o.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            com.soundcloud.android.foundation.ads.Q.a aVar2 = this.c;
            int hashCode3 = (hashCode2 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31;
            com.soundcloud.android.foundation.ads.M.a aVar3 = this.d;
            if (aVar3 != null) {
                i = aVar3.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("RelatedResources(companion=");
            sb.append(this.a);
            sb.append(", htmlCompanion=");
            sb.append(this.b);
            sb.append(", leaveBehind=");
            sb.append(this.c);
            sb.append(", htmlLeaveBehind=");
            sb.append(this.d);
            sb.append(")");
            return sb.toString();
        }
    }

    public C3693u(C3508cda cda, com.soundcloud.android.foundation.ads.C3676c.a aVar, C3508cda cda2, Long l2, List<Y> list, List<Y> list2, List<Y> list3, List<Y> list4, List<Y> list5, List<Y> list6, List<Y> list7, List<Y> list8, List<Y> list9, boolean z2, int i2, String str, da daVar, List<Y> list10, List<Y> list11, List<Y> list12, List<C3694v> list13, double d, List<AdVerificationResource> list14, List<C3682i> list15, C3688o oVar) {
        C3508cda cda3 = cda;
        com.soundcloud.android.foundation.ads.C3676c.a aVar2 = aVar;
        C3508cda cda4 = cda2;
        List<Y> list16 = list;
        List<Y> list17 = list2;
        List<Y> list18 = list3;
        List<Y> list19 = list4;
        List<Y> list20 = list5;
        List<Y> list21 = list6;
        List<Y> list22 = list7;
        List<Y> list23 = list8;
        List<Y> list24 = list9;
        List<Y> list25 = list10;
        List<Y> list26 = list11;
        List<Y> list27 = list12;
        List<C3694v> list28 = list13;
        C7471uYa.b(cda3, "adUrn");
        C7471uYa.b(aVar2, "monetizationType");
        C7471uYa.b(cda4, "monetizableTrackUrn");
        C7471uYa.b(list16, "impressionUrls");
        C7471uYa.b(list17, "startUrls");
        C7471uYa.b(list18, "finishUrls");
        C7471uYa.b(list19, "skipUrls");
        C7471uYa.b(list20, "firstQuartileUrls");
        C7471uYa.b(list21, "secondQuartileUrls");
        C7471uYa.b(list22, "thirdQuartileUrls");
        C7471uYa.b(list23, "pauseUrls");
        C7471uYa.b(list24, "resumeUrls");
        C7471uYa.b(list25, "errorTrackers");
        C7471uYa.b(list26, "clickUrls");
        C7471uYa.b(list27, "companionImpressionUrls");
        C7471uYa.b(list13, "audioSources");
        C7471uYa.b(list15, "progressTracking");
        List<C3694v> list29 = list13;
        this.f = cda3;
        this.g = aVar2;
        this.h = cda4;
        this.i = l2;
        this.j = list16;
        this.k = list17;
        this.l = list18;
        this.m = list19;
        this.n = list20;
        this.o = list21;
        this.p = list22;
        this.q = list23;
        this.r = list24;
        this.s = z2;
        this.t = i2;
        this.u = str;
        this.v = daVar;
        this.w = list25;
        this.x = list26;
        this.y = list12;
        this.z = list29;
        this.A = d;
        this.B = list14;
        this.C = list15;
        this.D = oVar;
    }

    public final C3688o A() {
        return this.D;
    }

    public final List<C3694v> B() {
        return this.z;
    }

    public List<Y> C() {
        return this.x;
    }

    public final List<Y> D() {
        return this.y;
    }

    public List<AdVerificationResource> E() {
        return this.B;
    }

    public final boolean F() {
        return this.D != null;
    }

    public Long a() {
        return this.i;
    }

    public List<Y> d() {
        return this.w;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3693u) {
                C3693u uVar = (C3693u) obj;
                if (C7471uYa.a((Object) f(), (Object) uVar.f()) && C7471uYa.a((Object) k(), (Object) uVar.k()) && C7471uYa.a((Object) i(), (Object) uVar.i()) && C7471uYa.a((Object) a(), (Object) uVar.a()) && C7471uYa.a((Object) q(), (Object) uVar.q()) && C7471uYa.a((Object) x(), (Object) uVar.x()) && C7471uYa.a((Object) o(), (Object) uVar.o()) && C7471uYa.a((Object) w(), (Object) uVar.w()) && C7471uYa.a((Object) p(), (Object) uVar.p()) && C7471uYa.a((Object) u(), (Object) uVar.u()) && C7471uYa.a((Object) y(), (Object) uVar.y()) && C7471uYa.a((Object) r(), (Object) uVar.r()) && C7471uYa.a((Object) t(), (Object) uVar.t())) {
                    if (z() == uVar.z()) {
                        if (!(v() == uVar.v()) || !C7471uYa.a((Object) m(), (Object) uVar.m()) || !C7471uYa.a((Object) n(), (Object) uVar.n()) || !C7471uYa.a((Object) d(), (Object) uVar.d()) || !C7471uYa.a((Object) C(), (Object) uVar.C()) || !C7471uYa.a((Object) this.y, (Object) uVar.y) || !C7471uYa.a((Object) this.z, (Object) uVar.z) || Double.compare(j(), uVar.j()) != 0 || !C7471uYa.a((Object) E(), (Object) uVar.E()) || !C7471uYa.a((Object) s(), (Object) uVar.s()) || !C7471uYa.a((Object) this.D, (Object) uVar.D)) {
                            return false;
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
        com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
        int hashCode2 = (hashCode + (k2 != null ? k2.hashCode() : 0)) * 31;
        C3508cda i3 = i();
        int hashCode3 = (hashCode2 + (i3 != null ? i3.hashCode() : 0)) * 31;
        Long a2 = a();
        int hashCode4 = (hashCode3 + (a2 != null ? a2.hashCode() : 0)) * 31;
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
        boolean z2 = z();
        if (z2) {
            z2 = true;
        }
        int v2 = (((hashCode13 + (z2 ? 1 : 0)) * 31) + v()) * 31;
        String m2 = m();
        int hashCode14 = (v2 + (m2 != null ? m2.hashCode() : 0)) * 31;
        da n2 = n();
        int hashCode15 = (hashCode14 + (n2 != null ? n2.hashCode() : 0)) * 31;
        List d = d();
        int hashCode16 = (hashCode15 + (d != null ? d.hashCode() : 0)) * 31;
        List C2 = C();
        int hashCode17 = (hashCode16 + (C2 != null ? C2.hashCode() : 0)) * 31;
        List<Y> list = this.y;
        int hashCode18 = (hashCode17 + (list != null ? list.hashCode() : 0)) * 31;
        List<C3694v> list2 = this.z;
        int hashCode19 = (hashCode18 + (list2 != null ? list2.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(j());
        int i4 = (hashCode19 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        List E = E();
        int hashCode20 = (i4 + (E != null ? E.hashCode() : 0)) * 31;
        List s2 = s();
        int hashCode21 = (hashCode20 + (s2 != null ? s2.hashCode() : 0)) * 31;
        C3688o oVar = this.D;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return hashCode21 + i2;
    }

    public C3508cda i() {
        return this.h;
    }

    public double j() {
        return this.A;
    }

    public com.soundcloud.android.foundation.ads.C3676c.a k() {
        return this.g;
    }

    public String m() {
        return this.u;
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
        return this.C;
    }

    public List<Y> t() {
        return this.r;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAd(adUrn=");
        sb.append(f());
        sb.append(", monetizationType=");
        sb.append(k());
        sb.append(", monetizableTrackUrn=");
        sb.append(i());
        sb.append(", adTimerDuration=");
        sb.append(a());
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
        sb.append(", isSkippable=");
        sb.append(z());
        sb.append(", skipOffset=");
        sb.append(v());
        sb.append(", callToActionButtonText=");
        sb.append(m());
        sb.append(", displayProperties=");
        sb.append(n());
        sb.append(", errorTrackers=");
        sb.append(d());
        sb.append(", clickUrls=");
        sb.append(C());
        sb.append(", companionImpressionUrls=");
        sb.append(this.y);
        sb.append(", audioSources=");
        sb.append(this.z);
        sb.append(", priority=");
        sb.append(j());
        sb.append(", verificationResources=");
        sb.append(E());
        sb.append(", progressTracking=");
        sb.append(s());
        sb.append(", adCompanion=");
        sb.append(this.D);
        sb.append(")");
        return sb.toString();
    }

    public List<Y> u() {
        return this.o;
    }

    public int v() {
        return this.t;
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
        return this.s;
    }
}
