package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\b\b\u0018\u0000 22\u00020\u00012\u00020\u0002:\u000212Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r¢\u0006\u0002\u0010\u0012J\t\u0010!\u001a\u00020\u0004HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\bHÆ\u0003J\t\u0010$\u001a\u00020\bHÆ\u0003J\t\u0010%\u001a\u00020\u000bHÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÆ\u0003J\t\u0010(\u001a\u00020\u0004HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003Jw\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0001J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020\bHÖ\u0001J\t\u00100\u001a\u00020\u000bHÖ\u0001R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0014\u0010\t\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0010\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019¨\u00063"}, d2 = {"Lcom/soundcloud/android/foundation/ads/HtmlLeaveBehindAd;", "Lcom/soundcloud/android/foundation/ads/HtmlVisualAdData;", "Lcom/soundcloud/android/foundation/ads/HasErrorTrackers;", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "monetizationType", "Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "width", "", "height", "htmlResource", "", "impressionUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "clickUrls", "precedingAdUrn", "errorTrackers", "(Lcom/soundcloud/android/foundation/domain/Urn;Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;IILjava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/soundcloud/android/foundation/domain/Urn;Ljava/util/List;)V", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "getClickUrls", "()Ljava/util/List;", "getErrorTrackers", "getHeight", "()I", "getHtmlResource", "()Ljava/lang/String;", "getImpressionUrls", "getMonetizationType", "()Lcom/soundcloud/android/foundation/ads/AdData$MonetizationType;", "getPrecedingAdUrn", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "", "hashCode", "toString", "ApiModel", "Companion", "ads_release"}, mv = {1, 1, 15})
/* compiled from: HtmlLeaveBehindAd.kt */
public final class M extends N implements K {
    public static final b g = new b(null);
    private final C3508cda h;
    private final com.soundcloud.android.foundation.ads.C3676c.a i;
    private final int j;
    private final int k;
    private final String l;
    private final List<Y> m;
    private final List<Y> n;
    private final C3508cda o;
    private final List<Y> p;

    /* compiled from: HtmlLeaveBehindAd.kt */
    public static final class a implements C3690q {
        private final C3508cda a;
        private final int b;
        private final int c;
        private final String d;
        private final List<Y> e;
        private final List<Y> f;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("html_resource") String str, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2) {
            C7471uYa.b(cda, "urn");
            C7471uYa.b(str, "htmlResource");
            C7471uYa.b(list, "trackingImpressionUrls");
            C7471uYa.b(list2, "trackingClickUrls");
            this.a = cda;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = list;
            this.f = list2;
        }

        @JsonProperty("height")
        public int a() {
            return this.c;
        }

        @JsonProperty("html_resource")
        public String b() {
            return this.d;
        }

        @JsonProperty("tracking_click_urls")
        public List<Y> c() {
            return this.f;
        }

        @JsonProperty("tracking_impression_urls")
        public List<Y> d() {
            return this.e;
        }

        @JsonProperty("urn")
        public C3508cda e() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) e(), (Object) aVar.e())) {
                        if (f() == aVar.f()) {
                            if (!(a() == aVar.a()) || !C7471uYa.a((Object) b(), (Object) aVar.b()) || !C7471uYa.a((Object) d(), (Object) aVar.d()) || !C7471uYa.a((Object) c(), (Object) aVar.c())) {
                                return false;
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        @JsonProperty("width")
        public int f() {
            return this.b;
        }

        public int hashCode() {
            C3508cda e2 = e();
            int i = 0;
            int hashCode = (((((e2 != null ? e2.hashCode() : 0) * 31) + f()) * 31) + a()) * 31;
            String b2 = b();
            int hashCode2 = (hashCode + (b2 != null ? b2.hashCode() : 0)) * 31;
            List d2 = d();
            int hashCode3 = (hashCode2 + (d2 != null ? d2.hashCode() : 0)) * 31;
            List c2 = c();
            if (c2 != null) {
                i = c2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ApiModel(urn=");
            sb.append(e());
            sb.append(", width=");
            sb.append(f());
            sb.append(", height=");
            sb.append(a());
            sb.append(", htmlResource=");
            sb.append(b());
            sb.append(", trackingImpressionUrls=");
            sb.append(d());
            sb.append(", trackingClickUrls=");
            sb.append(c());
            sb.append(")");
            return sb.toString();
        }
    }

    /* compiled from: HtmlLeaveBehindAd.kt */
    public static final class b {
        private b() {
        }

        public final M a(a aVar, C3508cda cda, List<Y> list) {
            C7471uYa.b(aVar, "apiModel");
            C7471uYa.b(cda, "precedingAdUrn");
            M m = new M(aVar.e(), com.soundcloud.android.foundation.ads.C3676c.a.HTML_LEAVE_BEHIND, aVar.f(), aVar.a(), aVar.b(), aVar.d(), aVar.c(), cda, list);
            return m;
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public M(C3508cda cda, com.soundcloud.android.foundation.ads.C3676c.a aVar, int i2, int i3, String str, List<Y> list, List<Y> list2, C3508cda cda2, List<Y> list3) {
        C7471uYa.b(cda, "adUrn");
        C7471uYa.b(aVar, "monetizationType");
        C7471uYa.b(str, "htmlResource");
        C7471uYa.b(list, "impressionUrls");
        C7471uYa.b(list2, "clickUrls");
        C7471uYa.b(cda2, "precedingAdUrn");
        this.h = cda;
        this.i = aVar;
        this.j = i2;
        this.k = i3;
        this.l = str;
        this.m = list;
        this.n = list2;
        this.o = cda2;
        this.p = list3;
    }

    public List<Y> d() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof M) {
                M m2 = (M) obj;
                if (C7471uYa.a((Object) f(), (Object) m2.f()) && C7471uYa.a((Object) k(), (Object) m2.k())) {
                    if (x() == m2.x()) {
                        if (!(v() == m2.v()) || !C7471uYa.a((Object) w(), (Object) m2.w()) || !C7471uYa.a((Object) n(), (Object) m2.n()) || !C7471uYa.a((Object) m(), (Object) m2.m()) || !C7471uYa.a((Object) this.o, (Object) m2.o) || !C7471uYa.a((Object) d(), (Object) m2.d())) {
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
        return this.h;
    }

    public int hashCode() {
        C3508cda f = f();
        int i2 = 0;
        int hashCode = (f != null ? f.hashCode() : 0) * 31;
        com.soundcloud.android.foundation.ads.C3676c.a k2 = k();
        int hashCode2 = (((((hashCode + (k2 != null ? k2.hashCode() : 0)) * 31) + x()) * 31) + v()) * 31;
        String w = w();
        int hashCode3 = (hashCode2 + (w != null ? w.hashCode() : 0)) * 31;
        List n2 = n();
        int hashCode4 = (hashCode3 + (n2 != null ? n2.hashCode() : 0)) * 31;
        List m2 = m();
        int hashCode5 = (hashCode4 + (m2 != null ? m2.hashCode() : 0)) * 31;
        C3508cda cda = this.o;
        int hashCode6 = (hashCode5 + (cda != null ? cda.hashCode() : 0)) * 31;
        List d = d();
        if (d != null) {
            i2 = d.hashCode();
        }
        return hashCode6 + i2;
    }

    public com.soundcloud.android.foundation.ads.C3676c.a k() {
        return this.i;
    }

    public List<Y> m() {
        return this.n;
    }

    public List<Y> n() {
        return this.m;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HtmlLeaveBehindAd(adUrn=");
        sb.append(f());
        sb.append(", monetizationType=");
        sb.append(k());
        sb.append(", width=");
        sb.append(x());
        sb.append(", height=");
        sb.append(v());
        sb.append(", htmlResource=");
        sb.append(w());
        sb.append(", impressionUrls=");
        sb.append(n());
        sb.append(", clickUrls=");
        sb.append(m());
        sb.append(", precedingAdUrn=");
        sb.append(this.o);
        sb.append(", errorTrackers=");
        sb.append(d());
        sb.append(")");
        return sb.toString();
    }

    public int v() {
        return this.k;
    }

    public String w() {
        return this.l;
    }

    public int x() {
        return this.j;
    }

    public final C3508cda y() {
        return this.o;
    }
}
