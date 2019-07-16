package com.soundcloud.android.profile;

import java.util.ArrayList;

/* compiled from: WriteMixedRecordsCommand */
public class re extends C1255eT<Iterable<? extends Object>, Boolean> {
    private final C3768fea a;
    private final Hda b;
    private final C3800jea c;

    protected re(C3768fea fea, Hda hda, C3800jea jea) {
        this.a = fea;
        this.b = hda;
        this.c = jea;
    }

    public Boolean a(Iterable<? extends Object> iterable) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object next : iterable) {
            if (next instanceof Yda) {
                arrayList.add((Yda) next);
            } else if (next instanceof C1955BP) {
                arrayList.add(((C1955BP) next).a());
            } else if (next instanceof C1975CP) {
                arrayList.add(((C1975CP) next).a());
            } else if (next instanceof C1995DP) {
                arrayList.add(((C1995DP) next).a());
            } else if (next instanceof C2015EP) {
                arrayList.add(((C2015EP) next).a());
            } else if (next instanceof Ada) {
                arrayList2.add(((Ada) next).f());
            } else if (next instanceof C3776gea) {
                arrayList3.add((C3776gea) next);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected entity type, unable to write ");
                sb.append(next);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        return Boolean.valueOf((arrayList.isEmpty() || this.a.a(arrayList)) && (arrayList2.isEmpty() || this.b.a(arrayList2)) && (arrayList3.isEmpty() || this.c.b(arrayList3)));
    }
}
