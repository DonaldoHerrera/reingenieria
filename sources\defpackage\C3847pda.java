package defpackage;

/* renamed from: pda reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_PlaylistItem */
final class C3847pda extends C3863rda {
    private final boolean a;
    private final boolean b;
    private final C3823mda c;
    private final int d;
    private final int e;
    private final C3903wda f;
    private final C3879tda g;
    private final Eda h;
    private final int i;
    private final Boolean j;

    /* renamed from: pda$a */
    /* compiled from: AutoValue_PlaylistItem */
    static final class a extends defpackage.C3863rda.a {
        private Boolean a;
        private Boolean b;
        private C3823mda c;
        private Integer d;
        private Integer e;
        private C3903wda f;
        private C3879tda g;
        private Eda h;
        private Integer i;
        private Boolean j;

        public defpackage.C3863rda.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public defpackage.C3863rda.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public defpackage.C3863rda.a c(int i2) {
            this.i = Integer.valueOf(i2);
            return this;
        }

        a() {
        }

        public defpackage.C3863rda.a a(C3823mda mda) {
            if (mda != null) {
                this.c = mda;
                return this;
            }
            throw new NullPointerException("Null offlineState");
        }

        public defpackage.C3863rda.a b(int i2) {
            this.e = Integer.valueOf(i2);
            return this;
        }

        private a(C3863rda rda) {
            this.a = Boolean.valueOf(rda.o());
            this.b = Boolean.valueOf(rda.p());
            this.c = rda.r();
            this.d = Integer.valueOf(rda.q());
            this.e = Integer.valueOf(rda.z());
            this.f = rda.w();
            this.g = rda.t();
            this.h = rda.H();
            this.i = Integer.valueOf(rda.L());
            this.j = rda.G();
        }

        public defpackage.C3863rda.a a(int i2) {
            this.d = Integer.valueOf(i2);
            return this;
        }

        public defpackage.C3863rda.a a(C3903wda wda) {
            this.f = wda;
            return this;
        }

        public defpackage.C3863rda.a a(C3879tda tda) {
            this.g = tda;
            return this;
        }

        public defpackage.C3863rda.a a(Eda eda) {
            if (eda != null) {
                this.h = eda;
                return this;
            }
            throw new NullPointerException("Null playlist");
        }

        public defpackage.C3863rda.a a(Boolean bool) {
            if (bool != null) {
                this.j = bool;
                return this;
            }
            throw new NullPointerException("Null isMarkedForOffline");
        }

        public C3863rda a() {
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
                sb6.append(" playlist");
                str = sb6.toString();
            }
            if (this.i == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" trackCount");
                str = sb7.toString();
            }
            if (this.j == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" isMarkedForOffline");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                C3847pda pda = new C3847pda(this.a.booleanValue(), this.b.booleanValue(), this.c, this.d.intValue(), this.e.intValue(), this.f, this.g, this.h, this.i.intValue(), this.j);
                return pda;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    public Boolean G() {
        return this.j;
    }

    public Eda H() {
        return this.h;
    }

    public defpackage.C3863rda.a K() {
        return new a(this);
    }

    public int L() {
        return this.i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007f, code lost:
        if (r4.j.equals(r5.G()) != false) goto L_0x0083;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3863rda)) {
            return false;
        }
        C3863rda rda = (C3863rda) obj;
        if (this.a == rda.o() && this.b == rda.p() && this.c.equals(rda.r()) && this.d == rda.q() && this.e == rda.z()) {
            C3903wda wda = this.f;
            if (wda != null ? wda.equals(rda.w()) : rda.w() == null) {
                C3879tda tda = this.g;
                if (tda != null ? tda.equals(rda.t()) : rda.t() == null) {
                    if (this.h.equals(rda.H())) {
                        if (this.i == rda.L()) {
                        }
                    }
                }
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        int i2 = 1231;
        int i3 = ((this.a ? 1231 : 1237) ^ 1000003) * 1000003;
        if (!this.b) {
            i2 = 1237;
        }
        int hashCode = (((((((i3 ^ i2) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e) * 1000003;
        C3903wda wda = this.f;
        int i4 = 0;
        int hashCode2 = (hashCode ^ (wda == null ? 0 : wda.hashCode())) * 1000003;
        C3879tda tda = this.g;
        if (tda != null) {
            i4 = tda.hashCode();
        }
        return ((((((hashCode2 ^ i4) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i) * 1000003) ^ this.j.hashCode();
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

    public C3879tda t() {
        return this.g;
    }

    public C3903wda w() {
        return this.f;
    }

    public int z() {
        return this.e;
    }

    private C3847pda(boolean z, boolean z2, C3823mda mda, int i2, int i3, C3903wda wda, C3879tda tda, Eda eda, int i4, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = mda;
        this.d = i2;
        this.e = i3;
        this.f = wda;
        this.g = tda;
        this.h = eda;
        this.i = i4;
        this.j = bool;
    }
}
