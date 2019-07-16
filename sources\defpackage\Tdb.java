package defpackage;

/* renamed from: Tdb reason: default package */
/* compiled from: Visibilities */
class Tdb extends C5583aeb {
    Tdb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "whatDeclaration";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "fromClass";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$3";
        if (i == 2 || i == 3) {
            objArr[2] = "doesReceiverFitForProtectedVisibility";
        } else {
            objArr[2] = "isVisible";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb != null) {
            C5029Jcb jcb = (C5029Jcb) C6531gpb.a((C5272Rcb) vcb, C5029Jcb.class);
            C5029Jcb jcb2 = (C5029Jcb) C6531gpb.a(rcb, C5029Jcb.class, false);
            if (jcb2 == null) {
                return false;
            }
            if (jcb != null && C6531gpb.k(jcb)) {
                C5029Jcb jcb3 = (C5029Jcb) C6531gpb.a((C5272Rcb) jcb, C5029Jcb.class);
                if (jcb3 != null && C6531gpb.b(jcb2, jcb3)) {
                    return true;
                }
            }
            C5390Vcb a = C6531gpb.a(vcb);
            C5029Jcb jcb4 = (C5029Jcb) C6531gpb.a((C5272Rcb) a, C5029Jcb.class);
            if (jcb4 == null) {
                return false;
            }
            if (!C6531gpb.b(jcb2, jcb4) || !a(tqb, a, jcb2)) {
                return a(tqb, vcb, jcb2.e());
            }
            return true;
        } else {
            a(1);
            throw null;
        }
    }

    private boolean a(Tqb tqb, C5390Vcb vcb, C5029Jcb jcb) {
        if (vcb == null) {
            a(2);
            throw null;
        } else if (jcb != null) {
            boolean z = false;
            if (tqb == _db.o) {
                return false;
            }
            if (!(vcb instanceof C4935Gcb) || (vcb instanceof C5242Qcb) || tqb == _db.n) {
                return true;
            }
            if (!(tqb == _db.m || tqb == null)) {
                C7706xtb a = tqb instanceof Uqb ? ((Uqb) tqb).a() : tqb.getType();
                if (C6531gpb.a(a, (C5272Rcb) jcb) || C6879ltb.a(a)) {
                    z = true;
                }
            }
            return z;
        } else {
            a(3);
            throw null;
        }
    }
}
