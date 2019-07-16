package defpackage;

/* renamed from: inb reason: default package and case insensitive filesystem */
/* compiled from: JvmMemberSignature.kt */
public abstract class C6664inb {

    /* renamed from: inb$a */
    /* compiled from: JvmMemberSignature.kt */
    public static final class a extends C6664inb {
        private final String a;
        private final String b;

        public a(String str, String str2) {
            C7471uYa.b(str, "name");
            C7471uYa.b(str2, "desc");
            super(null);
            this.a = str;
            this.b = str2;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(c());
            sb.append(':');
            sb.append(b());
            return sb.toString();
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        public final String d() {
            return c();
        }

        public final String e() {
            return b();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r3.b()) != false) goto L_0x0027;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (C7471uYa.a((Object) c(), (Object) aVar.c())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String c = c();
            int i = 0;
            int hashCode = (c != null ? c.hashCode() : 0) * 31;
            String b2 = b();
            if (b2 != null) {
                i = b2.hashCode();
            }
            return hashCode + i;
        }
    }

    /* renamed from: inb$b */
    /* compiled from: JvmMemberSignature.kt */
    public static final class b extends C6664inb {
        private final String a;
        private final String b;

        public b(String str, String str2) {
            C7471uYa.b(str, "name");
            C7471uYa.b(str2, "desc");
            super(null);
            this.a = str;
            this.b = str2;
        }

        public String a() {
            StringBuilder sb = new StringBuilder();
            sb.append(c());
            sb.append(b());
            return sb.toString();
        }

        public String b() {
            return this.b;
        }

        public String c() {
            return this.a;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0022, code lost:
            if (defpackage.C7471uYa.a((java.lang.Object) b(), (java.lang.Object) r3.b()) != false) goto L_0x0027;
         */
        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj instanceof b) {
                    b bVar = (b) obj;
                    if (C7471uYa.a((Object) c(), (Object) bVar.c())) {
                    }
                }
                return false;
            }
            return true;
        }

        public int hashCode() {
            String c = c();
            int i = 0;
            int hashCode = (c != null ? c.hashCode() : 0) * 31;
            String b2 = b();
            if (b2 != null) {
                i = b2.hashCode();
            }
            return hashCode + i;
        }
    }

    private C6664inb() {
    }

    public abstract String a();

    public abstract String b();

    public abstract String c();

    public final String toString() {
        return a();
    }

    public /* synthetic */ C6664inb(C7264rYa rya) {
        this();
    }
}
