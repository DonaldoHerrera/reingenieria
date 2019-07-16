package defpackage;

/* renamed from: Beb reason: default package */
/* compiled from: AbstractClassDescriptor */
public abstract class Beb implements C5029Jcb {
    private final C7694xnb a;
    protected final Psb<Etb> b;
    private final Psb<Eqb> c;
    private final Psb<C7615wdb> d;

    public Beb(Ssb ssb, C7694xnb xnb) {
        if (ssb == null) {
            a(0);
            throw null;
        } else if (xnb != null) {
            this.a = xnb;
            this.b = ssb.a((PXa<? extends T>) new C7754yeb<Object>(this));
            this.c = ssb.a((PXa<? extends T>) new C7823zeb<Object>(this));
            this.d = ssb.a((PXa<? extends T>) new Aeb<Object>(this));
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
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                i2 = 2;
                break;
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
        switch (i) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "typeArguments";
                break;
            case 9:
                objArr[0] = "typeSubstitution";
                break;
            case 12:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        String str3 = "substitute";
        String str4 = "getMemberScope";
        switch (i) {
            case 2:
                objArr[1] = "getName";
                break;
            case 3:
                objArr[1] = "getOriginal";
                break;
            case 4:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 5:
                objArr[1] = "getThisAsReceiverParameter";
                break;
            case 7:
            case 8:
            case 10:
            case 11:
                objArr[1] = str4;
                break;
            case 13:
            case 14:
                objArr[1] = str3;
                break;
            case 15:
                objArr[1] = "getDefaultType";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                break;
            case 6:
            case 9:
                objArr[2] = str4;
                break;
            case 12:
                objArr[2] = str3;
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public Eqb H() {
        Eqb eqb = (Eqb) this.c.d();
        if (eqb != null) {
            return eqb;
        }
        a(4);
        throw null;
    }

    public C7615wdb O() {
        C7615wdb wdb = (C7615wdb) this.d.d();
        if (wdb != null) {
            return wdb;
        }
        a(5);
        throw null;
    }

    public C7694xnb getName() {
        C7694xnb xnb = this.a;
        if (xnb != null) {
            return xnb;
        }
        a(2);
        throw null;
    }

    public C5029Jcb getOriginal() {
        return this;
    }

    public Etb z() {
        Etb etb = (Etb) this.b.d();
        if (etb != null) {
            return etb;
        }
        a(15);
        throw null;
    }

    public Eqb a(Wtb wtb) {
        if (wtb == null) {
            a(9);
            throw null;
        } else if (wtb.d()) {
            Eqb J = J();
            if (J != null) {
                return J;
            }
            a(10);
            throw null;
        } else {
            return new Kqb(J(), _tb.a(wtb));
        }
    }

    public C5029Jcb a(_tb _tb) {
        if (_tb == null) {
            a(12);
            throw null;
        } else if (_tb.b()) {
            return this;
        } else {
            return new C6452ffb(this, _tb);
        }
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d2) {
        return tcb.a((C5029Jcb) this, d2);
    }
}
