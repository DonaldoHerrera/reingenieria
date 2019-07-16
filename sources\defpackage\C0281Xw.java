package defpackage;

/* renamed from: Xw reason: default package and case insensitive filesystem */
final class C0281Xw implements Ax {
    private static final C1311fx a = new _w();
    private final C1311fx b;

    public C0281Xw() {
        this(new Zw(C0200Dw.a(), a()));
    }

    public final <T> C1859xx<T> a(Class<T> cls) {
        C1919zx.a(cls);
        C1342gx a2 = this.b.a(cls);
        if (a2.b()) {
            if (C0197Cw.class.isAssignableFrom(cls)) {
                return C1558nx.a(C1919zx.c(), C1888yw.a(), a2.c());
            }
            return C1558nx.a(C1919zx.a(), C1888yw.b(), a2.c());
        } else if (C0197Cw.class.isAssignableFrom(cls)) {
            if (a(a2)) {
                return C1496lx.a(cls, a2, C1709sx.b(), C0266Uw.b(), C1919zx.c(), C1888yw.a(), C1249dx.b());
            }
            return C1496lx.a(cls, a2, C1709sx.b(), C0266Uw.b(), C1919zx.c(), null, C1249dx.b());
        } else if (a(a2)) {
            return C1496lx.a(cls, a2, C1709sx.a(), C0266Uw.a(), C1919zx.a(), C1888yw.b(), C1249dx.a());
        } else {
            return C1496lx.a(cls, a2, C1709sx.a(), C0266Uw.a(), C1919zx.b(), null, C1249dx.a());
        }
    }

    private C0281Xw(C1311fx fxVar) {
        C0209Gw.a(fxVar, "messageInfoFactory");
        this.b = fxVar;
    }

    private static boolean a(C1342gx gxVar) {
        return gxVar.a() == e.i;
    }

    private static C1311fx a() {
        try {
            return (C1311fx) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return a;
        }
    }
}
