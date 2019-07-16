package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.rb reason: case insensitive filesystem */
final class C1030rb {
    private static final Class<?> a = c();

    public static C1042tb a() {
        if (a != null) {
            try {
                return a("getEmptyRegistry");
            } catch (Exception unused) {
            }
        }
        return C1042tb.d;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000e  */
    static C1042tb b() {
        C1042tb tbVar;
        if (a != null) {
            try {
                tbVar = a("loadGeneratedRegistry");
            } catch (Exception unused) {
            }
            if (tbVar == null) {
                tbVar = C1042tb.a();
            }
            return tbVar != null ? a() : tbVar;
        }
        tbVar = null;
        if (tbVar == null) {
        }
        if (tbVar != null) {
        }
    }

    private static Class<?> c() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private static final C1042tb a(String str) throws Exception {
        return (C1042tb) a.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
    }
}
