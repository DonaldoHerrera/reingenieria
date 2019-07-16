package defpackage;

/* renamed from: Wqb reason: default package */
/* compiled from: TransientReceiver */
public class Wqb extends Pqb {
    public Wqb(C7706xtb xtb) {
        if (xtb != null) {
            this(xtb, null);
        } else {
            b(0);
            throw null;
        }
    }

    private static /* synthetic */ void b(int i) {
        String str = i != 3 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 3 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/TransientReceiver";
        if (i == 2) {
            objArr[0] = "newType";
        } else if (i != 3) {
            objArr[0] = C1325gg.TYPE;
        } else {
            objArr[0] = str2;
        }
        String str3 = "replaceType";
        if (i != 3) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i == 2) {
            objArr[2] = str3;
        } else if (i != 3) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw (i != 3 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Transient} : ");
        sb.append(getType());
        return sb.toString();
    }

    private Wqb(C7706xtb xtb, Tqb tqb) {
        if (xtb != null) {
            super(xtb, tqb);
        } else {
            b(1);
            throw null;
        }
    }
}
