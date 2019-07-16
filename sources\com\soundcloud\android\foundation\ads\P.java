package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 ?2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002>?By\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000f¢\u0006\u0002\u0010\u0017J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fHÆ\u0003J\t\u0010-\u001a\u00020\u0005HÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u000f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u000e\b\u0002\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u00106J\u0013\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010:HÖ\u0003J\t\u0010;\u001a\u00020<HÖ\u0001J\t\u0010=\u001a\u00020\fHÖ\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010 R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0014\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0014\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001c\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001e¨\u0006@"}, d2 = {"Lcom/soundcloud/android/foundation/ads/InterstitialAd;", "Lcom/soundcloud/android/foundation/ads/ImageAdData;", "Lcom/soundcloud/android/foundation/ads/PlayBasedAd;", "Lcom/soundcloud/android/foundation/ads/HasVerificationScriptResources;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizableTrackUrn", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "adTimerDuration", "", "imageUrl", "", "clickthroughUrl", "impressionUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "clickUrls", "priority", "", "errorTrackers", "verificationResources", "Lcom/soundcloud/android/foundation/ads/AdVerificationResource;", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;DLjava/util/List;Ljava/util/List;)V", "getAdTimerDuration", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getClickUrls", "()Ljava/util/List;", "getClickthroughUrl", "()Ljava/lang/String;", "getErrorTrackers", "getImageUrl", "getImpressionUrls", "getMonetizableTrackUrn", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getPriority", "()D", "getVerificationResources", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;DLjava/util/List;Ljava/util/List;)Lcom/soundcloud/android/foundation/ads/InterstitialAd;", "equals", "", "other", "", "hashCode", "", "toString", "ApiModel", "Companion", "ads_release"}, mv = {1, 1, 15})
/* compiled from: InterstitialAd.kt */
public final class P extends O implements T, L {
    public static final b g = new b(null);
    private final C3508cda h;
    private final C3508cda i;
    private final com.soundcloud.android.foundation.ads.C3676c.a j;
    private final Long k;
    private final String l;
    private final String m;
    private final List<Y> n;
    private final List<Y> o;
    private final double p;
    private final List<Y> q;
    private final List<AdVerificationResource> r;

