package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: xfb reason: default package and case insensitive filesystem */
/* compiled from: TypeParameterDescriptorImpl */
public class C7686xfb extends Keb {
    private final _Xa<C7706xtb, Void> j;
    private final List<C7706xtb> k;
    private boolean l;

    private C7686xfb(C5272Rcb rcb, C6723jeb jeb, boolean z, C6473fub fub, C7694xnb xnb, int i, C7822zdb zdb, _Xa<C7706xtb, Void> _xa, C4843Ddb ddb) {
        if (rcb == null) {
            e(16);
            throw null;
        } else if (jeb == null) {
            e(17);
            throw null;
        } else if (fub == null) {
            e(18);
            throw null;
        } else if (xnb == null) {
            e(19);
            throw null;
        } else if (zdb == null) {
            e(20);
            throw null;
        } else if (ddb != null) {
            super(Jsb.b, rcb, jeb, xnb, fub, z, i, zdb, ddb);
            this.k = new ArrayList(1);
            this.l = false;
            this.j = _xa;
        } else {
            e(21);
            throw null;
        }
    }

    public static C4905Fdb a(C5272Rcb rcb, C6723jeb jeb, boolean z, C6473fub fub, C7694xnb xnb, int i) {
        if (rcb == null) {
            e(0);
            throw null;
        } else if (jeb == null) {
            e(1);
            throw null;
        } else if (fub == null) {
            e(2);
            throw null;
        } else if (xnb != null) {
            C7686xfb a = a(rcb, jeb, z, fub, xnb, i, C7822zdb.a);
            a.b(C7148pqb.b(rcb).n());
            a.ua();
            if (a != null) {
                return a;
            }
            e(4);
            throw null;
        } else {
            e(3);
            throw null;
        }
    }

    private void c(C7706xtb xtb) {
        if (!C7844ztb.a(xtb)) {
            this.k.add(xtb);
        }
    }

    private static /* synthetic */ void e(int i) {
        String str = (i == 4 || i == 24) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 24) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
        switch (i) {
            case 1:
            case 6:
            case 11:
            case 17:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
            case 12:
            case 18:
                objArr[0] = "variance";
                break;
            case 3:
            case 8:
            case 13:
            case 19:
                objArr[0] = "name";
                break;
            case 4:
            case 24:
                objArr[0] = str2;
                break;
            case 9:
            case 14:
            case 20:
                objArr[0] = "source";
                break;
            case 15:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 21:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 22:
                objArr[0] = "bound";
                break;
            case 23:
                objArr[0] = C1325gg.TYPE;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createWithDefaultBound";
        if (i == 4) {
            objArr[1] = str3;
        } else if (i != 24) {
            objArr[1] = str2;
        } else {
            objArr[1] = "resolveUpperBounds";
        }
        switch (i) {
            case 4:
            case 24:
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createForFurtherModification";
                break;
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                objArr[2] = "<init>";
                break;
            case 22:
                objArr[2] = "addUpperBound";
                break;
            case 23:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = str3;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 24) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    private void va() {
        if (!this.l) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type parameter descriptor is not initialized: ");
            sb.append(xa());
            throw new IllegalStateException(sb.toString());
        }
    }

    private void wa() {
        if (this.l) {
            StringBuilder sb = new StringBuilder();
            sb.append("Type parameter descriptor is already initialized: ");
            sb.append(xa());
            throw new IllegalStateException(sb.toString());
        }
    }

    private String xa() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName());
        sb.append(" declared in ");
        sb.append(C6531gpb.e(e()));
        return sb.toString();
    }

    public void b(C7706xtb xtb) {
        if (xtb != null) {
            wa();
            c(xtb);
            return;
        }
        e(22);
        throw null;
    }

    /* access modifiers changed from: protected */
    public List<C7706xtb> ta() {
        va();
        List<C7706xtb> list = this.k;
        if (list != null) {
            return list;
        }
        e(24);
        throw null;
    }

    public void ua() {
        wa();
        this.l = true;
    }

    public static C7686xfb a(C5272Rcb rcb, C6723jeb jeb, boolean z, C6473fub fub, C7694xnb xnb, int i, C7822zdb zdb) {
        if (rcb == null) {
            e(5);
            throw null;
        } else if (jeb == null) {
            e(6);
            throw null;
        } else if (fub == null) {
            e(7);
            throw null;
        } else if (xnb == null) {
            e(8);
            throw null;
        } else if (zdb != null) {
            return a(rcb, jeb, z, fub, xnb, i, zdb, null, a.a);
        } else {
            e(9);
            throw null;
        }
    }

    public static C7686xfb a(C5272Rcb rcb, C6723jeb jeb, boolean z, C6473fub fub, C7694xnb xnb, int i, C7822zdb zdb, _Xa<C7706xtb, Void> _xa, C4843Ddb ddb) {
        if (rcb == null) {
            e(10);
            throw null;
        } else if (jeb == null) {
            e(11);
            throw null;
        } else if (fub == null) {
            e(12);
            throw null;
        } else if (xnb == null) {
            e(13);
            throw null;
        } else if (zdb == null) {
            e(14);
            throw null;
        } else if (ddb != null) {
            C7686xfb xfb = new C7686xfb(rcb, jeb, z, fub, xnb, i, zdb, _xa, ddb);
            return xfb;
        } else {
            e(15);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public void a(C7706xtb xtb) {
        if (xtb != null) {
            _Xa<C7706xtb, Void> _xa = this.j;
            if (_xa != null) {
                _xa.invoke(xtb);
                return;
            }
            return;
        }
        e(23);
        throw null;
    }
}
