package defpackage;

/* renamed from: kLa reason: default package and case insensitive filesystem */
/* compiled from: Exists */
public class C6771kLa extends C7182qLa<C6975nLa, C6771kLa> implements C6635iLa<C6771kLa>, C7113pLa {
    private final C6975nLa b;
    private String c;

    C6771kLa(C6975nLa nla) {
        super(nla);
        this.b = nla.a(Character.valueOf('1'));
    }

    public /* bridge */ /* synthetic */ String[] C() {
        return super.C();
    }

    public /* bridge */ /* synthetic */ String D() {
        return super.D();
    }

    public String build() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("EXISTS(");
        sb.append(this.b.build());
        sb.append(')');
        C6703jLa.a(sb, this.c);
        return sb.toString();
    }

    public /* synthetic */ This c(C5085LLa lLa) {
        super.c(lLa);
        return this;
    }

    public C6771kLa d(String str) {
        this.c = str;
        return this;
    }
}
