package defpackage;

/* renamed from: Dw reason: default package and case insensitive filesystem */
final class C0200Dw implements C1311fx {
    private static final C0200Dw a = new C0200Dw();

    private C0200Dw() {
    }

    public static C0200Dw a() {
        return a;
    }

    public final boolean b(Class<?> cls) {
        return C0197Cw.class.isAssignableFrom(cls);
    }

    public final C1342gx a(Class<?> cls) {
        if (!C0197Cw.class.isAssignableFrom(cls)) {
            String str = "Unsupported message type: ";
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
        try {
            return (C1342gx) C0197Cw.a(cls.asSubclass(C0197Cw.class)).a(e.c, (Object) null, (Object) null);
        } catch (Exception e) {
            String str2 = "Unable to get message info for ";
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new String(str2), e);
        }
    }
}
