package defpackage;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;

/* renamed from: gea reason: default package and case insensitive filesystem */
/* compiled from: ApiUser.kt */
public final class C3776gea {
    private final C3508cda a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final int j;
    private final int k;
    private final long l;
    private final long m;
    private final boolean n;
    private final boolean o;
    private final String p;
    private final String q;
    private final String r;
    private final List<String> s;
    private final Date t;

    @JsonCreator
    public C3776gea(@JsonProperty("urn") C3508cda cda, @JsonProperty("permalink") String str, @JsonProperty("username") String str2, @JsonProperty("avatar_url") String str3, @JsonProperty("first_name") String str4, @JsonProperty("last_name") String str5, @JsonProperty("city") String str6, @JsonProperty("country") String str7, @JsonProperty("country_code") String str8, @JsonProperty("tracks_count") int i2, @JsonProperty("playlists_count") int i3, @JsonProperty("followers_count") long j2, @JsonProperty("followings_count") long j3, @JsonProperty("verified") boolean z, @JsonProperty("is_pro") boolean z2, @JsonProperty("description") String str9, @JsonProperty("avatar_url_template") String str10, @JsonProperty("visual_url_template") String str11, @JsonProperty("station_urns") List<String> list, @JsonProperty("created_at") Date date) {
        C3508cda cda2 = cda;
        String str12 = str;
        String str13 = str2;
        List<String> list2 = list;
        Date date2 = date;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "permalink");
        C7471uYa.b(str2, "username");
        C7471uYa.b(list2, "stationUrns");
        C7471uYa.b(date2, "createdAt");
        this.a = cda2;
        this.b = str12;
        this.c = str13;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = i2;
        this.k = i3;
        this.l = j2;
        this.m = j3;
        this.n = z;
        this.o = z2;
        this.p = str9;
        this.q = str10;
        this.r = str11;
        this.s = list2;
        this.t = date2;
    }

    public final String a() {
        return this.q;
    }

    public final String b() {
        return this.g;
    }

    public final String c() {
        return this.h;
    }

    public final Date d() {
        return this.t;
    }

    public final String e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3776gea) {
                C3776gea gea = (C3776gea) obj;
                if (C7471uYa.a((Object) this.a, (Object) gea.a) && C7471uYa.a((Object) this.b, (Object) gea.b) && C7471uYa.a((Object) this.c, (Object) gea.c) && C7471uYa.a((Object) this.d, (Object) gea.d) && C7471uYa.a((Object) this.e, (Object) gea.e) && C7471uYa.a((Object) this.f, (Object) gea.f) && C7471uYa.a((Object) this.g, (Object) gea.g) && C7471uYa.a((Object) this.h, (Object) gea.h) && C7471uYa.a((Object) this.i, (Object) gea.i)) {
                    if (this.j == gea.j) {
                        if (this.k == gea.k) {
                            if (this.l == gea.l) {
                                if (this.m == gea.m) {
                                    if (this.n == gea.n) {
                                        if (!(this.o == gea.o) || !C7471uYa.a((Object) this.p, (Object) gea.p) || !C7471uYa.a((Object) this.q, (Object) gea.q) || !C7471uYa.a((Object) this.r, (Object) gea.r) || !C7471uYa.a((Object) this.s, (Object) gea.s) || !C7471uYa.a((Object) this.t, (Object) gea.t)) {
                                            return false;
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

    public final String f() {
        return this.e;
    }

    public final long g() {
        return this.l;
    }

    public final long h() {
        return this.m;
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
        String str5 = this.f;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.g;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.h;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.i;
        int hashCode9 = (((((hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31) + this.j) * 31) + this.k) * 31;
        long j2 = this.l;
        int i3 = (hashCode9 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.m;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z = this.n;
        if (z) {
            z = true;
        }
        int i5 = (i4 + (z ? 1 : 0)) * 31;
        boolean z2 = this.o;
        if (z2) {
            z2 = true;
        }
        int i6 = (i5 + (z2 ? 1 : 0)) * 31;
        String str9 = this.p;
        int hashCode10 = (i6 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.q;
        int hashCode11 = (hashCode10 + (str10 != null ? str10.hashCode() : 0)) * 31;
        String str11 = this.r;
        int hashCode12 = (hashCode11 + (str11 != null ? str11.hashCode() : 0)) * 31;
        List<String> list = this.s;
        int hashCode13 = (hashCode12 + (list != null ? list.hashCode() : 0)) * 31;
        Date date = this.t;
        if (date != null) {
            i2 = date.hashCode();
        }
        return hashCode13 + i2;
    }

    public final String i() {
        return this.f;
    }

    public final String j() {
        return this.b;
    }

    public final List<String> k() {
        return this.s;
    }

    public final C3508cda l() {
        return this.a;
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.r;
    }

    public final boolean o() {
        return this.o;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiUser(urn=");
        sb.append(this.a);
        sb.append(", permalink=");
        sb.append(this.b);
        sb.append(", username=");
        sb.append(this.c);
        sb.append(", avatarUrl=");
        sb.append(this.d);
        sb.append(", firstName=");
        sb.append(this.e);
        sb.append(", lastName=");
        sb.append(this.f);
        sb.append(", city=");
        sb.append(this.g);
        sb.append(", country=");
        sb.append(this.h);
        sb.append(", countryCode=");
        sb.append(this.i);
        sb.append(", tracksCount=");
        sb.append(this.j);
        sb.append(", playlistCount=");
        sb.append(this.k);
        sb.append(", followersCount=");
        sb.append(this.l);
        sb.append(", followingsCount=");
        sb.append(this.m);
        sb.append(", verified=");
        sb.append(this.n);
        sb.append(", isPro=");
        sb.append(this.o);
        sb.append(", description=");
        sb.append(this.p);
        sb.append(", avatarUrlTemplate=");
        sb.append(this.q);
        sb.append(", visualUrlTemplate=");
        sb.append(this.r);
        sb.append(", stationUrns=");
        sb.append(this.s);
        sb.append(", createdAt=");
        sb.append(this.t);
        sb.append(")");
        return sb.toString();
    }
}
