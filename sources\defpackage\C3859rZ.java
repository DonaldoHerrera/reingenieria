package defpackage;

import java.util.List;

/* renamed from: rZ reason: default package and case insensitive filesystem */
/* compiled from: $AutoValue_ScrollDepthEvent */
abstract class C3859rZ extends Saa {
    private final String a;
    private final long b;
    private final Yca c;
    private final defpackage.Saa.a d;
    private final int e;
    private final List<c> f;
    private final List<c> g;

    /* renamed from: rZ$a */
    /* compiled from: $AutoValue_ScrollDepthEvent */
    static final class a extends b {
        private String a;
        private Long b;
        private Yca c;
        private defpackage.Saa.a d;
        private Integer e;
        private List<c> f;
        private List<c> g;

        a() {
        }

        public b a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null id");
        }

        public b b(List<c> list) {
            if (list != null) {
                this.g = list;
                return this;
            }
            throw new NullPointerException("Null latestItems");
        }

        public b a(long j) {
            this.b = Long.valueOf(j);
            return this;
        }

        public b a(Yca yca) {
            if (yca != null) {
                this.c = yca;
                return this;
            }
            throw new NullPointerException("Null screen");
        }

        public b a(defpackage.Saa.a aVar) {
            if (aVar != null) {
                this.d = aVar;
                return this;
            }
            throw new NullPointerException("Null action");
        }

        public b a(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        public b a(List<c> list) {
            if (list != null) {
                this.f = list;
                return this;
            }
            throw new NullPointerException("Null earliestItems");
        }

        public Saa a() {
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
                sb3.append(" screen");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" action");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" columnCount");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" earliestItems");
                str = sb6.toString();
            }
            if (this.g == null) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str);
                sb7.append(" latestItems");
                str = sb7.toString();
            }
            if (str.isEmpty()) {
                C3788iaa iaa = new C3788iaa(this.a, this.b.longValue(), this.c, this.d, this.e.intValue(), this.f, this.g);
                return iaa;
            }
            StringBuilder sb8 = new StringBuilder();
            sb8.append("Missing required properties:");
            sb8.append(str);
            throw new IllegalStateException(sb8.toString());
        }
    }

    C3859rZ(String str, long j, Yca yca, defpackage.Saa.a aVar, int i, List<c> list, List<c> list2) {
        if (str != null) {
            this.a = str;
            this.b = j;
            if (yca != null) {
                this.c = yca;
                if (aVar != null) {
                    this.d = aVar;
                    this.e = i;
                    if (list != null) {
                        this.f = list;
                        if (list2 != null) {
                            this.g = list2;
                            return;
                        }
                        throw new NullPointerException("Null latestItems");
                    }
                    throw new NullPointerException("Null earliestItems");
                }
                throw new NullPointerException("Null action");
            }
            throw new NullPointerException("Null screen");
        }
        throw new NullPointerException("Null id");
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Saa)) {
            return false;
        }
        Saa saa = (Saa) obj;
        if (!this.a.equals(saa.f()) || this.b != saa.g() || !this.c.equals(saa.n()) || !this.d.equals(saa.h()) || this.e != saa.i() || !this.f.equals(saa.k()) || !this.g.equals(saa.m())) {
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

    public defpackage.Saa.a h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        long j = this.b;
        return ((((((((((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public int i() {
        return this.e;
    }

    public List<c> k() {
        return this.f;
    }

    public List<c> m() {
        return this.g;
    }

    public Yca n() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ScrollDepthEvent{id=");
        sb.append(this.a);
        sb.append(", timestamp=");
        sb.append(this.b);
        sb.append(", screen=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", columnCount=");
        sb.append(this.e);
        sb.append(", earliestItems=");
        sb.append(this.f);
        sb.append(", latestItems=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
