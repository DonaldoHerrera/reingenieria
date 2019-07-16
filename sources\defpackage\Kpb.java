package defpackage;

/* renamed from: Kpb reason: default package */
/* compiled from: constantValues.kt */
public final class Kpb extends Wpb<Byte> {
    public Kpb(byte b) {
        super(Byte.valueOf(b));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(((Number) a()).byteValue());
        sb.append(".toByte()");
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb j = fdb.E().j();
        C7471uYa.a((Object) j, "module.builtIns.byteType");
        return j;
    }
}
