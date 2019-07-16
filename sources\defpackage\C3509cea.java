package defpackage;

import java.util.Date;

/* renamed from: cea reason: default package and case insensitive filesystem */
/* compiled from: Track.kt */
public final class C3509cea {
    private final String A;
    private final boolean B;
    private final C3508cda a;
    private final String b;
    private final Date c;
    private final long d;
    private final long e;
    private final boolean f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final boolean n;
    private final boolean o;
    private final boolean p;
    private final boolean q;
    private final String r;
    private final String s;
    private final String t;
    private final C3752dea u;
    private final String v;
    private final String w;
    private final C3508cda x;
    private final boolean y;
    private final String z;

    public C3509cea(C3508cda cda, String str, Date date, long j2, long j3, boolean z2, int i2, int i3, int i4, int i5, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, String str2, String str3, String str4, C3752dea dea, String str5, String str6, C3508cda cda2, boolean z10, String str7, String str8, boolean z11) {
        C3508cda cda3 = cda;
        String str9 = str;
        Date date2 = date;
        String str10 = str2;
        String str11 = str3;
        C3752dea dea2 = dea;
        String str12 = str5;
        String str13 = str6;
        C3508cda cda4 = cda2;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(str, "title");
        C7471uYa.b(date, "createdAt");
        C7471uYa.b(str10, "monetizationModel");
        C7471uYa.b(str11, "permalinkUrl");
        C7471uYa.b(dea2, "trackPolicy");
        C7471uYa.b(str12, "waveformUrl");
        C7471uYa.b(str13, "creatorName");
        C7471uYa.b(cda4, "creatorUrn");
        this.a = cda3;
        this.b = str9;
        this.c = date2;
        this.d = j2;
        this.e = j3;
        this.f = z2;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = z6;
        this.o = z7;
        this.p = z8;
        this.q = z9;
        this.r = str10;
        this.s = str11;
        this.t = str4;
        this.u = dea2;
        this.v = str12;
        this.w = str13;
        this.x = cda4;
        this.y = z10;
        this.z = str7;
        this.A = str8;
        this.B = z11;
    }

    public final boolean A() {
        return this.f;
    }

    public final boolean B() {
        return this.B;
    }

    public final boolean a() {
        return this.n;
    }

    public final boolean b() {
        return this.l;
    }

    public final int c() {
        return this.h;
    }

    public final Date d() {
        return this.c;
    }

