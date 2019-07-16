package defpackage;

/* renamed from: cub reason: default package and case insensitive filesystem */
/* compiled from: TypeWithEnhancement.kt */
public final class C6269cub {
    public static final C7706xtb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getEnhancement");
        if (xtb instanceof C5673bub) {
            return ((C5673bub) xtb).ua();
        }
        return null;
    }

    public static final C7706xtb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$unwrapEnhancement");
        C7706xtb a = a(xtb);
        return a != null ? a : xtb;
    }

    public static final C6405eub a(C6405eub eub, C7706xtb xtb) {
        C7471uYa.b(eub, "$this$inheritEnhancement");
        C7471uYa.b(xtb, "origin");
        return b(eub, a(xtb));
    }

    public static final C6405eub b(C6405eub eub, C7706xtb xtb) {
        C6405eub eub2;
        C7471uYa.b(eub, "$this$wrapEnhancement");
        if (xtb == null) {
            return eub;
        }
        if (eub instanceof Etb) {
            eub2 = new Gtb((Etb) eub, xtb);
        } else if (eub instanceof C7223qtb) {
            eub2 = new C7361stb((C7223qtb) eub, xtb);
        } else {
            throw new FVa();
        }
        return eub2;
    }
}
