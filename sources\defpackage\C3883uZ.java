package defpackage;

/* renamed from: uZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_UpgradeFunnelEvent */
abstract class C3883uZ extends Waa {
    private final String a;
    private final long b;
    private final g c;
    private final e d;
    private final C4928GKa<String> e;
    private final C4928GKa<String> f;
    private final C4928GKa<d> g;
    private final C4928GKa<c> h;
    private final C4928GKa<String> i;
    private final C4928GKa<f> j;
    private final C4928GKa<String> k;
    private final C4928GKa<String> l;
    private final C4928GKa<defpackage.Waa.a> m;

    /* renamed from: uZ$a */
    /* compiled from: $AutoValue_UpgradeFunnelEvent */
    static final class a extends b {
        private String a;
        private Long b;
        private g c;
        private e d;
        private C4928GKa<String> e;
        private C4928GKa<String> f;
        private C4928GKa<d> g;
        private C4928GKa<c> h;
        private C4928GKa<String> i;
        private C4928GKa<f> j;
        private C4928GKa<String> k;
        private C4928GKa<String> l;
        private C4928GKa<defpackage.Waa.a> m;

        a() {
        }

        /* access modifiers changed from: 0000 */
        public b a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        /* access modifiers changed from: 0000 */
        public b b(C4928GKa<c> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null clickCategory");
        }

        /* access modifiers changed from: 0000 */
        public b c(C4928GKa<d> gKa) {
            if (gKa != null) {
                this.g = gKa;
                return this;
            }
            throw new NullPointerException("Null clickName");
        }

        /* access modifiers changed from: 0000 */
        public b d(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.i = gKa;
                return this;
            }
            throw new NullPointerException("Null clickObject");
        }

        /* access modifiers changed from: 0000 */
        public b e(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.k = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionCategory");
        }

        /* access modifiers changed from: 0000 */
        public b f(C4928GKa<f> gKa) {
            if (gKa != null) {
                this.j = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionName");
        }

        /* access modifiers changed from: 0000 */
        public b g(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.l = gKa;
                return this;
            }
            throw new NullPointerException("Null impressionObject");
        }

