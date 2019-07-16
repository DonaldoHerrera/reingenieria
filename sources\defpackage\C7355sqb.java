package defpackage;

/* renamed from: sqb reason: default package and case insensitive filesystem */
/* compiled from: JvmClassName */
public class C7355sqb {
    private final String a;
    private C7349snb b;

    private C7355sqb(String str) {
        if (str != null) {
            this.a = str;
        } else {
            a(8);
            throw null;
        }
    }

    public static C7355sqb a(String str) {
        if (str != null) {
            return new C7355sqb(str);
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    i2 = 3;
                    break;
            }
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = str2;
                break;
            case 2:
                objArr[0] = "classId";
                break;
            case 4:
            case 6:
                objArr[0] = "fqName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        String str3 = "byFqNameWithoutInnerClasses";
        String str4 = "byClassId";
        String str5 = "byInternalName";
        if (i == 1) {
            objArr[1] = str5;
        } else if (i != 3) {
            if (i != 5 && i != 7) {
                switch (i) {
                    case 9:
                        objArr[1] = "getFqNameForClassNameWithoutDollars";
                        break;
                    case 10:
                        objArr[1] = "getFqNameForTopLevelClassMaybeWithDollars";
                        break;
                    case 11:
                    case 12:
                        objArr[1] = "getPackageFqName";
                        break;
                    case 13:
                        objArr[1] = "getInternalName";
                        break;
                    default:
                        objArr[1] = str2;
                        break;
                }
            } else {
                objArr[1] = str3;
            }
        } else {
            objArr[1] = str4;
        }
        switch (i) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            case 2:
                objArr[2] = str4;
                break;
            case 4:
            case 6:
                objArr[2] = str3;
                break;
            case 8:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = str5;
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 3 || i == 5 || i == 7)) {
            switch (i) {
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    th = new IllegalArgumentException(format);
                    break;
            }
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public String b() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(13);
        throw null;
    }

    public C7349snb c() {
        int lastIndexOf = this.a.lastIndexOf("/");
        if (lastIndexOf != -1) {
            return new C7349snb(this.a.substring(0, lastIndexOf).replace('/', '.'));
        }
        C7349snb snb = C7349snb.a;
        if (snb != null) {
            return snb;
        }
        a(11);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C7355sqb.class != obj.getClass()) {
            return false;
        }
        return this.a.equals(((C7355sqb) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a;
    }

    public static C7355sqb a(C7280rnb rnb) {
        if (rnb != null) {
            C7349snb d = rnb.d();
            String replace = rnb.e().a().replace('.', '$');
            if (d.b()) {
                return new C7355sqb(replace);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(d.a().replace('.', '/'));
            sb.append("/");
            sb.append(replace);
            return new C7355sqb(sb.toString());
        }
        a(2);
        throw null;
    }

    public static C7355sqb a(C7349snb snb) {
        if (snb != null) {
            C7355sqb sqb = new C7355sqb(snb.a().replace('.', '/'));
            sqb.b = snb;
            return sqb;
        }
        a(4);
        throw null;
    }

    public C7349snb a() {
        return new C7349snb(this.a.replace('/', '.'));
    }
}
