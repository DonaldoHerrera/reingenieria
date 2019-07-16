package defpackage;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: Cub reason: default package */
/* compiled from: utils.kt */
public final class Cub {
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0099  */
    public static final C7706xtb a(C7706xtb xtb, C7706xtb xtb2, C7846zub zub) {
        boolean z;
        boolean z2;
        C7471uYa.b(xtb, "subtype");
        C7471uYa.b(xtb2, "supertype");
        C7471uYa.b(zub, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new C7501uub(xtb, null));
        Ptb za = xtb2.za();
        while (!arrayDeque.isEmpty()) {
            C7501uub uub = (C7501uub) arrayDeque.poll();
            C7706xtb b = uub.b();
            Ptb za2 = b.za();
            if (zub.a(za2, za)) {
                boolean Aa = b.Aa();
                for (C7501uub a = uub.a(); a != null; a = a.a()) {
                    C7706xtb b2 = a.b();
                    List ya = b2.ya();
                    if (!(ya instanceof Collection) || !ya.isEmpty()) {
                        Iterator it = ya.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            if (((Stb) it.next()).b() != C6473fub.INVARIANT) {
                                z2 = true;
                                continue;
                            } else {
                                z2 = false;
                                continue;
                            }
                            if (z2) {
                                z = true;
                                break;
                            }
                        }
                        String str = "TypeConstructorSubstitut…uted, Variance.INVARIANT)";
                        if (!z) {
                            C7706xtb a2 = Gpb.a(Rtb.c.a(b2), false, 1, null).c().a(b, C6473fub.INVARIANT);
                            C7471uYa.a((Object) a2, str);
                            b = a(a2);
                        } else {
                            b = Rtb.c.a(b2).c().a(b, C6473fub.INVARIANT);
                            C7471uYa.a((Object) b, str);
                        }
                        Aa = !Aa || b2.Aa();
                    }
                    z = false;
                    String str2 = "TypeConstructorSubstitut…uted, Variance.INVARIANT)";
                    if (!z) {
                    }
                    if (!Aa) {
                    }
                }
                Ptb za3 = b.za();
                if (zub.a(za3, za)) {
                    return C5605aub.a(b, Aa);
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Type constructors should be equals!\n");
                sb.append("substitutedSuperType: ");
                sb.append(a(za3));
                sb.append(", \n\n");
                sb.append("supertype: ");
                sb.append(a(za));
                sb.append(" \n");
                sb.append(zub.a(za3, za));
                throw new AssertionError(sb.toString());
            }
            for (C7706xtb xtb3 : za2.b()) {
                C7471uYa.a((Object) xtb3, "immediateSupertype");
                arrayDeque.add(new C7501uub(xtb3, uub));
            }
        }
        return null;
    }

    private static final C7706xtb a(C7706xtb xtb) {
        return (C7706xtb) Nub.a(xtb).d();
    }

    private static final String a(Ptb ptb) {
        StringBuilder sb = new StringBuilder();
        Bub bub = new Bub(sb);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("type: ");
        sb2.append(ptb);
        bub.invoke(sb2.toString());
        StringBuilder sb3 = new StringBuilder();
        sb3.append("hashCode: ");
        sb3.append(ptb.hashCode());
        bub.invoke(sb3.toString());
        StringBuilder sb4 = new StringBuilder();
        String str = "javaClass: ";
        sb4.append(str);
        sb4.append(ptb.getClass().getCanonicalName());
        bub.invoke(sb4.toString());
        for (C5272Rcb c = ptb.c(); c != null; c = c.e()) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("fqName: ");
            sb5.append(Cob.f.a(c));
            bub.invoke(sb5.toString());
            StringBuilder sb6 = new StringBuilder();
            sb6.append(str);
            sb6.append(c.getClass().getCanonicalName());
            bub.invoke(sb6.toString());
        }
        String sb7 = sb.toString();
        C7471uYa.a((Object) sb7, "StringBuilder().apply(builderAction).toString()");
        return sb7;
    }
}
