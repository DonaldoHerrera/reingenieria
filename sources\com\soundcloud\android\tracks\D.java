package com.soundcloud.android.tracks;

import com.soundcloud.android.sync.T;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: DefaultTrackRepository.kt */
public class D implements C3760eea {
    private final Ya a;
    private final T b;
    private final HPa c;

    public D(Ya ya, T t, HPa hPa) {
        C7471uYa.b(ya, "trackStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(hPa, "scheduler");
        this.a = ya;
        this.b = t;
        this.c = hPa;
    }

    /* access modifiers changed from: private */
    public APa<Pda<C3509cea>> c(C3508cda cda) {
        APa<Pda<C3509cea>> h = this.a.b(cda).h(new C6200u(cda));
        C7471uYa.a((Object) h, "trackStorage.liveTrack(u…urn, null))\n            }");
        return h;
    }

    private APa<Pda<C3509cea>> d(C3508cda cda) {
        APa<Pda<C3509cea>> d = this.a.a(C6850lWa.a(cda)).g().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C6202v<Object,Object>(this, cda)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6204w<Object,Object>(this, cda));
        C7471uYa.a((Object) d, "trackStorage\n           …workResult)\n            }");
        return d;
    }

    /* access modifiers changed from: private */
    public IPa<MV> e(List<C3508cda> list) {
        IPa<MV> f = this.b.a((Collection<C3508cda>) list).e(A.a).f(B.a);
        C7471uYa.a((Object) f, "syncInitiator.batchSyncT…          }\n            }");
        return f;
    }

    private APa<Pda<C3509cea>> b(C3508cda cda) {
        APa<Pda<C3509cea>> d = e(C6850lWa.a(cda)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6196s<Object,Object>(this, cda));
        C7471uYa.a((Object) d, "syncTracks(listOf(urn)).… networkResult)\n        }");
        return d;
    }

    private APa<Ida<C3509cea>> b(List<C3508cda> list) {
        APa<Ida<C3509cea>> a2 = APa.a((EPa<? extends T>) a(list).f().g(), (EPa<? extends T>) c(list));
        C7471uYa.a((Object) a2, "Observable.concat(\n     …nced(requested)\n        )");
        return a2;
    }

    private APa<Ida<C3509cea>> c(List<C3508cda> list) {
        APa<Ida<C3509cea>> d = e(list).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6206x<Object,Object>(this, list));
        C7471uYa.a((Object) d, "syncTracks(requested).fl…etworkResponse)\n        }");
        return d;
    }

    public APa<Pda<C3509cea>> a(C3508cda cda, a aVar) {
        APa aPa;
        C7471uYa.b(cda, "urn");
        C7471uYa.b(aVar, "loadStrategy");
        if (cda.x()) {
            int i = C6193q.b[aVar.ordinal()];
            if (i == 1) {
                aPa = c(cda);
            } else if (i == 2) {
                aPa = a(cda);
            } else if (i == 3) {
                aPa = b(cda);
            } else if (i == 4) {
                aPa = d(cda);
            } else {
                throw new FVa();
            }
            APa<Pda<C3509cea>> b2 = aPa.b(this.c);
            C7471uYa.a((Object) b2, "when (loadStrategy) {\n  … }.subscribeOn(scheduler)");
            return b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cda);
        sb.append(" is not a valid track Urn");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    private APa<Ida<C3509cea>> d(List<C3508cda> list) {
        APa<Ida<C3509cea>> d = this.a.a(list).g().a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C6208y<Object,Object>(this, list)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6210z<Object,Object>(this, list));
        C7471uYa.a((Object) d, "trackStorage\n           …etchResult)\n            }");
        return d;
    }

    private APa<Pda<C3509cea>> a(C3508cda cda) {
        APa<Pda<C3509cea>> a2 = APa.a((EPa<? extends T>) c(cda).f().g(), (EPa<? extends T>) b(cda));
        C7471uYa.a((Object) a2, "Observable.concat(\n     …ngleSynced(urn)\n        )");
        return a2;
    }

    /* access modifiers changed from: private */
    public APa<Ida<C3509cea>> a(List<C3508cda> list) {
        APa<Ida<C3509cea>> h = this.a.b(list).h(new r(list));
        C7471uYa.a((Object) h, "trackStorage.liveTracks(…          }\n            }");
        return h;
    }

    public APa<Ida<C3509cea>> a(List<C3508cda> list, a aVar) {
        boolean z;
        APa aPa;
        C7471uYa.b(list, "urns");
        C7471uYa.b(aVar, "loadStrategy");
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C3508cda) it.next()).x()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            int i = C6193q.a[aVar.ordinal()];
            if (i == 1) {
                aPa = a(list);
            } else if (i == 2) {
                aPa = b(list);
            } else if (i == 3) {
                aPa = d(list);
            } else if (i == 4) {
                aPa = c(list);
            } else {
                throw new FVa();
            }
            APa<Ida<C3509cea>> b2 = aPa.b(this.c);
            C7471uYa.a((Object) b2, "when (loadStrategy) {\n  … }.subscribeOn(scheduler)");
            return b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Not all the provided urns are tracks: [");
        sb.append(C7676xWa.a(list, null, null, null, 0, null, C.a, 31, null));
        sb.append(']');
        throw new IllegalArgumentException(sb.toString().toString());
    }
}
