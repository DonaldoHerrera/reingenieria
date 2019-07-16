package defpackage;

/* renamed from: lub reason: default package and case insensitive filesystem */
/* compiled from: KotlinTypeCheckerImpl */
public class C6881lub implements C6745jub {
    private final C7777yub a;

    protected C6881lub(C7777yub yub) {
        if (yub != null) {
            this.a = yub;
        } else {
            a(2);
            throw null;
        }
    }

    public static C6745jub a(a aVar) {
        if (aVar != null) {
            return new C6881lub(new C7777yub(new C6813kub(aVar)));
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str = i != 1 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 1 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl";
        switch (i) {
            case 1:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "procedure";
                break;
            case 3:
                objArr[0] = "subtype";
                break;
            case 4:
                objArr[0] = "supertype";
                break;
            case 5:
                objArr[0] = "a";
                break;
            case 6:
                objArr[0] = "b";
                break;
            default:
                objArr[0] = "equalityAxioms";
                break;
        }
        String str3 = "withAxioms";
        if (i != 1) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 1:
                break;
            case 2:
                objArr[2] = "<init>";
                break;
            case 3:
            case 4:
                objArr[2] = "isSubtypeOf";
                break;
            case 5:
            case 6:
                objArr[2] = "equalTypes";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        String format = String.format(str, objArr);
        throw (i != 1 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public boolean b(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(3);
            throw null;
        } else if (xtb2 != null) {
            return this.a.d(xtb, xtb2);
        } else {
            a(4);
            throw null;
        }
    }

    public boolean a(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(5);
            throw null;
        } else if (xtb2 != null) {
            return this.a.a(xtb, xtb2);
        } else {
            a(6);
            throw null;
        }
    }
}