    /* compiled from: InterstitialAd.kt */
    public static final class a implements C3687n, C3680g, T, L {
        private final C3508cda a;
        private final String b;
        private final String c;
        private final List<Y> d;
        private final List<Y> e;
        private final Long f;
        private final double g;
        private final List<Y> h;
        private final List<AdVerificationResource> i;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("image_url") String str, @JsonProperty("clickthrough_url") String str2, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2, @JsonProperty("frequency_cap_duration") Long l, @JsonProperty("score") double d2, @JsonProperty("error_trackers") List<Y> list3, @JsonProperty("verification_resources") List<AdVerificationResource> list4) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "imageUrl");
            C7471uYa.b(str2, "clickthroughUrl");
            C7471uYa.b(list, "trackingImpressionUrls");
            C7471uYa.b(list2, "trackingClickUrls");
            this.a = cda;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = list2;
            this.f = l;
            this.g = d2;
            this.h = list3;
            this.i = list4;
        }

        public Long a() {
            return this.f;
        }

        public List<AdVerificationResource> b() {
            return this.i;
        }

        public String c() {
            return this.c;
        }

        public List<Y> d() {
            return this.h;
        }

        public C3508cda e() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0084, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r5.b()) != false) goto L_0x0089;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) e(), (Object) aVar.e())) {
                        if (C7471uYa.a((Object) f(), (Object) aVar.f())) {
                            if (C7471uYa.a((Object) c(), (Object) aVar.c())) {
                                if (C7471uYa.a((Object) h(), (Object) aVar.h())) {
                                    if (C7471uYa.a((Object) g(), (Object) aVar.g())) {
                                        if (C7471uYa.a((Object) a(), (Object) aVar.a())) {
                                            if (Double.compare(j(), aVar.j()) == 0) {
                                                if (C7471uYa.a((Object) d(), (Object) aVar.d())) {
                                                }
                                            }
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

        public String f() {
            return this.b;
        }

        public List<Y> g() {
            return this.e;
        }

        public List<Y> h() {
            return this.d;
        }

        public int hashCode() {
            C3508cda e2 = e();
            int i2 = 0;
            int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
            String f2 = f();
            int hashCode2 = (hashCode + (f2 != null ? f2.hashCode() : 0)) * 31;
            String c2 = c();
            int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
            List h2 = h();
            int hashCode4 = (hashCode3 + (h2 != null ? h2.hashCode() : 0)) * 31;
            List g2 = g();
            int hashCode5 = (hashCode4 + (g2 != null ? g2.hashCode() : 0)) * 31;
            Long a2 = a();
            int hashCode6 = (hashCode5 + (a2 != null ? a2.hashCode() : 0)) * 31;
            long doubleToLongBits = Double.doubleToLongBits(j());
            int i3 = (hashCode6 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
            List d2 = d();
            int hashCode7 = (i3 + (d2 != null ? d2.hashCode() : 0)) * 31;
            List b2 = b();
            if (b2 != null) {
                i2 = b2.hashCode();
            }
            return hashCode7 + i2;
        }

        public String i() {
            return "interstitial";
        }

        public double j() {
            return this.g;
        }

        public C3681h k() {
            return C3681h.a.a(e());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiModel(adUrn=");
            sb.append(e());
            sb.append(", imageUrl=");
            sb.append(f());
            sb.append(", clickthroughUrl=");
            sb.append(c());
            sb.append(", trackingImpressionUrls=");
            sb.append(h());
            sb.append(", trackingClickUrls=");
            sb.append(g());
            sb.append(", adTimerDuration=");
            sb.append(a());
            sb.append(", priority=");
            sb.append(j());
            sb.append(", errorTrackers=");
            sb.append(d());
            sb.append(", verificationResources=");
            sb.append(b());
            sb.append(")");
            return sb.toString();
        }

        @JsonCreator
        public /* synthetic */ a(C3508cda cda, String str, String str2, List list, List list2, Long l, double d2, List list3, List list4, int i2, C7264rYa rya) {
            this(cda, str, str2, list, list2, l, d2, (i2 & 128) != 0 ? null : list3, list4);
        }
    }

    /* compiled from: InterstitialAd.kt */
    public static final class b {
        private b() {
        }

        @NXa
        public final P a(a aVar, C3508cda cda) {
            a aVar2 = aVar;
            C7471uYa.b(aVar, "apiInterstitial");
            C7471uYa.b(cda, "monetizableTrackUrn");
            C3508cda e = aVar.e();
            com.soundcloud.android.foundation.ads.C3676c.a aVar3 = com.soundcloud.android.foundation.ads.C3676c.a.INTERSTITIAL;
            Long a = aVar.a();
            String f = aVar.f();
            String c = aVar.c();
            List h = aVar.h();
            List g = aVar.g();
            double j = aVar.j();
            List d = aVar.d();
            if (d == null) {
                d = C6918mWa.a();
            }
            P p = new P(e, cda, aVar3, a, f, c, h, g, j, d, aVar.b());
            return p;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public P(C3508cda cda, C3508cda cda2, com.soundcloud.android.foundation.ads.C3676c.a aVar, Long l2, String str, String str2, List<Y> list, List<Y> list2, double d, List<Y> list3, List<AdVerificationResource> list4) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(cda2, "monetizableTrackUrn");
        C7471uYa.b(aVar, "monetizationType");
        C7471uYa.b(str, "imageUrl");
        C7471uYa.b(str2, "clickthroughUrl");
        C7471uYa.b(list, "impressionUrls");
        C7471uYa.b(list2, "clickUrls");
        C7471uYa.b(list3, "errorTrackers");
        this.h = cda;
        this.i = cda2;
        this.j = aVar;
        this.k = l2;
        this.l = str;
        this.m = str2;
        this.n = list;
        this.o = list2;
        this.p = d;
        this.q = list3;
        this.r = list4;
    }

    public Long a() {
        return this.k;
    }

    public String c() {
        return this.m;
    }

    public List<Y> d() {
        return this.q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a0, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) w(), (java.lang.Object) r5.w()) != false) goto L_0x00a5;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof P) {
                P p2 = (P) obj;
                if (C7471uYa.a((Object) f(), (Object) p2.f())) {
                    if (C7471uYa.a((Object) i(), (Object) p2.i())) {
                        if (C7471uYa.a((Object) k(), (Object) p2.k())) {
                            if (C7471uYa.a((Object) a(), (Object) p2.a())) {
                                if (C7471uYa.a((Object) v(), (Object) p2.v())) {
                                    if (C7471uYa.a((Object) c(), (Object) p2.c())) {
                                        if (C7471uYa.a((Object) n(), (Object) p2.n())) {
                                            if (C7471uYa.a((Object) m(), (Object) p2.m())) {
                                                if (Double.compare(j(), p2.j()) == 0) {
                                                    if (C7471uYa.a((Object) d(), (Object) p2.d())) {
                                                    }
                                                }
                                            }
                                        }
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
        return this.h;
    }

    public int hashCode() {
        C3508cda f = f();
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        C3508cda i3 = i();
        int hashCode2 = (hashCode + (i3 != null ? i3.hashCode() : 0)) * 31;
        com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
        int hashCode3 = (hashCode2 + (k2 != null ? k2.hashCode() : 0)) * 31;
        Long a2 = a();
        int hashCode4 = (hashCode3 + (a2 != null ? a2.hashCode() : 0)) * 31;
        String v = v();
        int hashCode5 = (hashCode4 + (v != null ? v.hashCode() : 0)) * 31;
        String c = c();
        int hashCode6 = (hashCode5 + (c != null ? c.hashCode() : 0)) * 31;
        List n2 = n();
        int hashCode7 = (hashCode6 + (n2 != null ? n2.hashCode() : 0)) * 31;
        List m2 = m();
        int hashCode8 = (hashCode7 + (m2 != null ? m2.hashCode() : 0)) * 31;
        long doubleToLongBits = Double.doubleToLongBits(j());
        int i4 = (hashCode8 + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        List d = d();
        int hashCode9 = (i4 + (d != null ? d.hashCode() : 0)) * 31;
        List w = w();
        if (w != null) {
            i2 = w.hashCode();
        }
        return hashCode9 + i2;
    }

    public C3508cda i() {
        return this.i;
    }

    public double j() {
        return this.p;
    }

    public com.soundcloud.android.foundation.ads.C3676c.a k() {
        return this.j;
    }

    public List<Y> m() {
        return this.o;
    }

    public List<Y> n() {
        return this.n;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("InterstitialAd(adUrn=");
        sb.append(f());
        sb.append(", monetizableTrackUrn=");
        sb.append(i());
        sb.append(", monetizationType=");
        sb.append(k());
        sb.append(", adTimerDuration=");
        sb.append(a());
        sb.append(", imageUrl=");
        sb.append(v());
        sb.append(", clickthroughUrl=");
        sb.append(c());
        sb.append(", impressionUrls=");
        sb.append(n());
        sb.append(", clickUrls=");
        sb.append(m());
        sb.append(", priority=");
        sb.append(j());
        sb.append(", errorTrackers=");
        sb.append(d());
        sb.append(", verificationResources=");
        sb.append(w());
        sb.append(")");
        return sb.toString();
    }

    public String v() {
        return this.l;
    }

    public List<AdVerificationResource> w() {
        return this.r;
    }
}
