package defpackage;

/* renamed from: sA reason: default package and case insensitive filesystem */
public final class C1683sA {
    private final int a;
    private final int b;
    private final String c;

    public C1683sA(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final String toString() {
        String str = this.c;
        int i = this.a;
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 69);
        sb.append("InstallState{packageName=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
