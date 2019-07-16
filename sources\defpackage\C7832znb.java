package defpackage;

/* renamed from: znb reason: default package and case insensitive filesystem */
/* compiled from: SpecialNames */
public class C7832znb {
    public static final C7694xnb a = C7694xnb.d("<no name provided>");
    public static final C7694xnb b = C7694xnb.d("<root package>");
    public static final C7694xnb c = C7694xnb.b("Companion");
    public static final C7694xnb d = C7694xnb.b("no_name_in_PSI_3d19d79d_1ba9_4cd0_b7f5_b46aa3cd5d40");
    public static final C7694xnb e = C7694xnb.d("<anonymous>");

    private static /* synthetic */ void a(int i) {
        String str = i != 2 ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i != 2 ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/SpecialNames";
        if (i != 2) {
            objArr[0] = str2;
        } else {
            objArr[0] = "name";
        }
        if (i != 2) {
            objArr[1] = "safeIdentifier";
        } else {
            objArr[1] = str2;
        }
        if (i == 2) {
            objArr[2] = "isSafeIdentifier";
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static boolean a(C7694xnb xnb) {
        if (xnb != null) {
            return !xnb.a().isEmpty() && !xnb.c();
        }
        a(2);
        throw null;
    }

    public static C7694xnb b(C7694xnb xnb) {
        if (xnb == null || xnb.c()) {
            xnb = d;
        }
        if (xnb != null) {
            return xnb;
        }
        a(0);
        throw null;
    }
}
