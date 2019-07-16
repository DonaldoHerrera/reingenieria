package defpackage;

import java.util.Iterator;
import java.util.List;

/* renamed from: Xfb reason: default package */
/* compiled from: ErasedOverridabilityCondition.kt */
public final class Xfb implements C6599hpb {
    public b a(C4904Fcb fcb, C4904Fcb fcb2, C5029Jcb jcb) {
        boolean z;
        b bVar;
        boolean z2;
        C7471uYa.b(fcb, "superDescriptor");
        C7471uYa.b(fcb2, "subDescriptor");
        if (fcb2 instanceof Rgb) {
            Rgb rgb = (Rgb) fcb2;
            List typeParameters = rgb.getTypeParameters();
            C7471uYa.a((Object) typeParameters, "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                a a = C7629wpb.a(fcb, fcb2);
                if ((a != null ? a.a() : null) != null) {
                    return b.UNKNOWN;
                }
                List f = rgb.f();
                C7471uYa.a((Object) f, "subDescriptor.valueParameters");
                Iwb d = Ywb.d(C7676xWa.d(f), Wfb.a);
                C7706xtb a2 = rgb.a();
                if (a2 != null) {
                    Iwb c = Ywb.c(d, a2);
                    C7615wdb l = rgb.l();
                    Iterator it = Ywb.a(c, (Iterable<? extends T>) C6918mWa.b(l != null ? l.getType() : null)).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = false;
                            break;
                        }
                        C7706xtb xtb = (C7706xtb) it.next();
                        if (!(!xtb.ya().isEmpty()) || (xtb.Ba() instanceof Bib)) {
                            z2 = false;
                            continue;
                        } else {
                            z2 = true;
                            continue;
                        }
                        if (z2) {
                            z = true;
                            break;
                        }
                    }
                    if (z) {
                        return b.UNKNOWN;
                    }
                    C4904Fcb fcb3 = (C4904Fcb) fcb.a(C7620wib.e.c());
                    if (fcb3 == null) {
                        return b.UNKNOWN;
                    }
                    if (fcb3 instanceof C7684xdb) {
                        C7684xdb xdb = (C7684xdb) fcb3;
                        List typeParameters2 = xdb.getTypeParameters();
                        C7471uYa.a((Object) typeParameters2, "erasedSuper.typeParameters");
                        if (!typeParameters2.isEmpty()) {
                            fcb3 = xdb.x().b(C6918mWa.a()).build();
                            if (fcb3 == null) {
                                C7471uYa.a();
                                throw null;
                            }
                        }
                    }
                    a a3 = C7629wpb.b.a(fcb3, fcb2, false);
                    C7471uYa.a((Object) a3, "OverridingUtil.DEFAULT.i…er, subDescriptor, false)");
                    C0186a a4 = a3.a();
                    C7471uYa.a((Object) a4, "OverridingUtil.DEFAULT.i…Descriptor, false).result");
                    if (Vfb.a[a4.ordinal()] != 1) {
                        bVar = b.UNKNOWN;
                    } else {
                        bVar = b.OVERRIDABLE;
                    }
                    return bVar;
                }
                C7471uYa.a();
                throw null;
            }
        }
        return b.UNKNOWN;
    }

    public a a() {
        return a.SUCCESS_ONLY;
    }
}
