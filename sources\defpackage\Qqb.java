package defpackage;

/* renamed from: Qqb reason: default package */
/* compiled from: ExtensionReceiver */
public class Qqb extends Pqb implements Sqb {
    private final C4904Fcb c;

    public Qqb(C4904Fcb fcb, C7706xtb xtb, Tqb tqb) {
        if (fcb == null) {
            b(0);
            throw null;
        } else if (xtb != null) {
            super(xtb, tqb);
            this.c = fcb;
        } else {
            b(1);
            throw null;
        }
    }

    private static /* synthetic */ void b(int i) {
        String str = (i == 2 || i == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[((i == 2 || i == 4) ? 2 : 3)];
        String str2 = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    objArr[0] = "newType";
                } else if (i != 4) {
                    objArr[0] = "callableDescriptor";
                }
            }
            objArr[0] = str2;
        } else {
            objArr[0] = "receiverType";
        }
        String str3 = "replaceType";
        if (i == 2) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i != 4) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 2) {
            if (i == 3) {
                objArr[2] = str3;
            } else if (i != 4) {
                objArr[2] = "<init>";
            }
        }
        String format = String.format(str, objArr);
        throw ((i == 2 || i == 4) ? new IllegalStateException(format) : new IllegalArgumentException(format));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getType());
        sb.append(": Ext {");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
