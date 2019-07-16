package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: Leb reason: default package */
/* compiled from: ClassConstructorDescriptorImpl */
public class Leb extends _eb implements C4997Icb {
    private static final C7694xnb D = C7694xnb.d("<init>");
    protected final boolean E;

    protected Leb(C5029Jcb jcb, C5242Qcb qcb, C6723jeb jeb, boolean z, a aVar, C7822zdb zdb) {
        if (jcb == null) {
            e(0);
            throw null;
        } else if (jeb == null) {
            e(1);
            throw null;
        } else if (aVar == null) {
            e(2);
            throw null;
        } else if (zdb != null) {
            super(jcb, qcb, jeb, D, aVar, zdb);
            this.E = z;
        } else {
            e(3);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassConstructorDescriptorImpl";
        switch (i) {
            case 1:
            case 5:
            case 9:
            case 25:
                objArr[0] = "annotations";
                break;
            case 2:
            case 24:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
            case 26:
                objArr[0] = "source";
                break;
            case 7:
            case 11:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
            case 28:
                objArr[0] = str2;
                break;
            case 12:
            case 15:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 13:
            case 16:
                objArr[0] = "visibility";
                break;
            case 14:
                objArr[0] = "typeParameterDescriptors";
                break;
            case 20:
                objArr[0] = "originalSubstitutor";
                break;
            case 22:
                objArr[0] = "overriddenDescriptors";
                break;
            case 23:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "createSynthesized";
        String str5 = "create";
        if (i == 7) {
            objArr[1] = str5;
        } else if (i == 11) {
            objArr[1] = str4;
        } else if (i == 21) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i == 27) {
            objArr[1] = str3;
        } else if (i != 28) {
            switch (i) {
                case 17:
                    objArr[1] = "getContainingDeclaration";
                    break;
                case 18:
                    objArr[1] = "getConstructedClass";
                    break;
                case 19:
                    objArr[1] = "getOriginal";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
                objArr[2] = str5;
                break;
            case 7:
            case 11:
            case 17:
            case 18:
            case 19:
            case 21:
            case 27:
            case 28:
                break;
            case 8:
            case 9:
            case 10:
                objArr[2] = str4;
                break;
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                objArr[2] = "initialize";
                break;
            case 20:
                objArr[2] = "substitute";
                break;
            case 22:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 23:
            case 24:
            case 25:
            case 26:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 7 || i == 11 || i == 21 || i == 27 || i == 28)) {
            switch (i) {
                case 17:
                case 18:
                case 19:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public boolean S() {
        return this.E;
    }

    public C5029Jcb T() {
        C5029Jcb e = e();
        if (e != null) {
            return e;
        }
        e(18);
        throw null;
    }

    public void a(Collection<? extends C4935Gcb> collection) {
        if (collection == null) {
            e(22);
            throw null;
        }
    }

    public Collection<? extends C5582adb> j() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        e(21);
        throw null;
    }

    public C7615wdb ta() {
        C5029Jcb e = e();
        if (e.D()) {
            C5272Rcb e2 = e.e();
            if (e2 instanceof C5029Jcb) {
                return ((C5029Jcb) e2).O();
            }
        }
        return null;
    }

    public C5029Jcb e() {
        C5029Jcb jcb = (C5029Jcb) super.e();
        if (jcb != null) {
            return jcb;
        }
        e(17);
        throw null;
    }

    public C4997Icb getOriginal() {
        C4997Icb icb = (C4997Icb) super.getOriginal();
        if (icb != null) {
            return icb;
        }
        e(19);
        throw null;
    }

    public static Leb a(C5029Jcb jcb, C6723jeb jeb, boolean z, C7822zdb zdb) {
        if (jcb == null) {
            e(4);
            throw null;
        } else if (jeb == null) {
            e(5);
            throw null;
        } else if (zdb != null) {
            Leb leb = new Leb(jcb, null, jeb, z, a.DECLARATION, zdb);
            return leb;
        } else {
            e(6);
            throw null;
        }
    }

    public Leb a(List<C5061Kdb> list, C5583aeb aeb, List<C4905Fdb> list2) {
        if (list == null) {
            e(12);
            throw null;
        } else if (aeb == null) {
            e(13);
            throw null;
        } else if (list2 != null) {
            super.a(null, ta(), list2, list, null, C6314ddb.FINAL, aeb);
            return this;
        } else {
            e(14);
            throw null;
        }
    }

    public Leb a(List<C5061Kdb> list, C5583aeb aeb) {
        if (list == null) {
            e(15);
            throw null;
        } else if (aeb != null) {
            a(list, aeb, e().B());
            return this;
        } else {
            e(16);
            throw null;
        }
    }

    public C4997Icb a(_tb _tb) {
        if (_tb != null) {
            return (C4997Icb) super.a(_tb);
        }
        e(20);
        throw null;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C5242Qcb) this, d);
    }

    /* access modifiers changed from: protected */
    public Leb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        if (rcb == null) {
            e(23);
            throw null;
        } else if (aVar == null) {
            e(24);
            throw null;
        } else if (jeb == null) {
            e(25);
            throw null;
        } else if (zdb == null) {
            e(26);
            throw null;
        } else if (aVar == a.DECLARATION || aVar == a.SYNTHESIZED) {
            Leb leb = new Leb((C5029Jcb) rcb, this, jeb, this.E, a.DECLARATION, zdb);
            return leb;
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

    public C4997Icb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, a aVar, boolean z) {
        C4997Icb icb = (C4997Icb) super.a(rcb, ddb, aeb, aVar, z);
        if (icb != null) {
            return icb;
        }
        e(28);
        throw null;
    }
}
