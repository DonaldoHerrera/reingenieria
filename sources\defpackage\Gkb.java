package defpackage;

/* renamed from: Gkb reason: default package */
/* compiled from: MemberSignature.kt */
public final class Gkb {
    public static final a a = new a(null);
    private final String b;

    /* renamed from: Gkb$a */
    /* compiled from: MemberSignature.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Gkb a(Emb emb, c cVar) {
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(cVar, "signature");
            return b(emb.getString(cVar.k()), emb.getString(cVar.j()));
        }

        @NXa
        public final Gkb b(String str, String str2) {
            C7471uYa.b(str, "name");
            C7471uYa.b(str2, "desc");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(str2);
            return new Gkb(sb.toString(), null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }

        @NXa
        public final Gkb a(String str, String str2) {
            C7471uYa.b(str, "name");
            C7471uYa.b(str2, "desc");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(str2);
            return new Gkb(sb.toString(), null);
        }

        @NXa
        public final Gkb a(C6664inb inb) {
            C7471uYa.b(inb, "signature");
            if (inb instanceof b) {
                return b(inb.c(), inb.b());
            }
            if (inb instanceof defpackage.C6664inb.a) {
                return a(inb.c(), inb.b());
            }
            throw new FVa();
        }

        @NXa
        public final Gkb a(Gkb gkb, int i) {
            C7471uYa.b(gkb, "signature");
            StringBuilder sb = new StringBuilder();
            sb.append(gkb.a());
            sb.append("@");
            sb.append(i);
            return new Gkb(sb.toString(), null);
        }
    }

    private Gkb(String str) {
        this.b = str;
    }

    public final String a() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((defpackage.Gkb) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Gkb) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.b;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MemberSignature(signature=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ Gkb(String str, C7264rYa rya) {
        this(str);
    }
}
