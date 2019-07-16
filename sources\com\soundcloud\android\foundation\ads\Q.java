package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002-.BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0002\u0010\u0010J\t\u0010\u001d\u001a\u00020\u0004HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00042\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u000e\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012¨\u0006/"}, d2 = {"Lcom/soundcloud/android/foundation/ads/LeaveBehindAd;", "Lcom/soundcloud/android/foundation/ads/ImageAdData;", "Lcom/soundcloud/android/foundation/ads/HasErrorTrackers;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "imageUrl", "", "clickthroughUrl", "impressionUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "clickUrls", "precedingAdUrn", "errorTrackers", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;)V", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getClickUrls", "()Ljava/util/List;", "getClickthroughUrl", "()Ljava/lang/String;", "getErrorTrackers", "getImageUrl", "getImpressionUrls", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getPrecedingAdUrn", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ApiModel", "Companion", "ads_release"}, mv = {1, 1, 15})
/* compiled from: LeaveBehindAd.kt */
public final class Q extends O implements K {
    public static final b g = new b(null);
    private final C3508cda h;
    private final com.soundcloud.android.foundation.ads.C3676c.a i;
    private final String j;
    private final String k;
    private final List<Y> l;
    private final List<Y> m;
    private final C3508cda n;
    private final List<Y> o;

    /* compiled from: LeaveBehindAd.kt */
    public static final class a implements C3687n {
        private final C3508cda a;
        private final String b;
        private final String c;
        private final List<Y> d;
        private final List<Y> e;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("image_url") String str, @JsonProperty("clickthrough_url") String str2, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2) {
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
        }

        @JsonProperty("clickthrough_url")
        public String c() {
            return this.c;
        }

        @JsonProperty("urn")
        public C3508cda e() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x004c, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) g(), (java.lang.Object) r3.g()) != false) goto L_0x0051;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) e(), (Object) aVar.e())) {
                        if (C7471uYa.a((Object) f(), (Object) aVar.f())) {
                            if (C7471uYa.a((Object) c(), (Object) aVar.c())) {
                                if (C7471uYa.a((Object) h(), (Object) aVar.h())) {
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @JsonProperty("image_url")
        public String f() {
            return this.b;
        }

        @JsonProperty("tracking_click_urls")
        public List<Y> g() {
            return this.e;
        }

        @JsonProperty("tracking_impression_urls")
        public List<Y> h() {
            return this.d;
        }

        public int hashCode() {
            C3508cda e2 = e();
            int i = 0;
            int hashCode = (e2 != null ? e2.hashCode() : 0) * 31;
            String f = f();
            int hashCode2 = (hashCode + (f != null ? f.hashCode() : 0)) * 31;
            String c2 = c();
            int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
            List h = h();
            int hashCode4 = (hashCode3 + (h != null ? h.hashCode() : 0)) * 31;
            List g = g();
            if (g != null) {
                i = g.hashCode();
            }
            return hashCode4 + i;
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
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: LeaveBehindAd.kt */
    public static final class b {
        private b() {
        }

        public final Q a(a aVar, C3508cda cda, List<Y> list) {
            C7471uYa.b(aVar, "apiModel");
            C7471uYa.b(cda, "precedingAdUrn");
            Q q = new Q(aVar.e(), com.soundcloud.android.foundation.ads.C3676c.a.LEAVE_BEHIND, aVar.f(), aVar.c(), aVar.h(), aVar.g(), cda, list);
            return q;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public Q(C3508cda cda, com.soundcloud.android.foundation.ads.C3676c.a aVar, String str, String str2, List<Y> list, List<Y> list2, C3508cda cda2, List<Y> list3) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(aVar, "monetizationType");
        C7471uYa.b(str, "imageUrl");
        C7471uYa.b(str2, "clickthroughUrl");
        C7471uYa.b(list, "impressionUrls");
        C7471uYa.b(list2, "clickUrls");
        C7471uYa.b(cda2, "precedingAdUrn");
        this.h = cda;
        this.i = aVar;
        this.j = str;
        this.k = str2;
        this.l = list;
        this.m = list2;
        this.n = cda2;
        this.o = list3;
    }

    public String c() {
        return this.k;
    }

    public List<Y> d() {
        return this.o;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0072, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) d(), (java.lang.Object) r3.d()) != false) goto L_0x0077;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Q) {
                Q q = (Q) obj;
                if (C7471uYa.a((Object) f(), (Object) q.f())) {
                    if (C7471uYa.a((Object) k(), (Object) q.k())) {
                        if (C7471uYa.a((Object) v(), (Object) q.v())) {
                            if (C7471uYa.a((Object) c(), (Object) q.c())) {
                                if (C7471uYa.a((Object) n(), (Object) q.n())) {
                                    if (C7471uYa.a((Object) m(), (Object) q.m())) {
                                        if (C7471uYa.a((Object) this.n, (Object) q.n)) {
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
        com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
        int hashCode2 = (hashCode + (k2 != null ? k2.hashCode() : 0)) * 31;
        String v = v();
        int hashCode3 = (hashCode2 + (v != null ? v.hashCode() : 0)) * 31;
        String c = c();
        int hashCode4 = (hashCode3 + (c != null ? c.hashCode() : 0)) * 31;
        List n2 = n();
        int hashCode5 = (hashCode4 + (n2 != null ? n2.hashCode() : 0)) * 31;
        List m2 = m();
        int hashCode6 = (hashCode5 + (m2 != null ? m2.hashCode() : 0)) * 31;
        C3508cda cda = this.n;
        int hashCode7 = (hashCode6 + (cda != null ? cda.hashCode() : 0)) * 31;
        List d = d();
        if (d != null) {
            i2 = d.hashCode();
        }
        return hashCode7 + i2;
    }

    public com.soundcloud.android.foundation.ads.C3676c.a k() {
        return this.i;
    }

    public List<Y> m() {
        return this.m;
    }

    public List<Y> n() {
        return this.l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LeaveBehindAd(adUrn=");
        sb.append(f());
        sb.append(", monetizationType=");
        sb.append(k());
        sb.append(", imageUrl=");
        sb.append(v());
        sb.append(", clickthroughUrl=");
        sb.append(c());
        sb.append(", impressionUrls=");
        sb.append(n());
        sb.append(", clickUrls=");
        sb.append(m());
        sb.append(", precedingAdUrn=");
        sb.append(this.n);
        sb.append(", errorTrackers=");
        sb.append(d());
        sb.append(")");
        return sb.toString();
    }

    public String v() {
        return this.j;
    }

    public final C3508cda w() {
        return this.n;
    }
}
