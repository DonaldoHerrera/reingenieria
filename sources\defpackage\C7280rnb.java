package defpackage;

/* renamed from: rnb reason: default package and case insensitive filesystem */
/* compiled from: ClassId */
public final class C7280rnb {
    private final C7349snb a;
    private final C7349snb b;
    private final boolean c;

    public C7280rnb(C7349snb snb, C7349snb snb2, boolean z) {
        if (snb == null) {
            a(2);
            throw null;
        } else if (snb2 != null) {
            this.a = snb;
            this.b = snb2;
            this.c = z;
        } else {
            a(3);
            throw null;
        }
    }

    public static C7280rnb a(C7349snb snb) {
        if (snb != null) {
            return new C7280rnb(snb.c(), snb.e());
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
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
        }
        str = "@NotNull method %s.%s must not return null";
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
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
        }
        i2 = 2;
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/ClassId";
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
                objArr[0] = str2;
                break;
            case 2:
            case 4:
                objArr[0] = "packageFqName";
                break;
            case 3:
                objArr[0] = "relativeClassName";
                break;
            case 5:
                objArr[0] = "topLevelName";
                break;
            case 9:
                objArr[0] = "name";
                break;
            case 13:
                objArr[0] = "segment";
                break;
            case 14:
            case 16:
                objArr[0] = "string";
                break;
            default:
                objArr[0] = "topLevelFqName";
                break;
        }
        String str3 = "fromString";
        String str4 = "createNestedClassId";
        String str5 = "topLevel";
        if (i != 1) {
            if (i != 15) {
                if (i == 6) {
                    objArr[1] = "getPackageFqName";
                } else if (i == 7) {
                    objArr[1] = "getRelativeClassName";
                } else if (i != 8) {
                    switch (i) {
                        case 10:
                            objArr[1] = str4;
                            break;
                        case 11:
                        case 12:
                            objArr[1] = "asSingleFqName";
                            break;
                        default:
                            switch (i) {
                                case 17:
                                    break;
                                case 18:
                                case 19:
                                    objArr[1] = "asString";
                                    break;
                                default:
                                    objArr[1] = str2;
                                    break;
                            }
                    }
                } else {
                    objArr[1] = "getShortClassName";
                }
            }
            objArr[1] = str3;
        } else {
            objArr[1] = str5;
        }
        switch (i) {
            case 1:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 15:
            case 17:
            case 18:
            case 19:
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                objArr[2] = "<init>";
                break;
            case 9:
                objArr[2] = str4;
                break;
            case 13:
                objArr[2] = "startsWith";
                break;
            case 14:
            case 16:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = str5;
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 15 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
                case 10:
                case 11:
                case 12:
                    break;
                default:
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
        }
        th = new IllegalStateException(format);
        throw th;
    }

    public String b() {
        if (this.a.b()) {
            String a2 = this.b.a();
            if (a2 != null) {
                return a2;
            }
            a(18);
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.a().replace('.', '/'));
        sb.append("/");
        sb.append(this.b.a());
        String sb2 = sb.toString();
        if (sb2 != null) {
            return sb2;
        }
        a(19);
        throw null;
    }

    public C7280rnb c() {
        C7349snb c2 = this.b.c();
        if (c2.b()) {
            return null;
        }
        return new C7280rnb(d(), c2, this.c);
    }

    public C7349snb d() {
        C7349snb snb = this.a;
        if (snb != null) {
            return snb;
        }
        a(6);
        throw null;
    }

    public C7349snb e() {
        C7349snb snb = this.b;
        if (snb != null) {
            return snb;
        }
        a(7);
        throw null;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || C7280rnb.class != obj.getClass()) {
            return false;
        }
        C7280rnb rnb = (C7280rnb) obj;
        if (!this.a.equals(rnb.a) || !this.b.equals(rnb.b) || this.c != rnb.c) {
            z = false;
        }
        return z;
    }

    public C7694xnb f() {
        C7694xnb e = this.b.e();
        if (e != null) {
            return e;
        }
        a(8);
        throw null;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return !this.b.c().b();
    }

    public int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + Boolean.valueOf(this.c).hashCode();
    }

    public String toString() {
        if (!this.a.b()) {
            return b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("/");
        sb.append(b());
        return sb.toString();
    }

    public C7280rnb a(C7694xnb xnb) {
        if (xnb != null) {
            return new C7280rnb(d(), this.b.a(xnb), this.c);
        }
        a(9);
        throw null;
    }

    public C7349snb a() {
        if (this.a.b()) {
            C7349snb snb = this.b;
            if (snb != null) {
                return snb;
            }
            a(11);
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.a.a());
        sb.append(".");
        sb.append(this.b.a());
        return new C7349snb(sb.toString());
    }

    public C7280rnb(C7349snb snb, C7694xnb xnb) {
        if (snb == null) {
            a(4);
            throw null;
        } else if (xnb != null) {
            this(snb, C7349snb.c(xnb), false);
        } else {
            a(5);
            throw null;
        }
    }

    public static C7280rnb a(String str) {
        if (str != null) {
            C7280rnb a2 = a(str, false);
            if (a2 != null) {
                return a2;
            }
            a(15);
            throw null;
        }
        a(14);
        throw null;
    }

    public static C7280rnb a(String str, boolean z) {
        if (str != null) {
            return new C7280rnb(new C7349snb(Hxb.d(str, '/', "").replace('/', '.')), new C7349snb(Hxb.b(str, '/', str)), z);
        }
        a(16);
        throw null;
    }
}
