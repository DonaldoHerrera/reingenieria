package defpackage;

/* renamed from: hgb reason: default package and case insensitive filesystem */
/* compiled from: JvmAbi */
public final class C6589hgb {
    public static final C7349snb a = new C7349snb("kotlin.jvm.JvmField");
    public static final C7280rnb b = C7280rnb.a(new C7349snb("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));

    public static String a(String str) {
        if (str != null) {
            if (!e(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append("get");
                sb.append(C6951mvb.a(str));
                str = sb.toString();
            }
            if (str != null) {
                return str;
            }
            a(7);
            throw null;
        }
        a(6);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 3 || i == 7 || i == 9) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 7 || i == 9) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JvmAbi";
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "typeAliasName";
                break;
            case 4:
            case 5:
                objArr[0] = "name";
                break;
            case 10:
                objArr[0] = "propertyDescriptor";
                break;
            case 11:
            case 12:
                objArr[0] = "companionObject";
                break;
            case 13:
                objArr[0] = "memberDescriptor";
                break;
            default:
                objArr[0] = "propertyName";
                break;
        }
        String str3 = "setterName";
        String str4 = "getterName";
        String str5 = "getSyntheticMethodNameForAnnotatedTypeAlias";
        String str6 = "getSyntheticMethodNameForAnnotatedProperty";
        if (i == 1) {
            objArr[1] = str6;
        } else if (i == 3) {
            objArr[1] = str5;
        } else if (i == 7) {
            objArr[1] = str4;
        } else if (i != 9) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        switch (i) {
            case 1:
            case 3:
            case 7:
            case 9:
                break;
            case 2:
                objArr[2] = str5;
                break;
            case 4:
                objArr[2] = "isGetterName";
                break;
            case 5:
                objArr[2] = "isSetterName";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            case 10:
                objArr[2] = "isPropertyWithBackingFieldInOuterClass";
                break;
            case 11:
                objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
                break;
            case 12:
                objArr[2] = "isMappedIntrinsicCompanionObject";
                break;
            case 13:
                objArr[2] = "hasJvmFieldAnnotation";
                break;
            default:
                objArr[2] = str6;
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 3 || i == 7 || i == 9) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static boolean b(String str) {
        if (str != null) {
            return str.startsWith("get") || str.startsWith("is");
        }
        a(4);
        throw null;
    }

    public static boolean c(String str) {
        if (str != null) {
            return str.startsWith("set");
        }
        a(5);
        throw null;
    }

    public static String d(String str) {
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("set");
            sb.append(e(str) ? str.substring(2) : C6951mvb.a(str));
            String sb2 = sb.toString();
            if (sb2 != null) {
                return sb2;
            }
            a(9);
            throw null;
        }
        a(8);
        throw null;
    }

    public static boolean e(String str) {
        boolean z = false;
        if (!str.startsWith("is") || str.length() == 2) {
            return false;
        }
        char charAt = str.charAt(2);
        if ('a' > charAt || charAt > 'z') {
            z = true;
        }
        return z;
    }

    public static boolean a(C7408tdb tdb) {
        if (tdb == null) {
            a(10);
            throw null;
        } else if (tdb.g() == a.FAKE_OVERRIDE) {
            return false;
        } else {
            boolean z = true;
            if (a(tdb.e())) {
                return true;
            }
            if (!C6531gpb.k(tdb.e()) || !a((C4935Gcb) tdb)) {
                z = false;
            }
            return z;
        }
    }

    public static boolean a(C5272Rcb rcb) {
        if (rcb != null) {
            return C6531gpb.k(rcb) && C6531gpb.j(rcb.e()) && !a((C5029Jcb) rcb);
        }
        a(11);
        throw null;
    }

    public static boolean a(C5029Jcb jcb) {
        if (jcb != null) {
            return C5090Lbb.b.a(jcb);
        }
        a(12);
        throw null;
    }

    public static boolean a(C4935Gcb gcb) {
        if (gcb != null) {
            if (gcb instanceof C7408tdb) {
                C5448Xcb U = ((C7408tdb) gcb).U();
                if (U != null && U.getAnnotations().b(a)) {
                    return true;
                }
            }
            return gcb.getAnnotations().b(a);
        }
        a(13);
        throw null;
    }
}
