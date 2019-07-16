package defpackage;

/* renamed from: Zw reason: default package */
final class Zw implements C1311fx {
    private C1311fx[] a;

    Zw(C1311fx... fxVarArr) {
        this.a = fxVarArr;
    }

    public final C1342gx a(Class<?> cls) {
        C1311fx[] fxVarArr;
        for (C1311fx fxVar : this.a) {
            if (fxVar.b(cls)) {
                return fxVar.a(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final boolean b(Class<?> cls) {
        for (C1311fx b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
