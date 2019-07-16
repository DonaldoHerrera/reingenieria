package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* renamed from: Htb reason: default package */
/* compiled from: SpecialTypes.kt */
public final class Htb {
    public static final Tsb a(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getAbbreviatedType");
        C6405eub Ba = xtb.Ba();
        if (!(Ba instanceof Tsb)) {
            Ba = null;
        }
        return (Tsb) Ba;
    }

    public static final Etb b(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$getAbbreviation");
        Tsb a = a(xtb);
        if (a != null) {
            return a.Da();
        }
        return null;
    }

    public static final boolean c(C7706xtb xtb) {
        C7471uYa.b(xtb, "$this$isDefinitelyNotNullType");
        return xtb.Ba() instanceof C6471ftb;
    }

    private static final Etb d(C7706xtb xtb) {
        Ptb za = xtb.za();
        if (!(za instanceof C7637wtb)) {
            za = null;
        }
        C7637wtb wtb = (C7637wtb) za;
        if (wtb != null) {
            C7637wtb a = a(wtb);
            if (a != null) {
                return C7775ytb.a(xtb.getAnnotations(), a, C6918mWa.a(), false, a.e());
            }
        }
        return null;
    }

    public static final Etb a(Etb etb, Etb etb2) {
        C7471uYa.b(etb, "$this$withAbbreviation");
        C7471uYa.b(etb2, "abbreviatedType");
        if (C7844ztb.a(etb)) {
            return etb;
        }
        return new Tsb(etb, etb2);
    }

    public static final Etb a(Etb etb) {
        C7471uYa.b(etb, "$this$makeSimpleTypeDefinitelyNotNullOrNotNull");
        Etb a = C6471ftb.a.a(etb);
        if (a == null) {
            a = d(etb);
        }
        return a != null ? a : etb.a(false);
    }

    public static final C6405eub a(C6405eub eub) {
        C7471uYa.b(eub, "$this$makeDefinitelyNotNullOrNotNull");
        C6405eub a = C6471ftb.a.a(eub);
        if (a == null) {
            a = d(eub);
        }
        return a != null ? a : eub.a(false);
    }

    private static final C7637wtb a(C7637wtb wtb) {
        Collection<C7706xtb> b = wtb.b();
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) b, 10));
        boolean z = false;
        for (C7706xtb xtb : b) {
            if (C5605aub.g(xtb)) {
                z = true;
                xtb = a(xtb.Ba());
            }
            arrayList.add(xtb);
        }
        if (!z) {
            return null;
        }
        return new C7637wtb(arrayList);
    }
}
