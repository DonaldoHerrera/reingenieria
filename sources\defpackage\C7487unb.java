package defpackage;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: unb reason: default package and case insensitive filesystem */
/* compiled from: FqNameUnsafe */
public final class C7487unb {
    private static final C7694xnb a = C7694xnb.d("<root>");
    private static final Pattern b = Pattern.compile("\\.");
    private static final _Xa<String, C7694xnb> c = new C7418tnb();
    private final String d;
    private transient C7349snb e;
    private transient C7487unb f;
    private transient C7694xnb g;

    C7487unb(String str, C7349snb snb) {
        if (str == null) {
            a(0);
            throw null;
        } else if (snb != null) {
            this.d = str;
            this.e = snb;
        } else {
            a(1);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str;
        int i2;
        Throwable th;
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
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
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "shortName";
        String str3 = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
        if (i != 1) {
            switch (i) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 18:
                case 19:
                    objArr[0] = str3;
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 16:
                    objArr[0] = "segment";
                    break;
                case 17:
                    objArr[0] = str2;
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        String str4 = "topLevel";
        String str5 = "child";
        switch (i) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 10:
                objArr[1] = str5;
                break;
            case 11:
            case 12:
                objArr[1] = str2;
                break;
            case 13:
            case 14:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 15:
                objArr[1] = "pathSegments";
                break;
            case 18:
                objArr[1] = str4;
                break;
            case 19:
                objArr[1] = "toString";
                break;
            default:
                objArr[1] = str3;
                break;
        }
        switch (i) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                break;
            case 9:
                objArr[2] = str5;
                break;
            case 16:
                objArr[2] = "startsWith";
                break;
            case 17:
                objArr[2] = str4;
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
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 18:
            case 19:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    private void i() {
        int lastIndexOf = this.d.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.g = C7694xnb.a(this.d.substring(lastIndexOf + 1));
            this.f = new C7487unb(this.d.substring(0, lastIndexOf));
            return;
        }
        this.g = C7694xnb.a(this.d);
        this.f = C7349snb.a.g();
    }

    public String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        a(4);
        throw null;
    }

    public boolean b() {
        return this.d.isEmpty();
    }

    public boolean c() {
        return this.e != null || a().indexOf(60) < 0;
    }

    public C7487unb d() {
        C7487unb unb = this.f;
        if (unb != null) {
            if (unb != null) {
                return unb;
            }
            a(7);
            throw null;
        } else if (!b()) {
            i();
            C7487unb unb2 = this.f;
            if (unb2 != null) {
                return unb2;
            }
            a(8);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public List<C7694xnb> e() {
        List<C7694xnb> emptyList = b() ? Collections.emptyList() : C6578hWa.a((T[]) b.split(this.d), c);
        if (emptyList != null) {
            return emptyList;
        }
        a(15);
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7487unb)) {
            return false;
        }
        return this.d.equals(((C7487unb) obj).d);
    }

    public C7694xnb f() {
        C7694xnb xnb = this.g;
        if (xnb != null) {
            if (xnb != null) {
                return xnb;
            }
            a(11);
            throw null;
        } else if (!b()) {
            i();
            C7694xnb xnb2 = this.g;
            if (xnb2 != null) {
                return xnb2;
            }
            a(12);
            throw null;
        } else {
            throw new IllegalStateException("root");
        }
    }

    public C7694xnb g() {
        if (b()) {
            C7694xnb xnb = a;
            if (xnb != null) {
                return xnb;
            }
            a(13);
            throw null;
        }
        C7694xnb f2 = f();
        if (f2 != null) {
            return f2;
        }
        a(14);
        throw null;
    }

    public C7349snb h() {
        C7349snb snb = this.e;
        if (snb == null) {
            this.e = new C7349snb(this);
            C7349snb snb2 = this.e;
            if (snb2 != null) {
                return snb2;
            }
            a(6);
            throw null;
        } else if (snb != null) {
            return snb;
        } else {
            a(5);
            throw null;
        }
    }

    public int hashCode() {
        return this.d.hashCode();
    }

    public String toString() {
        String a2 = b() ? a.a() : this.d;
        if (a2 != null) {
            return a2;
        }
        a(19);
        throw null;
    }

    public static C7487unb c(C7694xnb xnb) {
        if (xnb != null) {
            return new C7487unb(xnb.a(), C7349snb.a.g(), xnb);
        }
        a(17);
        throw null;
    }

    public C7487unb a(C7694xnb xnb) {
        String str;
        if (xnb != null) {
            if (b()) {
                str = xnb.a();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(this.d);
                sb.append(".");
                sb.append(xnb.a());
                str = sb.toString();
            }
            return new C7487unb(str, this, xnb);
        }
        a(9);
        throw null;
    }

    public boolean b(C7694xnb xnb) {
        if (xnb != null) {
            int indexOf = this.d.indexOf(46);
            if (b()) {
                return false;
            }
            String str = this.d;
            String a2 = xnb.a();
            if (indexOf == -1) {
                indexOf = this.d.length();
            }
            return str.regionMatches(0, a2, 0, indexOf);
        }
        a(16);
        throw null;
    }

    public C7487unb(String str) {
        if (str != null) {
            this.d = str;
        } else {
            a(2);
            throw null;
        }
    }

    private C7487unb(String str, C7487unb unb, C7694xnb xnb) {
        if (str != null) {
            this.d = str;
            this.f = unb;
            this.g = xnb;
            return;
        }
        a(3);
        throw null;
    }
}
