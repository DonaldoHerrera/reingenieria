package defpackage;

/* renamed from: jLa reason: default package and case insensitive filesystem */
/* compiled from: ColumnFunctions */
public final class C6703jLa {
    private C6703jLa() {
    }

    public static C6567hLa a(String str) {
        return new C6567hLa("COUNT", str);
    }

    public static C6771kLa a(C6975nLa nla) {
        return new C6771kLa(nla);
    }

    static void a(StringBuilder sb, String str) {
        if (str != null) {
            sb.append(" AS ");
            sb.append(str);
        }
    }
}
