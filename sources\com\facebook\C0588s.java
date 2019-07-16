package com.facebook;

/* renamed from: com.facebook.s reason: case insensitive filesystem */
/* compiled from: FacebookDialogException */
public class C0588s extends C0594t {
    private int a;
    private String b;

    public C0588s(String str, int i, String str2) {
        super(str);
        this.a = i;
        this.b = str2;
    }

    public int a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{FacebookDialogException: ");
        sb.append("errorCode: ");
        sb.append(a());
        sb.append(", message: ");
        sb.append(getMessage());
        sb.append(", url: ");
        sb.append(b());
        sb.append("}");
        return sb.toString();
    }
}
