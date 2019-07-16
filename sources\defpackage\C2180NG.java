package defpackage;

/* renamed from: NG reason: default package and case insensitive filesystem */
public class C2180NG {
    private final String a;
    private final String b;

    private C2180NG(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static C2180NG a(String str, String str2) {
        C3067jH.a(str, "Name is null or empty");
        C3067jH.a(str2, "Version is null or empty");
        return new C2180NG(str, str2);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}
