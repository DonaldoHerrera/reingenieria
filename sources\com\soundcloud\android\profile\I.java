package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.events.C3710l;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.SearchQuerySourceInfo;
import com.soundcloud.android.foundation.events.p;
import com.soundcloud.android.foundation.events.v;
import com.soundcloud.android.foundation.events.y;
import com.soundcloud.android.foundation.playqueue.u;
import com.soundcloud.android.playback.Db;
import com.soundcloud.android.playback.Db.a.C0132a;
import com.soundcloud.android.profile.P.c;
import com.soundcloud.android.profile.P.d;
import com.soundcloud.android.profile.P.e;
import com.soundcloud.android.profile.P.f;
import com.soundcloud.android.properties.a;
import com.soundcloud.android.properties.m.r;
import com.soundcloud.android.tracks.C6185ma;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: ProfileBucketsDataSource.kt */
public class I {
    private final HPa a;
    private final C5879z b;
    /* access modifiers changed from: private */
    public final C5604aua c;
    private final Sa d;
    /* access modifiers changed from: private */
    public final C5327TLa e;
    /* access modifiers changed from: private */
    public final y f;
    /* access modifiers changed from: private */
    public final a g;

    public I(HPa hPa, C5879z zVar, C5604aua aua, Sa sa, C5327TLa tLa, y yVar, a aVar) {
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(zVar, "profileApi");
        C7471uYa.b(aua, "liveEntities");
        C7471uYa.b(sa, "storeProfileCommand");
        C7471uYa.b(tLa, "eventBus");
        C7471uYa.b(yVar, "screenProvider");
        C7471uYa.b(aVar, "appFeatures");
        this.a = hPa;
        this.b = zVar;
        this.c = aua;
        this.d = sa;
        this.e = tLa;
        this.f = yVar;
        this.g = aVar;
    }

    public APa<List<P>> a(C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        C7471uYa.b(cda, "user");
        APa<List<P>> b2 = this.b.f(cda).c(this.d.b()).c((C6776kQa<? super T>) new F<Object>(this)).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new H<Object,Object>(this, searchQuerySourceInfo)).b(this.a);
        C7471uYa.a((Object) b2, "profileApi.userProfile(u…  .subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public List<C3508cda> a(C5785g gVar) {
        List d2 = C6918mWa.d(gVar.h().l());
        List<C5775e> f2 = gVar.e().f();
        C7471uYa.a((Object) f2, "apiUserProfile.spotlight.collection");
        ArrayList arrayList = new ArrayList();
        for (C5775e d3 : f2) {
            C3508cda d4 = d3.d();
            if (d4 != null) {
                arrayList.add(d4);
            }
        }
        List c2 = C7676xWa.c((Collection) d2, (Iterable) arrayList);
        String str = "it";
        if (this.g.a((a) r.a)) {
            List<C1995DP> f3 = gVar.f().f();
            C7471uYa.a((Object) f3, "apiUserProfile.topTracks.collection");
            ArrayList arrayList2 = new ArrayList();
            for (C1995DP dp : f3) {
                C7471uYa.a((Object) dp, str);
                C3508cda w = dp.a().w();
                if (w != null) {
                    arrayList2.add(w);
                }
            }
            c2 = C7676xWa.c((Collection) c2, (Iterable) arrayList2);
        }
        List<C5775e> f4 = gVar.d().f();
        C7471uYa.a((Object) f4, "apiUserProfile.reposts.collection");
        ArrayList arrayList3 = new ArrayList();
        for (C5775e d5 : f4) {
            C3508cda d6 = d5.d();
            if (d6 != null) {
                arrayList3.add(d6);
            }
        }
        List<C5775e> f5 = gVar.b().f();
        C7471uYa.a((Object) f5, "apiUserProfile.likes.collection");
        ArrayList arrayList4 = new ArrayList();
        for (C5775e d7 : f5) {
            C3508cda d8 = d7.d();
            if (d8 != null) {
                arrayList4.add(d8);
            }
        }
        List c3 = C7676xWa.c((Collection) arrayList3, (Iterable) arrayList4);
        List<C1995DP> f6 = gVar.g().f();
        C7471uYa.a((Object) f6, "apiUserProfile.tracks.collection");
        ArrayList arrayList5 = new ArrayList();
        for (C1995DP dp2 : f6) {
            C7471uYa.a((Object) dp2, str);
            C3508cda w2 = dp2.a().w();
            if (w2 != null) {
                arrayList5.add(w2);
            }
        }
        List c4 = C7676xWa.c((Collection) c3, (Iterable) arrayList5);
        List<C3338wP> f7 = gVar.a().f();
        C7471uYa.a((Object) f7, "apiUserProfile.albums.collection");
        ArrayList arrayList6 = new ArrayList();
        for (C3338wP wPVar : f7) {
            C7471uYa.a((Object) wPVar, str);
            C3508cda a2 = wPVar.f().a();
            if (a2 != null) {
                arrayList6.add(a2);
            }
        }
        List c5 = C7676xWa.c((Collection) c4, (Iterable) arrayList6);
        List<C3338wP> f8 = gVar.c().f();
        C7471uYa.a((Object) f8, "apiUserProfile.playlists.collection");
        ArrayList arrayList7 = new ArrayList();
        for (C3338wP wPVar2 : f8) {
            C7471uYa.a((Object) wPVar2, str);
            C3508cda a3 = wPVar2.f().a();
            if (a3 != null) {
                arrayList7.add(a3);
            }
        }
        return C7676xWa.c((Collection) c2, (Iterable) C7676xWa.c((Collection) c5, (Iterable) arrayList7));
    }

