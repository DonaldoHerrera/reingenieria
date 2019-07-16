package defpackage;

/* renamed from: Hrb reason: default package */
/* compiled from: ProtoEnumFlags.kt */
public final class Hrb {
    public static final Hrb a = new Hrb();

    private Hrb() {
    }

    public final a a(Elb elb) {
        if (elb != null) {
            int i = Grb.a[elb.ordinal()];
            if (i == 1) {
                return a.DECLARATION;
            }
            if (i == 2) {
                return a.FAKE_OVERRIDE;
            }
            if (i == 3) {
                return a.DELEGATION;
            }
            if (i == 4) {
                return a.SYNTHESIZED;
            }
        }
        return a.DECLARATION;
    }

    public final C6314ddb a(Glb glb) {
        if (glb != null) {
            int i = Grb.c[glb.ordinal()];
            if (i == 1) {
                return C6314ddb.FINAL;
            }
            if (i == 2) {
                return C6314ddb.OPEN;
            }
            if (i == 3) {
                return C6314ddb.ABSTRACT;
            }
            if (i == 4) {
                return C6314ddb.SEALED;
            }
        }
        return C6314ddb.FINAL;
    }

    public final C5583aeb a(C7762ymb ymb) {
        C5583aeb aeb;
        if (ymb != null) {
            switch (Grb.e[ymb.ordinal()]) {
                case 1:
                    aeb = _db.d;
                    break;
                case 2:
                    aeb = _db.a;
                    break;
                case 3:
                    aeb = _db.b;
                    break;
                case 4:
                    aeb = _db.c;
                    break;
                case 5:
                    aeb = _db.e;
                    break;
                case 6:
                    aeb = _db.f;
                    break;
            }
        }
        aeb = _db.a;
        C7471uYa.a((Object) aeb, "when (visibility) {\n    …isibilities.PRIVATE\n    }");
        return aeb;
    }

    public final C5060Kcb a(b bVar) {
        if (bVar != null) {
            switch (Grb.f[bVar.ordinal()]) {
                case 1:
                    return C5060Kcb.CLASS;
                case 2:
                    return C5060Kcb.INTERFACE;
                case 3:
                    return C5060Kcb.ENUM_CLASS;
                case 4:
                    return C5060Kcb.ENUM_ENTRY;
                case 5:
                    return C5060Kcb.ANNOTATION_CLASS;
                case 6:
                case 7:
                    return C5060Kcb.OBJECT;
            }
        }
        return C5060Kcb.CLASS;
    }

    public final C6473fub a(b bVar) {
        C7471uYa.b(bVar, "variance");
        int i = Grb.h[bVar.ordinal()];
        if (i == 1) {
            return C6473fub.IN_VARIANCE;
        }
        if (i == 2) {
            return C6473fub.OUT_VARIANCE;
        }
        if (i == 3) {
            return C6473fub.INVARIANT;
        }
        throw new FVa();
    }

    public final C6473fub a(b bVar) {
        C7471uYa.b(bVar, "projection");
        int i = Grb.i[bVar.ordinal()];
        if (i == 1) {
            return C6473fub.IN_VARIANCE;
        }
        if (i == 2) {
            return C6473fub.OUT_VARIANCE;
        }
        if (i == 3) {
            return C6473fub.INVARIANT;
        }
        if (i != 4) {
            throw new FVa();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Only IN, OUT and INV are supported. Actual argument: ");
        sb.append(bVar);
        throw new IllegalArgumentException(sb.toString());
    }
}
