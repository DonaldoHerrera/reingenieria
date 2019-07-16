package defpackage;

/* renamed from: xnb reason: default package and case insensitive filesystem */
/* compiled from: Name */
public final class C7694xnb implements Comparable<C7694xnb> {
    private final String a;
    private final boolean b;

    private C7694xnb(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/name/Name";
        if (i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) {
            objArr[0] = str2;
        } else {
            objArr[0] = "name";
        }
        String str3 = "guessByFirstCharacter";
        String str4 = "special";
        String str5 = "identifier";
        if (i == 1) {
            objArr[1] = "asString";
        } else if (i == 2) {
            objArr[1] = "getIdentifier";
        } else if (i == 4) {
            objArr[1] = str5;
        } else if (i == 7) {
            objArr[1] = str4;
        } else if (i == 9 || i == 10) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 9:
            case 10:
                break;
            case 3:
                objArr[2] = str5;
                break;
            case 5:
                objArr[2] = "isValidIdentifier";
                break;
            case 6:
                objArr[2] = str4;
                break;
            case 8:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2 || i == 4 || i == 7 || i == 9 || i == 10) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public static C7694xnb d(String str) {
        if (str == null) {
            a(6);
            throw null;
        } else if (str.startsWith("<")) {
            return new C7694xnb(str, true);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("special name must start with '<': ");
            sb.append(str);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public String a() {
        String str = this.a;
        if (str != null) {
            return str;
        }
        a(1);
        throw null;
    }

    public String b() {
        if (!this.b) {
            String a2 = a();
            if (a2 != null) {
                return a2;
            }
            a(2);
            throw null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("not identifier: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public boolean c() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7694xnb)) {
            return false;
        }
        C7694xnb xnb = (C7694xnb) obj;
        return this.b == xnb.b && this.a.equals(xnb.a);
    }

    public int hashCode() {
        return (this.a.hashCode() * 31) + (this.b ? 1 : 0);
    }

    public String toString() {
        return this.a;
    }

    public static boolean c(String str) {
        if (str == null) {
            a(5);
            throw null;
        } else if (str.isEmpty() || str.startsWith("<")) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (charAt == '.' || charAt == '/' || charAt == '\\') {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: a */
    public int compareTo(C7694xnb xnb) {
        return this.a.compareTo(xnb.a);
    }

    public static C7694xnb a(String str) {
        if (str == null) {
            a(8);
            throw null;
        } else if (str.startsWith("<")) {
            C7694xnb d = d(str);
            if (d != null) {
                return d;
            }
            a(9);
            throw null;
        } else {
            C7694xnb b2 = b(str);
            if (b2 != null) {
                return b2;
            }
            a(10);
            throw null;
        }
    }

    public static C7694xnb b(String str) {
        if (str != null) {
            return new C7694xnb(str, false);
        }
        a(3);
        throw null;
    }
}
