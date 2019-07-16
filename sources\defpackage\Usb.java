package defpackage;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: Usb reason: default package */
/* compiled from: AbstractClassTypeConstructor */
public abstract class Usb extends Vsb implements Ptb {
    private int b;

    public Usb(Ssb ssb) {
        if (ssb != null) {
            super(ssb);
            this.b = 0;
            return;
        }
        a(0);
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0045  */
    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 3 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/AbstractClassTypeConstructor";
        if (i != 1) {
            if (i == 2) {
                objArr[0] = "descriptor";
            } else if (!(i == 3 || i == 4)) {
                objArr[0] = "storageManager";
            }
            if (i != 1) {
                objArr[1] = "getBuiltIns";
            } else if (i == 3 || i == 4) {
                objArr[1] = "getAdditionalNeighboursInSupertypeGraph";
            } else {
                objArr[1] = str2;
            }
            if (i != 1) {
                if (i == 2) {
                    objArr[2] = "hasMeaningfulFqName";
                } else if (!(i == 3 || i == 4)) {
                    objArr[2] = "<init>";
                }
            }
            String format = String.format(str, objArr);
            throw ((i != 1 || i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
        }
        objArr[0] = str2;
        if (i != 1) {
        }
        if (i != 1) {
        }
        String format2 = String.format(str, objArr);
        throw ((i != 1 || i == 3 || i == 4) ? new IllegalStateException(format2) : new IllegalArgumentException(format2));
    }

    private static boolean a(C5029Jcb jcb, C5029Jcb jcb2) {
        if (!jcb.getName().equals(jcb2.getName())) {
            return false;
        }
        C5272Rcb e = jcb.e();
        C5272Rcb e2 = jcb2.e();
        while (true) {
            boolean z = true;
            if (e == null || e2 == null) {
                return true;
            }
            if (e instanceof C6450fdb) {
                return e2 instanceof C6450fdb;
            }
            if (e2 instanceof C6450fdb) {
                return false;
            }
            if (e instanceof C6790kdb) {
                if (!(e2 instanceof C6790kdb) || !((C6790kdb) e).q().equals(((C6790kdb) e2).q())) {
                    z = false;
                }
                return z;
            } else if ((e2 instanceof C6790kdb) || !e.getName().equals(e2.getName())) {
                return false;
            } else {
                e = e.e();
                e2 = e2.e();
            }
        }
        return true;
    }

    public C5301Sbb E() {
        C5301Sbb b2 = C7148pqb.b((C5272Rcb) c());
        if (b2 != null) {
            return b2;
        }
        a(1);
        throw null;
    }

    public abstract C5029Jcb c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ptb) || obj.hashCode() != hashCode()) {
            return false;
        }
        Ptb ptb = (Ptb) obj;
        if (ptb.getParameters().size() != getParameters().size()) {
            return false;
        }
        C5029Jcb c = c();
        C5122Mcb c2 = ptb.c();
        if (!a((C5122Mcb) c) || ((c2 != null && !a(c2)) || !(c2 instanceof C5029Jcb))) {
            return false;
        }
        return a(c, (C5029Jcb) c2);
    }

    /* access modifiers changed from: protected */
    public C7706xtb f() {
        if (C5301Sbb.e(c())) {
            return null;
        }
        return E().e();
    }

    public final int hashCode() {
        int i;
        int i2 = this.b;
        if (i2 != 0) {
            return i2;
        }
        C5029Jcb c = c();
        if (a((C5122Mcb) c)) {
            i = C6531gpb.e(c).hashCode();
        } else {
            i = System.identityHashCode(this);
        }
        this.b = i;
        return i;
    }

    private static boolean a(C5122Mcb mcb) {
        if (mcb != null) {
            return !C7154ptb.a((C5272Rcb) mcb) && !C6531gpb.p(mcb);
        }
        a(2);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Collection<C7706xtb> a(boolean z) {
        C5272Rcb e = c().e();
        if (!(e instanceof C5029Jcb)) {
            List emptyList = Collections.emptyList();
            if (emptyList != null) {
                return emptyList;
            }
            a(3);
            throw null;
        }
        Fvb fvb = new Fvb();
        C5029Jcb jcb = (C5029Jcb) e;
        fvb.add(jcb.z());
        C5029Jcb M = jcb.M();
        if (z && M != null) {
            fvb.add(M.z());
        }
        return fvb;
    }
}
