package defpackage;

import java.util.List;

/* renamed from: _Y reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_AdOverlayTrackingEvent */
abstract class C3484_Y extends C3425GZ {
    private final String a;
    private final long b;
    private final b c;
    private final List<String> d;
    private final C3508cda e;
    private final C3508cda f;
    private final C4928GKa<String> g;
    private final C4928GKa<String> h;
    private final C3508cda i;
    private final C4928GKa<c> j;
    private final C4928GKa<String> k;
    private final C4928GKa<String> l;
    private final C4928GKa<C3508cda> m;
    private final C4928GKa<c> n;
    private final C4928GKa<C3508cda> o;

    /* renamed from: _Y$a */
    /* compiled from: $AutoValue_AdOverlayTrackingEvent */
    static final class a extends defpackage.C3425GZ.a {
        private String a;
        private Long b;
        private b c;
        private List<String> d;
        private C3508cda e;
        private C3508cda f;
        private C4928GKa<String> g;
        private C4928GKa<String> h;
        private C3508cda i;
        private C4928GKa<c> j;
        private C4928GKa<String> k;
        private C4928GKa<String> l;
        private C4928GKa<C3508cda> m;
        private C4928GKa<c> n;
        private C4928GKa<C3508cda> o;

        a() {
        }

        public defpackage.C3425GZ.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public defpackage.C3425GZ.a b(C3508cda cda) {
            if (cda != null) {
                this.f = cda;
                return this;
            }
            throw new NullPointerException("Null monetizableTrack");
        }

        public defpackage.C3425GZ.a c(C3508cda cda) {
            if (cda != null) {
                this.e = cda;
                return this;
            }
            throw new NullPointerException("Null user");
        }

        public defpackage.C3425GZ.a d(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null clickTarget");
        }

        public defpackage.C3425GZ.a e(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.n = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionName");
        }

        public defpackage.C3425GZ.a f(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.o = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionObject");
        }

        public defpackage.C3425GZ.a g(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null monetizationType");
        }

        public defpackage.C3425GZ.a h(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null originScreen");
        }

        public defpackage.C3425GZ.a a(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        public defpackage.C3425GZ.a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.k = gKa;
                return this;
            }
            throw new NullPointerException("Null clickName");
        }

        public defpackage.C3425GZ.a c(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null clickObject");
        }

        public defpackage.C3425GZ.a a(b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null eventName");
        }

        public defpackage.C3425GZ.a a(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null trackingUrls");
        }

