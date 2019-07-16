package defpackage;

/* renamed from: Frb reason: default package */
/* compiled from: ProtoContainer.kt */
public abstract class Frb {
    private final Emb a;
    private final Jmb b;
    private final C7822zdb c;

    /* renamed from: Frb$a */
    /* compiled from: ProtoContainer.kt */
    public static final class a extends Frb {
        private final C7280rnb d;
        private final defpackage.C6458flb.b e;
        private final boolean f;
        private final C6458flb g;
        private final a h;

        public a(C6458flb flb, Emb emb, Jmb jmb, C7822zdb zdb, a aVar) {
            C7471uYa.b(flb, "classProto");
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(jmb, "typeTable");
            super(emb, jmb, zdb, null);
            this.g = flb;
            this.h = aVar;
            this.d = Drb.a(emb, this.g.s());
            defpackage.C6458flb.b bVar = (defpackage.C6458flb.b) Dmb.e.a(this.g.r());
            if (bVar == null) {
                bVar = defpackage.C6458flb.b.CLASS;
            }
            this.e = bVar;
            Boolean a = Dmb.f.a(this.g.r());
            C7471uYa.a((Object) a, "Flags.IS_INNER.get(classProto.flags)");
            this.f = a.booleanValue();
        }

        public C7349snb a() {
            C7349snb a = this.d.a();
            C7471uYa.a((Object) a, "classId.asSingleFqName()");
            return a;
        }

        public final C7280rnb e() {
            return this.d;
        }

        public final C6458flb f() {
            return this.g;
        }

        public final defpackage.C6458flb.b g() {
            return this.e;
        }

        public final a h() {
            return this.h;
        }

        public final boolean i() {
            return this.f;
        }
    }

    /* renamed from: Frb$b */
    /* compiled from: ProtoContainer.kt */
    public static final class b extends Frb {
        private final C7349snb d;

        public b(C7349snb snb, Emb emb, Jmb jmb, C7822zdb zdb) {
            C7471uYa.b(snb, "fqName");
            C7471uYa.b(emb, "nameResolver");
            C7471uYa.b(jmb, "typeTable");
            super(emb, jmb, zdb, null);
            this.d = snb;
        }

        public C7349snb a() {
            return this.d;
        }
    }

    private Frb(Emb emb, Jmb jmb, C7822zdb zdb) {
        this.a = emb;
        this.b = jmb;
        this.c = zdb;
    }

    public abstract C7349snb a();

    public final Emb b() {
        return this.a;
    }

    public final C7822zdb c() {
        return this.c;
    }

    public final Jmb d() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(": ");
        sb.append(a());
        return sb.toString();
    }

    public /* synthetic */ Frb(Emb emb, Jmb jmb, C7822zdb zdb, C7264rYa rya) {
        this(emb, jmb, zdb);
    }
}
