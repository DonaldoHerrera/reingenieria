package defpackage;

/* renamed from: Qeb reason: default package */
/* compiled from: DeclarationDescriptorNonRootImpl */
public abstract class Qeb extends Peb implements C5302Scb {
    private final C5272Rcb c;
    private final C7822zdb d;

    protected Qeb(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C7822zdb zdb) {
        if (rcb == null) {
            c(0);
            throw null;
        } else if (jeb == null) {
            c(1);
            throw null;
        } else if (xnb == null) {
            c(2);
            throw null;
        } else if (zdb != null) {
            super(jeb, xnb);
            this.c = rcb;
            this.d = zdb;
        } else {
            c(3);
            throw null;
        }
    }

    private static /* synthetic */ void c(int i) {
        String str = (i == 4 || i == 5 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5 || i == 6) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i == 4) {
            objArr[1] = "getOriginal";
        } else if (i == 5) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 6) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5 || i == 6)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C5272Rcb e() {
        C5272Rcb rcb = this.c;
        if (rcb != null) {
            return rcb;
        }
        c(5);
        throw null;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = this.d;
        if (zdb != null) {
            return zdb;
        }
        c(6);
        throw null;
    }

    public C5361Ucb getOriginal() {
        super.getOriginal();
        return this;
    }
}
