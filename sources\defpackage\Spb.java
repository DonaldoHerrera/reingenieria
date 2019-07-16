package defpackage;

/* renamed from: Spb reason: default package */
/* compiled from: constantValues.kt */
public final class Spb extends Npb<HVa<? extends C7280rnb, ? extends C7694xnb>> {
    private final C7280rnb b;
    private final C7694xnb c;

    public Spb(C7280rnb rnb, C7694xnb xnb) {
        C7471uYa.b(rnb, "enumClassId");
        C7471uYa.b(xnb, "enumEntryName");
        super(NVa.a(rnb, xnb));
        this.b = rnb;
        this.c = xnb;
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C5029Jcb a = C5535_cb.a(fdb, this.b);
        if (a != null) {
            if (!C6531gpb.m(a)) {
                a = null;
            }
            if (a != null) {
                Etb z = a.z();
                if (z != null) {
                    return z;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Containing class for error-class based enum entry ");
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        Etb c2 = C7154ptb.c(sb.toString());
        C7471uYa.a((Object) c2, "ErrorUtils.createErrorTy…mClassId.$enumEntryName\")");
        return c2;
    }

    public final C7694xnb b() {
        return this.c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b.f());
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }
}
