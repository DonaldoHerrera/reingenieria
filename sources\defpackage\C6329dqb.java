package defpackage;

/* renamed from: dqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C6329dqb extends C6533gqb<Integer> {
    public C6329dqb(int i) {
        super(Integer.valueOf(i));
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7280rnb rnb = C5301Sbb.h.sa;
        C7471uYa.a((Object) rnb, "KotlinBuiltIns.FQ_NAMES.uInt");
        C5029Jcb a = C5535_cb.a(fdb, rnb);
        if (a != null) {
            Etb z = a.z();
            if (z != null) {
                return z;
            }
        }
        Etb c = C7154ptb.c("Unsigned type UInt not found");
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…ned type UInt not found\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).intValue());
        sb.append(".toUInt()");
        return sb.toString();
    }
}
