package defpackage;

/* renamed from: ynb reason: default package and case insensitive filesystem */
/* compiled from: NameUtils.kt */
public final class C7763ynb {
    private static final C7162pxb a = new C7162pxb("[^\\p{L}\\p{Digit}]");
    public static final C7763ynb b = new C7763ynb();

    private C7763ynb() {
    }

    @NXa
    public static final String a(String str) {
        C7471uYa.b(str, "name");
        return a.a((CharSequence) str, "_");
    }
}
