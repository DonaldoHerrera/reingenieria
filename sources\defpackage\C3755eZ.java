package defpackage;

import com.soundcloud.android.foundation.playqueue.m;

/* renamed from: eZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_CollectionEvent */
abstract class C3755eZ extends C3860raa {
    private final String a;
    private final long b;
    private final b c;
    private final C4928GKa<String> d;
    private final C4928GKa<String> e;
    private final C4928GKa<d> f;
    private final String g;
    private final C4928GKa<m> h;

    /* renamed from: eZ$a */
    /* compiled from: $AutoValue_CollectionEvent */
    static final class a extends defpackage.C3860raa.a {
        private String a;
        private Long b;
        private b c;
        private C4928GKa<String> d;
        private C4928GKa<String> e;
        private C4928GKa<d> f;
        private String g;
        private C4928GKa<m> h;

        a() {
        }

        public defpackage.C3860raa.a a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public defpackage.C3860raa.a b(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public defpackage.C3860raa.a c(C4928GKa<m> gKa) {
            if (gKa != null) {
                this.h = gKa;
                return this;
            }
            throw new NullPointerException("Null source");
        }

        public defpackage.C3860raa.a d(C4928GKa<d> gKa) {
            if (gKa != null) {
                this.f = gKa;
                return this;
            }
            throw new NullPointerException("Null target");
        }

        public defpackage.C3860raa.a a(b bVar) {
            if (bVar != null) {
                this.c = bVar;
                return this;
            }
            throw new NullPointerException("Null clickName");
        }

        public defpackage.C3860raa.a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.e = gKa;
                return this;
            }
            throw new NullPointerException("Null object");
        }

        public defpackage.C3860raa.a a(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.d = gKa;
                return this;
            }
            throw new NullPointerException("Null clickCategory");
        }

        public defpackage.C3860raa.a a(String str) {
            if (str != null) {
                this.g = str;
                return this;
            }
            throw new NullPointerException("Null pageName");
        }

        public C3860raa a() {
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
                sb3.append(" clickName");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" clickCategory");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" object");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" target");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" pageName");
                str = sb7.toString();
            }
            if (this.h == null) {
                StringBuilder sb8 = new StringBuilder();
                sb8.append(str);
                sb8.append(" source");
                str = sb8.toString();
            }
            if (str.isEmpty()) {
                C3467UZ uz = new C3467UZ(this.a, this.b.longValue(), this.c, this.d, this.e, this.f, this.g, this.h);
                return uz;
            }
            StringBuilder sb9 = new StringBuilder();
            sb9.append("Missing required properties:");
            sb9.append(str);
            throw new IllegalStateException(sb9.toString());
        }
    }

    C3755eZ(String str, long j, b bVar, C4928GKa<String> gKa, C4928GKa<String> gKa2, C4928GKa<d> gKa3, String str2, C4928GKa<m> gKa4) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (bVar != null) {
                this.c = bVar;
                if (gKa != null) {
                    this.d = gKa;
                    if (gKa2 != null) {
                        this.e = gKa2;
                        if (gKa3 != null) {
                            this.f = gKa3;
                            if (str2 != null) {
                                this.g = str2;
                                if (gKa4 != null) {
                                    this.h = gKa4;
                                    return;
                                }
                                throw new NullPointerException("Null source");
                            }
                            throw new NullPointerException("Null pageName");
                        }
                        throw new NullPointerException("Null target");
                    }
                    throw new NullPointerException("Null object");
                }
                throw new NullPointerException("Null clickCategory");
            }
            throw new NullPointerException("Null clickName");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3860raa)) {
            return false;
        }
        C3860raa raa = (C3860raa) obj;
        if (!this.a.equals(raa.f()) || this.b != raa.g() || !this.c.equals(raa.i()) || !this.d.equals(raa.h()) || !this.e.equals(raa.j()) || !this.f.equals(raa.m()) || !this.g.equals(raa.k()) || !this.h.equals(raa.l())) {
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
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode();
    }

    @C3783hda
    public b i() {
        return this.c;
    }

    public C4928GKa<String> j() {
        return this.e;
    }

    public String k() {
        return this.g;
    }

    public C4928GKa<m> l() {
        return this.h;
    }

    public C4928GKa<d> m() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", clickName=");
        sb.append(this.c);
        sb.append(", clickCategory=");
        sb.append(this.d);
        sb.append(", object=");
        sb.append(this.e);
        sb.append(", target=");
        sb.append(this.f);
        sb.append(", pageName=");
        sb.append(this.g);
        sb.append(", source=");
        sb.append(this.h);
        sb.append("}");
        return sb.toString();
    }
}
