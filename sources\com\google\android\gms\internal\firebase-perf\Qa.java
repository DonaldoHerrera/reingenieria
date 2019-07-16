package com.google.android.gms.internal.firebase-perf;

import java.util.Comparator;

final class Qa implements Comparator<Oa> {
    Qa() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Oa oa = (Oa) obj;
        Oa oa2 = (Oa) obj2;
        Xa xa = (Xa) oa.iterator();
        Xa xa2 = (Xa) oa2.iterator();
        while (xa.hasNext() && xa2.hasNext()) {
            int compare = Integer.compare(Oa.b(xa.nextByte()), Oa.b(xa2.nextByte()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(oa.size(), oa2.size());
    }
}
