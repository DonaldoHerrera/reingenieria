package defpackage;

import java.util.List;

/* renamed from: Ogb reason: default package */
/* compiled from: JavaClassConstructorDescriptor */
public class Ogb extends Leb implements Ngb {
    private Boolean F;
    private Boolean G;

    protected Ogb(C5029Jcb jcb, Ogb ogb, C6723jeb jeb, boolean z, a aVar, C7822zdb zdb) {
        if (jcb == null) {
            f(0);
            throw null;
        } else if (jeb == null) {
            f(1);
            throw null;
        } else if (aVar == null) {
            f(2);
            throw null;
        } else if (zdb != null) {
            super(jcb, ogb, jeb, z, aVar, zdb);
            this.F = null;
            this.G = null;
        } else {
            f(3);
            throw null;
        }
    }

    public static Ogb b(C5029Jcb jcb, C6723jeb jeb, boolean z, C7822zdb zdb) {
        if (jcb == null) {
            f(4);
            throw null;
        } else if (jeb == null) {
            f(5);
            throw null;
        } else if (zdb != null) {
            Ogb ogb = new Ogb(jcb, null, jeb, z, a.DECLARATION, zdb);
            return ogb;
        } else {
            f(6);
            throw null;
        }
    }

    private static /* synthetic */ void f(int i) {
        String str = (i == 7 || i == 12 || i == 17 || i == 20) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 7 || i == 12 || i == 17 || i == 20) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
        switch (i) {
            case 1:
            case 5:
            case 10:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
            case 14:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 11:
                objArr[0] = "source";
                break;
            case 7:
            case 12:
            case 17:
            case 20:
                objArr[0] = str2;
                break;
            case 8:
            case 13:
                objArr[0] = "newOwner";
                break;
            case 15:
                objArr[0] = "sourceElement";
                break;
            case 18:
                objArr[0] = "enhancedValueParametersData";
                break;
            case 19:
                objArr[0] = "enhancedReturnType";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "enhance";
        String str4 = "createDescriptor";
        String str5 = "createSubstitutedCopy";
        String str6 = "createJavaConstructor";
        if (i == 7) {
            objArr[1] = str6;
        } else if (i == 12) {
            objArr[1] = str5;
        } else if (i == 17) {
            objArr[1] = str4;
        } else if (i != 20) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = str6;
                break;
            case 7:
            case 12:
            case 17:
            case 20:
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = str5;
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = str4;
                break;
            case 18:
            case 19:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 7 || i == 12 || i == 17 || i == 20) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public void d(boolean z) {
        this.F = Boolean.valueOf(z);
    }

    public void e(boolean z) {
        this.G = Boolean.valueOf(z);
    }

    public boolean o() {
        return this.G.booleanValue();
    }

    public boolean ua() {
        return this.F.booleanValue();
    }

    /* access modifiers changed from: protected */
    public Ogb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        if (rcb == null) {
            f(8);
            throw null;
        } else if (aVar == null) {
            f(9);
            throw null;
        } else if (jeb == null) {
            f(10);
            throw null;
        } else if (zdb == null) {
            f(11);
            throw null;
        } else if (aVar == a.DECLARATION || aVar == a.SYNTHESIZED) {
            Ogb a = a((C5029Jcb) rcb, (Ogb) adb, aVar, zdb, jeb);
            a.d(ua());
            a.e(o());
            if (a != null) {
                return a;
            }
            f(12);
            throw null;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Attempt at creating a constructor that is not a declaration: \ncopy from: ");
            sb.append(this);
            String str = "\n";
            sb.append(str);
            sb.append("newOwner: ");
            sb.append(rcb);
            sb.append(str);
            sb.append("kind: ");
            sb.append(aVar);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* access modifiers changed from: protected */
    public Ogb a(C5029Jcb jcb, Ogb ogb, a aVar, C7822zdb zdb, C6723jeb jeb) {
        if (jcb == null) {
            f(13);
            throw null;
        } else if (aVar == null) {
            f(14);
            throw null;
        } else if (zdb == null) {
            f(15);
            throw null;
        } else if (jeb != null) {
            Ogb ogb2 = new Ogb(jcb, ogb, jeb, this.E, aVar, zdb);
            return ogb2;
        } else {
            f(16);
            throw null;
        }
    }

    public Ogb a(C7706xtb xtb, List<Wgb> list, C7706xtb xtb2, HVa<a<?>, ?> hVa) {
        C7615wdb wdb;
        C7706xtb xtb3 = xtb;
        if (list == null) {
            f(18);
            throw null;
        } else if (xtb2 != null) {
            Ogb a = a((C5272Rcb) e(), (C5582adb) null, g(), (C7694xnb) null, getAnnotations(), getSource());
            if (xtb3 == null) {
                wdb = null;
            } else {
                wdb = C6463fpb.a((C4904Fcb) a, xtb, C6723jeb.c.a());
            }
            a.a(wdb, k(), getTypeParameters(), Vgb.a(list, f(), a), xtb2, h(), d());
            if (hVa != null) {
                a.a((a) hVa.c(), hVa.d());
            }
            if (a != null) {
                return a;
            }
            f(20);
            throw null;
        } else {
            f(19);
            throw null;
        }
    }
}