    public final boolean e() {
        return this.y;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3509cea) {
                C3509cea cea = (C3509cea) obj;
                if (C7471uYa.a((Object) this.a, (Object) cea.a) && C7471uYa.a((Object) this.b, (Object) cea.b) && C7471uYa.a((Object) this.c, (Object) cea.c)) {
                    if (this.d == cea.d) {
                        if (this.e == cea.e) {
                            if (this.f == cea.f) {
                                if (this.g == cea.g) {
                                    if (this.h == cea.h) {
                                        if (this.i == cea.i) {
                                            if (this.j == cea.j) {
                                                if (this.k == cea.k) {
                                                    if (this.l == cea.l) {
                                                        if (this.m == cea.m) {
                                                            if (this.n == cea.n) {
                                                                if (this.o == cea.o) {
                                                                    if (this.p == cea.p) {
                                                                        if ((this.q == cea.q) && C7471uYa.a((Object) this.r, (Object) cea.r) && C7471uYa.a((Object) this.s, (Object) cea.s) && C7471uYa.a((Object) this.t, (Object) cea.t) && C7471uYa.a((Object) this.u, (Object) cea.u) && C7471uYa.a((Object) this.v, (Object) cea.v) && C7471uYa.a((Object) this.w, (Object) cea.w) && C7471uYa.a((Object) this.x, (Object) cea.x)) {
                                                                            if ((this.y == cea.y) && C7471uYa.a((Object) this.z, (Object) cea.z) && C7471uYa.a((Object) this.A, (Object) cea.A)) {
                                                                                if (this.B == cea.B) {
                                                                                    return true;
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
        return this.w;
    }

    public final C3508cda g() {
        return this.x;
    }

    public final boolean h() {
        return this.k;
    }

    public int hashCode() {
        C3508cda cda = this.a;
        int i2 = 0;
        int hashCode = (cda != null ? cda.hashCode() : 0) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Date date = this.c;
        int hashCode3 = (hashCode2 + (date != null ? date.hashCode() : 0)) * 31;
        long j2 = this.d;
        int i3 = (hashCode3 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.e;
        int i4 = (i3 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        boolean z2 = this.f;
        if (z2) {
            z2 = true;
        }
        int i5 = (((((((((i4 + (z2 ? 1 : 0)) * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31;
        boolean z3 = this.k;
        if (z3) {
            z3 = true;
        }
        int i6 = (i5 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.l;
        if (z4) {
            z4 = true;
        }
        int i7 = (i6 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.m;
        if (z5) {
            z5 = true;
        }
        int i8 = (i7 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.n;
        if (z6) {
            z6 = true;
        }
        int i9 = (i8 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.o;
        if (z7) {
            z7 = true;
        }
        int i10 = (i9 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.p;
        if (z8) {
            z8 = true;
        }
        int i11 = (i10 + (z8 ? 1 : 0)) * 31;
        boolean z9 = this.q;
        if (z9) {
            z9 = true;
        }
        int i12 = (i11 + (z9 ? 1 : 0)) * 31;
        String str2 = this.r;
        int hashCode4 = (i12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.s;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.t;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        C3752dea dea = this.u;
        int hashCode7 = (hashCode6 + (dea != null ? dea.hashCode() : 0)) * 31;
        String str5 = this.v;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.w;
        int hashCode9 = (hashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        C3508cda cda2 = this.x;
        int hashCode10 = (hashCode9 + (cda2 != null ? cda2.hashCode() : 0)) * 31;
        boolean z10 = this.y;
        if (z10) {
            z10 = true;
        }
        int i13 = (hashCode10 + (z10 ? 1 : 0)) * 31;
        String str7 = this.z;
        int hashCode11 = (i13 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.A;
        if (str8 != null) {
            i2 = str8.hashCode();
        }
        int i14 = (hashCode11 + i2) * 31;
        boolean z11 = this.B;
        if (z11) {
            z11 = true;
        }
        return i14 + (z11 ? 1 : 0);
    }

    public final long i() {
        return this.e;
    }

    public final String j() {
        return this.z;
    }

    public final String k() {
        return this.t;
    }

    public final int l() {
        return this.i;
    }

    public final boolean m() {
        return this.m;
    }

    public final String n() {
        return this.r;
    }

    public final String o() {
        return this.s;
    }

    public final int p() {
        return this.g;
    }

    public final int q() {
        return this.j;
    }

    public final String r() {
        return this.A;
    }

    public final boolean s() {
        return this.o;
    }

    public final long t() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Track(urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", createdAt=");
        sb.append(this.c);
        sb.append(", snippetDuration=");
        sb.append(this.d);
        sb.append(", fullDuration=");
        sb.append(this.e);
        sb.append(", isPrivate=");
        sb.append(this.f);
        sb.append(", playCount=");
        sb.append(this.g);
        sb.append(", commentsCount=");
        sb.append(this.h);
        sb.append(", likesCount=");
        sb.append(this.i);
        sb.append(", repostsCount=");
        sb.append(this.j);
        sb.append(", displayStats=");
        sb.append(this.k);
        sb.append(", commentable=");
        sb.append(this.l);
        sb.append(", monetizable=");
        sb.append(this.m);
        sb.append(", blocked=");
        sb.append(this.n);
        sb.append(", snipped=");
        sb.append(this.o);
        sb.append(", subHighTier=");
        sb.append(this.p);
        sb.append(", subMidTier=");
        sb.append(this.q);
        sb.append(", monetizationModel=");
        sb.append(this.r);
        sb.append(", permalinkUrl=");
        sb.append(this.s);
        sb.append(", imageUrlTemplate=");
        sb.append(this.t);
        sb.append(", trackPolicy=");
        sb.append(this.u);
        sb.append(", waveformUrl=");
        sb.append(this.v);
        sb.append(", creatorName=");
        sb.append(this.w);
        sb.append(", creatorUrn=");
        sb.append(this.x);
        sb.append(", creatorIsPro=");
        sb.append(this.y);
        sb.append(", genre=");
        sb.append(this.z);
        sb.append(", secretToken=");
        sb.append(this.A);
        sb.append(", isSyncable=");
        sb.append(this.B);
        sb.append(")");
        return sb.toString();
    }

    public final boolean u() {
        return this.p;
    }

    public final boolean v() {
        return this.q;
    }

    public final String w() {
        return this.b;
    }

    public final C3752dea x() {
        return this.u;
    }

    public final C3508cda y() {
        return this.a;
    }

    public final String z() {
        return this.v;
    }
}
