package defpackage;

/* renamed from: dx reason: default package and case insensitive filesystem */
final class C1249dx {
    private static final C0508bx a = c();
    private static final C0508bx b = new C1280ex();

    static C0508bx a() {
        return a;
    }

    static C0508bx b() {
        return b;
    }

    private static C0508bx c() {
        try {
            return (C0508bx) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
