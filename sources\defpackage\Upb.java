package defpackage;

/* renamed from: Upb reason: default package */
/* compiled from: constantValues.kt */
public final class Upb extends Npb<Float> {
    public Upb(float f) {
        super(Float.valueOf(f));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).floatValue());
        sb.append(".toFloat()");
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb p = fdb.E().p();
        C7471uYa.a((Object) p, "module.builtIns.floatType");
        return p;
    }
}
