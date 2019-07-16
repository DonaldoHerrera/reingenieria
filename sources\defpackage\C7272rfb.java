package defpackage;

/* renamed from: rfb reason: default package and case insensitive filesystem */
/* compiled from: ReceiverParameterDescriptorImpl */
public class C7272rfb extends Deb {
    private final C5272Rcb d;
    private final Tqb e;

    public C7272rfb(C5272Rcb rcb, Tqb tqb, C6723jeb jeb) {
        if (rcb == null) {
            d(0);
            throw null;
        } else if (tqb == null) {
            d(1);
            throw null;
        } else if (jeb != null) {
            super(jeb);
            this.d = rcb;
            this.e = tqb;
        } else {
            d(2);
            throw null;
        }
    }

    private static /* synthetic */ void d(int i) {
        String str = (i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 6) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ReceiverParameterDescriptorImpl";
        switch (i) {
            case 1:
                objArr[0] = "value";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
            case 4:
            case 6:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "newOwner";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        String str3 = "copy";
        if (i == 3) {
            objArr[1] = "getValue";
        } else if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = str3;
            } else if (i != 6) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C5272Rcb e() {
        C5272Rcb rcb = this.d;
        if (rcb != null) {
            return rcb;
        }
        d(4);
        throw null;
    }

    public Tqb getValue() {
        Tqb tqb = this.e;
        if (tqb != null) {
            return tqb;
        }
        d(3);
        throw null;
    }
}
