package com.soundcloud.android.collection.recentlyplayed;

import android.util.SparseArray;
import com.soundcloud.android.collection.playhistory.ua;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* compiled from: RecentlyPlayedSyncer */
class Ka implements Callable<Boolean> {
    private final C2817j a;
    private final C2813h b;
    private final C6416fAa c;
    private final Hda d;
    private final C6824lAa e;
    private final C3800jea f;
    private final C5327TLa g;
    private final Ga h;
    private final Vda i;

    Ka(Ga ga, C2813h hVar, C2817j jVar, C6416fAa faa, Hda hda, C6824lAa laa, C3800jea jea, C5327TLa tLa, Vda vda) {
        this.h = ga;
        this.a = jVar;
        this.b = hVar;
        this.c = faa;
        this.d = hda;
        this.e = laa;
        this.f = jea;
        this.g = tLa;
        this.i = vda;
    }

    private void a() {
        this.h.c(1000);
        this.a.a();
    }

    private boolean b() throws Exception {
        HashSet a2 = C2458bE.a((Iterable<? extends E>) this.b.a());
        HashSet a3 = C2458bE.a((Iterable<? extends E>) this.h.c());
        boolean z = !a3.equals(a2);
        if (z) {
            a(a3, a2);
            b(a3, a2);
            this.g.c(C3876taa.w, Daa.b());
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
            b(arrayList);
            this.h.a((List<? extends ua>) arrayList);
        }
    }

    private void b(Collection<ua> collection, Collection<ua> collection2) {
        ArrayList arrayList = new ArrayList(collection);
        arrayList.removeAll(collection2);
        if (!arrayList.isEmpty()) {
            this.h.c((List<? extends ua>) arrayList);
        }
    }

    private SparseArray<Set<C3508cda>> a(List<ua> list) {
        SparseArray<Set<C3508cda>> sparseArray = new SparseArray<>(4);
        for (ua uaVar : list) {
            int c2 = uaVar.c();
            if (sparseArray.indexOfKey(c2) < 0) {
                HashSet hashSet = new HashSet(1);
                hashSet.add(uaVar.b());
                sparseArray.put(c2, hashSet);
            } else {
                ((Set) sparseArray.get(c2)).add(uaVar.b());
            }
        }
        return sparseArray;
    }

    private void b(List<ua> list) throws Exception {
        SparseArray a2 = a(list);
        for (int i2 = 0; i2 < a2.size(); i2++) {
            int keyAt = a2.keyAt(i2);
            ArrayList arrayList = new ArrayList((Collection) a2.valueAt(i2));
            if (keyAt == 1) {
                this.d.a(((_S) this.c.a(arrayList)).call());
            } else if (keyAt == 2 || keyAt == 3) {
                this.i.a((List<C3508cda>) arrayList).a((C7117pPa) new C4943Gua());
            } else if (keyAt == 4) {
                this.f.b(((_S) this.e.a(arrayList)).call());
            }
        }
    }
}
