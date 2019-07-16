package defpackage;

import java.util.Collection;
import java.util.List;

/* renamed from: ntb reason: default package and case insensitive filesystem */
/* compiled from: ErrorUtils */
class C7016ntb implements C6450fdb {
    C7016ntb() {
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/ErrorUtils$1";
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            case 2:
            case 7:
                objArr[0] = "fqName";
                break;
            case 3:
                objArr[0] = "nameFilter";
                break;
            case 10:
                objArr[0] = "visitor";
                break;
            case 11:
                objArr[0] = "targetModule";
                break;
            default:
                objArr[0] = "capability";
                break;
        }
        String str3 = "getSubPackagesOf";
        if (i == 1) {
            objArr[1] = "getAnnotations";
        } else if (i == 4) {
            objArr[1] = str3;
        } else if (i == 5) {
            objArr[1] = "getName";
        } else if (i == 6) {
            objArr[1] = "getStableName";
        } else if (i == 8) {
            objArr[1] = "getAllDependencyModules";
        } else if (i == 9) {
            objArr[1] = "getExpectedByModules";
        } else if (i == 12) {
            objArr[1] = "getOriginal";
        } else if (i != 13) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getBuiltIns";
        }
        switch (i) {
            case 1:
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 12:
            case 13:
                break;
            case 2:
            case 3:
                objArr[2] = str3;
                break;
            case 7:
                objArr[2] = "getPackage";
                break;
            case 10:
                objArr[2] = "accept";
                break;
            case 11:
                objArr[2] = "shouldSeeInternalsOf";
                break;
            default:
                objArr[2] = "getCapability";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 4 || i == 5 || i == 6 || i == 8 || i == 9 || i == 12 || i == 13) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C5301Sbb E() {
        C5121Mbb F = C5121Mbb.F();
        if (F != null) {
            return F;
        }
        a(13);
        throw null;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        if (tcb != null) {
            return null;
        }
        a(10);
        throw null;
    }

    public Collection<C7349snb> a(C7349snb snb, _Xa<? super C7694xnb, Boolean> _xa) {
        if (snb == null) {
            a(2);
            throw null;
        } else if (_xa != null) {
            List a = C6918mWa.a();
            if (a != null) {
                return a;
            }
            a(4);
            throw null;
        } else {
            a(3);
            throw null;
        }
    }

    public boolean a(C6450fdb fdb) {
        if (fdb != null) {
            return false;
        }
        a(11);
        throw null;
    }

    public C5272Rcb e() {
        return null;
    }

    public C6723jeb getAnnotations() {
        C6723jeb a = C6723jeb.c.a();
        if (a != null) {
            return a;
        }
        a(1);
        throw null;
    }

    public C7694xnb getName() {
        C7694xnb d = C7694xnb.d("<ERROR MODULE>");
        if (d != null) {
            return d;
        }
        a(5);
        throw null;
    }

    public C5272Rcb getOriginal() {
        return this;
    }

    public C7132pdb a(C7349snb snb) {
        if (snb == null) {
            a(7);
            throw null;
        }
        throw new IllegalStateException("Should not be called!");
    }
}
