package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: iub reason: default package and case insensitive filesystem */
/* compiled from: IntersectionType.kt */
public final class C6677iub {
    public static final C6405eub a(List<? extends C6405eub> list) {
        Etb etb;
        C7471uYa.b(list, "types");
        int size = list.size();
        if (size == 0) {
            throw new IllegalStateException("Expected some types");
        } else if (size == 1) {
            return (C6405eub) C7676xWa.j((List) list);
        } else {
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
            boolean z = false;
            boolean z2 = false;
            for (C6405eub eub : list) {
                z = z || C7844ztb.a(eub);
                if (eub instanceof Etb) {
                    etb = (Etb) eub;
                } else if (!(eub instanceof C7223qtb)) {
                    throw new FVa();
                } else if (C6879ltb.a(eub)) {
                    return eub;
                } else {
                    etb = ((C7223qtb) eub).Da();
                    z2 = true;
                }
                arrayList.add(etb);
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append("Intersection of error types: ");
                sb.append(list);
                Etb c = C7154ptb.c(sb.toString());
                C7471uYa.a((Object) c, "ErrorUtils.createErrorTy… of error types: $types\")");
                return c;
            } else if (!z2) {
                return Aub.a.a((List<? extends Etb>) arrayList);
            } else {
                ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable<? extends T>) list, 10));
                for (C6405eub d : list) {
                    arrayList2.add(C7430ttb.d(d));
                }
                return C7775ytb.a(Aub.a.a((List<? extends Etb>) arrayList), Aub.a.a((List<? extends Etb>) arrayList2));
            }
        }
    }
}
