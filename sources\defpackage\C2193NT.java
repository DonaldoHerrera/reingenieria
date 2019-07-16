package defpackage;

import java.util.List;

/* renamed from: NT reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_Configuration */
final class C2193NT extends C2212OT {
    private final List<C2417ZU> a;
    private final C2966dV b;
    private final C2020EU c;
    private final C2492cU d;
    private final boolean e;
    private final List<String> f;
    private final C2155LT g;

    /* renamed from: NT$a */
    /* compiled from: AutoValue_Configuration */
    static final class a extends defpackage.C2212OT.a {
        private List<C2417ZU> a;
        private C2966dV b;
        private C2020EU c;
        private C2492cU d;
        private Boolean e;
        private List<String> f;
        private C2155LT g;

        a() {
        }

        public defpackage.C2212OT.a a(C2966dV dVVar) {
            if (dVVar != null) {
                this.b = dVVar;
                return this;
            }
            throw new NullPointerException("Null userPlan");
        }

        public defpackage.C2212OT.a b(List<C2417ZU> list) {
            if (list != null) {
                this.a = list;
                return this;
            }
            throw new NullPointerException("Null features");
        }

        public defpackage.C2212OT.a a(C2020EU eu) {
            if (eu != null) {
                this.c = eu;
                return this;
            }
            throw new NullPointerException("Null assignment");
        }

        public defpackage.C2212OT.a a(C2492cU cUVar) {
            if (cUVar != null) {
                this.d = cUVar;
                return this;
            }
            throw new NullPointerException("Null deviceManagement");
        }

        public defpackage.C2212OT.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public defpackage.C2212OT.a a(List<String> list) {
            if (list != null) {
                this.f = list;
                return this;
            }
            throw new NullPointerException("Null imageSizeSpecs");
        }

        public defpackage.C2212OT.a a(C2155LT lt) {
            if (lt != null) {
                this.g = lt;
                return this;
            }
            throw new NullPointerException("Null privacySettings");
        }

        public C2212OT a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" features");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" userPlan");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" assignment");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" deviceManagement");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" selfDestruct");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" imageSizeSpecs");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" privacySettings");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                C2193NT nt = new C2193NT(this.a, this.b, this.c, this.d, this.e.booleanValue(), this.f, this.g);
                return nt;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    public C2020EU a() {
        return this.c;
    }

    public C2492cU b() {
        return this.d;
    }

    public List<C2417ZU> c() {
        return this.a;
    }

    public List<String> d() {
        return this.f;
    }

    public C2155LT e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2212OT)) {
            return false;
        }
        C2212OT ot = (C2212OT) obj;
        if (!this.a.equals(ot.c()) || !this.b.equals(ot.f()) || !this.c.equals(ot.a()) || !this.d.equals(ot.b()) || this.e != ot.g() || !this.f.equals(ot.d()) || !this.g.equals(ot.e())) {
            z = false;
        }
        return z;
    }

    public C2966dV f() {
        return this.b;
    }

    public boolean g() {
        return this.e;
    }

    public int hashCode() {
        return ((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Configuration{features=");
        sb.append(this.a);
        sb.append(", userPlan=");
        sb.append(this.b);
        sb.append(", assignment=");
        sb.append(this.c);
        sb.append(", deviceManagement=");
        sb.append(this.d);
        sb.append(", selfDestruct=");
        sb.append(this.e);
        sb.append(", imageSizeSpecs=");
        sb.append(this.f);
        sb.append(", privacySettings=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    private C2193NT(List<C2417ZU> list, C2966dV dVVar, C2020EU eu, C2492cU cUVar, boolean z, List<String> list2, C2155LT lt) {
        this.a = list;
        this.b = dVVar;
        this.c = eu;
        this.d = cUVar;
        this.e = z;
        this.f = list2;
        this.g = lt;
    }
}
