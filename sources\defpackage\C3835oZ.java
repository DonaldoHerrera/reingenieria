package defpackage;

import java.util.List;

/* renamed from: oZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_PromotedTrackingEvent */
abstract class C3835oZ extends Qaa {
    private final String a;
    private final long b;
    private final c c;
    private final List<String> d;
    private final String e;
    private final String f;
    private final String g;
    private final C4928GKa<C3508cda> h;
    private final C4928GKa<b> i;
    private final C4928GKa<C3508cda> j;
    private final C4928GKa<C3508cda> k;
    private final C4928GKa<C3508cda> l;
    private final C4928GKa<String> m;
    private final C4928GKa<Integer> n;

    /* renamed from: oZ$a */
    /* compiled from: $AutoValue_PromotedTrackingEvent */
    static final class a extends defpackage.Qaa.a {
        private String a;
        private Long b;
        private c c;
        private List<String> d;
        private String e;
        private String f;
        private String g;
        private C4928GKa<C3508cda> h;
        private C4928GKa<b> i;
        private C4928GKa<C3508cda> j;
        private C4928GKa<C3508cda> k;
        private C4928GKa<C3508cda> l;
        private C4928GKa<String> m;
        private C4928GKa<Integer> n;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a a(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a b(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null monetizationType");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a c(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null originScreen");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a d(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a e(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionObject");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a f(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null promoterUrn");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a g(C4928GKa<Integer> gKa) {
            if (gKa != null) {
                this.n = gKa;
                return this;
            }
            throw new NullPointerException("Null queryPosition");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a a(c cVar) {
            if (cVar != null) {
                this.c = cVar;
                return this;
            }
            throw new NullPointerException("Null kind");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a b(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.k = gKa;
                return this;
            }
            throw new NullPointerException("Null clickObject");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a c(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null clickTarget");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a d(C4928GKa<b> gKa) {
            if (gKa != null) {
                this.i = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionName");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a a(List<String> list) {
            if (list != null) {
                this.d = list;
                return this;
            }
            throw new NullPointerException("Null trackingUrls");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a a(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null adUrn");
        }

        /* access modifiers changed from: 0000 */
        public defpackage.Qaa.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null clickName");
        }

        public Qaa a() {
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
                sb3.append(" kind");
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
                sb5.append(" monetizationType");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" adUrn");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" originScreen");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" impressionObject");
                str = sb8.toString();
            }
            if (this.i == null) {
                StringBuilder sb9 = new StringBuilder();
                sb9.append(str);
                sb9.append(" impressionName");
                str = sb9.toString();
            }
            if (this.j == null) {
                StringBuilder sb10 = new StringBuilder();
                sb10.append(str);
                sb10.append(" promoterUrn");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" clickObject");
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
                sb13.append(" clickName");
                str = sb13.toString();
            }
            if (this.n == null) {
                StringBuilder sb14 = new StringBuilder();
                sb14.append(str);
                sb14.append(" queryPosition");
                str = sb14.toString();
            }
            if (str.isEmpty()) {
                C3772gaa gaa = new C3772gaa(this.a, this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
                return gaa;
            }
            StringBuilder sb15 = new StringBuilder();
            sb15.append("Missing required properties:");
            sb15.append(str);
            throw new IllegalStateException(sb15.toString());
        }
    }

    C3835oZ(String str, long j2, c cVar, List<String> list, String str2, String str3, String str4, C4928GKa<C3508cda> gKa, C4928GKa<b> gKa2, C4928GKa<C3508cda> gKa3, C4928GKa<C3508cda> gKa4, C4928GKa<C3508cda> gKa5, C4928GKa<String> gKa6, C4928GKa<Integer> gKa7) {
        if (str != null) {
            this.a = str;
            this.b = j2;
            if (cVar != null) {
                this.c = cVar;
                if (list != null) {
                    this.d = list;
                    if (str2 != null) {
                        this.e = str2;
                        if (str3 != null) {
                            this.f = str3;
                            if (str4 != null) {
                                this.g = str4;
                                if (gKa != null) {
                                    this.h = gKa;
                                    if (gKa2 != null) {
                                        this.i = gKa2;
                                        if (gKa3 != null) {
                                            this.j = gKa3;
                                            if (gKa4 != null) {
                                                this.k = gKa4;
                                                if (gKa5 != null) {
                                                    this.l = gKa5;
                                                    if (gKa6 != null) {
                                                        this.m = gKa6;
                                                        if (gKa7 != null) {
                                                            this.n = gKa7;
                                                            return;
                                                        }
                                                        throw new NullPointerException("Null queryPosition");
                                                    }
                                                    throw new NullPointerException("Null clickName");
                                                }
                                                throw new NullPointerException("Null clickTarget");
                                            }
                                            throw new NullPointerException("Null clickObject");
                                        }
                                        throw new NullPointerException("Null promoterUrn");
                                    }
                                    throw new NullPointerException("Null impressionName");
                                }
                                throw new NullPointerException("Null impressionObject");
                            }
                            throw new NullPointerException("Null originScreen");
                        }
                        throw new NullPointerException("Null adUrn");
                    }
                    throw new NullPointerException("Null monetizationType");
                }
                throw new NullPointerException("Null trackingUrls");
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Qaa)) {
            return false;
        }
        Qaa qaa = (Qaa) obj;
        if (!this.a.equals(qaa.f()) || this.b != qaa.g() || !this.c.equals(qaa.n()) || !this.d.equals(qaa.s()) || !this.e.equals(qaa.o()) || !this.f.equals(qaa.h()) || !this.g.equals(qaa.p()) || !this.h.equals(qaa.m()) || !this.i.equals(qaa.l()) || !this.j.equals(qaa.q()) || !this.k.equals(qaa.j()) || !this.l.equals(qaa.k()) || !this.m.equals(qaa.i()) || !this.n.equals(qaa.r())) {
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

    public String h() {
        return this.f;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((((((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode()) * 1000003) ^ this.n.hashCode();
    }

    public C4928GKa<String> i() {
        return this.m;
    }

    public C4928GKa<C3508cda> j() {
        return this.k;
    }

    public C4928GKa<C3508cda> k() {
        return this.l;
    }

    public C4928GKa<b> l() {
        return this.i;
    }

    public C4928GKa<C3508cda> m() {
        return this.h;
    }

    public c n() {
        return this.c;
    }

    public String o() {
        return this.e;
    }

    public String p() {
        return this.g;
    }

    public C4928GKa<C3508cda> q() {
        return this.j;
    }

    public C4928GKa<Integer> r() {
        return this.n;
    }

    public List<String> s() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PromotedTrackingEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", trackingUrls=");
        sb.append(this.d);
        sb.append(", monetizationType=");
        sb.append(this.e);
        sb.append(", adUrn=");
        sb.append(this.f);
        sb.append(", originScreen=");
        sb.append(this.g);
        sb.append(", impressionObject=");
        sb.append(this.h);
        sb.append(", impressionName=");
        sb.append(this.i);
        sb.append(", promoterUrn=");
        sb.append(this.j);
        sb.append(", clickObject=");
        sb.append(this.k);
        sb.append(", clickTarget=");
        sb.append(this.l);
        sb.append(", clickName=");
        sb.append(this.m);
        sb.append(", queryPosition=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }
}
