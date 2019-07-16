package defpackage;

import java.util.List;

/* renamed from: uda reason: default package and case insensitive filesystem */
/* compiled from: PromotedProperties.kt */
public final class C3887uda {
    private final List<String> a;
    private final List<String> b;
    private final List<String> c;
    private final List<String> d;
    private final List<String> e;

    public C3887uda(List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        C7471uYa.b(list, "trackingTrackClickedUrls");
        C7471uYa.b(list3, "trackingPromoterClickedUrls");
        C7471uYa.b(list4, "trackingTrackPlayedUrls");
        C7471uYa.b(list5, "trackingTrackImpressionUrls");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final List<String> a() {
        return this.b;
    }

    public final List<String> b() {
        return this.c;
    }

    public final List<String> c() {
        return this.a;
    }

    public final List<String> d() {
        return this.e;
    }

    public final List<String> e() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3887uda) {
                C3887uda uda = (C3887uda) obj;
                if (C7471uYa.a((Object) this.a, (Object) uda.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) uda.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) uda.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) uda.d)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<String> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<String> list4 = this.d;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<String> list5 = this.e;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedTrackingUrls(trackingTrackClickedUrls=");
        sb.append(this.a);
        sb.append(", trackingProfileClickedUrls=");
        sb.append(this.b);
        sb.append(", trackingPromoterClickedUrls=");
        sb.append(this.c);
        sb.append(", trackingTrackPlayedUrls=");
        sb.append(this.d);
        sb.append(", trackingTrackImpressionUrls=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
