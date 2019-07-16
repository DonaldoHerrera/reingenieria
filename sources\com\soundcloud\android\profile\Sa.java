package com.soundcloud.android.profile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: StoreProfileCommand */
public class Sa extends C1255eT<C5785g, Boolean> {
    private final re a;

    protected Sa(re reVar) {
        this.a = reVar;
    }

    public Boolean a(C5785g gVar) {
        Pca e = gVar.e();
        Pca g = gVar.g();
        Pca a2 = gVar.a();
        Pca c = gVar.c();
        Pca d = gVar.d();
        Pca b = gVar.b();
        return this.a.a(C1943BD.a((Iterable<? extends T>[]) new Iterable[]{Collections.singletonList(gVar.h()), a(e), g.f(), a2.f(), c.f(), a(d), a(b)}));
    }

    static List<Xca> a(Pca<? extends C5770d> pca) {
        ArrayList arrayList = new ArrayList();
        Iterator it = pca.iterator();
        while (it.hasNext()) {
            C4928GKa a2 = ((C5770d) it.next()).a();
            if (a2.c()) {
                arrayList.add(a2.b());
            }
        }
        return arrayList;
    }
}
