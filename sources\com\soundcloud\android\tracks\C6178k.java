package com.soundcloud.android.tracks;

import java.util.Date;

/* renamed from: com.soundcloud.android.tracks.k reason: case insensitive filesystem */
/* compiled from: AutoValue_TrackItem */
final class C6178k extends C6185ma {
    private final int A;
    private final int B;
    private final long C;
    private final long D;
    private final String E;
    private final C4928GKa<String> F;
    private final boolean G;
    private final String H;
    private final boolean a;
    private final boolean b;
    private final C3823mda c;
    private final int d;
    private final int e;
    private final C3903wda f;
    private final C3879tda g;
    private final boolean h;
    private final C3508cda i;
    private final C4928GKa<String> j;
    private final Date k;
    private final String l;
    private final String m;
    private final boolean n;
    private final C3508cda o;
    private final String p;
    private final Date q;
    private final String r;
    private final boolean s;
    private final boolean t;
    private final boolean u;
    private final boolean v;
    private final boolean w;
    private final boolean x;
    private final String y;
    private final String z;

    /* renamed from: com.soundcloud.android.tracks.k$a */
    /* compiled from: AutoValue_TrackItem */
    static final class a extends com.soundcloud.android.tracks.C6185ma.a {
        private Integer A;
        private Integer B;
        private Long C;
        private Long D;
        private String E;
        private C4928GKa<String> F;
        private Boolean G;
        private String H;
        private Boolean a;
        private Boolean b;
        private C3823mda c;
        private Integer d;
        private Integer e;
        private C3903wda f;
        private C3879tda g;
        private Boolean h;
        private C3508cda i;
        private C4928GKa<String> j;
        private Date k;
        private String l;
        private String m;
        private Boolean n;
        private C3508cda o;
        private String p;
        private Date q;
        private String r;
        private Boolean s;
        private Boolean t;
        private Boolean u;
        private Boolean v;
        private Boolean w;
        private Boolean x;
        private String y;
        private String z;

