package defpackage;

/* renamed from: Meb reason: default package */
/* compiled from: ClassDescriptorBase */
public abstract class Meb extends Beb {
    private final C5272Rcb e;
    private final C7822zdb f;
    private final boolean g;

    protected Meb(Ssb ssb, C5272Rcb rcb, C7694xnb xnb, C7822zdb zdb, boolean z) {
        if (ssb == null) {
            b(0);
            throw null;
        } else if (rcb == null) {
            b(1);
            throw null;
        } else if (xnb == null) {
            b(2);
            throw null;
        } else if (zdb != null) {
            super(ssb, xnb);
            this.e = rcb;
            this.f = zdb;
            this.g = z;
        } else {
            b(3);
            throw null;
        }
    }

    private static /* synthetic */ void b(int i) {
        String str = (i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 4 || i == 5) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/ClassDescriptorBase";
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i == 4 || i == 5) {
            objArr[0] = str2;
        } else {
            objArr[0] = "storageManager";
        }
        if (i == 4) {
            objArr[1] = "getContainingDeclaration";
        } else if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getSource";
        }
        if (!(i == 4 || i == 5)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C5272Rcb e() {
        C5272Rcb rcb = this.e;
        if (rcb != null) {
            return rcb;
        }
        b(4);
        throw null;
    }

    public C7822zdb getSource() {
        C7822zdb zdb = this.f;
        if (zdb != null) {
            return zdb;
        }
        b(5);
        throw null;
    }

    public boolean n() {
        return this.g;
    }
}
