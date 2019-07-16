package defpackage;

/* renamed from: npb reason: default package and case insensitive filesystem */
/* compiled from: OverridingUtil */
class C7008npb implements a {
    C7008npb() {
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        if (i != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public boolean a(Ptb ptb, Ptb ptb2) {
        if (ptb == null) {
            a(0);
            throw null;
        } else if (ptb2 != null) {
            return ptb.equals(ptb2);
        } else {
            a(1);
            throw null;
        }
    }
}
