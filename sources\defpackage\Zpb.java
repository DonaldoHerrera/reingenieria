package defpackage;

/* renamed from: Zpb reason: default package */
/* compiled from: constantValues.kt */
public final class Zpb extends Wpb<Long> {
    public Zpb(long j) {
        super(Long.valueOf(j));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).longValue());
        sb.append(".toLong()");
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb s = fdb.E().s();
        C7471uYa.a((Object) s, "module.builtIns.longType");
        return s;
    }
}
