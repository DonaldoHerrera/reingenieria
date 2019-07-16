package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: sfb reason: default package and case insensitive filesystem */
/* compiled from: SimpleFunctionDescriptorImpl */
public class C7341sfb extends _eb implements C7684xdb {
    protected C7341sfb(C5272Rcb rcb, C7684xdb xdb, C6723jeb jeb, C7694xnb xnb, a aVar, C7822zdb zdb) {
        if (rcb == null) {
            e(0);
            throw null;
        } else if (jeb == null) {
            e(1);
            throw null;
        } else if (xnb == null) {
            e(2);
            throw null;
        } else if (aVar == null) {
            e(3);
            throw null;
        } else if (zdb != null) {
            super(rcb, xdb, jeb, xnb, aVar, zdb);
        } else {
            e(4);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/SimpleFunctionDescriptorImpl";
        switch (i) {
            case 1:
            case 6:
            case 22:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 8:
            case 21:
                objArr[0] = "kind";
                break;
            case 4:
            case 9:
            case 23:
                objArr[0] = "source";
                break;
            case 10:
            case 14:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
                objArr[0] = str2;
                break;
            case 11:
            case 15:
                objArr[0] = "typeParameters";
                break;
            case 12:
            case 16:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 13:
            case 17:
                objArr[0] = "visibility";
                break;
            case 20:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "createSubstitutedCopy";
        String str4 = "initialize";
        String str5 = "create";
        if (i == 10) {
            objArr[1] = str5;
        } else if (i == 14 || i == 18) {
            objArr[1] = str4;
        } else if (i != 19) {
            switch (i) {
                case 24:
                    objArr[1] = str3;
                    break;
                case 25:
                    objArr[1] = "copy";
                    break;
                case 26:
                    objArr[1] = "newCopyBuilder";
                    break;
                default:
                    objArr[1] = str2;
                    break;
            }
        } else {
            objArr[1] = "getOriginal";
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                objArr[2] = str5;
                break;
            case 10:
            case 14:
            case 18:
            case 19:
            case 24:
            case 25:
            case 26:
                break;
            case 11:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
                objArr[2] = str4;
                break;
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 10 || i == 14 || i == 18 || i == 19)) {
            switch (i) {
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public a<? extends C7684xdb> x() {
        a<? extends C7684xdb> x = super.x();
        if (x != null) {
            return x;
        }
        e(26);
        throw null;
    }

    public static C7341sfb a(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, a aVar, C7822zdb zdb) {
        if (rcb == null) {
            e(5);
            throw null;
        } else if (jeb == null) {
            e(6);
            throw null;
        } else if (xnb == null) {
            e(7);
            throw null;
        } else if (aVar == null) {
            e(8);
            throw null;
        } else if (zdb != null) {
            C7341sfb sfb = new C7341sfb(rcb, null, jeb, xnb, aVar, zdb);
            return sfb;
        } else {
            e(9);
            throw null;
        }
    }

    public C7341sfb a(C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb) {
        if (list == null) {
            e(11);
            throw null;
        } else if (list2 == null) {
            e(12);
            throw null;
        } else if (aeb != null) {
            C7341sfb a = a(wdb, wdb2, list, list2, xtb, ddb, aeb, null);
            if (a != null) {
                return a;
            }
            e(14);
            throw null;
        } else {
            e(13);
            throw null;
        }
    }

    public C7684xdb getOriginal() {
        C7684xdb xdb = (C7684xdb) super.getOriginal();
        if (xdb != null) {
            return xdb;
        }
        e(19);
        throw null;
    }

    public C7341sfb a(C7615wdb wdb, C7615wdb wdb2, List<? extends C4905Fdb> list, List<C5061Kdb> list2, C7706xtb xtb, C6314ddb ddb, C5583aeb aeb, Map<? extends a<?>, ?> map) {
        if (list == null) {
            e(15);
            throw null;
        } else if (list2 == null) {
            e(16);
            throw null;
        } else if (aeb != null) {
            super.a(wdb, wdb2, list, list2, xtb, ddb, aeb);
            if (map != null && !map.isEmpty()) {
                this.C = new LinkedHashMap(map);
            }
            return this;
        } else {
            e(17);
            throw null;
        }
    }

    /* access modifiers changed from: protected */
    public _eb a(C5272Rcb rcb, C5582adb adb, a aVar, C7694xnb xnb, C6723jeb jeb, C7822zdb zdb) {
        if (rcb == null) {
            e(20);
            throw null;
        } else if (aVar == null) {
            e(21);
            throw null;
        } else if (jeb == null) {
            e(22);
            throw null;
        } else if (zdb != null) {
            C7684xdb xdb = (C7684xdb) adb;
            if (xnb == null) {
                xnb = getName();
            }
            C7341sfb sfb = new C7341sfb(rcb, xdb, jeb, xnb, aVar, zdb);
            return sfb;
        } else {
            e(23);
            throw null;
        }
    }

    public C7684xdb a(C5272Rcb rcb, C6314ddb ddb, C5583aeb aeb, a aVar, boolean z) {
        C7684xdb xdb = (C7684xdb) super.a(rcb, ddb, aeb, aVar, z);
        if (xdb != null) {
            return xdb;
        }
        e(25);
        throw null;
    }
}