    /* access modifiers changed from: private */
    public C6376eYa<Map<C3508cda, ? extends C6185ma>, Map<C3508cda, C4954HFa>, Map<C3508cda, ? extends C3863rda>, List<P>> a(C5785g gVar, SearchQuerySourceInfo searchQuerySourceInfo) {
        return new E(this, gVar, searchQuerySourceInfo);
    }

    static /* synthetic */ u a(I i, C5775e eVar, C3508cda cda, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                cda = null;
            }
            return i.a(eVar, cda);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPlayableWithReposter");
    }

    /* access modifiers changed from: private */
    public u a(C5775e eVar, C3508cda cda) {
        u a2 = u.a(eVar.d(), C4928GKa.b(cda));
        C7471uYa.a((Object) a2, "PlayableWithReposter.cre…l.fromNullable(reposter))");
        return a2;
    }

    static /* synthetic */ u a(I i, C3338wP wPVar, C3508cda cda, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                cda = null;
            }
            return i.a(wPVar, cda);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPlayableWithReposter");
    }

    private u a(C3338wP wPVar, C3508cda cda) {
        u a2 = u.a(wPVar.f().a(), C4928GKa.b(cda));
        C7471uYa.a((Object) a2, "PlayableWithReposter.cre…l.fromNullable(reposter))");
        return a2;
    }

    static /* synthetic */ u a(I i, C1995DP dp, C3508cda cda, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 1) != 0) {
                cda = null;
            }
            return i.a(dp, cda);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toPlayableWithReposter");
    }

    private u a(C1995DP dp, C3508cda cda) {
        u a2 = u.a(dp.a().w(), C4928GKa.b(cda));
        C7471uYa.a((Object) a2, "PlayableWithReposter.cre…l.fromNullable(reposter))");
        return a2;
    }

    /* access modifiers changed from: private */
    public P a(C5775e eVar, int i, Map<C3508cda, ? extends C6185ma> map, Map<C3508cda, ? extends C3863rda> map2, C0132a aVar, int i2, int i3, SearchQuerySourceInfo searchQuerySourceInfo, C3508cda cda) {
        if (eVar.c() != null) {
            Map<C3508cda, ? extends C6185ma> map3 = map;
            C6185ma maVar = (C6185ma) map.get(eVar.c().w());
            if (maVar != null) {
                return a(maVar, aVar, i2, i3, i, cda);
            }
            return null;
        }
        C3927zda b2 = eVar.b();
        if (b2 != null) {
            Map<C3508cda, ? extends C3863rda> map4 = map2;
            C3863rda rda = (C3863rda) map2.get(b2.a());
            if (rda != null) {
                return a(rda, searchQuerySourceInfo, i, i2, cda);
            }
            return null;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private Yca a() {
        return Yca.a(this.f.a());
    }

    private C3710l a(C3855qda qda, v vVar) {
        String a2 = a().a();
        C7471uYa.a((Object) a2, "screen().get()");
        return C5672bua.a(qda, a2, vVar, p.SELF, null, 8, null);
    }

    /* access modifiers changed from: private */
    public P a(C1995DP dp, int i, C0132a aVar, Map<C3508cda, ? extends C6185ma> map, int i2, int i3, C3508cda cda) {
        C6185ma maVar = (C6185ma) map.get(dp.a().w());
        if (maVar != null) {
            return a(maVar, aVar, i2, i3, i, cda);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public P a(C3338wP wPVar, int i, Map<C3508cda, ? extends C3863rda> map, SearchQuerySourceInfo searchQuerySourceInfo, int i2, C3508cda cda) {
        C3863rda rda = (C3863rda) map.get(wPVar.f().a());
        if (rda != null) {
            return a(rda, searchQuerySourceInfo, i, i2, cda);
        }
        return null;
    }

    /* access modifiers changed from: private */
    public List<P> a(List<? extends P> list, int i, boolean z, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        if (!list.isEmpty()) {
            list = C7676xWa.c(list);
            list.add(0, new P.a(i));
            list.add(1, new c(i));
            if (z) {
                list.add(new f(a(i, cda, searchQuerySourceInfo), i));
            }
        }
        return list;
    }

    private C4621nja a(int i, C3508cda cda, SearchQuerySourceInfo searchQuerySourceInfo) {
        String str = "NavigationTarget.forProf…e(searchQuerySourceInfo))";
        switch (i) {
            case 1:
                C4621nja h = C4621nja.h(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) h, str);
                return h;
            case 2:
                C4621nja c2 = C4621nja.c(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) c2, str);
                return c2;
            case 3:
                C4621nja e2 = C4621nja.e(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) e2, str);
                return e2;
            case 4:
                C4621nja f2 = C4621nja.f(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) f2, str);
                return f2;
            case 5:
                C4621nja d2 = C4621nja.d(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) d2, str);
                return d2;
            case 6:
                C4621nja g2 = C4621nja.g(cda, C4928GKa.b(searchQuerySourceInfo));
                C7471uYa.a((Object) g2, str);
                return g2;
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown collection type : ");
                sb.append(i);
                throw new IllegalArgumentException(sb.toString());
        }
    }

    private e a(C6185ma maVar, C0132a aVar, int i, int i2, int i3, C3508cda cda) {
        Db.a a2 = aVar.a(i2 + i);
        v a3 = Rd.a(i3, i);
        C7471uYa.a((Object) a3, "fromModule(\n            …ionInModule\n            )");
        e eVar = new e(maVar, a2, i3, a3, !C7471uYa.a((Object) maVar.i(), (Object) cda));
        return eVar;
    }

    private d a(C3863rda rda, SearchQuerySourceInfo searchQuerySourceInfo, int i, int i2, C3508cda cda) {
        v a2 = Rd.a(i, i2);
        C3508cda a3 = rda.a();
        Yca a4 = a();
        C4928GKa b2 = C4928GKa.b(searchQuerySourceInfo);
        C4928GKa a5 = C4928GKa.a();
        K.f fVar = K.a;
        C3508cda a6 = rda.a();
        C7471uYa.a((Object) a6, "playlistItem.urn");
        if (rda instanceof C3855qda) {
            C7471uYa.a((Object) a2, "module");
            C4621nja a7 = C4621nja.a(a3, a4, b2, a5, C4928GKa.c(fVar.e(a6, a((C3855qda) rda, a2))));
            C7471uYa.a((Object) a7, "NavigationTarget.forPlay…          )\n            )");
            d dVar = new d(rda, a7, i, a2, !C7471uYa.a((Object) rda.i(), (Object) cda));
            return dVar;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Input ");
        sb.append(rda);
        sb.append(" not of type ");
        sb.append(C3855qda.class.getSimpleName());
        throw new IllegalArgumentException(sb.toString());
    }
}
