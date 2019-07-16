package defpackage;

/* renamed from: ggb reason: default package and case insensitive filesystem */
/* compiled from: JavaVisibilities */
public class C6521ggb {
    public static final C5583aeb a = new C6317dgb("package", false);
    public static final C5583aeb b = new C6385egb("protected_static", true);
    public static final C5583aeb c = new C6453fgb("protected_and_package", true);

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "from";
        } else if (i == 2) {
            objArr[0] = "first";
        } else if (i != 3) {
            objArr[0] = "what";
        } else {
            objArr[0] = "second";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaVisibilities";
        if (i == 2 || i == 3) {
            objArr[2] = "areInSamePackage";
        } else {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    /* access modifiers changed from: private */
    public static boolean b(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb == null) {
            a(1);
            throw null;
        } else if (b(C6531gpb.a(vcb), rcb)) {
            return true;
        } else {
            return _db.c.a(tqb, vcb, rcb);
        }
    }

    /* access modifiers changed from: private */
    public static boolean b(C5272Rcb rcb, C5272Rcb rcb2) {
        if (rcb == null) {
            a(2);
            throw null;
        } else if (rcb2 != null) {
            C6790kdb kdb = (C6790kdb) C6531gpb.a(rcb, C6790kdb.class, false);
            C6790kdb kdb2 = (C6790kdb) C6531gpb.a(rcb2, C6790kdb.class, false);
            if (kdb2 == null || kdb == null || !kdb.q().equals(kdb2.q())) {
                return false;
            }
            return true;
        } else {
            a(3);
            throw null;
        }
    }
}
