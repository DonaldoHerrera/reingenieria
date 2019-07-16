package defpackage;

/* renamed from: afb reason: default package and case insensitive filesystem */
/* compiled from: LazyClassReceiverParameterDescriptor */
public class C5584afb extends Deb {
    private final C5029Jcb d;
    private final Rqb e;

    public C5584afb(C5029Jcb jcb) {
        if (jcb != null) {
            super(C6723jeb.c.a());
            this.d = jcb;
            this.e = new Rqb(jcb, null);
            return;
        }
        d(0);
        throw null;
    }

    private static /* synthetic */ void d(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazyClassReceiverParameterDescriptor";
        if (i == 1 || i == 2) {
            objArr[0] = str2;
        } else if (i != 3) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "newOwner";
        }
        if (i == 1) {
            objArr[1] = "getValue";
        } else if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getContainingDeclaration";
        }
        if (!(i == 1 || i == 2)) {
            if (i != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "copy";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C5272Rcb e() {
        C5029Jcb jcb = this.d;
        if (jcb != null) {
            return jcb;
        }
        d(2);
        throw null;
    }

    public Tqb getValue() {
        Rqb rqb = this.e;
        if (rqb != null) {
            return rqb;
        }
        d(1);
        throw null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ");
        sb.append(this.d.getName());
        sb.append("::this");
        return sb.toString();
    }
}
