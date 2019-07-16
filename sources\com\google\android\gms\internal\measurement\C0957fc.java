package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fc reason: case insensitive filesystem */
final class C0957fc implements C1008nc {
    private C1008nc[] a;

    C0957fc(C1008nc... ncVarArr) {
        this.a = ncVarArr;
    }

    public final C1014oc a(Class<?> cls) {
        C1008nc[] ncVarArr;
        for (C1008nc ncVar : this.a) {
            if (ncVar.b(cls)) {
                return ncVar.a(cls);
            }
        }
        String str = "No factory is available for message type: ";
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    public final boolean b(Class<?> cls) {
        for (C1008nc b : this.a) {
            if (b.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
