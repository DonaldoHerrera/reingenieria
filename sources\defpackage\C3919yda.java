package defpackage;

import java.util.Date;

/* renamed from: yda reason: default package and case insensitive filesystem */
/* compiled from: StreamEntity.kt */
public final class C3919yda implements C3759eda {
    public final long a;
    public final C3508cda b;
    public final Date c;
    public final String d;
    public final C3903wda e;
    public final C3879tda f;

    public C3919yda(long j, C3508cda cda, Date date, String str, C3903wda wda, C3879tda tda) {
        C7471uYa.b(cda, "urn");
        C7471uYa.b(date, "createdAt");
        this.a = j;
        this.b = cda;
        this.c = date;
        this.d = str;
        this.e = wda;
        this.f = tda;
    }

    public static /* synthetic */ C3919yda a(C3919yda yda, long j, C3508cda cda, Date date, String str, C3903wda wda, C3879tda tda, int i, Object obj) {
        C3919yda yda2 = yda;
        return yda.a((i & 1) != 0 ? yda2.a : j, (i & 2) != 0 ? yda2.b : cda, (i & 4) != 0 ? yda2.c : date, (i & 8) != 0 ? yda2.d : str, (i & 16) != 0 ? yda2.e : wda, (i & 32) != 0 ? yda2.f : tda);
    }

    public final C3919yda a(long j, C3508cda cda, Date date, String str, C3903wda wda, C3879tda tda) {
        C3508cda cda2 = cda;
        C7471uYa.b(cda, "urn");
        Date date2 = date;
        C7471uYa.b(date, "createdAt");
        C3919yda yda = new C3919yda(j, cda2, date2, str, wda, tda);
        return yda;
    }

    public C3508cda c() {
        return this.b;
    }

    public final boolean d() {
        return this.f != null;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3919yda) {
                C3919yda yda = (C3919yda) obj;
                if (!(this.a == yda.a) || !C7471uYa.a((Object) this.b, (Object) yda.b) || !C7471uYa.a((Object) this.c, (Object) yda.c) || !C7471uYa.a((Object) this.d, (Object) yda.d) || !C7471uYa.a((Object) this.e, (Object) yda.e) || !C7471uYa.a((Object) this.f, (Object) yda.f)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        C3508cda cda = this.b;
        int i2 = 0;
        int hashCode = (i + (cda != null ? cda.hashCode() : 0)) * 31;
        Date date = this.c;
        int hashCode2 = (hashCode + (date != null ? date.hashCode() : 0)) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        C3903wda wda = this.e;
        int hashCode4 = (hashCode3 + (wda != null ? wda.hashCode() : 0)) * 31;
        C3879tda tda = this.f;
        if (tda != null) {
            i2 = tda.hashCode();
        }
        return hashCode4 + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StreamEntity(id=");
        sb.append(this.a);
        sb.append(", urn=");
        sb.append(this.b);
        sb.append(", createdAt=");
        sb.append(this.c);
        sb.append(", avatarUrlTemplate=");
        sb.append(this.d);
        sb.append(", repostedProperties=");
        sb.append(this.e);
        sb.append(", promotedProperties=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
