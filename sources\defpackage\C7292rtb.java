package defpackage;

/* renamed from: rtb reason: default package and case insensitive filesystem */
/* compiled from: flexibleTypes.kt */
public final class C7292rtb extends C7223qtb implements C6403etb {
    public static boolean c;
    public static final a d = new a(null);
    private boolean e;

    /* renamed from: rtb$a */
    /* compiled from: flexibleTypes.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C7292rtb(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "lowerBound");
        C7471uYa.b(etb2, "upperBound");
        super(etb, etb2);
    }

    private final void Fa() {
        if (c && !this.e) {
            this.e = true;
            boolean z = !C7430ttb.b(Da());
            if (!TVa.a || z) {
                boolean z2 = !C7430ttb.b(Ea());
                if (!TVa.a || z2) {
                    boolean a2 = true ^ C7471uYa.a((Object) Da(), (Object) Ea());
                    if (!TVa.a || a2) {
                        boolean b = C6745jub.a.b(Da(), Ea());
                        if (TVa.a && !b) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Lower bound ");
                            sb.append(Da());
                            sb.append(" of a flexible type must be a subtype of the upper bound ");
                            sb.append(Ea());
                            throw new AssertionError(sb.toString());
                        }
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Lower and upper bounds are equal: ");
                    sb2.append(Da());
                    sb2.append(" == ");
                    sb2.append(Ea());
                    throw new AssertionError(sb2.toString());
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Upper bound of a flexible type can not be flexible: ");
                sb3.append(Ea());
                throw new AssertionError(sb3.toString());
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("Lower bound of a flexible type can not be flexible: ");
            sb4.append(Da());
            throw new AssertionError(sb4.toString());
        }
    }

    public Etb Ca() {
        Fa();
        return Da();
    }

    public C7706xtb a(C7706xtb xtb) {
        C6405eub eub;
        C7471uYa.b(xtb, "replacement");
        C6405eub Ba = xtb.Ba();
        if (Ba instanceof C7223qtb) {
            eub = Ba;
        } else if (Ba instanceof Etb) {
            Etb etb = (Etb) Ba;
            eub = C7775ytb.a(etb, etb.a(true));
        } else {
            throw new FVa();
        }
        return C6269cub.a(eub, Ba);
    }

    public boolean ta() {
        return (Da().za().c() instanceof C4905Fdb) && C7471uYa.a((Object) Da().za(), (Object) Ea().za());
    }

    public C6405eub a(C6723jeb jeb) {
        C7471uYa.b(jeb, "newAnnotations");
        return C7775ytb.a(Da().a(jeb), Ea().a(jeb));
    }

    public String a(Cob cob, Pob pob) {
        C7471uYa.b(cob, "renderer");
        C7471uYa.b(pob, "options");
        if (!pob.c()) {
            return cob.a(cob.a((C7706xtb) Da()), cob.a((C7706xtb) Ea()), Fub.b(this));
        }
        StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(cob.a((C7706xtb) Da()));
        sb.append("..");
        sb.append(cob.a((C7706xtb) Ea()));
        sb.append(')');
        return sb.toString();
    }

    public C6405eub a(boolean z) {
        return C7775ytb.a(Da().a(z), Ea().a(z));
    }
}
