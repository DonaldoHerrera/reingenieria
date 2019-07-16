package com.soundcloud.android.tracks;

import com.soundcloud.android.likes.C3989m;
import com.soundcloud.android.playback.C4416rb;
import java.util.List;
import java.util.Map;

/* compiled from: TrackItemRepository.kt */
public class Ca {
    private final C3760eea a;
    private final C3501bea b;
    /* access modifiers changed from: private */
    public final C5425Wta c;
    private final C3989m d;
    private final C2210OR e;
    private final C4416rb f;
    private final C3815lda g;

    public Ca(C3760eea eea, C3501bea bea, C5425Wta wta, C3989m mVar, C2210OR or, C4416rb rbVar, C3815lda lda) {
        C7471uYa.b(eea, "trackRepository");
        C7471uYa.b(bea, "fullTrackRepository");
        C7471uYa.b(wta, "entityItemCreator");
        C7471uYa.b(mVar, "likesStateProvider");
        C7471uYa.b(or, "repostsStateProvider");
        C7471uYa.b(rbVar, "playSessionStateProvider");
        C7471uYa.b(lda, "offlinePropertiesProvider");
        this.a = eea;
        this.b = bea;
        this.c = wta;
        this.d = mVar;
        this.e = or;
        this.f = rbVar;
        this.g = lda;
    }

    public APa<C6185ma> b(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        APa<C6185ma> h = a(this, C6850lWa.a(cda), false, 2, null).a((C7256rQa<? super T>) new C6205wa<Object>(cda)).h(new C6207xa(cda));
        C7471uYa.a((Object) h, "liveFromUrns(listOf(trac…> urnTrackMap[trackUrn] }");
        return h;
    }

    public C7531vPa<C6185ma> c(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        C7531vPa<C6185ma> f2 = Nda.a(this.a.a(cda, a.SYNC_MISSING)).f(new Aa(this));
        C7471uYa.a((Object) f2, "trackRepository.track(tr…emCreator.trackItem(it) }");
        return f2;
    }

    public IPa<Map<C3508cda, C6185ma>> a(List<C3508cda> list) {
        C7471uYa.b(list, "requestedTracks");
        IPa<Map<C3508cda, C6185ma>> e2 = a(list, a.SYNC_MISSING).g().e(new C6199ta(this));
        C7471uYa.a((Object) e2, "liveTracks(requestedTrac…tor.convertTrackMap(it) }");
        return e2;
    }

    private APa<Map<C3508cda, C3509cea>> b(List<C3508cda> list, boolean z) {
        APa<Map<C3508cda, C3509cea>> i = a(list, a.SYNC_MISSING).i(new C6209ya(this, z, list));
        C7471uYa.a((Object) i, "liveTracks(requestedTrac…         }\n            })");
        return i;
    }

    public static /* synthetic */ APa a(Ca ca, List list, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            return ca.a(list, z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: liveFromUrns");
    }

    public IPa<List<C6185ma>> b(List<C3508cda> list) {
        C7471uYa.b(list, "requestedTracks");
        IPa<List<C6185ma>> e2 = a(list).e(new Ba(list));
        C7471uYa.a((Object) e2, "fromUrns(requestedTracks…ckMap[it] }\n            }");
        return e2;
    }

    public APa<Map<C3508cda, C6185ma>> a(List<C3508cda> list, boolean z) {
        C7471uYa.b(list, "requestedTracks");
        _Ua _ua = _Ua.a;
        APa b2 = b(list, z);
        APa d2 = this.d.d();
        APa b3 = this.e.b();
        C7471uYa.a((Object) b3, "repostsStateProvider.repostedStatuses()");
        APa a2 = this.f.a();
        C7471uYa.a((Object) a2, "playSessionStateProvider.nowPlayingUrn()");
        APa d3 = this.g.d();
        C7471uYa.a((Object) d3, "offlinePropertiesProvider.states()");
        APa<Map<C3508cda, C6185ma>> d4 = APa.a(b2, d2, b3, a2, d3, new C6203va(this)).d();
        C7471uYa.a((Object) d4, "Observables.combineLates… }.distinctUntilChanged()");
        return d4;
    }

    /* access modifiers changed from: private */
    public APa<Map<C3508cda, C3509cea>> a(List<C3508cda> list, a aVar) {
        APa<Map<C3508cda, C3509cea>> h = QV.a(this.a.a(list, aVar)).h(C6211za.a);
        C7471uYa.a((Object) h, "trackRepository.tracks(r….associateBy { it.urn } }");
        return h;
    }

    public APa<C6185ma> a(C3508cda cda) {
        C7471uYa.b(cda, "trackUrn");
        APa<C6185ma> c2 = this.b.a(cda).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new C6201ua<Object,Object>(this));
        C7471uYa.a((Object) c2, "fullTrackRepository.loca…          }\n            }");
        return c2;
    }
}
