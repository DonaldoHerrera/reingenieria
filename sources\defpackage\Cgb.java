package defpackage;

/* renamed from: Cgb reason: default package */
/* compiled from: JavaResolverCache */
class Cgb implements Dgb {
    Cgb() {
    }

    private static /* synthetic */ void a(int i) {
        Object[] objArr = new Object[3];
        switch (i) {
            case 1:
                objArr[0] = "method";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public C5029Jcb a(C7349snb snb) {
        if (snb != null) {
            return null;
        }
        a(0);
        throw null;
    }

    public void a(Kib kib, C5029Jcb jcb) {
        if (kib == null) {
            a(7);
            throw null;
        } else if (jcb == null) {
            a(8);
            throw null;
        }
    }

    public void a(Pib pib, C5242Qcb qcb) {
        if (pib == null) {
            a(3);
            throw null;
        } else if (qcb == null) {
            a(4);
            throw null;
        }
    }

    public void a(Rib rib, C7408tdb tdb) {
        if (rib == null) {
            a(5);
            throw null;
        } else if (tdb == null) {
            a(6);
            throw null;
        }
    }

    public void a(Uib uib, C7684xdb xdb) {
        if (uib == null) {
            a(1);
            throw null;
        } else if (xdb == null) {
            a(2);
            throw null;
        }
    }
}
