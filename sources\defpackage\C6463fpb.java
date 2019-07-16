package defpackage;

import java.util.Collections;

/* renamed from: fpb reason: default package and case insensitive filesystem */
/* compiled from: DescriptorFactory */
public class C6463fpb {

    /* renamed from: fpb$a */
    /* compiled from: DescriptorFactory */
    private static class a extends Leb {
        public a(C5029Jcb jcb, C7822zdb zdb) {
            if (jcb == null) {
                f(0);
                throw null;
            } else if (zdb != null) {
                super(jcb, null, C6723jeb.c.a(), true, defpackage.C4935Gcb.a.DECLARATION, zdb);
                a(Collections.emptyList(), C6531gpb.a(jcb));
            } else {
                f(1);
                throw null;
            }
        }

        private static /* synthetic */ void f(int i) {
            Object[] objArr = new Object[3];
            if (i != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    public static C7203qfb a(C7408tdb tdb, C6723jeb jeb, C6723jeb jeb2) {
        if (tdb == null) {
            a(0);
            throw null;
        } else if (jeb == null) {
            a(1);
            throw null;
        } else if (jeb2 != null) {
            C7203qfb a2 = a(tdb, jeb, jeb2, true, false, false, tdb.getSource());
            if (a2 != null) {
                return a2;
            }
            a(3);
            throw null;
        } else {
            a(2);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        int i2 = i;
        String str = (i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        switch (i2) {
            case 1:
            case 5:
            case 10:
            case 16:
            case 19:
            case 22:
            case 36:
                objArr[0] = "annotations";
                break;
            case 2:
            case 6:
            case 11:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 8:
            case 14:
            case 17:
            case 20:
            case 24:
            case 27:
            case 29:
            case 31:
                objArr[0] = str2;
                break;
            case 7:
            case 13:
            case 23:
                objArr[0] = "sourceElement";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 25:
                objArr[0] = "containingClass";
                break;
            case 26:
                objArr[0] = "source";
                break;
            case 28:
            case 30:
                objArr[0] = "enumClass";
                break;
            case 32:
            case 33:
            case 34:
                objArr[0] = "descriptor";
                break;
            case 35:
                objArr[0] = "owner";
                break;
            default:
                objArr[0] = "propertyDescriptor";
                break;
        }
        String str3 = "createSetter";
        String str4 = "createDefaultSetter";
        if (i2 == 3) {
            objArr[1] = str4;
        } else if (i2 == 8 || i2 == 14) {
            objArr[1] = str3;
        } else if (i2 == 17) {
            objArr[1] = "createDefaultGetter";
        } else if (i2 == 20 || i2 == 24) {
            objArr[1] = "createGetter";
        } else if (i2 == 27) {
            objArr[1] = "createPrimaryConstructorForObject";
        } else if (i2 == 29) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i2 != 31) {
            objArr[1] = str2;
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i2) {
            case 3:
            case 8:
            case 14:
            case 17:
            case 20:
            case 24:
            case 27:
            case 29:
            case 31:
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = str3;
                break;
            case 15:
            case 16:
                objArr[2] = "createDefaultGetter";
                break;
            case 18:
            case 19:
            case 21:
            case 22:
            case 23:
                objArr[2] = "createGetter";
                break;
            case 25:
            case 26:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 28:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 30:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 32:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 33:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 34:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 35:
            case 36:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            default:
                objArr[2] = str4;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i2 == 3 || i2 == 8 || i2 == 14 || i2 == 17 || i2 == 20 || i2 == 24 || i2 == 27 || i2 == 29 || i2 == 31) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C7684xdb b(C5029Jcb jcb) {
        if (jcb != null) {
            C7341sfb a2 = C7341sfb.a((C5272Rcb) jcb, C6723jeb.c.a(), C6531gpb.a, defpackage.C4935Gcb.a.SYNTHESIZED, jcb.getSource()).a((C7615wdb) null, (C7615wdb) null, Collections.emptyList(), Collections.emptyList(), (C7706xtb) C7148pqb.b((C5272Rcb) jcb).a(C6473fub.INVARIANT, (C7706xtb) jcb.z()), C6314ddb.FINAL, _db.e);
            if (a2 != null) {
                return a2;
            }
            a(29);
            throw null;
        }
        a(28);
        throw null;
    }

    private static boolean c(C5582adb adb) {
        if (adb != null) {
            return adb.g() == defpackage.C4935Gcb.a.SYNTHESIZED && C6531gpb.m(adb.e());
        }
        a(34);
        throw null;
    }

    public static C7203qfb a(C7408tdb tdb, C6723jeb jeb, C6723jeb jeb2, boolean z, boolean z2, boolean z3, C7822zdb zdb) {
        if (tdb == null) {
            a(4);
            throw null;
        } else if (jeb == null) {
            a(5);
            throw null;
        } else if (jeb2 == null) {
            a(6);
            throw null;
        } else if (zdb != null) {
            C7203qfb a2 = a(tdb, jeb, jeb2, z, z2, z3, tdb.d(), zdb);
            if (a2 != null) {
                return a2;
            }
            a(8);
            throw null;
        } else {
            a(7);
            throw null;
        }
    }

    public static boolean b(C5582adb adb) {
        if (adb != null) {
            return adb.getName().equals(C6531gpb.a) && c(adb);
        }
        a(32);
        throw null;
    }

    public static C7203qfb a(C7408tdb tdb, C6723jeb jeb, C6723jeb jeb2, boolean z, boolean z2, boolean z3, C5583aeb aeb, C7822zdb zdb) {
        C6723jeb jeb3 = jeb2;
        if (tdb == null) {
            a(9);
            throw null;
        } else if (jeb == null) {
            a(10);
            throw null;
        } else if (jeb3 == null) {
            a(11);
            throw null;
        } else if (aeb == null) {
            a(12);
            throw null;
        } else if (zdb != null) {
            C7203qfb qfb = new C7203qfb(tdb, jeb, tdb.h(), aeb, z, z2, z3, defpackage.C4935Gcb.a.DECLARATION, null, zdb);
            qfb.a(C7203qfb.a(qfb, tdb.getType(), jeb2));
            return qfb;
        } else {
            a(13);
            throw null;
        }
    }

    public static C7134pfb a(C7408tdb tdb, C6723jeb jeb) {
        if (tdb == null) {
            a(15);
            throw null;
        } else if (jeb != null) {
            C7134pfb a2 = a(tdb, jeb, true, false, false);
            if (a2 != null) {
                return a2;
            }
            a(17);
            throw null;
        } else {
            a(16);
            throw null;
        }
    }

    public static C7134pfb a(C7408tdb tdb, C6723jeb jeb, boolean z, boolean z2, boolean z3) {
        if (tdb == null) {
            a(18);
            throw null;
        } else if (jeb != null) {
            C7134pfb a2 = a(tdb, jeb, z, z2, z3, tdb.getSource());
            if (a2 != null) {
                return a2;
            }
            a(20);
            throw null;
        } else {
            a(19);
            throw null;
        }
    }

    public static C7134pfb a(C7408tdb tdb, C6723jeb jeb, boolean z, boolean z2, boolean z3, C7822zdb zdb) {
        if (tdb == null) {
            a(21);
            throw null;
        } else if (jeb == null) {
            a(22);
            throw null;
        } else if (zdb != null) {
            C7134pfb pfb = new C7134pfb(tdb, jeb, tdb.h(), tdb.d(), z, z2, z3, defpackage.C4935Gcb.a.DECLARATION, null, zdb);
            return pfb;
        } else {
            a(23);
            throw null;
        }
    }

    public static Leb a(C5029Jcb jcb, C7822zdb zdb) {
        if (jcb == null) {
            a(25);
            throw null;
        } else if (zdb != null) {
            return new a(jcb, zdb);
        } else {
            a(26);
            throw null;
        }
    }

    public static C7684xdb a(C5029Jcb jcb) {
        C5029Jcb jcb2 = jcb;
        if (jcb2 != null) {
            C7341sfb a2 = C7341sfb.a((C5272Rcb) jcb2, C6723jeb.c.a(), C6531gpb.b, defpackage.C4935Gcb.a.SYNTHESIZED, jcb.getSource());
            C7755yfb yfb = new C7755yfb(a2, null, 0, C6723jeb.c.a(), C7694xnb.b("value"), C7148pqb.b((C5272Rcb) jcb).C(), false, false, false, null, jcb.getSource());
            C7341sfb a3 = a2.a((C7615wdb) null, (C7615wdb) null, Collections.emptyList(), Collections.singletonList(yfb), (C7706xtb) jcb.z(), C6314ddb.FINAL, _db.e);
            if (a3 != null) {
                return a3;
            }
            a(31);
            throw null;
        }
        a(30);
        throw null;
    }

    public static boolean a(C5582adb adb) {
        if (adb != null) {
            return adb.getName().equals(C6531gpb.b) && c(adb);
        }
        a(33);
        throw null;
    }

    public static C7615wdb a(C4904Fcb fcb, C7706xtb xtb, C6723jeb jeb) {
        if (fcb == null) {
            a(35);
            throw null;
        } else if (jeb == null) {
            a(36);
            throw null;
        } else if (xtb == null) {
            return null;
        } else {
            return new C7272rfb(fcb, new Qqb(fcb, xtb, null), jeb);
        }
    }
}
