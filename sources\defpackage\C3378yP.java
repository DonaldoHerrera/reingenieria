package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/* renamed from: yP reason: default package and case insensitive filesystem */
/* compiled from: ApiPromotedTrack.kt */
public final class C3378yP {
    private final Date a;
    private final Yda b;
    private final C3776gea c;
    private final String d;
    private final List<String> e;
    private final List<String> f;
    private final List<String> g;
    private final List<String> h;
    private final List<String> i;

    @JsonCreator
    public C3378yP(@JsonProperty("created_at") Date date, @JsonProperty("track") Yda yda, @JsonProperty("promoter") C3776gea gea, @JsonProperty("urn") String str, @JsonProperty("tracking_track_clicked_urls") List<String> list, @JsonProperty("tracking_profile_clicked_urls") List<String> list2, @JsonProperty("tracking_promoter_clicked_urls") List<String> list3, @JsonProperty("tracking_track_played_urls") List<String> list4, @JsonProperty("tracking_track_impression_urls") List<String> list5) {
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(yda, "apiTrack");
        C7471uYa.b(str, "adUrn");
        C7471uYa.b(list, "trackingTrackClickedUrls");
        C7471uYa.b(list2, "trackingProfileClickedUrls");
        C7471uYa.b(list3, "trackingPromoterClickedUrls");
        C7471uYa.b(list4, "trackingTrackPlayedUrls");
        C7471uYa.b(list5, "trackingTrackImpressionUrls");
        this.a = date;
        this.b = yda;
        this.c = gea;
        this.d = str;
        this.e = list;
        this.f = list2;
        this.g = list3;
        this.h = list4;
        this.i = list5;
    }

    public final String a() {
        return this.d;
    }

    public final Yda b() {
        return this.b;
    }

    public final Date c() {
        return this.a;
    }

    public final C3776gea d() {
        return this.c;
    }

    public final List<String> e() {
        return this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.i, (java.lang.Object) r3.i) != false) goto L_0x0065;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3378yP) {
                C3378yP yPVar = (C3378yP) obj;
                if (C7471uYa.a((Object) this.a, (Object) yPVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) yPVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) yPVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) yPVar.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) yPVar.e)) {
                                    if (C7471uYa.a((Object) this.f, (Object) yPVar.f)) {
                                        if (C7471uYa.a((Object) this.g, (Object) yPVar.g)) {
                                            if (C7471uYa.a((Object) this.h, (Object) yPVar.h)) {
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

    public final List<String> f() {
        return this.g;
    }

    public final List<String> g() {
        return this.e;
    }

    public final List<String> h() {
        return this.i;
    }

    public int hashCode() {
        Date date = this.a;
        int i2 = 0;
        int hashCode = (date != null ? date.hashCode() : 0) * 31;
        Yda yda = this.b;
        int hashCode2 = (hashCode + (yda != null ? yda.hashCode() : 0)) * 31;
        C3776gea gea = this.c;
        int hashCode3 = (hashCode2 + (gea != null ? gea.hashCode() : 0)) * 31;
        String str = this.d;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        List<String> list = this.e;
        int hashCode5 = (hashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<String> list2 = this.f;
        int hashCode6 = (hashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.g;
        int hashCode7 = (hashCode6 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.h;
        int hashCode8 = (hashCode7 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<String> list5 = this.i;
        if (list5 != null) {
            i2 = list5.hashCode();
        }
        return hashCode8 + i2;
    }

    public final List<String> i() {
        return this.h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiPromotedTrack(createdAt=");
        sb.append(this.a);
        sb.append(", apiTrack=");
        sb.append(this.b);
        sb.append(", promoter=");
        sb.append(this.c);
        sb.append(", adUrn=");
        sb.append(this.d);
        sb.append(", trackingTrackClickedUrls=");
        sb.append(this.e);
        sb.append(", trackingProfileClickedUrls=");
        sb.append(this.f);
        sb.append(", trackingPromoterClickedUrls=");
        sb.append(this.g);
        sb.append(", trackingTrackPlayedUrls=");
        sb.append(this.h);
        sb.append(", trackingTrackImpressionUrls=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
