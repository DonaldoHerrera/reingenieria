package defpackage;

/* renamed from: ftb reason: default package and case insensitive filesystem */
/* compiled from: SpecialTypes.kt */
public final class C6471ftb extends C6607htb implements C6403etb {
    public static final a a = new a(null);
    private final Etb b;

    /* renamed from: ftb$a */
    /* compiled from: SpecialTypes.kt */
    public static final class a {
        private a() {
        }

        private final boolean b(C6405eub eub) {
            return Fub.a(eub) && !C7363sub.a.a(eub);
        }

        public final C6471ftb a(C6405eub eub) {
            C7471uYa.b(eub, C1325gg.TYPE);
            if (eub instanceof C6471ftb) {
                return (C6471ftb) eub;
            }
            if (!b(eub)) {
                return null;
            }
            if (eub instanceof C7223qtb) {
                C7223qtb qtb = (C7223qtb) eub;
                boolean a = C7471uYa.a((Object) qtb.Da().za(), (Object) qtb.Ea().za());
                if (TVa.a && !a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("DefinitelyNotNullType for flexible type (");
                    sb.append(eub);
                    sb.append(") can be created only from type variable with the same constructor for bounds");
                    throw new AssertionError(sb.toString());
                }
            }
            return new C6471ftb(C7430ttb.c(eub), null);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    private C6471ftb(Etb etb) {
        this.b = etb;
    }

    public boolean Aa() {
        return false;
    }

    /* access modifiers changed from: protected */
    public Etb Ca() {
        return this.b;
    }

    public final Etb getOriginal() {
        return this.b;
    }

    public boolean ta() {
        Ca().za();
        return Ca().za().c() instanceof C4905Fdb;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Ca());
        sb.append("!!");
        return sb.toString();
    }

    public /* synthetic */ C6471ftb(Etb etb, C7264rYa rya) {
        this(etb);
    }

    public C7706xtb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "replacement");
        return Htb.a(xtb.Ba());
    }

    public C6471ftb a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return new C6471ftb(Ca().a(jeb));
    }

    public Etb a(boolean z) {
        return z ? Ca().a(z) : this;
    }
}
