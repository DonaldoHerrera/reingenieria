package defpackage;

/* renamed from: Ceb reason: default package */
/* compiled from: AbstractLazyTypeParameterDescriptor */
public abstract class Ceb extends Keb {
    public Ceb(Ssb ssb, C5272Rcb rcb, C7694xnb xnb, C6473fub fub, boolean z, int i, C7822zdb zdb, C4843Ddb ddb) {
        if (ssb == null) {
            e(0);
            throw null;
        } else if (rcb == null) {
            e(1);
            throw null;
        } else if (xnb == null) {
            e(2);
            throw null;
        } else if (fub == null) {
            e(3);
            throw null;
        } else if (zdb == null) {
            e(4);
            throw null;
        } else if (ddb != null) {
            super(ssb, rcb, C6723jeb.c.a(), xnb, fub, z, i, zdb, ddb);
        } else {
            e(5);
            throw null;
        }
    }

    private static /* synthetic */ void e(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "containingDeclaration";
        } else if (i == 2) {
            objArr[0] = "name";
        } else if (i == 3) {
            objArr[0] = "variance";
        } else if (i == 4) {
            objArr[0] = "source";
        } else if (i != 5) {
            objArr[0] = "storageManager";
        } else {
            objArr[0] = "supertypeLoopChecker";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public String toString() {
        Object[] objArr = new Object[3];
        String str = "";
        objArr[0] = oa() ? "reified " : str;
        if (pa() != C6473fub.INVARIANT) {
            StringBuilder sb = new StringBuilder();
            sb.append(pa());
            sb.append(" ");
            str = sb.toString();
        }
        objArr[1] = str;
        objArr[2] = getName();
        return String.format("%s%s%s", objArr);
    }
}
