package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: Zbb reason: default package and case insensitive filesystem */
/* compiled from: UnsignedType.kt */
public final class C5505Zbb {
    private static final Set<C7694xnb> a;
    private static final HashMap<C7280rnb, C7280rnb> b = new HashMap<>();
    private static final HashMap<C7280rnb, C7280rnb> c = new HashMap<>();
    private static final Set<C7694xnb> d;
    public static final C5505Zbb e = new C5505Zbb();

    static {
        C5476Ybb[] values;
        C5476Ybb[] values2 = C5476Ybb.values();
        ArrayList arrayList = new ArrayList(values2.length);
        for (C5476Ybb c2 : values2) {
            arrayList.add(c2.c());
        }
        a = C7676xWa.t(arrayList);
        C5476Ybb[] values3 = C5476Ybb.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C5476Ybb a2 : values3) {
            linkedHashSet.add(a2.a().f());
        }
        d = linkedHashSet;
        for (C5476Ybb ybb : C5476Ybb.values()) {
            b.put(ybb.a(), ybb.b());
            c.put(ybb.b(), ybb.a());
        }
    }

    private C5505Zbb() {
    }

    public final boolean a(C7694xnb xnb) {
        C7471uYa.b(xnb, "name");
        return d.contains(xnb);
    }

    public final C7280rnb b(C7280rnb rnb) {
        C7471uYa.b(rnb, "arrayClassId");
        return (C7280rnb) b.get(rnb);
    }

    public final C7280rnb a(C7280rnb rnb) {
        C7471uYa.b(rnb, "arrayClassId");
        return (C7280rnb) c.get(rnb);
    }

    public final boolean a(C7706xtb xtb) {
        C7471uYa.b(xtb, C1325gg.TYPE);
        if (C5605aub.k(xtb)) {
            return false;
        }
        C5122Mcb c2 = xtb.za().c();
        if (c2 == null) {
            return false;
        }
        C7471uYa.a((Object) c2, "type.constructor.declara…escriptor ?: return false");
        return a((C5272Rcb) c2);
    }

    public final boolean a(C5272Rcb rcb) {
        C7471uYa.b(rcb, "descriptor");
        C5272Rcb e2 = rcb.e();
        return (e2 instanceof C6790kdb) && C7471uYa.a((Object) ((C6790kdb) e2).q(), (Object) C5301Sbb.b) && a.contains(rcb.getName());
    }
}
