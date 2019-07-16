package defpackage;

import java.util.List;

/* renamed from: snb reason: default package and case insensitive filesystem */
/* compiled from: FqName */
public final class C7349snb {
    public static final C7349snb a = new C7349snb("");
    private final C7487unb b;
    private transient C7349snb c;

    public C7349snb(String str) {
        if (str != null) {
            this.b = new C7487unb(str, this);
        } else {
            a(2);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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
        String str2 = "shortName";
        String str3 = "kotlin/reflect/jvm/internal/impl/name/FqName";
        switch (i) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
                objArr[0] = str3;
                break;
            case 2:
            case 3:
            case 4:
                objArr[0] = "fqName";
                break;
            case 9:
                objArr[0] = "name";
                break;
            case 14:
                objArr[0] = "segment";
                break;
            case 15:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "names";
                break;
        }
        String str4 = "topLevel";
        String str5 = "child";
        String str6 = "fromSegments";
        if (i == 1) {
            objArr[1] = str6;
        } else if (i == 16) {
            objArr[1] = str4;
        } else if (i == 5) {
            objArr[1] = "asString";
        } else if (i != 6) {
            if (i != 7 && i != 8) {
                switch (i) {
                    case 10:
                        objArr[1] = str5;
                        break;
                    case 11:
                        objArr[1] = str2;
                        break;
                    case 12:
                        objArr[1] = "shortNameOrSpecial";
                        break;
                    case 13:
                        objArr[1] = "pathSegments";
                        break;
                    default:
                        objArr[1] = str3;
                        break;
                }
            } else {
                objArr[1] = "parent";
            }
        } else {
            objArr[1] = "toUnsafe";
        }
        switch (i) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 16:
                break;
            case 2:
            case 3:
            case 4:
                objArr[2] = "<init>";
                break;
            case 9:
                objArr[2] = str5;
                break;
            case 14:
                objArr[2] = "startsWith";
                break;
            case 15:
                objArr[2] = str4;
                break;
            default:
                objArr[2] = str6;
                break;
        }
        String format = String.format(str, objArr);
        if (!(i == 1 || i == 16 || i == 5 || i == 6 || i == 7 || i == 8)) {
            switch (i) {
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

    public String a() {
        String a2 = this.b.a();
        if (a2 != null) {
            return a2;
        }
        a(5);
        throw null;
    }

    public boolean b() {
        return this.b.b();
    }

    public C7349snb c() {
        C7349snb snb = this.c;
        if (snb != null) {
            if (snb != null) {
                return snb;
            }
            a(7);
            throw null;
        } else if (!b()) {
            this.c = new C7349snb(this.b.d());
            C7349snb snb2 = this.c;
            if (snb2 != null) {
                return snb2;
            }
            a(8);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public List<C7694xnb> d() {
        List<C7694xnb> e = this.b.e();
        if (e != null) {
            return e;
        }
        a(13);
        throw null;
    }

    public C7694xnb e() {
        C7694xnb f = this.b.f();
        if (f != null) {
            return f;
        }
        a(11);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7349snb)) {
            return false;
        }
        return this.b.equals(((C7349snb) obj).b);
    }

    public C7694xnb f() {
        C7694xnb g = this.b.g();
        if (g != null) {
            return g;
        }
        a(12);
        throw null;
    }

    public C7487unb g() {
        C7487unb unb = this.b;
        if (unb != null) {
            return unb;
        }
        a(6);
        throw null;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return this.b.toString();
    }

    public C7349snb a(C7694xnb xnb) {
        if (xnb != null) {
            return new C7349snb(this.b.a(xnb), this);
        }
        a(9);
        throw null;
    }

    public boolean b(C7694xnb xnb) {
        if (xnb != null) {
            return this.b.b(xnb);
        }
        a(14);
        throw null;
    }

    public C7349snb(C7487unb unb) {
        if (unb != null) {
            this.b = unb;
        } else {
            a(3);
            throw null;
        }
    }

    private C7349snb(C7487unb unb, C7349snb snb) {
        if (unb != null) {
            this.b = unb;
            this.c = snb;
            return;
        }
        a(4);
        throw null;
    }

    public static C7349snb c(C7694xnb xnb) {
        if (xnb != null) {
            return new C7349snb(C7487unb.c(xnb));
        }
        a(15);
        throw null;
    }
}
