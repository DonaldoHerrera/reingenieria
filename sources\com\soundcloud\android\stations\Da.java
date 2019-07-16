package com.soundcloud.android.stations;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: LikedStationsSyncer */
class Da implements Callable<Boolean> {
    private final Vb a;
    private final kc b;

    public Da(Vb vb, kc kcVar) {
        this.a = vb;
        this.b = kcVar;
    }

    private List<C3508cda> a(List<C3508cda> list, List<C3508cda> list2, List<C6043s> list3) {
        return C7040oHa.a(list, C7040oHa.a(list2, C2063HD.a(list3, C6043s.a)));
    }

    public Boolean call() throws Exception {
        List list;
        C6036pa a2 = C6036pa.a(this.b.b(), this.b.a());
        List c = this.b.c();
        List f = this.a.a(a2).f();
        List a3 = C7040oHa.a(f, c);
        if (a3.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = this.a.a(a3);
        }
        this.b.a(a(f, a3, list), list);
        return Boolean.valueOf(true);
    }
}
