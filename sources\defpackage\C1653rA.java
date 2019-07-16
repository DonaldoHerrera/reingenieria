package defpackage;

/* renamed from: rA reason: default package and case insensitive filesystem */
public class C1653rA extends RuntimeException {
    private final int a;

    public C1653rA(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Install Error: ");
        sb.append(i);
        super(sb.toString());
        this.a = i;
    }
}
