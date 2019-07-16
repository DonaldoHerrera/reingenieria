package defpackage;

import java.util.Date;

/* renamed from: sT reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_LegacyApiComment */
final class C3262sT extends C3342wT {
    private final C3508cda a;
    private final C3508cda b;
    private final String c;
    private final C4928GKa<Long> d;
    private final Date e;
    private final C3776gea f;

    /* renamed from: sT$a */
    /* compiled from: AutoValue_LegacyApiComment */
    static final class a extends defpackage.C3342wT.a {
        private C3508cda a;
        private C3508cda b;
        private String c;
        private C4928GKa<Long> d;
        private Date e;
        private C3776gea f;

        a() {
        }

        public defpackage.C3342wT.a a(C3508cda cda) {
            if (cda != null) {
                this.b = cda;
                return this;
            }
            throw new NullPointerException("Null trackUrn");
        }

        public defpackage.C3342wT.a b(C3508cda cda) {
            if (cda != null) {
                this.a = cda;
                return this;
            }
            throw new NullPointerException("Null urn");
        }

        public defpackage.C3342wT.a a(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null body");
        }

        public defpackage.C3342wT.a a(C4928GKa<Long> gKa) {
            if (gKa != null) {
                this.d = gKa;
                return this;
            }
            throw new NullPointerException("Null trackTime");
        }

        public defpackage.C3342wT.a a(Date date) {
            if (date != null) {
                this.e = date;
                return this;
            }
            throw new NullPointerException("Null createdAt");
        }

        public defpackage.C3342wT.a a(C3776gea gea) {
            if (gea != null) {
                this.f = gea;
                return this;
            }
            throw new NullPointerException("Null user");
        }

        public C3342wT a() {
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
                sb2.append(" trackUrn");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" body");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" trackTime");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" createdAt");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" user");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                C3262sT sTVar = new C3262sT(this.a, this.b, this.c, this.d, this.e, this.f);
                return sTVar;
            }
            StringBuilder sb7 = new StringBuilder();
            sb7.append("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    public C3508cda a() {
        return this.a;
    }

    public Date b() {
        return this.e;
    }

    public C3776gea d() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3342wT)) {
            return false;
        }
        C3342wT wTVar = (C3342wT) obj;
        if (!this.a.equals(wTVar.a()) || !this.b.equals(wTVar.h()) || !this.c.equals(wTVar.f()) || !this.d.equals(wTVar.g()) || !this.e.equals(wTVar.b()) || !this.f.equals(wTVar.d())) {
            z = false;
        }
        return z;
    }

    public String f() {
        return this.c;
    }

    public C4928GKa<Long> g() {
        return this.d;
    }

    public C3508cda h() {
        return this.b;
    }

    public int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LegacyApiComment{urn=");
        sb.append(this.a);
        sb.append(", trackUrn=");
        sb.append(this.b);
        sb.append(", body=");
        sb.append(this.c);
        sb.append(", trackTime=");
        sb.append(this.d);
        sb.append(", createdAt=");
        sb.append(this.e);
        sb.append(", user=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    private C3262sT(C3508cda cda, C3508cda cda2, String str, C4928GKa<Long> gKa, Date date, C3776gea gea) {
        this.a = cda;
        this.b = cda2;
        this.c = str;
        this.d = gKa;
        this.e = date;
        this.f = gea;
    }
}
