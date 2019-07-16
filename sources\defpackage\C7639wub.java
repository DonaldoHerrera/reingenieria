package defpackage;

/* renamed from: wub reason: default package and case insensitive filesystem */
/* compiled from: TypeCheckerProcedureCallbacksImpl */
class C7639wub implements C7846zub {
    C7639wub() {
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = C1325gg.TYPE;
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
            default:
                objArr[0] = "a";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Ptb ptb, Ptb ptb2) {
        if (ptb == null) {
            a(3);
            throw null;
        } else if (ptb2 != null) {
            return ptb.equals(ptb2);
        } else {
            a(4);
            throw null;
        }
    }

    public boolean a(C7706xtb xtb, Stb stb) {
        if (xtb == null) {
            a(8);
            throw null;
        } else if (stb != null) {
            return false;
        } else {
            a(9);
            throw null;
        }
    }

    public boolean a(C7706xtb xtb, C7706xtb xtb2) {
        if (xtb == null) {
            a(10);
            throw null;
        } else if (xtb2 != null) {
            return false;
        } else {
            a(11);
            throw null;
        }
    }

    public boolean b(C7706xtb xtb, C7706xtb xtb2, C7777yub yub) {
        if (xtb == null) {
            a(0);
            throw null;
        } else if (xtb2 == null) {
            a(1);
            throw null;
        } else if (yub != null) {
            return yub.a(xtb, xtb2);
        } else {
            a(2);
            throw null;
        }
    }

    public boolean a(C7706xtb xtb, C7706xtb xtb2, C7777yub yub) {
        if (xtb == null) {
            a(5);
            throw null;
        } else if (xtb2 == null) {
            a(6);
            throw null;
        } else if (yub != null) {
            return yub.d(xtb, xtb2);
        } else {
            a(7);
            throw null;
        }
    }
}
