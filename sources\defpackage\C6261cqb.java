package defpackage;

/* renamed from: cqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C6261cqb extends C6533gqb<Byte> {
    public C6261cqb(byte b) {
        super(Byte.valueOf(b));
    }

    public C7706xtb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        C7280rnb rnb = C5301Sbb.h.qa;
        C7471uYa.a((Object) rnb, "KotlinBuiltIns.FQ_NAMES.uByte");
        C5029Jcb a = C5535_cb.a(fdb, rnb);
        if (a != null) {
            Etb z = a.z();
            if (z != null) {
                return z;
            }
        }
        Etb c = C7154ptb.c("Unsigned type UByte not found");
        C7471uYa.a((Object) c, "ErrorUtils.createErrorTy…ed type UByte not found\")");
        return c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).byteValue());
        sb.append(".toUByte()");
        return sb.toString();
    }
}
