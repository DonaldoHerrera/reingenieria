package defpackage;

/* renamed from: Rdb reason: default package and case insensitive filesystem */
/* compiled from: Visibilities */
class C5273Rdb extends C5583aeb {
    C5273Rdb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "what";
        } else if (i != 2) {
            objArr[0] = "descriptor";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$1";
        if (i == 1 || i == 2) {
            objArr[2] = "isVisible";
        } else {
            objArr[2] = "hasContainingSourceFile";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean a(C5272Rcb rcb) {
        if (rcb != null) {
            return C6531gpb.c(rcb) != C4781Bdb.a;
        }
        a(0);
        throw null;
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=Vcb, code=Rcb, for r5v0, types: [Rcb, Vcb] */
    public boolean a(Tqb tqb, C5272Rcb rcb, C5272Rcb rcb2) {
        if (rcb == null) {
            a(1);
            throw null;
        } else if (rcb2 == null) {
            a(2);
            throw null;
        } else if (C6531gpb.r(rcb) && a(rcb2)) {
            return _db.a(rcb, rcb2);
        } else {
            if (rcb instanceof C5242Qcb) {
                C5152Ncb e = ((C5242Qcb) rcb).e();
                if (C6531gpb.q(e) && C6531gpb.r(e) && (rcb2 instanceof C5242Qcb) && C6531gpb.r(rcb2.e()) && _db.a(rcb, rcb2)) {
                    return true;
                }
            }
            while (rcb != null) {
                rcb = rcb.e();
                if (!(rcb instanceof C5029Jcb) || C6531gpb.k(rcb)) {
                    if (rcb instanceof C6790kdb) {
                        break;
                    }
                } else {
                    break;
                }
            }
            boolean z = false;
            if (rcb == null) {
                return false;
            }
            while (rcb2 != null) {
                if (rcb == rcb2) {
                    return true;
                }
                if (rcb2 instanceof C6790kdb) {
                    if ((rcb instanceof C6790kdb) && ((C6790kdb) rcb).q().equals(((C6790kdb) rcb2).q()) && C6531gpb.a(rcb2, rcb)) {
                        z = true;
                    }
                    return z;
                }
                rcb2 = rcb2.e();
            }
            return false;
        }
    }
}
