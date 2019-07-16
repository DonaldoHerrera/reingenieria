package defpackage;

/* renamed from: YY reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_AdDeliveryEvent */
abstract class C3478YY extends C3410BZ {
    private final String a;
    private final long b;
    private final C3508cda c;
    private final C4928GKa<C3508cda> d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> h;

    /* renamed from: YY$a */
    /* compiled from: $AutoValue_AdDeliveryEvent */
    static final class a extends defpackage.C3410BZ.a {
        private String a;
        private Long b;
        private C3508cda c;
        private C4928GKa<C3508cda> d;
        private String e;
        private Boolean f;
        private Boolean g;
        private C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> h;

        public defpackage.C3410BZ.a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public defpackage.C3410BZ.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        a() {
        }

        public defpackage.C3410BZ.a a(C3508cda cda) {
            if (cda != null) {
                this.c = cda;
                return this;
            }
            throw new NullPointerException("Null adUrn");
        }

        private a(C3410BZ bz) {
            this.a = bz.f();
            this.b = Long.valueOf(bz.g());
            this.c = bz.i();
            this.d = bz.k();
            this.e = bz.h();
            this.f = Boolean.valueOf(bz.j());
            this.g = Boolean.valueOf(bz.m());
            this.h = bz.l();
        }

        public defpackage.C3410BZ.a b(boolean z) {
            this.g = Boolean.valueOf(z);
            return this;
        }

        public defpackage.C3410BZ.a a(C4928GKa<C3508cda> gKa) {
            if (gKa != null) {
                this.d = gKa;
                return this;
            }
            throw new NullPointerException("Null monetizableUrn");
        }

        public defpackage.C3410BZ.a b(C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null monetizationType");
        }

        public defpackage.C3410BZ.a a(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null adRequestId");
        }

        public defpackage.C3410BZ.a a(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public C3410BZ a() {
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
                sb3.append(" adUrn");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" monetizableUrn");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" adRequestId");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" inForeground");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" playerVisible");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" monetizationType");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                C3449OZ oz = new C3449OZ(this.a, this.b.longValue(), this.c, this.d, this.e, this.f.booleanValue(), this.g.booleanValue(), this.h);
                return oz;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    C3478YY(String str, long j, C3508cda cda, C4928GKa<C3508cda> gKa, String str2, boolean z, boolean z2, C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> gKa2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (cda != null) {
                this.c = cda;
                if (gKa != null) {
                    this.d = gKa;
                    if (str2 != null) {
                        this.e = str2;
                        this.f = z;
                        this.g = z2;
                        if (gKa2 != null) {
                            this.h = gKa2;
                            return;
                        }
                        throw new NullPointerException("Null monetizationType");
                    }
                    throw new NullPointerException("Null adRequestId");
                }
                throw new NullPointerException("Null monetizableUrn");
            }
            throw new NullPointerException("Null adUrn");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3410BZ)) {
            return false;
        }
        C3410BZ bz = (C3410BZ) obj;
        if (!this.a.equals(bz.f()) || this.b != bz.g() || !this.c.equals(bz.i()) || !this.d.equals(bz.k()) || !this.e.equals(bz.h()) || this.f != bz.j() || this.g != bz.m() || !this.h.equals(bz.l())) {
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
        return this.e;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        int i = 1231;
        int hashCode2 = (((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ (this.f ? 1231 : 1237)) * 1000003;
        if (!this.g) {
            i = 1237;
        }
        return ((hashCode2 ^ i) * 1000003) ^ this.h.hashCode();
    }

    public C3508cda i() {
        return this.c;
    }

    public boolean j() {
        return this.f;
    }

    public C4928GKa<C3508cda> k() {
        return this.d;
    }

    public C4928GKa<com.soundcloud.android.foundation.ads.C3676c.a> l() {
        return this.h;
    }

    public boolean m() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public defpackage.C3410BZ.a n() {
        return new a(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdDeliveryEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", adUrn=");
        sb.append(this.c);
        sb.append(", monetizableUrn=");
        sb.append(this.d);
        sb.append(", adRequestId=");
        sb.append(this.e);
        sb.append(", inForeground=");
        sb.append(this.f);
        sb.append(", playerVisible=");
        sb.append(this.g);
        sb.append(", monetizationType=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
