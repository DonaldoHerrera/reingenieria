package defpackage;

/* renamed from: ktb reason: default package and case insensitive filesystem */
/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
public final class C6811ktb extends Wtb {
    public static final a c = new a(null);
    private final Wtb d;
    private final Wtb e;

    /* renamed from: ktb$a */
    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final Wtb a(Wtb wtb, Wtb wtb2) {
            C7471uYa.b(wtb, "first");
            C7471uYa.b(wtb2, "second");
            if (wtb.d()) {
                return wtb2;
            }
            if (wtb2.d()) {
                return wtb;
            }
            return new C6811ktb(wtb, wtb2, null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public /* synthetic */ C6811ktb(Wtb wtb, Wtb wtb2, C7264rYa rya) {
        this(wtb, wtb2);
    }

    @NXa
    public static final Wtb a(Wtb wtb, Wtb wtb2) {
        return c.a(wtb, wtb2);
    }

    public Stb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "key");
        Stb a2 = this.d.a(xtb);
        return a2 != null ? a2 : this.e.a(xtb);
    }

    public boolean b() {
        return this.d.b() || this.e.b();
    }

    public boolean d() {
        return false;
    }

    private C6811ktb(Wtb wtb, Wtb wtb2) {
        this.d = wtb;
        this.e = wtb2;
    }

    public C7706xtb a(C7706xtb xtb, C6473fub fub) {
        C7471uYa.b(xtb, "topLevelType");
        C7471uYa.b(fub, "position");
        return this.e.a(this.d.a(xtb, fub), fub);
    }

    public boolean a() {
        return this.d.a() || this.e.a();
    }

    public C6723jeb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "annotations");
        return this.e.a(this.d.a(jeb));
    }
}
