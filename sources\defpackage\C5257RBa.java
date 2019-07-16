package defpackage;

import com.soundcloud.android.sync.C6135s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: RBa reason: default package and case insensitive filesystem */
/* compiled from: SinglePlaylistSyncer */
class C5257RBa implements Callable<Boolean> {
    private final C3508cda a;
    private final C7238rBa b;
    private final dfa c;
    private final C3768fea d;
    private final Fda e;
    private final Hda f;
    private final C5075LBa g;
    private final C5128Msa h;
    private final C6332dsa i;
    private final C5327TLa j;
    private final C6135s k;

    C5257RBa(C3508cda cda, C5128Msa msa, C7238rBa rba, dfa dfa, C3768fea fea, Fda fda, Hda hda, C5075LBa lBa, C6332dsa dsa, C5327TLa tLa, C6135s sVar) {
        this.a = cda;
        this.b = rba;
        this.c = dfa;
        this.d = fea;
        this.e = fda;
        this.f = hda;
        this.h = msa;
        this.g = lBa;
        this.i = dsa;
        this.j = tLa;
        this.k = sVar;
    }

    private C6486gBa a(C3508cda cda) throws Exception {
        return (C6486gBa) this.c.a(hfa.b(C2226PO.PLAYLIST_WITH_TRACKS.a(cda)).a("secret_token", this.e.a(cda)).c().b(), (C4990IKa<ResourceType>) new C5197PBa<ResourceType>(this));
    }

    private List<C3508cda> b(List<C3508cda> list, List<C3508cda> list2, Set<C3508cda> set) {
        ArrayList arrayList = new ArrayList(list.size() + set.size());
        for (C3508cda cda : list) {
            if (!list2.contains(cda)) {
                arrayList.add(cda);
            }
        }
        arrayList.addAll(set);
        return arrayList;
    }

    public Boolean call() throws Exception {
        C3927zda zda;
        try {
            C6486gBa a2 = a(this.a);
            List a3 = a(a2);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            HashSet hashSet = new HashSet();
            C3508cda a4 = a2.a().a();
            C4928GKa a5 = this.i.a(a4);
            a((List<C3508cda>) arrayList, (List<C3508cda>) arrayList2, (Set<C3508cda>) hashSet);
            if (a(a5, (List<C3508cda>) arrayList2, (Set<C3508cda>) hashSet)) {
                List a6 = a(a5.c(), a3, arrayList, arrayList2, hashSet);
                zda = a(a6, a4, a5);
                a(zda, a2, a6);
            } else {
                zda = a2.a();
                a(zda, a2, a3);
            }
            this.j.c(C3876taa.q, Kaa.a((Collection<Eda>) Collections.singletonList(Eda.a(zda))));
            return Boolean.valueOf(true);
        } catch (ifa e2) {
            a(this.a, e2);
            return Boolean.valueOf(true);
        }
    }

    private List<C3508cda> a(boolean z, List<C3508cda> list, List<C3508cda> list2, List<C3508cda> list3, Set<C3508cda> set) {
        if (z) {
            return a(list, list2, list3, set);
        }
        return b(list, list3, set);
    }

    private List<C3508cda> a(List<C3508cda> list, List<C3508cda> list2, List<C3508cda> list3, Set<C3508cda> set) {
        ArrayList arrayList = new ArrayList(Math.max(list.size(), list2.size()));
        for (C3508cda cda : list2) {
            if (list.contains(cda) || set.contains(cda)) {
                arrayList.add(cda);
            }
        }
        arrayList.addAll(a(list, (List<C3508cda>[]) new List[]{list2, list3}));
        return arrayList;
    }

    private boolean a(C4928GKa<C7376tBa> gKa, List<C3508cda> list, Set<C3508cda> set) {
        return gKa.c() || !list.isEmpty() || !set.isEmpty();
    }

    private C3927zda a(List<C3508cda> list, C3508cda cda, C4928GKa<C7376tBa> gKa) throws ifa, IOException, Lea {
        return ((C6554hBa) this.c.a(hfa.d(C2226PO.PLAYLISTS_UPDATE.a(cda)).c().a((Object) C7790zBa.a(gKa, list)).b(), C6554hBa.class)).a();
    }

    private void a(C3927zda zda, C6486gBa gba, List<C3508cda> list) throws Exception {
        this.d.a(a(gba, list));
        this.g.a(list);
        this.f.a(Collections.singleton(zda));
        this.k.b(zda.a());
    }

    private void a(C3508cda cda, ifa ifa) throws Exception {
        int i2 = C5227QBa.a[ifa.j().ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.h.a(cda);
            return;
        }
        throw ifa;
    }

    private List<C3508cda> a(C6486gBa gba) {
        Pca b2 = gba.b();
        ArrayList arrayList = new ArrayList(b2.f().size());
        for (Yda w : b2.f()) {
            arrayList.add(w.w());
        }
        return arrayList;
    }

    private void a(List<C3508cda> list, List<C3508cda> list2, Set<C3508cda> set) throws Exception {
        for (C4733ABa aBa : this.b.call()) {
            C3508cda c2 = aBa.c();
            if (aBa.b()) {
                list2.add(c2);
            } else {
                list.add(c2);
                if (aBa.a()) {
                    set.add(c2);
                }
            }
        }
    }

    private List<Yda> a(C6486gBa gba, List<C3508cda> list) throws Exception {
        ArrayList arrayList = new ArrayList();
        for (Yda yda : gba.b().f()) {
            if (list.contains(yda.w())) {
                arrayList.add(yda);
            }
        }
        return arrayList;
    }

    private List<C3508cda> a(List<C3508cda> list, List<C3508cda>... listArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (List<C3508cda> removeAll : listArr) {
            arrayList.removeAll(removeAll);
        }
        return arrayList;
    }
}
