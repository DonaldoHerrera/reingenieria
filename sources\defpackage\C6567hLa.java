package defpackage;

/* renamed from: hLa reason: default package and case insensitive filesystem */
/* compiled from: AggregateFunction */
public class C6567hLa implements C6635iLa<C6567hLa> {
    private final String a;
    private final String b;
    private String c;

    C6567hLa(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public C6567hLa a(String str) {
        this.c = str;
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder(64);
        sb.append(this.a);
        sb.append("(");
        sb.append(this.b);
        sb.append(')');
        C6703jLa.a(sb, this.c);
        return sb.toString();
    }
}
