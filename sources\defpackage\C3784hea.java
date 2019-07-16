package defpackage;

import java.util.Date;

/* renamed from: hea reason: default package and case insensitive filesystem */
/* compiled from: User.kt */
public final class C3784hea {
    public final C3508cda a;
    private final String b;
    public final String c;
    private final String d;
    private final String e;
    private final Date f;
    private final String g;
    private final String h;
    private final long i;
    private final long j;
    private final String k;
    public final String l;
    private final String m;
    private final C3508cda n;
    private final boolean o;

    public C3784hea(C3508cda cda, String str, String str2, String str3, String str4, Date date, String str5, String str6, long j2, long j3, String str7, String str8, String str9, C3508cda cda2, boolean z) {
        C3508cda cda3 = cda;
        String str10 = str;
        String str11 = str2;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "permalink");
        C7471uYa.b(str2, "username");
        this.a = cda3;
        this.b = str10;
        this.c = str11;
        this.d = str3;
        this.e = str4;
        this.f = date;
        this.g = str5;
        this.h = str6;
        this.i = j2;
        this.j = j3;
        this.k = str7;
        this.l = str8;
        this.m = str9;
        this.n = cda2;
        this.o = z;
    }

    public final C3508cda a() {
        return this.n;
    }

    public final String b() {
        return this.g;
    }

    public final long c() {
        return this.i;
    }

    public final long d() {
        return this.j;
    }

    public final String e() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3784hea) {
                C3784hea hea = (C3784hea) obj;
                if (C7471uYa.a((Object) this.a, (Object) hea.a) && C7471uYa.a((Object) this.b, (Object) hea.b) && C7471uYa.a((Object) this.c, (Object) hea.c) && C7471uYa.a((Object) this.d, (Object) hea.d) && C7471uYa.a((Object) this.e, (Object) hea.e) && C7471uYa.a((Object) this.f, (Object) hea.f) && C7471uYa.a((Object) this.g, (Object) hea.g) && C7471uYa.a((Object) this.h, (Object) hea.h)) {
                    if (this.i == hea.i) {
                        if ((this.j == hea.j) && C7471uYa.a((Object) this.k, (Object) hea.k) && C7471uYa.a((Object) this.l, (Object) hea.l) && C7471uYa.a((Object) this.m, (Object) hea.m) && C7471uYa.a((Object) this.n, (Object) hea.n)) {
                            if (this.o == hea.o) {
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

    public final String f() {
        return this.m;
    }

    public final boolean g() {
        return this.o;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i2 = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Date date = this.f;
        int hashCode6 = (hashCode5 + (date != null ? date.hashCode() : 0)) * 31;
        String str5 = this.g;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.h;
        int hashCode8 = (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31;
        long j2 = this.i;
        int i3 = (hashCode8 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.j;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        String str7 = this.k;
        int hashCode9 = (i4 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.l;
        int hashCode10 = (hashCode9 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.m;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        C3508cda cda2 = this.n;
        if (cda2 != null) {
            i2 = cda2.hashCode();
        }
        int i5 = (hashCode11 + i2) * 31;
        boolean z = this.o;
        if (z) {
            z = true;
        }
        return i5 + (z ? 1 : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("User(urn=");
        sb.append(this.a);
        sb.append(", permalink=");
        sb.append(this.b);
        sb.append(", username=");
        sb.append(this.c);
        sb.append(", firstName=");
        sb.append(this.d);
        sb.append(", lastName=");
        sb.append(this.e);
        sb.append(", signupDate=");
        sb.append(this.f);
        sb.append(", country=");
        sb.append(this.g);
        sb.append(", city=");
        sb.append(this.h);
        sb.append(", followersCount=");
        sb.append(this.i);
        sb.append(", followingsCount=");
        sb.append(this.j);
        sb.append(", description=");
        sb.append(this.k);
        sb.append(", avatarUrl=");
        sb.append(this.l);
        sb.append(", visualUrl=");
        sb.append(this.m);
        sb.append(", artistStation=");
        sb.append(this.n);
        sb.append(", isPro=");
        sb.append(this.o);
        sb.append(")");
        return sb.toString();
    }
}
