package defpackage;

/* renamed from: Peb reason: default package */
/* compiled from: DeclarationDescriptorImpl */
public abstract class Peb extends C5719ceb implements C5272Rcb {
    private final C7694xnb b;

    public Peb(C6723jeb jeb, C7694xnb xnb) {
        if (jeb == null) {
            b(0);
            throw null;
        } else if (xnb != null) {
            super(jeb);
            this.b = xnb;
        } else {
            b(1);
            throw null;
        }
    }

    public static String a(C5272Rcb rcb) {
        if (rcb != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(Cob.h.a(rcb));
                sb.append("[");
                sb.append(rcb.getClass().getSimpleName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(rcb)));
                sb.append("]");
                String sb2 = sb.toString();
                if (sb2 != null) {
                    return sb2;
                }
                b(5);
                throw null;
            } catch (Throwable unused) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(rcb.getClass().getSimpleName());
                sb3.append(" ");
                sb3.append(rcb.getName());
                String sb4 = sb3.toString();
                if (sb4 != null) {
                    return sb4;
                }
                b(6);
                throw null;
            }
        } else {
            b(4);
            throw null;
        }
    }

    private static /* synthetic */ void b(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3 || i == 5 || i == 6) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 5:
            case 6:
                objArr[0] = str2;
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        String str3 = "toString";
        if (i == 2) {
            objArr[1] = "getName";
        } else if (i == 3) {
            objArr[1] = "getOriginal";
        } else if (i == 5 || i == 6) {
            objArr[1] = str3;
        } else {
            objArr[1] = str2;
        }
        if (!(i == 2 || i == 3)) {
            if (i == 4) {
                objArr[2] = str3;
            } else if (!(i == 5 || i == 6)) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C7694xnb getName() {
        C7694xnb xnb = this.b;
        if (xnb != null) {
            return xnb;
        }
        b(2);
        throw null;
    }

    public C5272Rcb getOriginal() {
        return this;
    }

    public String toString() {
        return a(this);
    }
}
