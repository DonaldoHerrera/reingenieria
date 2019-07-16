package defpackage;

/* renamed from: fqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C6465fqb extends C6533gqb<Short> {
    public C6465fqb(short s) {
        super(Short.valueOf(s));
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7280rnb rnb = C5301Sbb.h.ra;
        C7471uYa.a((Object) rnb, "KotlinBuiltIns.FQ_NAMES.uShort");
        C5029Jcb a = C5535_cb.a(fdb, rnb);
        if (a != null) {
            Etb z = a.z();
            if (z != null) {
                return z;
            }
        }
        Etb c = C7154ptb.c("Unsigned type UShort not found");
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…d type UShort not found\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).shortValue());
        sb.append(".toUShort()");
        return sb.toString();
    }
}
