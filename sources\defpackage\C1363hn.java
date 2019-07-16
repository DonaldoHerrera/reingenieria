package defpackage;

/* renamed from: hn reason: default package and case insensitive filesystem */
/* compiled from: SeekMap */
public interface C1363hn {

    /* renamed from: hn$a */
    /* compiled from: SeekMap */
    public static final class a {
        public final C1393in a;
        public final C1393in b;

        public a(C1393in inVar) {
            this(inVar, inVar);
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.a.equals(aVar.a) || !this.b.equals(aVar.b)) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(this.a);
            if (this.a.equals(this.b)) {
                str = "";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(", ");
                sb2.append(this.b);
                str = sb2.toString();
            }
            sb.append(str);
            sb.append("]");
            return sb.toString();
        }

        public a(C1393in inVar, C1393in inVar2) {
            C1852xq.a(inVar);
            this.a = inVar;
            C1852xq.a(inVar2);
            this.b = inVar2;
        }
    }

    /* renamed from: hn$b */
    /* compiled from: SeekMap */
    public static final class b implements C1363hn {
        private final long a;
        private final a b;

        public b(long j) {
            this(j, 0);
        }

        public a a(long j) {
            return this.b;
        }

        public boolean b() {
            return false;
        }

        public long c() {
            return this.a;
        }

        public b(long j, long j2) {
            this.a = j;
            this.b = new a(j2 == 0 ? C1393in.a : new C1393in(0, j2));
        }
    }

    a a(long j);

    boolean b();

    long c();
}
