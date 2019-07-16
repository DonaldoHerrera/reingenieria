package defpackage;

/* renamed from: Otb reason: default package */
/* compiled from: TypeCapabilities.kt */
public final class Otb {
    public static final C6403etb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getCustomTypeVariable");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof C6403etb)) {
            Ba = null;
        }
        C6403etb etb = (C6403etb) Ba;
        if (etb == null || !etb.ta()) {
            return null;
        }
        return etb;
    }

    public static final C7706xtb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getSubtypeRepresentative");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Mtb)) {
            Ba = null;
        }
        Mtb mtb = (Mtb) Ba;
        if (mtb == null) {
            return xtb;
        }
        C7706xtb xa = mtb.xa();
        return xa != null ? xa : xtb;
    }

    public static final C7706xtb c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getSupertypeRepresentative");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Mtb)) {
            Ba = null;
        }
        Mtb mtb = (Mtb) Ba;
        if (mtb == null) {
            return xtb;
        }
        C7706xtb va = mtb.va();
        return va != null ? va : xtb;
    }

    public static final boolean d(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isCustomTypeVariable");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof C6403etb)) {
            Ba = null;
        }
        C6403etb etb = (C6403etb) Ba;
        if (etb != null) {
            return etb.ta();
        }
        return false;
    }

    public static final boolean a(C7706xtb xtb, C7706xtb xtb2) {
        C7471uYa.b(xtb, "first");
        C7471uYa.b(xtb2, "second");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Mtb)) {
            Ba = null;
        }
        Mtb mtb = (Mtb) Ba;
        if (!(mtb != null ? mtb.b(xtb2) : false)) {
            C6405eub Ba2 = xtb2.Ba();
            if (!(Ba2 instanceof Mtb)) {
                Ba2 = null;
            }
            Mtb mtb2 = (Mtb) Ba2;
            if (!(mtb2 != null ? mtb2.b(xtb) : false)) {
                return false;
            }
        }
        return true;
    }
}
