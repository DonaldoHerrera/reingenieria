package defpackage;

/* renamed from: aqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C5597aqb extends Wpb<Short> {
    public C5597aqb(short s) {
        super(Short.valueOf(s));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).shortValue());
        sb.append(".toShort()");
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb z = fdb.E().z();
        C7471uYa.a((Object) z, "module.builtIns.shortType");
        return z;
    }
}
