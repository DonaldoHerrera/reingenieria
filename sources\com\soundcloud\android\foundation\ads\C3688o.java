package com.soundcloud.android.foundation.ads;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

@EVa(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u000e\u000fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b\u0001\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion;", "", "()V", "adUrn", "Lcom/soundcloud/android/foundation/domain/Urn;", "getAdUrn", "()Lcom/soundcloud/android/foundation/domain/Urn;", "trackingClickUrls", "", "Lcom/soundcloud/android/foundation/ads/UrlWithPlaceholder;", "getTrackingClickUrls", "()Ljava/util/List;", "trackingImpressionUrls", "getTrackingImpressionUrls", "HtmlCompanion", "ImageCompanion", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$ImageCompanion;", "Lcom/soundcloud/android/foundation/ads/ApiBaseAdVisualCompanion$HtmlCompanion;", "ads_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.foundation.ads.o reason: case insensitive filesystem */
/* compiled from: ApiBaseAdVisualCompanion.kt */
public abstract class C3688o {

    /* renamed from: com.soundcloud.android.foundation.ads.o$a */
    /* compiled from: ApiBaseAdVisualCompanion.kt */
    public static final class a extends C3688o {
        private final C3508cda a;
        private final int b;
        private final int c;
        private final String d;
        private final List<Y> e;
        private final List<Y> f;
        private final boolean g;

        @JsonCreator
        public a(@JsonProperty("urn") C3508cda cda, @JsonProperty("width") int i, @JsonProperty("height") int i2, @JsonProperty("html_resource") String str, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2, @JsonProperty("responsive") boolean z) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "htmlResource");
            C7471uYa.b(list, "trackingImpressionUrls");
            C7471uYa.b(list2, "trackingClickUrls");
            super(null);
            this.a = cda;
            this.b = i;
            this.c = i2;
            this.d = str;
            this.e = list;
            this.f = list2;
            this.g = z;
        }

        public C3508cda a() {
            return this.a;
        }

        public List<Y> b() {
            return this.f;
        }

        public List<Y> c() {
            return this.e;
        }

        public final int d() {
            return this.c;
        }

        public final String e() {
            return this.d;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) a(), (Object) aVar.a())) {
                        if (this.b == aVar.b) {
                            if ((this.c == aVar.c) && C7471uYa.a((Object) this.d, (Object) aVar.d) && C7471uYa.a((Object) c(), (Object) aVar.c()) && C7471uYa.a((Object) b(), (Object) aVar.b())) {
                                if (this.g == aVar.g) {
                                    return true;
                                }
                            }
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int f() {
            return this.b;
        }

        public final boolean g() {
            return this.g;
        }

        public int hashCode() {
            C3508cda a2 = a();
            int i = 0;
            int hashCode = (((((a2 != null ? a2.hashCode() : 0) * 31) + this.b) * 31) + this.c) * 31;
            String str = this.d;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            List c2 = c();
            int hashCode3 = (hashCode2 + (c2 != null ? c2.hashCode() : 0)) * 31;
            List b2 = b();
            if (b2 != null) {
                i = b2.hashCode();
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z = this.g;
            if (z) {
                z = true;
            }
            return i2 + (z ? 1 : 0);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("HtmlCompanion(adUrn=");
            sb.append(a());
            sb.append(", width=");
            sb.append(this.b);
            sb.append(", height=");
            sb.append(this.c);
            sb.append(", htmlResource=");
            sb.append(this.d);
            sb.append(", trackingImpressionUrls=");
            sb.append(c());
            sb.append(", trackingClickUrls=");
            sb.append(b());
            sb.append(", isResponsive=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: com.soundcloud.android.foundation.ads.o$b */
    /* compiled from: ApiBaseAdVisualCompanion.kt */
    public static final class b extends C3688o {
        private final C3508cda a;
        private final String b;
        private final String c;
        private final List<Y> d;
        private final List<Y> e;
        private final String f;
        private final r g;

        @JsonCreator
        public b(@JsonProperty("urn") C3508cda cda, @JsonProperty("image_url") String str, @JsonProperty("clickthrough_url") String str2, @JsonProperty("tracking_impression_urls") List<Y> list, @JsonProperty("tracking_click_urls") List<Y> list2, @JsonProperty("cta_button_text") String str3, @JsonProperty("display_properties") r rVar) {
            C7471uYa.b(cda, "adUrn");
            C7471uYa.b(str, "imageUrl");
            C7471uYa.b(str2, "clickthroughUrl");
            C7471uYa.b(list, "trackingImpressionUrls");
            C7471uYa.b(list2, "trackingClickUrls");
            C7471uYa.b(rVar, "displayProperties");
            super(null);
            this.a = cda;
            this.b = str;
            this.c = str2;
            this.d = list;
            this.e = list2;
            this.f = str3;
            this.g = rVar;
        }

        public C3508cda a() {
            return this.a;
        }

        public List<Y> b() {
            return this.e;
        }

        public List<Y> c() {
            return this.d;
        }

        public final String d() {
            return this.c;
        }

        public final String e() {
            return this.f;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) r2.g, (java.lang.Object) r3.g) != false) goto L_0x005d;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) a(), (Object) bVar.a())) {
                        if (C7471uYa.a((Object) this.b, (Object) bVar.b)) {
                            if (C7471uYa.a((Object) this.c, (Object) bVar.c)) {
                                if (C7471uYa.a((Object) c(), (Object) bVar.c())) {
                                    if (C7471uYa.a((Object) b(), (Object) bVar.b())) {
                                        if (C7471uYa.a((Object) this.f, (Object) bVar.f)) {
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

        public final r f() {
            return this.g;
        }

        public final String g() {
            return this.b;
        }

        public int hashCode() {
            C3508cda a2 = a();
            int i = 0;
            int hashCode = (a2 != null ? a2.hashCode() : 0) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.c;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            List c2 = c();
            int hashCode4 = (hashCode3 + (c2 != null ? c2.hashCode() : 0)) * 31;
            List b2 = b();
            int hashCode5 = (hashCode4 + (b2 != null ? b2.hashCode() : 0)) * 31;
            String str3 = this.f;
            int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
            r rVar = this.g;
            if (rVar != null) {
                i = rVar.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ImageCompanion(adUrn=");
            sb.append(a());
            sb.append(", imageUrl=");
            sb.append(this.b);
            sb.append(", clickthroughUrl=");
            sb.append(this.c);
            sb.append(", trackingImpressionUrls=");
            sb.append(c());
            sb.append(", trackingClickUrls=");
            sb.append(b());
            sb.append(", ctaButtonText=");
            sb.append(this.f);
            sb.append(", displayProperties=");
            sb.append(this.g);
            sb.append(")");
            return sb.toString();
        }
    }

    private C3688o() {
    }

    public abstract C3508cda a();

    public abstract List<Y> b();

    public abstract List<Y> c();

    public /* synthetic */ C3688o(C7264rYa rya) {
        this();
    }
}
