package defpackage;

/* renamed from: Utb reason: default package */
/* compiled from: TypeProjectionImpl */
public class Utb extends Ttb {
    private final C6473fub a;
    private final C7706xtb b;

    public Utb(C6473fub fub, C7706xtb xtb) {
        if (fub == null) {
            a(0);
            throw null;
        } else if (xtb != null) {
            this.a = fub;
            this.b = xtb;
        } else {
            a(1);
            throw null;
        }
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 3 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 3 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
        if (i == 1 || i == 2) {
            objArr[0] = C1325gg.TYPE;
        } else if (i == 3 || i == 4) {
            objArr[0] = str2;
        } else {
            objArr[0] = "projection";
        }
        if (i == 3) {
            objArr[1] = "getProjectionKind";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getType";
        }
        if (!(i == 3 || i == 4)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 3 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public boolean a() {
        return false;
    }

    public C6473fub b() {
        C6473fub fub = this.a;
        if (fub != null) {
            return fub;
        }
        a(3);
        throw null;
    }

    public C7706xtb getType() {
        C7706xtb xtb = this.b;
        if (xtb != null) {
            return xtb;
        }
        a(4);
        throw null;
    }

    public Utb(C7706xtb xtb) {
        if (xtb != null) {
            this(C6473fub.INVARIANT, xtb);
        } else {
            a(2);
            throw null;
        }
    }
}
