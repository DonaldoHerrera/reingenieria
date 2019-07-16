package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: zfb reason: default package and case insensitive filesystem */
/* compiled from: VariableDescriptorImpl */
public abstract class C7824zfb extends Qeb implements C5123Mdb {
    protected C7706xtb e;

    public C7824zfb(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C7706xtb xtb, C7822zdb zdb) {
        if (rcb == null) {
            d(0);
            throw null;
        } else if (jeb == null) {
            d(1);
            throw null;
        } else if (xnb == null) {
            d(2);
            throw null;
        } else if (zdb != null) {
            super(rcb, jeb, xnb, zdb);
            this.e = xtb;
        } else {
            d(3);
            throw null;
        }
    }

    private static /* synthetic */ void d(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public void a(C7706xtb xtb) {
        this.e = xtb;
    }

    public List<C5061Kdb> f() {
        List<C5061Kdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d(6);
        throw null;
    }

    public C7706xtb getType() {
        C7706xtb xtb = this.e;
        if (xtb != null) {
            return xtb;
        }
        d(4);
        throw null;
    }

    public List<C4905Fdb> getTypeParameters() {
        List<C4905Fdb> emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        d(8);
        throw null;
    }

    public C7615wdb k() {
        return null;
    }

    public C7615wdb l() {
        return null;
    }

    public boolean o() {
        return false;
    }

    public C7706xtb a() {
        C7706xtb type = getType();
        if (type != null) {
            return type;
        }
        d(9);
        throw null;
    }
}
