package defpackage;

/* renamed from: dgb reason: default package and case insensitive filesystem */
/* compiled from: JavaVisibilities */
class C6317dgb extends C5583aeb {
    C6317dgb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4 || i == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4 || i == 6) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities$1";
        switch (i) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "visibility";
                break;
            case 3:
            case 4:
            case 6:
                objArr[0] = str2;
                break;
            case 5:
                objArr[0] = "classDescriptor";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        String str3 = "effectiveVisibility";
        if (i == 3) {
            objArr[1] = "getDisplayName";
        } else if (i == 4) {
            objArr[1] = "normalize";
        } else if (i != 6) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i == 2) {
            objArr[2] = "compareTo";
        } else if (!(i == 3 || i == 4)) {
            if (i == 5) {
                objArr[2] = str3;
            } else if (i != 6) {
                objArr[2] = "isVisible";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4 || i == 6) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public String a() {
        return "public/*package*/";
    }

    public boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb != null) {
            return C6521ggb.b(vcb, rcb);
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
            if (_db.a(aeb)) {
                return Integer.valueOf(1);
            }
            return Integer.valueOf(-1);
        }
    }
}
