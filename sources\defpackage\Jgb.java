package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: Jgb reason: default package */
/* compiled from: SignaturePropagator */
class Jgb implements Kgb {
    Jgb() {
    }

    private static /* synthetic */ void a(int i) {
        String str = i != 5 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i != 5 ? 3 : 2)];
        String str2 = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        switch (i) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = str2;
                break;
            case 6:
                objArr[0] = "descriptor";
                break;
            case 7:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        String str3 = "resolvePropagatedSignature";
        if (i != 5) {
            objArr[1] = str2;
        } else {
            objArr[1] = str3;
        }
        if (i != 5) {
            if (i == 6 || i == 7) {
                objArr[2] = "reportSignatureErrors";
            } else {
                objArr[2] = str3;
            }
        }
        String format = String.format(str, objArr);
        throw (i != 5 ? new IllegalArgumentException(format) : new IllegalStateException(format));
    }

    public a a(Uib uib, C5029Jcb jcb, C7706xtb xtb, C7706xtb xtb2, List<C5061Kdb> list, List<C4905Fdb> list2) {
        if (uib == null) {
            a(0);
            throw null;
        } else if (jcb == null) {
            a(1);
            throw null;
        } else if (xtb == null) {
            a(2);
            throw null;
        } else if (list == null) {
            a(3);
            throw null;
        } else if (list2 != null) {
            a aVar = new a(xtb, xtb2, list, list2, Collections.emptyList(), false);
            return aVar;
        } else {
            a(4);
            throw null;
        }
    }

    public void a(C4935Gcb gcb, List<String> list) {
        if (gcb == null) {
            a(6);
            throw null;
        } else if (list == null) {
            a(7);
            throw null;
        } else {
            throw new UnsupportedOperationException("Should not be called");
        }
    }
}
