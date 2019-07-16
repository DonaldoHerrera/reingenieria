package defpackage;

/* renamed from: Rpb reason: default package */
/* compiled from: constantValues.kt */
public final class Rpb extends Npb<Double> {
    public Rpb(double d) {
        super(Double.valueOf(d));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).doubleValue());
        sb.append(".toDouble()");
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb o = fdb.E().o();
        C7471uYa.a((Object) o, "module.builtIns.doubleType");
        return o;
    }
}