        public defpackage.C3425GZ.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.g = gKa;
                return this;
            }
            throw new NullPointerException("Null adArtworkUrl");
        }

        public defpackage.C3425GZ.a a(C3508cda cda) {
            if (cda != null) {
                this.i = cda;
                return this;
            }
            throw new NullPointerException("Null adUrn");
        }

        public C3425GZ a() {
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
                sb4.append(" trackingUrls");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" user");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" monetizableTrack");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" adArtworkUrl");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" originScreen");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" adUrn");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" monetizationType");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" clickName");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" clickTarget");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" clickObject");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" impressionName");
                str = sb14.toString();
            }
            if (this.o == null) {
                StringBuilder sb15 = new StringBuilder();
                sb15.append(str);
                sb15.append(" impressionObject");
                str = sb15.toString();
            }
            if (str.isEmpty()) {
                C3455QZ qz = new C3455QZ(this.a, this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
                return qz;
            }
            StringBuilder sb16 = new StringBuilder();
            sb16.append("Missing required properties:");
            sb16.append(str);
            throw new IllegalStateException(sb16.toString());
        }
    }

    C3484_Y(String str, long j2, b bVar, List<String> list, C3508cda cda, C3508cda cda2, C4928GKa<String> gKa, C4928GKa<String> gKa2, C3508cda cda3, C4928GKa<c> gKa3, C4928GKa<String> gKa4, C4928GKa<String> gKa5, C4928GKa<C3508cda> gKa6, C4928GKa<c> gKa7, C4928GKa<C3508cda> gKa8) {
        String str2 = str;
        b bVar2 = bVar;
        List<String> list2 = list;
        C3508cda cda4 = cda;
        C3508cda cda5 = cda2;
        C4928GKa<String> gKa9 = gKa;
        C4928GKa<String> gKa10 = gKa2;
        C3508cda cda6 = cda3;
        C4928GKa<c> gKa11 = gKa3;
        C4928GKa<String> gKa12 = gKa4;
        C4928GKa<String> gKa13 = gKa5;
        C4928GKa<C3508cda> gKa14 = gKa6;
        C4928GKa<c> gKa15 = gKa7;
        C4928GKa<C3508cda> gKa16 = gKa8;
        if (str2 != null) {
            this.a = str2;
            this.b = j2;
            if (bVar2 != null) {
                this.c = bVar2;
                if (list2 != null) {
                    this.d = list2;
                    if (cda4 != null) {
                        this.e = cda4;
                        if (cda5 != null) {
                            this.f = cda5;
                            if (gKa9 != null) {
                                this.g = gKa9;
                                if (gKa10 != null) {
                                    this.h = gKa10;
                                    if (cda6 != null) {
                                        this.i = cda6;
                                        if (gKa11 != null) {
                                            this.j = gKa11;
                                            if (gKa12 != null) {
                                                this.k = gKa12;
                                                if (gKa13 != null) {
                                                    this.l = gKa13;
                                                    if (gKa14 != null) {
                                                        this.m = gKa14;
                                                        if (gKa15 != null) {
                                                            this.n = gKa15;
                                                            C4928GKa<C3508cda> gKa17 = gKa8;
                                                            if (gKa17 != null) {
                                                                this.o = gKa17;
                                                                return;
                                                            }
                                                            throw new NullPointerException("Null impressionObject");
                                                        }
                                                        throw new NullPointerException("Null impressionName");
                                                    }
                                                    throw new NullPointerException("Null clickObject");
                                                }
                                                throw new NullPointerException("Null clickTarget");
                                            }
                                            throw new NullPointerException("Null clickName");
                                        }
                                        throw new NullPointerException("Null monetizationType");
                                    }
                                    throw new NullPointerException("Null adUrn");
                                }
                                throw new NullPointerException("Null originScreen");
                            }
                            throw new NullPointerException("Null adArtworkUrl");
                        }
                        throw new NullPointerException("Null monetizableTrack");
                    }
                    throw new NullPointerException("Null user");
                }
                throw new NullPointerException("Null trackingUrls");
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
        if (!(obj instanceof C3425GZ)) {
            return false;
        }
        C3425GZ gz = (C3425GZ) obj;
        if (!this.a.equals(gz.f()) || this.b != gz.g() || !this.c.equals(gz.m()) || !this.d.equals(gz.s()) || !this.e.equals(gz.t()) || !this.f.equals(gz.p()) || !this.g.equals(gz.h()) || !this.h.equals(gz.r()) || !this.i.equals(gz.i()) || !this.j.equals(gz.q()) || !this.k.equals(gz.j()) || !this.l.equals(gz.l()) || !this.m.equals(gz.k()) || !this.n.equals(gz.n()) || !this.o.equals(gz.o())) {
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
        return this.g;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((((((((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode()) * 1000003) ^ this.o.hashCode();
    }

    public C3508cda i() {
        return this.i;
    }

    public C4928GKa<String> j() {
        return this.k;
    }

    public C4928GKa<C3508cda> k() {
        return this.m;
    }

    public C4928GKa<String> l() {
        return this.l;
    }

    public b m() {
        return this.c;
    }

    public C4928GKa<c> n() {
        return this.n;
    }

    public C4928GKa<C3508cda> o() {
        return this.o;
    }

    public C3508cda p() {
        return this.f;
    }

    public C4928GKa<c> q() {
        return this.j;
    }

    public C4928GKa<String> r() {
        return this.h;
    }

    public List<String> s() {
        return this.d;
    }

    public C3508cda t() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdOverlayTrackingEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", eventName=");
        sb.append(this.c);
        sb.append(", trackingUrls=");
        sb.append(this.d);
        sb.append(", user=");
        sb.append(this.e);
        sb.append(", monetizableTrack=");
        sb.append(this.f);
        sb.append(", adArtworkUrl=");
        sb.append(this.g);
        sb.append(", originScreen=");
        sb.append(this.h);
        sb.append(", adUrn=");
        sb.append(this.i);
        sb.append(", monetizationType=");
        sb.append(this.j);
        sb.append(", clickName=");
        sb.append(this.k);
        sb.append(", clickTarget=");
        sb.append(this.l);
        sb.append(", clickObject=");
        sb.append(this.m);
        sb.append(", impressionName=");
        sb.append(this.n);
        sb.append(", impressionObject=");
        sb.append(this.o);
        sb.append("}");
        return sb.toString();
    }
}
