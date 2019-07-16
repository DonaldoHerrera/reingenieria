package defpackage;

import java.util.Date;
import java.util.List;

/* renamed from: Cda reason: default package */
/* compiled from: AutoValue_Playlist */
final class Cda extends Eda {
    private final C3508cda a;
    private final String b;
    private final C3508cda c;
    private final String d;
    private final boolean e;
    private final long f;
    private final int g;
    private final boolean h;
    private final C4928GKa<String> i;
    private final int j;
    private final int k;
    private final C4928GKa<String> l;
    private final C4928GKa<String> m;
    private final Date n;
    private final Date o;
    private final Date p;
    private final boolean q;
    private final C4928GKa<String> r;
    private final C4928GKa<String> s;
    private final C4928GKa<List<String>> t;
    private final C4928GKa<String> u;

    /* renamed from: Cda$a */
    /* compiled from: AutoValue_Playlist */
    static final class a extends defpackage.Eda.a {
        private C3508cda a;
        private String b;
        private C3508cda c;
        private String d;
        private Boolean e;
        private Long f;
        private Integer g;
        private Boolean h;
        private C4928GKa<String> i;
        private Integer j;
        private Integer k;
        private C4928GKa<String> l;
        private C4928GKa<String> m;
        private Date n;
        private Date o;
        private Date p;
        private Boolean q;
        private C4928GKa<String> r;
        private C4928GKa<String> s;
        private C4928GKa<List<String>> t;
        private C4928GKa<String> u;

        a() {
        }

        public defpackage.Eda.a a(C3508cda cda) {
            if (cda != null) {
                this.c = cda;
                return this;
            }
            throw new NullPointerException("Null creatorUrn");
        }

        public defpackage.Eda.a b(C3508cda cda) {
            if (cda != null) {
                this.a = cda;
                return this;
            }
            throw new NullPointerException("Null urn");
        }

        public defpackage.Eda.a c(int i2) {
            this.g = Integer.valueOf(i2);
            return this;
        }

        public defpackage.Eda.a d(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.r = gKa;
                return this;
            }
            throw new NullPointerException("Null releaseDate");
        }

        public defpackage.Eda.a e(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null title");
        }

        public defpackage.Eda.a f(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null setType");
        }

        public defpackage.Eda.a g(C4928GKa<List<String>> gKa) {
            if (gKa != null) {
                this.t = gKa;
                return this;
            }
            throw new NullPointerException("Null tags");
        }

        public defpackage.Eda.a c(boolean z) {
            this.h = Boolean.valueOf(z);
            return this;
        }

        public defpackage.Eda.a a(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null creatorName");
        }

        public defpackage.Eda.a b(int i2) {
            this.k = Integer.valueOf(i2);
            return this;
        }

        public defpackage.Eda.a c(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null permalinkUrl");
        }

