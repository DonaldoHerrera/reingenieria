package com.soundcloud.android.collection.playhistory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PlayHistorySyncer */
class za implements Callable<Boolean> {
    private final va a;
    private final Fa b;
    private final C2788p c;
    private final C6620iAa d;
    private final C3768fea e;
    private final C5327TLa f;

    za(va vaVar, C2788p pVar, Fa fa, C6620iAa iaa, C3768fea fea, C5327TLa tLa) {
        this.a = vaVar;
        this.b = fa;
        this.c = pVar;
        this.d = iaa;
        this.e = fea;
        this.f = tLa;
    }

    private void a() {
        this.a.b(1000);
        this.b.a();
    }

    private boolean b() throws Exception {
        HashSet a2 = C2458bE.a((Iterable<? extends E>) this.c.a());
        HashSet a3 = C2458bE.a((Iterable<? extends E>) this.a.d());
        boolean z = !a3.equals(a2);
        if (z) {
            a(a3, a2);
            b(a3, a2);
            this.f.c(C3876taa.w, Daa.b());
        }
        return z;
    }

    public Boolean call() throws Exception {
        boolean b2 = b();
        a();
        return Boolean.valueOf(b2);
    }

    private void a(Collection<ua> collection, Collection<ua> collection2) throws Exception {
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        if (!arrayList.isEmpty()) {
            a(arrayList);
            this.a.a((List<ua>) arrayList);
        }
    }

    private void b(Collection<ua> collection, Collection<ua> collection2) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(collection2);
        if (!arrayList.isEmpty()) {
            this.a.d(arrayList);
        }
    }

    private void a(List<ua> list) throws Exception {
        this.e.a(((_S) this.d.a(new ArrayList(new HashSet(C3063jD.a((Collection<F>) list, ua.a))))).call());
    }
}
