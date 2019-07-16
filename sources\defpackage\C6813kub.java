package defpackage;

/* renamed from: kub reason: default package and case insensitive filesystem */
/* compiled from: KotlinTypeCheckerImpl */
class C6813kub extends C7639wub {
    final /* synthetic */ a a;

    C6813kub(a aVar) {
        this.a = aVar;
    }

    private static /* synthetic */ void b(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "constructor1";
        } else {
            objArr[0] = "constructor2";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeCheckerImpl$1";
        objArr[2] = "assertEqualTypeConstructors";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Ptb ptb, Ptb ptb2) {
        if (ptb == null) {
            b(0);
            throw null;
        } else if (ptb2 != null) {
            return ptb.equals(ptb2) || this.a.a(ptb, ptb2);
        } else {
            b(1);
            throw null;
        }
    }
}
