package defpackage;

import java.util.Date;

/* renamed from: BY reason: default package and case insensitive filesystem */
/* compiled from: PromotedTrackCardEntity.kt */
public final class C3409BY {
    private final Date a;
    private final C3508cda b;
    private final C3508cda c;
    private final C3508cda d;
    private final C3887uda e;
    private final String f;

    public C3409BY(Date date, C3508cda cda, C3508cda cda2, C3508cda cda3, C3887uda uda, String str) {
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(cda, "trackUrn");
        C7471uYa.b(cda3, "urn");
        C7471uYa.b(uda, "trackingUrls");
        C7471uYa.b(str, "monetizationType");
        this.a = date;
        this.b = cda;
        this.c = cda2;
        this.d = cda3;
        this.e = uda;
        this.f = str;
    }

    public final String a() {
        return this.f;
    }

    public final C3508cda b() {
        return this.c;
    }

    public final C3508cda c() {
        return this.b;
    }

    public final C3887uda d() {
        return this.e;
    }

    public final C3508cda e() {
        return this.d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.f, (java.lang.Object) r3.f) != false) goto L_0x0047;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3409BY) {
                C3409BY by = (C3409BY) obj;
                if (C7471uYa.a((Object) this.a, (Object) by.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) by.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) by.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) by.d)) {
                                if (C7471uYa.a((Object) this.e, (Object) by.e)) {
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

    public int hashCode() {
        Date date = this.a;
        int i = 0;
        int hashCode = (date != null ? date.hashCode() : 0) * 31;
        C3508cda cda = this.b;
        int hashCode2 = (hashCode + (cda != null ? cda.hashCode() : 0)) * 31;
        C3508cda cda2 = this.c;
        int hashCode3 = (hashCode2 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        C3508cda cda3 = this.d;
        int hashCode4 = (hashCode3 + (cda3 != null ? cda3.hashCode() : 0)) * 31;
        C3887uda uda = this.e;
        int hashCode5 = (hashCode4 + (uda != null ? uda.hashCode() : 0)) * 31;
        String str = this.f;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedTrackCardEntity(createdAt=");
        sb.append(this.a);
        sb.append(", trackUrn=");
        sb.append(this.b);
        sb.append(", promoterUrn=");
        sb.append(this.c);
        sb.append(", urn=");
        sb.append(this.d);
        sb.append(", trackingUrls=");
        sb.append(this.e);
        sb.append(", monetizationType=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
