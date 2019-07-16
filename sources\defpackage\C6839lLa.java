package defpackage;

@Deprecated
/* renamed from: lLa reason: default package and case insensitive filesystem */
/* compiled from: Field */
public class C6839lLa implements C6635iLa<C6839lLa> {
    private String a;
    private final String b;

    public C6839lLa(String str) {
        this.b = str;
    }

    public static C6839lLa b(String str) {
        return new C6839lLa(str);
    }

    public C6839lLa a(String str) {
        this.a = str;
        return this;
    }

    public String build() {
        StringBuilder sb = new StringBuilder(this.b);
        C6703jLa.a(sb, this.a);
        return sb.toString();
    }
}
