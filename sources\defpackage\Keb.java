package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Keb reason: default package */
/* compiled from: AbstractTypeParameterDescriptor */
public abstract class Keb extends Qeb implements C4905Fdb {
    private final C6473fub e;
    private final boolean f;
    private final int g;
    private final Psb<Ptb> h;
    private final Psb<Etb> i;

    /* renamed from: Keb$a */
    /* compiled from: AbstractTypeParameterDescriptor */
    private class a extends Vsb {
        private final C4843Ddb b;
        final /* synthetic */ Keb c;

        public a(Keb keb, Ssb ssb, C4843Ddb ddb) {
            if (ssb != null) {
                this.c = keb;
                super(ssb);
                this.b = ddb;
                return;
            }
            a(0);
            throw null;
        }

        private static /* synthetic */ void a(int i) {
            String str = (i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? 2 : 3)];
            String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    objArr[0] = str2;
                    break;
                case 6:
                    objArr[0] = C1325gg.TYPE;
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i == 1) {
                objArr[1] = "computeSupertypes";
            } else if (i == 2) {
                objArr[1] = "getParameters";
            } else if (i == 3) {
                objArr[1] = "getDeclarationDescriptor";
            } else if (i == 4) {
                objArr[1] = "getBuiltIns";
            } else if (i != 5) {
                objArr[1] = str2;
            } else {
                objArr[1] = "getSupertypeLoopChecker";
            }
            switch (i) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    break;
                case 6:
                    objArr[2] = "reportSupertypeLoopError";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String format = String.format(str, objArr);
            throw ((i == 1 || i == 2 || i == 3 || i == 4 || i == 5) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }

        public C5301Sbb E() {
            C5301Sbb b2 = C7148pqb.b((C5272Rcb) this.c);
            if (b2 != null) {
                return b2;
            }
            a(4);
            throw null;
        }

        /* access modifiers changed from: protected */
        public void b(C7706xtb xtb) {
            if (xtb != null) {
                this.c.a(xtb);
            } else {
                a(6);
                throw null;
            }
        }

        public C5122Mcb c() {
            Keb keb = this.c;
            if (keb != null) {
                return keb;
            }
            a(3);
            throw null;
        }

        public boolean d() {
            return true;
        }

        /* access modifiers changed from: protected */
        public Collection<C7706xtb> e() {
            List ta = this.c.ta();
            if (ta != null) {
                return ta;
            }
            a(1);
            throw null;
        }

        /* access modifiers changed from: protected */
        public C7706xtb f() {
            return C7154ptb.c("Cyclic upper bounds");
        }

        /* access modifiers changed from: protected */
        public C4843Ddb g() {
            C4843Ddb ddb = this.b;
            if (ddb != null) {
                return ddb;
            }
            a(5);
            throw null;
        }

        public List<C4905Fdb> getParameters() {
            List<C4905Fdb> emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            a(2);
            throw null;
        }

        public String toString() {
            return this.c.getName().toString();
        }
    }

    protected Keb(Ssb ssb, C5272Rcb rcb, C6723jeb jeb, C7694xnb xnb, C6473fub fub, boolean z, int i2, C7822zdb zdb, C4843Ddb ddb) {
        if (ssb == null) {
            d(0);
            throw null;
        } else if (rcb == null) {
            d(1);
            throw null;
        } else if (jeb == null) {
            d(2);
            throw null;
        } else if (xnb == null) {
            d(3);
            throw null;
        } else if (fub == null) {
            d(4);
            throw null;
        } else if (zdb == null) {
            d(5);
            throw null;
        } else if (ddb != null) {
            super(rcb, jeb, xnb, zdb);
            this.e = fub;
            this.f = z;
            this.g = i2;
            this.h = ssb.a((PXa<? extends T>) new Heb<Object>(this, ssb, ddb));
            this.i = ssb.a((PXa<? extends T>) new Jeb<Object>(this, ssb, xnb));
        } else {
            d(6);
            throw null;
        }
    }

    private static /* synthetic */ void d(int i2) {
        String str;
        int i3;
        Throwable th;
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                i3 = 2;
                break;
            default:
                i3 = 3;
                break;
        }
        Object[] objArr = new Object[i3];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor";
        switch (i2) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = str2;
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        switch (i2) {
            case 7:
                objArr[1] = "getVariance";
                break;
            case 8:
                objArr[1] = "getUpperBounds";
                break;
            case 9:
                objArr[1] = "getTypeConstructor";
                break;
            case 10:
                objArr[1] = "getDefaultType";
                break;
            case 11:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = str2;
                break;
        }
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i2) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                th = new IllegalStateException(format);
                break;
            default:
                th = new IllegalArgumentException(format);
                break;
        }
        throw th;
    }

    public final Ptb Q() {
        Ptb ptb = (Ptb) this.h.d();
        if (ptb != null) {
            return ptb;
        }
        d(9);
        throw null;
    }

    public <R, D> R a(C5332Tcb<R, D> tcb, D d) {
        return tcb.a((C4905Fdb) this, d);
    }

    /* access modifiers changed from: protected */
    public abstract void a(C7706xtb xtb);

    public int getIndex() {
        return this.g;
    }

    public List<C7706xtb> getUpperBounds() {
        List<C7706xtb> b = ((a) Q()).b();
        if (b != null) {
            return b;
        }
        d(8);
        throw null;
    }

    public boolean oa() {
        return this.f;
    }

    public C6473fub pa() {
        C6473fub fub = this.e;
        if (fub != null) {
            return fub;
        }
        d(7);
        throw null;
    }

    public boolean qa() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract List<C7706xtb> ta();

    public Etb z() {
        Etb etb = (Etb) this.i.d();
        if (etb != null) {
            return etb;
        }
        d(10);
        throw null;
    }

    public C4905Fdb getOriginal() {
        C4905Fdb fdb = (C4905Fdb) super.getOriginal();
        if (fdb != null) {
            return fdb;
        }
        d(11);
        throw null;
    }
}
