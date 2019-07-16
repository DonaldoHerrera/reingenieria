package defpackage;

/* renamed from: Okb reason: default package */
/* compiled from: TypeMappingMode.kt */
public final class Okb {
    public static final Okb a;
    public static final Okb b;
    public static final Okb c;
    public static final Okb d;
    public static final Okb e;
    public static final Okb f;
    public static final Okb g;
    public static final a h = new a(null);
    private final boolean i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private final Okb n;
    private final boolean o;
    private final Okb p;
    private final Okb q;

    /* renamed from: Okb$a */
    /* compiled from: TypeMappingMode.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    static {
        Okb okb = new Okb(false, false, false, false, false, null, false, null, null, 511, null);
        a = okb;
        Okb okb2 = new Okb(false, true, false, false, false, null, false, null, null, 509, null);
        b = okb2;
        Okb okb3 = new Okb(false, false, false, false, false, a, false, null, null, 476, null);
        c = okb3;
        Okb okb4 = new Okb(false, true, false, false, false, a, false, null, null, 476, null);
        d = okb4;
        Okb okb5 = new Okb(false, false, false, true, false, a, false, null, null, 471, null);
        e = okb5;
        Okb okb6 = new Okb(false, false, false, true, false, a, false, null, null, 407, null);
        f = okb6;
        Okb okb7 = new Okb(false, false, true, false, false, a, false, null, null, 475, null);
        Okb okb8 = new Okb(false, false, true, false, false, okb7, false, null, null, 472, null);
        g = okb8;
    }

    private Okb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Okb okb, boolean z6, Okb okb2, Okb okb3) {
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = z4;
        this.m = z5;
        this.n = okb;
        this.o = z6;
        this.p = okb2;
        this.q = okb3;
    }

    public final boolean a() {
        return this.o;
    }

    public final boolean b() {
        return this.j;
    }

    public final boolean c() {
        return this.i;
    }

    public final boolean d() {
        return this.k;
    }

    public final Okb e() {
        Okb okb = new Okb(this.i, true, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
        return okb;
    }

    /* synthetic */ Okb(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Okb okb, boolean z6, Okb okb2, Okb okb3, int i2, C7264rYa rya) {
        int i3 = i2;
        boolean z7 = true;
        boolean z8 = (i3 & 1) != 0 ? true : z;
        boolean z9 = (i3 & 2) != 0 ? true : z2;
        boolean z10 = false;
        boolean z11 = (i3 & 4) != 0 ? false : z3;
        boolean z12 = (i3 & 8) != 0 ? false : z4;
        if ((i3 & 16) == 0) {
            z10 = z5;
        }
        Okb okb4 = (i3 & 32) != 0 ? null : okb;
        if ((i3 & 64) == 0) {
            z7 = z6;
        }
        this(z8, z9, z11, z12, z10, okb4, z7, (i3 & 128) != 0 ? okb4 : okb2, (i3 & 256) != 0 ? okb4 : okb3);
    }

    public final Okb a(C6473fub fub) {
        C7471uYa.b(fub, "effectiveVariance");
        int i2 = Pkb.a[fub.ordinal()];
        if (i2 == 1) {
            Okb okb = this.p;
            if (okb != null) {
                return okb;
            }
        } else if (i2 != 2) {
            Okb okb2 = this.n;
            if (okb2 != null) {
                return okb2;
            }
        } else {
            Okb okb3 = this.q;
            if (okb3 != null) {
                return okb3;
            }
        }
        return this;
    }
}
