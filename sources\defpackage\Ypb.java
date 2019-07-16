package defpackage;

/* renamed from: Ypb reason: default package */
/* compiled from: constantValues.kt */
public final class Ypb extends Npb<b> {
    public static final a b = new a(null);

    /* renamed from: Ypb$a */
    /* compiled from: constantValues.kt */
    public static final class a {
        private a() {
        }

        public final Npb<?> a(C7706xtb xtb) {
            C7471uYa.b(xtb, "argumentType");
            Ypb ypb = null;
            if (C7844ztb.a(xtb)) {
                return null;
            }
            C7706xtb xtb2 = xtb;
            int i = 0;
            while (C5301Sbb.d(xtb2)) {
                xtb2 = ((Stb) C7676xWa.j(xtb2.ya())).getType();
                C7471uYa.a((Object) xtb2, "type.arguments.single().type");
                i++;
            }
            C5122Mcb c = xtb2.za().c();
            if (c instanceof C5029Jcb) {
                C7280rnb a = C7148pqb.a(c);
                if (a == null) {
                    return new Ypb((b) new a(xtb));
                }
                ypb = new Ypb(a, i);
            } else if (c instanceof C4905Fdb) {
                C7280rnb a2 = C7280rnb.a(C5301Sbb.h.a.h());
                C7471uYa.a((Object) a2, "ClassId.topLevel(KotlinB…ns.FQ_NAMES.any.toSafe())");
                ypb = new Ypb(a2, 0);
            }
            return ypb;
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    /* renamed from: Ypb$b */
    /* compiled from: constantValues.kt */
    public static abstract class b {

        /* renamed from: Ypb$b$a */
        /* compiled from: constantValues.kt */
        public static final class a extends b {
            private final C7706xtb a;

            public a(C7706xtb xtb) {
                C7471uYa.b(xtb, C1325gg.TYPE);
                super(null);
                this.a = xtb;
            }

            public final C7706xtb a() {
                return this.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Ypb.b.a) r2).a) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof a) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                C7706xtb xtb = this.a;
                if (xtb != null) {
                    return xtb.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("LocalClass(type=");
                sb.append(this.a);
                sb.append(")");
                return sb.toString();
            }
        }

        /* renamed from: Ypb$b$b reason: collision with other inner class name */
        /* compiled from: constantValues.kt */
        public static final class C0159b extends b {
            private final Mpb a;

            public C0159b(Mpb mpb) {
                C7471uYa.b(mpb, "value");
                super(null);
                this.a = mpb;
            }

            public final int a() {
                return this.a.c();
            }

            public final C7280rnb b() {
                return this.a.d();
            }

            public final Mpb c() {
                return this.a;
            }

            /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
                if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((defpackage.Ypb.b.C0159b) r2).a) != false) goto L_0x0015;
             */
            public boolean equals(Object obj) {
                if (this != obj) {
                    if (obj instanceof C0159b) {
                    }
                    return false;
                }
                return true;
            }

            public int hashCode() {
                Mpb mpb = this.a;
                if (mpb != null) {
                    return mpb.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder sb = new StringBuilder();
                sb.append("NormalClass(value=");
                sb.append(this.a);
                sb.append(")");
                return sb.toString();
            }
        }

        private b() {
        }

        public /* synthetic */ b(C7264rYa rya) {
            this();
        }
    }

    public Ypb(b bVar) {
        C7471uYa.b(bVar, "value");
        super(bVar);
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C6723jeb a2 = C6723jeb.c.a();
        C5029Jcb r = fdb.E().r();
        C7471uYa.a((Object) r, "module.builtIns.kClass");
        return C7775ytb.a(a2, r, C6850lWa.a(new Utb(b(fdb))));
    }

    public final C7706xtb b(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        b bVar = (b) a();
        if (bVar instanceof a) {
            return ((a) a()).a();
        }
        if (bVar instanceof C0159b) {
            Mpb c = ((C0159b) a()).c();
            C7280rnb a2 = c.a();
            int b2 = c.b();
            C5029Jcb a3 = C5535_cb.a(fdb, a2);
            if (a3 != null) {
                Etb z = a3.z();
                C7471uYa.a((Object) z, "descriptor.defaultType");
                C7706xtb g = Fub.g(z);
                for (int i = 0; i < b2; i++) {
                    g = fdb.E().a(C6473fub.INVARIANT, g);
                    C7471uYa.a((Object) g, "module.builtIns.getArray…Variance.INVARIANT, type)");
                }
                return g;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unresolved type: ");
            sb.append(a2);
            sb.append(" (arrayDimensions=");
            sb.append(b2);
            sb.append(')');
            Etb c2 = C7154ptb.c(sb.toString());
            C7471uYa.a((Object) c2, "ErrorUtils.createErrorTy…sions=$arrayDimensions)\")");
            return c2;
        }
        throw new FVa();
    }

    public Ypb(Mpb mpb) {
        C7471uYa.b(mpb, "value");
        this((b) new C0159b(mpb));
    }

    public Ypb(C7280rnb rnb, int i) {
        C7471uYa.b(rnb, "classId");
        this(new Mpb(rnb, i));
    }
}
