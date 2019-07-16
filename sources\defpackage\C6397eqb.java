package defpackage;

/* renamed from: eqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C6397eqb extends C6533gqb<Long> {
    public C6397eqb(long j) {
        super(Long.valueOf(j));
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7280rnb rnb = C5301Sbb.h.ta;
        C7471uYa.a((Object) rnb, "KotlinBuiltIns.FQ_NAMES.uLong");
        C5029Jcb a = C5535_cb.a(fdb, rnb);
        if (a != null) {
            Etb z = a.z();
            if (z != null) {
                return z;
            }
        }
        Etb c = C7154ptb.c("Unsigned type ULong not found");
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…ed type ULong not found\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).longValue());
        sb.append(".toULong()");
        return sb.toString();
    }
}
