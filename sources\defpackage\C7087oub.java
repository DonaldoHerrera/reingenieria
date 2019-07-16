package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: oub reason: default package and case insensitive filesystem */
/* compiled from: NewCapturedType.kt */
public final class C7087oub {
    public static /* synthetic */ Etb a(Etb etb, C6609hub hub, C6308dYa dya, int i, Object obj) {
        if ((i & 4) != 0) {
            dya = C7779yvb.b();
        }
        return a(etb, hub, dya);
    }

    public static final Etb a(Etb etb, C6609hub hub, C6308dYa<? super Integer, ? super C6949mub, RVa> dya) {
        boolean z;
        C7471uYa.b(etb, C1325gg.TYPE);
        C7471uYa.b(hub, "status");
        C7471uYa.b(dya, "acceptNewCapturedType");
        if (etb.ya().size() != etb.za().getParameters().size()) {
            return null;
        }
        List<Stb> ya = etb.ya();
        boolean z2 = true;
        if (!(ya instanceof Collection) || !ya.isEmpty()) {
            Iterator it = ya.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((Stb) it.next()).b() == C6473fub.INVARIANT) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        z2 = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        if (z2) {
            return null;
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) ya, 10));
        for (Stb stb : ya) {
            if (stb.b() != C6473fub.INVARIANT) {
                stb = Fub.a((C7706xtb) new C6949mub(hub, (stb.a() || stb.b() != C6473fub.IN_VARIANCE) ? null : stb.getType().Ba(), stb));
            }
            arrayList.add(stb);
        }
        _tb c = Rtb.c.a(etb.za(), (List<? extends Stb>) arrayList).c();
        int size = ya.size();
        for (int i = 0; i < size; i++) {
            Stb stb2 = (Stb) ya.get(i);
            Stb stb3 = (Stb) arrayList.get(i);
            if (stb2.b() != C6473fub.INVARIANT) {
                Object obj = etb.za().getParameters().get(i);
                C7471uYa.a(obj, "type.constructor.parameters[index]");
                List<C7706xtb> upperBounds = ((C4905Fdb) obj).getUpperBounds();
                C7471uYa.a((Object) upperBounds, "type.constructor.parameters[index].upperBounds");
                List arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) upperBounds, 10));
                for (C7706xtb a : upperBounds) {
                    arrayList2.add(C7225qub.a.a(c.a(a, C6473fub.INVARIANT).Ba()));
                }
                if (!stb2.a() && stb2.b() == C6473fub.OUT_VARIANCE) {
                    arrayList2 = C7676xWa.a((Collection<? extends T>) arrayList2, C7225qub.a.a(stb2.getType().Ba()));
                }
                C7706xtb type = stb3.getType();
                if (type != null) {
                    C6949mub mub = (C6949mub) type;
                    mub.za().a(arrayList2);
                    dya.invoke(Integer.valueOf(i), mub);
                } else {
                    throw new OVa("null cannot be cast to non-null type org.jetbrains.kotlin.types.checker.NewCapturedType");
                }
            }
        }
        return C7775ytb.a(etb.getAnnotations(), etb.za(), arrayList, etb.Aa());
    }
}
