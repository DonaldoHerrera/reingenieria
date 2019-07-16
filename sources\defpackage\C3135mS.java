package defpackage;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: mS reason: default package and case insensitive filesystem */
/* compiled from: AutoValue_CastPlayQueue */
final class C3135mS extends C3261sS {
    private final C4928GKa<String> a;
    private final List<C3341wS> b;
    private final int c;
    private final long d;
    private final String e;
    private final String f;
    private final C4928GKa<C3183oS> g;

    /* renamed from: mS$a */
    /* compiled from: AutoValue_CastPlayQueue */
    static final class a extends a {
        private C4928GKa<String> a;
        private List<C3341wS> b;
        private Integer c;
        private Long d;
        private String e;
        private String f;
        private C4928GKa<C3183oS> g;

        /* access modifiers changed from: 0000 */
        public a a(List<C3341wS> list) {
            if (list != null) {
                this.b = list;
                return this;
            }
            throw new NullPointerException("Null queue");
        }

        /* access modifiers changed from: 0000 */
        public a b(C4928GKa<String> gKa) {
            if (gKa != null) {
                this.a = gKa;
                return this;
            }
            throw new NullPointerException("Null revision");
        }

        a() {
        }

        private a(C3261sS sSVar) {
            this.a = sSVar.h();
            this.b = sSVar.g();
            this.c = Integer.valueOf(sSVar.b());
            this.d = Long.valueOf(sSVar.f());
            this.e = sSVar.i();
            this.f = sSVar.k();
            this.g = sSVar.a();
        }

        /* access modifiers changed from: 0000 */
        public a a(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public a b(String str) {
            if (str != null) {
                this.f = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }

        /* access modifiers changed from: 0000 */
        public a a(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        /* access modifiers changed from: 0000 */
        public a a(String str) {
            if (str != null) {
                this.e = str;
                return this;
            }
            throw new NullPointerException("Null source");
        }

        /* access modifiers changed from: 0000 */
        public a a(C4928GKa<C3183oS> gKa) {
            if (gKa != null) {
                this.g = gKa;
                return this;
            }
            throw new NullPointerException("Null credentials");
        }

        /* access modifiers changed from: 0000 */
        public C3261sS a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" revision");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" queue");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" currentIndex");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" progress");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" source");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" version");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" credentials");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                C3135mS mSVar = new C3135mS(this.a, this.b, this.c.intValue(), this.d.longValue(), this.e, this.f, this.g);
                return mSVar;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    @JsonProperty("credentials")
    public C4928GKa<C3183oS> a() {
        return this.g;
    }

    @JsonProperty("current_index")
    public int b() {
        return this.c;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C3261sS)) {
            return false;
        }
        C3261sS sSVar = (C3261sS) obj;
        if (!this.a.equals(sSVar.h()) || !this.b.equals(sSVar.g()) || this.c != sSVar.b() || this.d != sSVar.f() || !this.e.equals(sSVar.i()) || !this.f.equals(sSVar.k()) || !this.g.equals(sSVar.a())) {
            z = false;
        }
        return z;
    }

    @JsonProperty("progress")
    public long f() {
        return this.d;
    }

    @JsonProperty("queue")
    public List<C3341wS> g() {
        return this.b;
    }

    @JsonProperty("revision")
    public C4928GKa<String> h() {
        return this.a;
    }

    public int hashCode() {
        int hashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        return ((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    @JsonProperty("source")
    public String i() {
        return this.e;
    }

    public a j() {
        return new a(this);
    }

    @JsonProperty("version")
    public String k() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CastPlayQueue{revision=");
        sb.append(this.a);
        sb.append(", queue=");
        sb.append(this.b);
        sb.append(", currentIndex=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.d);
        sb.append(", source=");
        sb.append(this.e);
        sb.append(", version=");
        sb.append(this.f);
        sb.append(", credentials=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }

    private C3135mS(C4928GKa<String> gKa, List<C3341wS> list, int i, long j, String str, String str2, C4928GKa<C3183oS> gKa2) {
        this.a = gKa;
        this.b = list;
        this.c = i;
        this.d = j;
        this.e = str;
        this.f = str2;
        this.g = gKa2;
    }
}