        public defpackage.Eda.a e(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.s = gKa;
                return this;
            }
            throw new NullPointerException("Null secretToken");
        }

        public defpackage.Eda.a b(Date date) {
            if (date != null) {
                this.p = date;
                return this;
            }
            throw new NullPointerException("Null lastLocalChange");
        }

        public defpackage.Eda.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public defpackage.Eda.a c(Date date) {
            if (date != null) {
                this.o = date;
                return this;
            }
            throw new NullPointerException("Null updatedAt");
        }

        public defpackage.Eda.a a(long j2) {
            this.f = Long.valueOf(j2);
            return this;
        }

        public defpackage.Eda.a b(boolean z) {
            this.q = Boolean.valueOf(z);
            return this;
        }

        public defpackage.Eda.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.i = gKa;
                return this;
            }
            throw new NullPointerException("Null genre");
        }

        public defpackage.Eda.a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.u = gKa;
                return this;
            }
            throw new NullPointerException("Null imageUrlTemplate");
        }

        public defpackage.Eda.a a(int i2) {
            this.j = Integer.valueOf(i2);
            return this;
        }

        public defpackage.Eda.a a(Date date) {
            if (date != null) {
                this.n = date;
                return this;
            }
            throw new NullPointerException("Null createdAt");
        }

        public Eda a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" urn");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" title");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" creatorUrn");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" creatorName");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" creatorIsPro");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" duration");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" trackCount");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" isPrivate");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" genre");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" likesCount");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" repostCount");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" permalinkUrl");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" setType");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" createdAt");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" updatedAt");
                str = sb15.toString();
            }
            if (this.p == null) {
                StringBuilder sb16 = new StringBuilder();
                sb16.append(str);
                sb16.append(" lastLocalChange");
                str = sb16.toString();
            }
            if (this.q == null) {
                StringBuilder sb17 = new StringBuilder();
                sb17.append(str);
                sb17.append(" isAlbum");
                str = sb17.toString();
            }
            if (this.r == null) {
                StringBuilder sb18 = new StringBuilder();
                sb18.append(str);
                sb18.append(" releaseDate");
                str = sb18.toString();
            }
            if (this.s == null) {
                StringBuilder sb19 = new StringBuilder();
                sb19.append(str);
                sb19.append(" secretToken");
                str = sb19.toString();
            }
            if (this.t == null) {
                StringBuilder sb20 = new StringBuilder();
                sb20.append(str);
                sb20.append(" tags");
                str = sb20.toString();
            }
            if (this.u == null) {
                StringBuilder sb21 = new StringBuilder();
                sb21.append(str);
                sb21.append(" imageUrlTemplate");
                str = sb21.toString();
            }
            if (str.isEmpty()) {
                Cda cda = new Cda(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f.longValue(), this.g.intValue(), this.h.booleanValue(), this.i, this.j.intValue(), this.k.intValue(), this.l, this.m, this.n, this.o, this.p, this.q.booleanValue(), this.r, this.s, this.t, this.u);
                return cda;
            }
            StringBuilder sb22 = new StringBuilder();
            sb22.append("Missing required properties:");
            sb22.append(str);
            throw new IllegalStateException(sb22.toString());
        }
    }

    public Date b() {
        return this.n;
    }

    public boolean c() {
        return this.e;
    }

    public String d() {
        return this.d;
    }

    public C3508cda e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Eda)) {
            return false;
        }
        Eda eda = (Eda) obj;
        if (!this.a.equals(eda.v()) || !this.b.equals(eda.s()) || !this.c.equals(eda.e()) || !this.d.equals(eda.d()) || this.e != eda.c() || this.f != eda.f() || this.g != eda.t() || this.h != eda.j() || !this.i.equals(eda.g()) || this.j != eda.l() || this.k != eda.o() || !this.l.equals(eda.m()) || !this.m.equals(eda.q()) || !this.n.equals(eda.b()) || !this.o.equals(eda.u()) || !this.p.equals(eda.k()) || this.q != eda.i() || !this.r.equals(eda.n()) || !this.s.equals(eda.p()) || !this.t.equals(eda.r()) || !this.u.equals(eda.h())) {
            z = false;
        }
        return z;
    }

    public long f() {
        return this.f;
    }

    public C4928GKa<String> g() {
        return this.i;
    }

    public C4928GKa<String> h() {
        return this.u;
    }

    public int hashCode() {
        int i2 = 1231;
        int hashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        long j2 = this.f;
        int hashCode2 = (((((((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.g) * 1000003) ^ (this.h ? 1231 : 1237)) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j) * 1000003) ^ this.k) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode()) * 1000003) ^ this.p.hashCode()) * 1000003;
        if (!this.q) {
            i2 = 1237;
        }
        return ((((((((hashCode2 ^ i2) * 1000003) ^ this.r.hashCode()) * 1000003) ^ this.s.hashCode()) * 1000003) ^ this.t.hashCode()) * 1000003) ^ this.u.hashCode();
    }

    public boolean i() {
        return this.q;
    }

    public boolean j() {
        return this.h;
    }

    public Date k() {
        return this.p;
    }

    public int l() {
        return this.j;
    }

    public C4928GKa<String> m() {
        return this.l;
    }

    public C4928GKa<String> n() {
        return this.r;
    }

    public int o() {
        return this.k;
    }

    public C4928GKa<String> p() {
        return this.s;
    }

    public C4928GKa<String> q() {
        return this.m;
    }

    public C4928GKa<List<String>> r() {
        return this.t;
    }

    public String s() {
        return this.b;
    }

    public int t() {
        return this.g;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Playlist{urn=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", creatorUrn=");
        sb.append(this.c);
        sb.append(", creatorName=");
        sb.append(this.d);
        sb.append(", creatorIsPro=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", trackCount=");
        sb.append(this.g);
        sb.append(", isPrivate=");
        sb.append(this.h);
        sb.append(", genre=");
        sb.append(this.i);
        sb.append(", likesCount=");
        sb.append(this.j);
        sb.append(", repostCount=");
        sb.append(this.k);
        sb.append(", permalinkUrl=");
        sb.append(this.l);
        sb.append(", setType=");
        sb.append(this.m);
        sb.append(", createdAt=");
        sb.append(this.n);
        sb.append(", updatedAt=");
        sb.append(this.o);
        sb.append(", lastLocalChange=");
        sb.append(this.p);
        sb.append(", isAlbum=");
        sb.append(this.q);
        sb.append(", releaseDate=");
        sb.append(this.r);
        sb.append(", secretToken=");
        sb.append(this.s);
        sb.append(", tags=");
        sb.append(this.t);
        sb.append(", imageUrlTemplate=");
        sb.append(this.u);
        sb.append("}");
        return sb.toString();
    }

    public Date u() {
        return this.o;
    }

    public C3508cda v() {
        return this.a;
    }

    private Cda(C3508cda cda, String str, C3508cda cda2, String str2, boolean z, long j2, int i2, boolean z2, C4928GKa<String> gKa, int i3, int i4, C4928GKa<String> gKa2, C4928GKa<String> gKa3, Date date, Date date2, Date date3, boolean z3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<List<String>> gKa6, C4928GKa<String> gKa7) {
        this.a = cda;
        this.b = str;
        this.c = cda2;
        this.d = str2;
        this.e = z;
        this.f = j2;
        this.g = i2;
        this.h = z2;
        this.i = gKa;
        this.j = i3;
        this.k = i4;
        this.l = gKa2;
        this.m = gKa3;
        this.n = date;
        this.o = date2;
        this.p = date3;
        this.q = z3;
        this.r = gKa4;
        this.s = gKa5;
        this.t = gKa6;
        this.u = gKa7;
    }
}
