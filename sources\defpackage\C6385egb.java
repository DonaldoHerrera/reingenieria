package defpackage;

/* renamed from: egb reason: default package and case insensitive filesystem */
/* compiled from: JavaVisibilities */
class C6385egb extends C5583aeb {
    C6385egb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 2 || i == 3) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 3) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$2";
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2 || i == 3) {
            objArr[0] = str2;
        } else {
            objArr[0] = "what";
        }
        if (i == 2) {
            objArr[1] = "getDisplayName";
        } else if (i != 3) {
            objArr[1] = str2;
        } else {
            objArr[1] = "normalize";
        }
        if (!(i == 2 || i == 3)) {
            objArr[2] = "isVisible";
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 3) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public String a() {
        return "protected/*protected static*/";
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
        a(3);
        throw null;
    }
}
