package com.google.android.gms.internal.firebase-perf;

final class Tb implements C0816ac {
    private C0816ac[] a;

    Tb(C0816ac... acVarArr) {
        this.a = acVarArr;
    }

    public final boolean a(Class<?> cls) {
        for (C0816ac a2 : this.a) {
            if (a2.a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final C0821bc b(Class<?> cls) {
        C0816ac[] acVarArr;
        for (C0816ac acVar : this.a) {
            if (acVar.a(cls)) {
                return acVar.b(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }
}
