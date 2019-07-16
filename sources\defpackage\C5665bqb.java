package defpackage;

/* renamed from: bqb reason: default package and case insensitive filesystem */
/* compiled from: constantValues.kt */
public final class C5665bqb extends Npb<String> {
    public C5665bqb(String str) {
        C7471uYa.b(str, "value");
        super(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('\"');
        sb.append((String) a());
        sb.append('\"');
        return sb.toString();
    }

    public Etb a(C6450fdb fdb) {
        C7471uYa.b(fdb, "module");
        Etb C = fdb.E().C();
        C7471uYa.a((Object) C, "module.builtIns.stringType");
        return C;
    }
}
