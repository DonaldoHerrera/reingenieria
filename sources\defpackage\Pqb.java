package defpackage;

/* renamed from: Pqb reason: default package */
/* compiled from: AbstractReceiverValue */
public abstract class Pqb implements Tqb {
    protected final C7706xtb a;
    private final Tqb b;

    public Pqb(C7706xtb xtb, Tqb tqb) {
        if (xtb != null) {
            this.a = xtb;
            if (tqb == 0) {
                tqb = this;
            }
            this.b = tqb;
            return;
        }
        a(0);
        throw null;
    }

    private static /* synthetic */ void a(int i) {
        String str = (i == 1 || i == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 1 || i == 2) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        if (i == 1 || i == 2) {
            objArr[0] = str2;
        } else {
            objArr[0] = "receiverType";
        }
        if (i == 1) {
            objArr[1] = "getType";
        } else if (i != 2) {
            objArr[1] = str2;
        } else {
            objArr[1] = "getOriginal";
        }
        if (!(i == 1 || i == 2)) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        throw ((i == 1 || i == 2) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public C7706xtb getType() {
        C7706xtb xtb = this.a;
        if (xtb != null) {
            return xtb;
        }
        a(1);
        throw null;
    }
}
