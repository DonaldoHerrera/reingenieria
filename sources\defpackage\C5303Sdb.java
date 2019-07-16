package defpackage;

/* renamed from: Sdb reason: default package and case insensitive filesystem */
/* compiled from: Visibilities */
class C5303Sdb extends C5583aeb {
    C5303Sdb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        String str = i != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 2 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$2";
        if (i == 1) {
            objArr[0] = "from";
        } else if (i != 2) {
            objArr[0] = "what";
        } else {
            objArr[0] = str2;
        }
        if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getDisplayName";
        }
        if (i != 2) {
            objArr[2] = "isVisible";
        }
        String format = String.format(str, objArr);
        throw (i != 2 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String a() {
        return "private/*private to this*/";
    }

    public boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb != null) {
            if (_db.a.a(tqb, vcb, rcb)) {
                if (tqb == _db.n) {
                    return true;
                }
                if (tqb == _db.m) {
                    return false;
                }
                C5272Rcb a = C6531gpb.a((C5272Rcb) vcb, C5029Jcb.class);
                if (a != null && (tqb instanceof Vqb)) {
                    return ((Vqb) tqb).A().getOriginal().equals(a.getOriginal());
                }
            }
            return false;
        } else {
            a(1);
            throw null;
        }
    }
}
