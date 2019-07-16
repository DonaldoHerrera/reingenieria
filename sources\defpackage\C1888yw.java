package defpackage;

/* renamed from: yw reason: default package and case insensitive filesystem */
final class C1888yw {
    private static final C1798vw<?> a = new C1768uw();
    private static final C1798vw<?> b = c();

    static C1798vw<?> a() {
        return a;
    }

    static C1798vw<?> b() {
        C1798vw<?> vwVar = b;
        if (vwVar != null) {
            return vwVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    private static C1798vw<?> c() {
        try {
            return (C1798vw) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