        public com.soundcloud.android.tracks.C6185ma.a a(C3823mda mda) {
            if (mda != null) {
                this.c = mda;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        public com.soundcloud.android.tracks.C6185ma.a b(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a c(boolean z2) {
            this.t = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a d(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a e(boolean z2) {
            this.h = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a f(boolean z2) {
            this.s = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a g(String str) {
            if (str != null) {
                this.m = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public com.soundcloud.android.tracks.C6185ma.a h(boolean z2) {
            this.w = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a i(boolean z2) {
            this.v = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a j(boolean z2) {
            this.a = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a k(boolean z2) {
            this.b = Boolean.valueOf(z2);
            return this;
        }

        a() {
        }

        public com.soundcloud.android.tracks.C6185ma.a b(C3508cda cda) {
            if (cda != null) {
                this.i = cda;
                return this;
            }
            throw new NullPointerException("Null getUrn");
        }

        public com.soundcloud.android.tracks.C6185ma.a c(String str) {
            if (str != null) {
                this.y = str;
                return this;
            }
            throw new NullPointerException("Null monetizationModel");
        }

        public com.soundcloud.android.tracks.C6185ma.a d(String str) {
            if (str != null) {
                this.r = str;
                return this;
            }
            throw new NullPointerException("Null permalinkUrl");
        }

        public com.soundcloud.android.tracks.C6185ma.a e(String str) {
            if (str != null) {
                this.z = str;
                return this;
            }
            throw new NullPointerException("Null policy");
        }

        public com.soundcloud.android.tracks.C6185ma.a f(String str) {
            this.H = str;
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a h(String str) {
            if (str != null) {
                this.E = str;
                return this;
            }
            throw new NullPointerException("Null waveformUrl");
        }

        private a(C6185ma maVar) {
            this.a = Boolean.valueOf(maVar.o());
            this.b = Boolean.valueOf(maVar.p());
            this.c = maVar.r();
            this.d = Integer.valueOf(maVar.q());
            this.e = Integer.valueOf(maVar.z());
            this.f = maVar.w();
            this.g = maVar.t();
            this.h = Boolean.valueOf(maVar.M());
            this.i = maVar.a();
            this.j = maVar.b();
            this.k = maVar.I();
            this.l = maVar.f();
            this.m = maVar.B();
            this.n = Boolean.valueOf(maVar.E());
            this.o = maVar.e();
            this.p = maVar.d();
            this.q = maVar.D();
            this.r = maVar.s();
            this.s = Boolean.valueOf(maVar.m());
            this.t = Boolean.valueOf(maVar.K());
            this.u = Boolean.valueOf(maVar.N());
            this.v = Boolean.valueOf(maVar.P());
            this.w = Boolean.valueOf(maVar.O());
            this.x = Boolean.valueOf(maVar.L());
            this.y = maVar.R();
            this.z = maVar.T();
            this.A = Integer.valueOf(maVar.S());
            this.B = Integer.valueOf(maVar.C());
            this.C = Long.valueOf(maVar.H());
            this.D = Long.valueOf(maVar.U());
            this.E = maVar.W();
            this.F = maVar.F();
            this.G = Boolean.valueOf(maVar.G());
            this.H = maVar.A();
        }

        public com.soundcloud.android.tracks.C6185ma.a a(C3903wda wda) {
            this.f = wda;
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a g(boolean z2) {
            this.u = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(C3879tda tda) {
            this.g = tda;
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null getImageUrlTemplate");
        }

        public com.soundcloud.android.tracks.C6185ma.a c(int i2) {
            this.A = Integer.valueOf(i2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a d(boolean z2) {
            this.x = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(boolean z2) {
            this.n = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(C3508cda cda) {
            if (cda != null) {
                this.o = cda;
                return this;
            }
            throw new NullPointerException("Null creatorUrn");
        }

        public com.soundcloud.android.tracks.C6185ma.a b(Date date) {
            if (date != null) {
                this.k = date;
                return this;
            }
            throw new NullPointerException("Null getCreatedAt");
        }

        public com.soundcloud.android.tracks.C6185ma.a a(String str) {
            if (str != null) {
                this.p = str;
                return this;
            }
            throw new NullPointerException("Null creatorName");
        }

        public com.soundcloud.android.tracks.C6185ma.a b(String str) {
            this.l = str;
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a b(long j2) {
            this.D = Long.valueOf(j2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(Date date) {
            if (date != null) {
                this.q = date;
                return this;
            }
            throw new NullPointerException("Null createdAt");
        }

        public com.soundcloud.android.tracks.C6185ma.a b(boolean z2) {
            this.G = Boolean.valueOf(z2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(int i2) {
            this.B = Integer.valueOf(i2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(long j2) {
            this.C = Long.valueOf(j2);
            return this;
        }

        public com.soundcloud.android.tracks.C6185ma.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.F = gKa;
                return this;
            }
            throw new NullPointerException("Null description");
        }

        public C6185ma a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" isUserLike");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isUserRepost");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" offlineState");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" likesCount");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" repostsCount");
                str = sb5.toString();
            }
            if (this.h == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" isPlaying");
                str = sb6.toString();
            }
            if (this.i == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" getUrn");
                str = sb7.toString();
            }
            if (this.j == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" getImageUrlTemplate");
                str = sb8.toString();
            }
            if (this.k == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" getCreatedAt");
                str = sb9.toString();
            }
            if (this.m == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" title");
                str = sb10.toString();
            }
            if (this.n == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" creatorIsPro");
                str = sb11.toString();
            }
            if (this.o == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" creatorUrn");
                str = sb12.toString();
            }
            if (this.p == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" creatorName");
                str = sb13.toString();
            }
            if (this.q == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" createdAt");
                str = sb14.toString();
            }
            if (this.r == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" permalinkUrl");
                str = sb15.toString();
            }
            if (this.s == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" isPrivate");
                str = sb16.toString();
            }
            if (this.t == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" isBlocked");
                str = sb17.toString();
            }
            if (this.u == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" isSnipped");
                str = sb18.toString();
            }
            if (this.v == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" isSubMidTier");
                str = sb19.toString();
            }
            if (this.w == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" isSubHighTier");
                str = sb20.toString();
            }
            if (this.x == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" isCommentable");
                str = sb21.toString();
            }
            if (this.y == null) {
                StringBuilder sb22 = new StringBuilder();
                sb22.append(str);
                sb22.append(" monetizationModel");
                str = sb22.toString();
            }
            if (this.z == null) {
                StringBuilder sb23 = new StringBuilder();
                sb23.append(str);
                sb23.append(" policy");
                str = sb23.toString();
            }
            if (this.A == null) {
                StringBuilder sb24 = new StringBuilder();
                sb24.append(str);
                sb24.append(" playCount");
                str = sb24.toString();
            }
            if (this.B == null) {
                StringBuilder sb25 = new StringBuilder();
                sb25.append(str);
                sb25.append(" commentsCount");
                str = sb25.toString();
            }
            if (this.C == null) {
                StringBuilder sb26 = new StringBuilder();
                sb26.append(str);
                sb26.append(" fullDuration");
                str = sb26.toString();
            }
            if (this.D == null) {
                StringBuilder sb27 = new StringBuilder();
                sb27.append(str);
                sb27.append(" snippetDuration");
                str = sb27.toString();
            }
            if (this.E == null) {
                StringBuilder sb28 = new StringBuilder();
                sb28.append(str);
                sb28.append(" waveformUrl");
                str = sb28.toString();
            }
            if (this.F == null) {
                StringBuilder sb29 = new StringBuilder();
                sb29.append(str);
                sb29.append(" description");
                str = sb29.toString();
            }
            if (this.G == null) {
                StringBuilder sb30 = new StringBuilder();
                sb30.append(str);
                sb30.append(" displayStatsEnabled");
                str = sb30.toString();
            }
            if (str.isEmpty()) {
                C6178k kVar = new C6178k(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.intValue(), this.e.intValue(), this.f, this.g, this.h.booleanValue(), this.i, this.j, this.k, this.l, this.m, this.n.booleanValue(), this.o, this.p, this.q, this.r, this.s.booleanValue(), this.t.booleanValue(), this.u.booleanValue(), this.v.booleanValue(), this.w.booleanValue(), this.x.booleanValue(), this.y, this.z, this.A.intValue(), this.B.intValue(), this.C.longValue(), this.D.longValue(), this.E, this.F, this.G.booleanValue(), this.H);
                return kVar;
            }
            StringBuilder sb31 = new StringBuilder();
            sb31.append("Missing required properties:");
            sb31.append(str);
            throw new IllegalStateException(sb31.toString());
        }
    }

    public String A() {
        return this.H;
    }

    public String B() {
        return this.m;
    }

    public int C() {
        return this.B;
    }

    public Date D() {
        return this.q;
    }

    public boolean E() {
        return this.n;
    }

    public C4928GKa<String> F() {
        return this.F;
    }

    public boolean G() {
        return this.G;
    }

    public long H() {
        return this.C;
    }

    public Date I() {
        return this.k;
    }

    public boolean K() {
        return this.t;
    }

    public boolean L() {
        return this.x;
    }

    public boolean M() {
        return this.h;
    }

    public boolean N() {
        return this.u;
    }

    public boolean O() {
        return this.w;
    }

    public boolean P() {
        return this.v;
    }

    public String R() {
        return this.y;
    }

    public int S() {
        return this.A;
    }

    public String T() {
        return this.z;
    }

    public long U() {
        return this.D;
    }

    public com.soundcloud.android.tracks.C6185ma.a V() {
        return new a(this);
    }

    public String W() {
        return this.E;
    }

    public C3508cda a() {
        return this.i;
    }

    public C4928GKa<String> b() {
        return this.j;
    }

    public String d() {
        return this.p;
    }

    public C3508cda e() {
        return this.o;
    }

    public boolean equals(Object obj) {
        boolean z2 = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6185ma)) {
            return false;
        }
        C6185ma maVar = (C6185ma) obj;
        if (this.a == maVar.o() && this.b == maVar.p() && this.c.equals(maVar.r()) && this.d == maVar.q() && this.e == maVar.z()) {
            C3903wda wda = this.f;
            if (wda != null ? wda.equals(maVar.w()) : maVar.w() == null) {
                C3879tda tda = this.g;
                if (tda != null ? tda.equals(maVar.t()) : maVar.t() == null) {
                    if (this.h == maVar.M() && this.i.equals(maVar.a()) && this.j.equals(maVar.b()) && this.k.equals(maVar.I())) {
                        String str = this.l;
                        if (str != null ? str.equals(maVar.f()) : maVar.f() == null) {
                            if (this.m.equals(maVar.B()) && this.n == maVar.E() && this.o.equals(maVar.e()) && this.p.equals(maVar.d()) && this.q.equals(maVar.D()) && this.r.equals(maVar.s()) && this.s == maVar.m() && this.t == maVar.K() && this.u == maVar.N() && this.v == maVar.P() && this.w == maVar.O() && this.x == maVar.L() && this.y.equals(maVar.R()) && this.z.equals(maVar.T()) && this.A == maVar.S() && this.B == maVar.C() && this.C == maVar.H() && this.D == maVar.U() && this.E.equals(maVar.W()) && this.F.equals(maVar.F()) && this.G == maVar.G()) {
                                String str2 = this.H;
                                if (str2 != null) {
                                }
                            }
                        }
                    }
                }
            }
        }
        z2 = false;
        return z2;
    }

    public String f() {
        return this.l;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        C3903wda wda = this.f;
        int i3 = 0;
        int hashCode2 = (hashCode ^ (wda == null ? 0 : wda.hashCode())) * 1000003;
        C3879tda tda = this.g;
        int hashCode3 = (((((((((hashCode2 ^ (tda == null ? 0 : tda.hashCode())) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003;
        String str = this.l;
        int hashCode4 = (((((((((((((((((((((((((((((((((hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.m.hashCode()) * 1000003) ^ (this.n ? 1231 : 1237)) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003) ^ this.q.hashCode()) * 1000003) ^ this.r.hashCode()) * 1000003) ^ (this.s ? 1231 : 1237)) * 1000003) ^ (this.t ? 1231 : 1237)) * 1000003) ^ (this.u ? 1231 : 1237)) * 1000003) ^ (this.v ? 1231 : 1237)) * 1000003) ^ (this.w ? 1231 : 1237)) * 1000003) ^ (this.x ? 1231 : 1237)) * 1000003) ^ this.y.hashCode()) * 1000003) ^ this.z.hashCode()) * 1000003) ^ this.A) * 1000003) ^ this.B) * 1000003;
        long j2 = this.C;
        int i4 = (hashCode4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.D;
        int hashCode5 = (((((i4 ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.E.hashCode()) * 1000003) ^ this.F.hashCode()) * 1000003;
        if (!this.G) {
            i2 = 1237;
        }
        int i5 = (hashCode5 ^ i2) * 1000003;
        String str2 = this.H;
        if (str2 != null) {
            i3 = str2.hashCode();
        }
        return i5 ^ i3;
    }

    public boolean m() {
        return this.s;
    }

    public boolean o() {
        return this.a;
    }

    public boolean p() {
        return this.b;
    }

    public int q() {
        return this.d;
    }

    public C3823mda r() {
        return this.c;
    }

    public String s() {
        return this.r;
    }

    public C3879tda t() {
        return this.g;
    }

    public C3903wda w() {
        return this.f;
    }

    public int z() {
        return this.e;
    }

    private C6178k(boolean z2, boolean z3, C3823mda mda, int i2, int i3, C3903wda wda, C3879tda tda, boolean z4, C3508cda cda, C4928GKa<String> gKa, Date date, String str, String str2, boolean z5, C3508cda cda2, String str3, Date date2, String str4, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, String str5, String str6, int i4, int i5, long j2, long j3, String str7, C4928GKa<String> gKa2, boolean z12, String str8) {
        this.a = z2;
        this.b = z3;
        this.c = mda;
        this.d = i2;
        this.e = i3;
        this.f = wda;
        this.g = tda;
        this.h = z4;
        this.i = cda;
        this.j = gKa;
        this.k = date;
        this.l = str;
        this.m = str2;
        this.n = z5;
        this.o = cda2;
        this.p = str3;
        this.q = date2;
        this.r = str4;
        this.s = z6;
        this.t = z7;
        this.u = z8;
        this.v = z9;
        this.w = z10;
        this.x = z11;
        this.y = str5;
        this.z = str6;
        this.A = i4;
        this.B = i5;
        this.C = j2;
        this.D = j3;
        this.E = str7;
        this.F = gKa2;
        this.G = z12;
        this.H = str8;
    }
}
