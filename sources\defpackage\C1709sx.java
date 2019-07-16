package defpackage;

/* renamed from: sx reason: default package and case insensitive filesystem */
final class C1709sx {
    private static final C1620px a = c();
    private static final C1620px b = new C1589ox();

    static C1620px a() {
        return a;
    }

    static C1620px b() {
        return b;
    }

    private static C1620px c() {
        try {
            return (C1620px) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
