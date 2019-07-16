package defpackage;

/* renamed from: fgb reason: default package and case insensitive filesystem */
/* compiled from: JavaVisibilities */
class C6453fgb extends C5583aeb {
    C6453fgb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$3";
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "visibility";
        } else if (i == 3 || i == 4) {
            objArr[0] = str2;
        } else {
            objArr[0] = "what";
        }
        if (i == 3) {
            objArr[1] = "getDisplayName";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = "normalize";
        }
        if (i == 2) {
            objArr[2] = "compareTo";
        } else if (!(i == 3 || i == 4)) {
            objArr[2] = "isVisible";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public String a() {
        return "protected/*protected and package*/";
    }

    public boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb != null) {
            return C6521ggb.b(tqb, vcb, rcb);
        } else {
            a(1);
            throw null;
        }
    }

    public C5583aeb c() {
        C5583aeb aeb = _db.c;
        if (aeb != null) {
            return aeb;
        }
        a(4);
        throw null;
    }

    /* access modifiers changed from: protected */
    public Integer a(C5583aeb aeb) {
        if (aeb == null) {
            a(2);
            throw null;
        } else if (this == aeb) {
            return Integer.valueOf(0);
        } else {
            if (aeb == _db.d) {
                return null;
            }
            if (_db.a(aeb)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }
    }
}
