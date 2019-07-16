package com.soundcloud.android.playback.playqueue;

import com.google.common.base.Predicate;
import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.tracks.C6185ma;
import com.soundcloud.android.tracks.Ca;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* compiled from: PlayQueueOperations.kt */
public class Ma {
    private final HPa a;
    private final C3814lca b;
    private final Ca c;
    private final C3792iea d;
    private final Vda e;
    private final Fda f;
    private final C3760eea g;

    public Ma(HPa hPa, C3814lca lca, Ca ca, C3792iea iea, Vda vda, Fda fda, C3760eea eea) {
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(lca, "playQueueManager");
        C7471uYa.b(ca, "trackItemRepository");
        C7471uYa.b(iea, "userRepository");
        C7471uYa.b(vda, "stationsRepository");
        C7471uYa.b(fda, "playlistRepository");
        C7471uYa.b(eea, "trackRepository");
        this.a = hPa;
        this.b = lca;
        this.c = ca;
        this.d = iea;
        this.e = vda;
        this.f = fda;
        this.g = eea;
    }

    /* access modifiers changed from: private */
    public IPa<List<eb>> c() {
        List<q> a2 = this.b.a((Predicate<q>) Ka.a);
        C7471uYa.a((Object) a2, "playQueueManager\n       … null && it.urn.isTrack }");
        ArrayList<F> arrayList = new ArrayList<>(C6986nWa.a((Iterable) a2, 10));
        for (q qVar : a2) {
            if (qVar != null) {
                arrayList.add((F) qVar);
            } else {
                throw new OVa("null cannot be cast to non-null type com.soundcloud.android.foundation.playqueue.TrackQueueItem");
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (F c2 : arrayList) {
            arrayList2.add(c2.c());
        }
        IPa<List<eb>> b2 = this.c.a(C7676xWa.e(arrayList2)).e(new Ja(this, arrayList)).b(this.a);
        C7471uYa.a((Object) b2, "trackItemRepository\n    …  .subscribeOn(scheduler)");
        return b2;
    }

    private IPa<Map<C3508cda, String>> d(List<C3508cda> list, _Xa<? super C3508cda, Boolean> _xa) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            IPa<Map<C3508cda, String>> e2 = this.d.a((List<C3508cda>) arrayList).g().e(Ia.a);
            C7471uYa.a((Object) e2, "userRepository\n         …urn }, { it.username }) }");
            return e2;
        }
        IPa<Map<C3508cda, String>> a2 = IPa.a(LWa.a());
        C7471uYa.a((Object) a2, "Single.just(emptyMap())");
        return a2;
    }

    public IPa<List<eb>> b() {
        IPa<List<eb>> a2 = IPa.a((Callable<? extends MPa<? extends T>>) new La<Object>(this));
        C7471uYa.a((Object) a2, "Single.defer { this.loadTracks() }");
        return a2;
    }

    private IPa<Map<C3508cda, String>> b(List<C3508cda> list, _Xa<? super C3508cda, Boolean> _xa) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            IPa<Map<C3508cda, String>> e2 = this.e.b((List<C3508cda>) arrayList).e(Fa.a);
            C7471uYa.a((Object) e2, "stationsRepository\n     …it.urn }, { it.title }) }");
            return e2;
        }
        IPa<Map<C3508cda, String>> a2 = IPa.a(LWa.a());
        C7471uYa.a((Object) a2, "Single.just(emptyMap())");
        return a2;
    }

    public IPa<Map<C3508cda, String>> a() {
        List f2 = this.b.f();
        C7471uYa.a((Object) f2, "contextUrns");
        IPa b2 = b(f2, Aa.a);
        IPa d2 = d(f2, Ca.a);
        IPa a2 = a(f2, (_Xa<? super C3508cda, Boolean>) C4409za.a);
        IPa c2 = c(f2, Ba.a);
        C5573aVa ava = C5573aVa.a;
        IPa a3 = IPa.a(d2, b2, a2, c2, new C4407ya());
        C7471uYa.a((Object) a3, "Single.zip(s1, s2, s3, s…invoke(t1, t2, t3, t4) })");
        IPa<Map<C3508cda, String>> b3 = a3.b(this.a);
        C7471uYa.a((Object) b3, "Singles.zip(\n           … }.subscribeOn(scheduler)");
        return b3;
    }

    private IPa<Map<C3508cda, String>> a(List<C3508cda> list, _Xa<? super C3508cda, Boolean> _xa) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            IPa<Map<C3508cda, String>> e2 = this.f.a((List<C3508cda>) arrayList).g().e(Da.a).e(Ea.a);
            C7471uYa.a((Object) e2, "playlistRepository.playl…le() })\n                }");
            return e2;
        }
        IPa<Map<C3508cda, String>> a2 = IPa.a(LWa.a());
        C7471uYa.a((Object) a2, "Single.just(emptyMap())");
        return a2;
    }

    private IPa<Map<C3508cda, String>> c(List<C3508cda> list, _Xa<? super C3508cda, Boolean> _xa) {
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((Boolean) _xa.invoke(next)).booleanValue()) {
                arrayList.add(next);
            }
        }
        if (!arrayList.isEmpty()) {
            IPa<Map<C3508cda, String>> e2 = QV.a(this.g.a((List<C3508cda>) arrayList, a.SYNC_MISSING)).h(Ga.a).g().e(Ha.a);
            C7471uYa.a((Object) e2, "trackRepository\n        …key to it.value.title } }");
            return e2;
        }
        IPa<Map<C3508cda, String>> a2 = IPa.a(LWa.a());
        C7471uYa.a((Object) a2, "Single.just(emptyMap())");
        return a2;
    }

    /* access modifiers changed from: private */
    public List<eb> a(List<? extends F> list, Map<C3508cda, ? extends C6185ma> map) {
        ArrayList<F> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (map.containsKey(((F) next).c())) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        for (F f2 : arrayList) {
            arrayList2.add(new eb((C6185ma) map.get(f2.c()), f2));
        }
        return arrayList2;
    }
}
