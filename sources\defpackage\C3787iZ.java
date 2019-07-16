package defpackage;

/* renamed from: iZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_OfflineInteractionEvent */
abstract class C3787iZ extends C3924zaa {
    private final String a;
    private final long b;
    private final b c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<c> f;
    private final C4928GKa<c> g;
    private final C4928GKa<String> h;
    private final C4928GKa<C3508cda> i;
    private final C4928GKa<String> j;
    private final C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> k;
    private final C4928GKa<C3508cda> l;
    private final C4928GKa<d> m;
    private final C4928GKa<Boolean> n;
    private final boolean o;

    /* renamed from: iZ$a */
    /* compiled from: $AutoValue_OfflineInteractionEvent */
    static final class a extends defpackage.C3924zaa.a {
        private String a;
        private Long b;
        private b c;
        private C4928GKa<String> d;
        private C4928GKa<String> e;
        private C4928GKa<c> f;
        private C4928GKa<c> g;
        private C4928GKa<String> h;
        private C4928GKa<C3508cda> i;
        private C4928GKa<String> j;
        private C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> k;
        private C4928GKa<C3508cda> l;
        private C4928GKa<d> m;
        private C4928GKa<Boolean> n;
        private Boolean o;

        a() {
        }

        public defpackage.C3924zaa.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public defpackage.C3924zaa.a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.e = gKa;
                return this;
            }
            throw new NullPointerException("Null clickCategory");
        }

        public defpackage.C3924zaa.a c(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.g = gKa;
                return this;
            }
            throw new NullPointerException("Null clickName");
        }

        public defpackage.C3924zaa.a d(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.i = gKa;
                return this;
            }
            throw new NullPointerException("Null clickObject");
        }

        public defpackage.C3924zaa.a e(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.d = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionCategory");
        }

        public defpackage.C3924zaa.a f(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.f = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionName");
        }

        public defpackage.C3924zaa.a g(C4928GKa<Boolean> gKa) {
            if (gKa != null) {
                this.n = gKa;
                return this;
            }
            throw new NullPointerException("Null isEnabled");
        }

        public defpackage.C3924zaa.a h(C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa) {
            if (gKa != null) {
                this.k = gKa;
                return this;
            }
            throw new NullPointerException("Null monetizationType");
        }

        public defpackage.C3924zaa.a i(C4928GKa<d> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null offlineContentContext");
        }

        public defpackage.C3924zaa.a j(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null pageName");
        }

        public defpackage.C3924zaa.a k(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null promoterUrn");
        }

        public defpackage.C3924zaa.a a(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        public defpackage.C3924zaa.a a(b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null eventName");
        }

        public defpackage.C3924zaa.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null adUrn");
        }

        public defpackage.C3924zaa.a a(boolean z) {
            this.o = Boolean.valueOf(z);
            return this;
        }

        public C3924zaa a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" id");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" timestamp");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventName");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" impressionCategory");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" clickCategory");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" impressionName");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" clickName");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" pageName");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" clickObject");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" adUrn");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" monetizationType");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" promoterUrn");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" offlineContentContext");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" isEnabled");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" sendToEventLogger");
                str = sb15.toString();
            }
            if (str.isEmpty()) {
                C3479YZ yz = new C3479YZ(this.a, this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o.booleanValue());
                return yz;
            }
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Missing required properties:");
            sb16.append(str);
            throw new IllegalStateException(sb16.toString());
        }
    }

    C3787iZ(String str, long j2, b bVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<c> gKa3, C4928GKa<c> gKa4, C4928GKa<String> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<String> gKa7, C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa8, C4928GKa<C3508cda> gKa9, C4928GKa<d> gKa10, C4928GKa<Boolean> gKa11, boolean z) {
        String str2 = str;
        b bVar2 = bVar;
        C4928GKa<String> gKa12 = gKa;
        C4928GKa<String> gKa13 = gKa2;
        C4928GKa<c> gKa14 = gKa3;
        C4928GKa<c> gKa15 = gKa4;
        C4928GKa<String> gKa16 = gKa5;
        C4928GKa<C3508cda> gKa17 = gKa6;
        C4928GKa<String> gKa18 = gKa7;
        C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa19 = gKa8;
        C4928GKa<C3508cda> gKa20 = gKa9;
        C4928GKa<d> gKa21 = gKa10;
        C4928GKa<Boolean> gKa22 = gKa11;
        if (str2 != null) {
            this.a = str2;
            this.b = j2;
            if (bVar2 != null) {
                this.c = bVar2;
                if (gKa12 != null) {
                    this.d = gKa12;
                    if (gKa13 != null) {
                        this.e = gKa13;
                        if (gKa14 != null) {
                            this.f = gKa14;
                            if (gKa15 != null) {
                                this.g = gKa15;
                                if (gKa16 != null) {
                                    this.h = gKa16;
                                    if (gKa17 != null) {
                                        this.i = gKa17;
                                        if (gKa18 != null) {
                                            this.j = gKa18;
                                            if (gKa19 != null) {
                                                this.k = gKa19;
                                                if (gKa20 != null) {
                                                    this.l = gKa20;
                                                    if (gKa21 != null) {
                                                        this.m = gKa21;
                                                        if (gKa22 != null) {
                                                            this.n = gKa22;
                                                            this.o = z;
                                                            return;
                                                        }
                                                        throw new NullPointerException("Null isEnabled");
                                                    }
                                                    throw new NullPointerException("Null offlineContentContext");
                                                }
                                                throw new NullPointerException("Null promoterUrn");
                                            }
                                            throw new NullPointerException("Null monetizationType");
                                        }
                                        throw new NullPointerException("Null adUrn");
                                    }
                                    throw new NullPointerException("Null clickObject");
                                }
                                throw new NullPointerException("Null pageName");
                            }
                            throw new NullPointerException("Null clickName");
                        }
                        throw new NullPointerException("Null impressionName");
                    }
                    throw new NullPointerException("Null clickCategory");
                }
                throw new NullPointerException("Null impressionCategory");
            }
            throw new NullPointerException("Null eventName");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3924zaa)) {
            return false;
        }
        C3924zaa zaa = (C3924zaa) obj;
        if (!this.a.equals(zaa.f()) || this.b != zaa.g() || !this.c.equals(zaa.l()) || !this.d.equals(zaa.q()) || !this.e.equals(zaa.i()) || !this.f.equals(zaa.r()) || !this.g.equals(zaa.j()) || !this.h.equals(zaa.v()) || !this.i.equals(zaa.k()) || !this.j.equals(zaa.h()) || !this.k.equals(zaa.t()) || !this.l.equals(zaa.w()) || !this.m.equals(zaa.u()) || !this.n.equals(zaa.s()) || this.o != zaa.x()) {
            z = false;
        }
        return z;
    }

    @C3783hda
    public String f() {
        return this.a;
    }

    @C3783hda
    public long g() {
        return this.b;
    }

    public C4928GKa<String> h() {
        return this.j;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((((((((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ (this.o ? 1231 : 1237);
    }

    public C4928GKa<String> i() {
        return this.e;
    }

    public C4928GKa<c> j() {
        return this.g;
    }

    public C4928GKa<C3508cda> k() {
        return this.i;
    }

    public b l() {
        return this.c;
    }

    public C4928GKa<String> q() {
        return this.d;
    }

    public C4928GKa<c> r() {
        return this.f;
    }

    public C4928GKa<Boolean> s() {
        return this.n;
    }

    public C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> t() {
        return this.k;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OfflineInteractionEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", eventName=");
        sb.append(this.c);
        sb.append(", impressionCategory=");
        sb.append(this.d);
        sb.append(", clickCategory=");
        sb.append(this.e);
        sb.append(", impressionName=");
        sb.append(this.f);
        sb.append(", clickName=");
        sb.append(this.g);
        sb.append(", pageName=");
        sb.append(this.h);
        sb.append(", clickObject=");
        sb.append(this.i);
        sb.append(", adUrn=");
        sb.append(this.j);
        sb.append(", monetizationType=");
        sb.append(this.k);
        sb.append(", promoterUrn=");
        sb.append(this.l);
        sb.append(", offlineContentContext=");
        sb.append(this.m);
        sb.append(", isEnabled=");
        sb.append(this.n);
        sb.append(", sendToEventLogger=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }

    public C4928GKa<d> u() {
        return this.m;
    }

    public C4928GKa<String> v() {
        return this.h;
    }

    public C4928GKa<C3508cda> w() {
        return this.l;
    }

    public boolean x() {
        return this.o;
    }
}
