package defpackage;

/* renamed from: ttb reason: default package and case insensitive filesystem */
/* compiled from: flexibleTypes.kt */
public final class C7430ttb {
    public static final C7223qtb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$asFlexibleType");
        C6405eub Ba = xtb.Ba();
        if (Ba != null) {
            return (C7223qtb) Ba;
        }
        throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
    }

    public static final boolean b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isFlexible");
        return xtb.Ba() instanceof C7223qtb;
    }

    public static final Etb c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$lowerIfFlexible");
        C6405eub Ba = xtb.Ba();
        if (Ba instanceof C7223qtb) {
            return ((C7223qtb) Ba).Da();
        }
        if (Ba instanceof Etb) {
            return (Etb) Ba;
        }
        throw new FVa();
    }

    public static final Etb d(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$upperIfFlexible");
        C6405eub Ba = xtb.Ba();
        if (Ba instanceof C7223qtb) {
            return ((C7223qtb) Ba).Ea();
        }
        if (Ba instanceof Etb) {
            return (Etb) Ba;
        }
        throw new FVa();
    }
}
