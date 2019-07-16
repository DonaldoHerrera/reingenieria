package defpackage;

/* renamed from: Xdb reason: default package */
/* compiled from: Visibilities */
class Xdb extends C5583aeb {
    Xdb(String str, boolean z) {
        super(str, z);
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "what";
        } else {
            objArr[0] = "from";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/Visibilities$7";
        objArr[2] = "isVisible";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Tqb tqb, C5390Vcb vcb, C5272Rcb rcb) {
        if (vcb == null) {
            a(0);
            throw null;
        } else if (rcb == null) {
            a(1);
            throw null;
        } else {
            throw new IllegalStateException("Visibility is unknown yet");
        }
    }
}