        /* access modifiers changed from: 0000 */
        public b h(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.e = gKa;
                return this;
            }
            throw new NullPointerException("Null pageName");
        }

        /* access modifiers changed from: 0000 */
        public b i(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.f = gKa;
                return this;
            }
            throw new NullPointerException("Null pageUrn");
        }

        /* access modifiers changed from: 0000 */
        public b a(long j2) {
            this.b = Long.valueOf(j2);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public b a(g gVar) {
            if (gVar != null) {
                this.c = gVar;
                return this;
            }
            throw new NullPointerException("Null kind");
        }

        /* access modifiers changed from: 0000 */
        public b a(e eVar) {
            if (eVar != null) {
                this.d = eVar;
                return this;
            }
            throw new NullPointerException("Null eventName");
        }

        /* access modifiers changed from: 0000 */
        public b a(C4928GKa<defpackage.Waa.a> gKa) {
            if (gKa != null) {
                this.m = gKa;
                return this;
            }
            throw new NullPointerException("Null adjustToken");
        }

        /* access modifiers changed from: 0000 */
        public Waa a() {
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
                sb4.append(" eventName");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" pageName");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" pageUrn");
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
                sb8.append(" clickCategory");
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
                sb10.append(" impressionName");
                str = sb10.toString();
            }
            if (this.k == null) {
                StringBuilder sb11 = new StringBuilder();
                sb11.append(str);
                sb11.append(" impressionCategory");
                str = sb11.toString();
            }
            if (this.l == null) {
                StringBuilder sb12 = new StringBuilder();
                sb12.append(str);
                sb12.append(" impressionObject");
                str = sb12.toString();
            }
            if (this.m == null) {
                StringBuilder sb13 = new StringBuilder();
                sb13.append(str);
                sb13.append(" adjustToken");
                str = sb13.toString();
            }
            if (str.isEmpty()) {
                C3812laa laa = new C3812laa(this.a, this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
                return laa;
            }
            StringBuilder sb14 = new StringBuilder();
            sb14.append("Missing required properties:");
            sb14.append(str);
            throw new IllegalStateException(sb14.toString());
        }
    }

    C3883uZ(String str, long j2, g gVar, e eVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<d> gKa3, C4928GKa<c> gKa4, C4928GKa<String> gKa5, C4928GKa<f> gKa6, C4928GKa<String> gKa7, C4928GKa<String> gKa8, C4928GKa<defpackage.Waa.a> gKa9) {
        if (str != null) {
            this.a = str;
            this.b = j2;
            if (gVar != null) {
                this.c = gVar;
                if (eVar != null) {
                    this.d = eVar;
                    if (gKa != null) {
                        this.e = gKa;
                        if (gKa2 != null) {
                            this.f = gKa2;
                            if (gKa3 != null) {
                                this.g = gKa3;
                                if (gKa4 != null) {
                                    this.h = gKa4;
                                    if (gKa5 != null) {
                                        this.i = gKa5;
                                        if (gKa6 != null) {
                                            this.j = gKa6;
                                            if (gKa7 != null) {
                                                this.k = gKa7;
                                                if (gKa8 != null) {
                                                    this.l = gKa8;
                                                    if (gKa9 != null) {
                                                        this.m = gKa9;
                                                        return;
                                                    }
                                                    throw new NullPointerException("Null adjustToken");
                                                }
                                                throw new NullPointerException("Null impressionObject");
                                            }
                                            throw new NullPointerException("Null impressionCategory");
                                        }
                                        throw new NullPointerException("Null impressionName");
                                    }
                                    throw new NullPointerException("Null clickObject");
                                }
                                throw new NullPointerException("Null clickCategory");
                            }
                            throw new NullPointerException("Null clickName");
                        }
                        throw new NullPointerException("Null pageUrn");
                    }
                    throw new NullPointerException("Null pageName");
                }
                throw new NullPointerException("Null eventName");
            }
            throw new NullPointerException("Null kind");
        }
        throw new NullPointerException("Null id");
    }

    public C4928GKa<String> T() {
        return this.k;
    }

    public C4928GKa<f> U() {
        return this.j;
    }

    public C4928GKa<String> V() {
        return this.l;
    }

    public g W() {
        return this.c;
    }

    public C4928GKa<String> X() {
        return this.e;
    }

    public C4928GKa<String> Y() {
        return this.f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Waa)) {
            return false;
        }
        Waa waa = (Waa) obj;
        if (!this.a.equals(waa.f()) || this.b != waa.g() || !this.c.equals(waa.W()) || !this.d.equals(waa.l()) || !this.e.equals(waa.X()) || !this.f.equals(waa.Y()) || !this.g.equals(waa.j()) || !this.h.equals(waa.i()) || !this.i.equals(waa.k()) || !this.j.equals(waa.U()) || !this.k.equals(waa.T()) || !this.l.equals(waa.V()) || !this.m.equals(waa.h())) {
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

    public C4928GKa<defpackage.Waa.a> h() {
        return this.m;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((((((((((((((((((((((hashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003) ^ this.j.hashCode()) * 1000003) ^ this.k.hashCode()) * 1000003) ^ this.l.hashCode()) * 1000003) ^ this.m.hashCode();
    }

    public C4928GKa<c> i() {
        return this.h;
    }

    public C4928GKa<d> j() {
        return this.g;
    }

    public C4928GKa<String> k() {
        return this.i;
    }

    public e l() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UpgradeFunnelEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", kind=");
        sb.append(this.c);
        sb.append(", eventName=");
        sb.append(this.d);
        sb.append(", pageName=");
        sb.append(this.e);
        sb.append(", pageUrn=");
        sb.append(this.f);
        sb.append(", clickName=");
        sb.append(this.g);
        sb.append(", clickCategory=");
        sb.append(this.h);
        sb.append(", clickObject=");
        sb.append(this.i);
        sb.append(", impressionName=");
        sb.append(this.j);
        sb.append(", impressionCategory=");
        sb.append(this.k);
        sb.append(", impressionObject=");
        sb.append(this.l);
        sb.append(", adjustToken=");
        sb.append(this.m);
        sb.append("}");
        return sb.toString();
    }
}
