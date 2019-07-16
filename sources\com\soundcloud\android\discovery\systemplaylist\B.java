package com.soundcloud.android.discovery.systemplaylist;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4416rb;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* compiled from: SystemPlaylistItemMapper.kt */
public class B {
    private final C4416rb a;
    /* access modifiers changed from: private */
    public final C5604aua b;

    public B(C4416rb rbVar, C5604aua aua) {
        C7471uYa.b(rbVar, "playSessionStateProvider");
        C7471uYa.b(aua, "liveEntities");
        this.a = rbVar;
        this.b = aua;
    }

    /* access modifiers changed from: private */
    public List<V> b(C3520k kVar, List<? extends C6185ma> list) {
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6185ma maVar : list) {
            a(maVar);
            arrayList.add(maVar);
        }
        ArrayList arrayList2 = new ArrayList(C6986nWa.a((Iterable) arrayList, 10));
        int i = 0;
        for (Object next : arrayList) {
            int i2 = i + 1;
            if (i >= 0) {
                C6185ma maVar2 = (C6185ma) next;
                C3508cda i3 = kVar.i();
                C7471uYa.a((Object) i3, "systemPlaylist.urn()");
                W w = new W(i3, (C3508cda) kVar.e().d(), (String) kVar.g().d(), maVar2);
                PlaySessionSource a2 = a((C3532x) w, list.size(), i);
                ArrayList arrayList3 = new ArrayList(C6986nWa.a((Iterable) list, 10));
                for (C6185ma a3 : list) {
                    arrayList3.add(a3.a());
                }
                arrayList2.add(new V(w, new ea(a2, arrayList3, i)));
                i = i2;
            } else {
                C6782kWa.c();
                throw null;
            }
        }
        return arrayList2;
    }

    public APa<ba> a(C3520k kVar) {
        C7471uYa.b(kVar, "systemPlaylist");
        APa<ba> h = APa.c(kVar.h()).h(C3533y.a).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C3534z<Object,Object>(this)).h(new A(this, kVar));
        C7471uYa.a((Object) h, "Observable.just(systemPl…odel(items)\n            }");
        return h;
    }

    /* access modifiers changed from: private */
    public C3527s a(C3520k kVar, List<? extends C6185ma> list) {
        List h = kVar.h();
        C3508cda i = kVar.i();
        C7471uYa.a((Object) i, "urn()");
        C3508cda cda = (C3508cda) kVar.e().d();
        String str = (String) kVar.g().d();
        String str2 = (String) kVar.f().d();
        String str3 = (String) kVar.b().d();
        Vca vca = (Vca) kVar.c().d();
        int size = h.size();
        C7471uYa.a((Object) h, "tracks");
        C3528t tVar = new C3528t(i, cda, str, str2, str3, vca, size, a(h), (Date) kVar.d().d(), !h.isEmpty());
        PlaySessionSource a2 = a((C3532x) tVar, h.size(), 0);
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
        for (C6185ma a3 : list) {
            arrayList.add(a3.a());
        }
        return new C3527s(tVar, new ea(a2, arrayList, 0));
    }

    private C6185ma a(C6185ma maVar) {
        if (this.a.b(maVar.a())) {
            maVar.a(true);
        }
        return maVar;
    }

    private PlaySessionSource a(C3532x xVar, int i, int i2) {
        PlaySessionSource a2 = PlaySessionSource.a(Yca.SYSTEM_PLAYLIST.a(), C4928GKa.b(xVar.c()), i2, C4928GKa.b(xVar.a()), xVar.b(), i);
        C7471uYa.a((Object) a2, "forSystemPlaylist(\n     …      trackSize\n        )");
        return a2;
    }

    private long a(List<C3509cea> list) {
        ArrayList<Number> arrayList = new ArrayList<>(C6986nWa.a((Iterable) list, 10));
        for (C3509cea i : list) {
            arrayList.add(Long.valueOf(i.i()));
        }
        long j = 0;
        for (Number longValue : arrayList) {
            j += longValue.longValue();
        }
        return j;
    }
}
