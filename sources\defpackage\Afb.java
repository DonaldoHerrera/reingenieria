package defpackage;

/* renamed from: Afb reason: default package */
/* compiled from: VariableDescriptorWithInitializerImpl */
public abstract class Afb extends C7824zfb {
    private final boolean f;
    protected Qsb<Npb<?>> g;

    public Afb(C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C7706xtb xtb, boolean z, C7822zdb zdb) {
        if (rcb == null) {
            e(0);
            throw null;
        } else if (jeb == null) {
            e(1);
            throw null;
        } else if (xnb == null) {
            e(2);
            throw null;
        } else if (zdb != null) {
            super(rcb, jeb, xnb, xtb, zdb);
            this.f = z;
        } else {
            e(3);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "annotations";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "source";
        } else if (i != 4) {
            objArr[0] = "containingDeclaration";
        } else {
            objArr[0] = "compileTimeInitializer";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i != 4) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean V() {
        return this.f;
    }

    public Npb<?> Y() {
        Qsb<Npb<?>> qsb = this.g;
        if (qsb != null) {
            return (Npb) qsb.d();
        }
        return null;
    }

    public void a(Qsb<Npb<?>> qsb) {
        if (qsb != null) {
            this.g = qsb;
        } else {
            e(4);
            throw null;
        }
    }
}
