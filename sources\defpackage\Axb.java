package defpackage;

/* renamed from: Axb reason: default package */
/* compiled from: StringNumberConversionsJVM.kt */
class Axb extends C7852zxb {
    public static Double a(String str) {
        C7471uYa.b(str, "$this$toDoubleOrNull");
        try {
            if (C7300rxb.a.b(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static Float b(String str) {
        C7471uYa.b(str, "$this$toFloatOrNull");
        try {
            if (C7300rxb.a.b(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
