package com.soundcloud.android.collection.recentlyplayed;

import com.google.common.base.Function;
import com.soundcloud.android.collection.playhistory.ua;
import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.ia;
import com.soundcloud.android.sync.na;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@EVa(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 82\u00020\u0001:\u00018BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0016J\u001e\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00182\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0012J:\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020#0\"H\u0012Jf\u0010$\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020&0\u001e2>\u0010'\u001a:\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020#0\"\u0012\u0014\u0012\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d0(j\u0002`)H\u0012J:\u0010*\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020#0\"H\u0012J:\u0010+\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001e2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020#0\"H\u0012J\u001e\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001e0\u001d2\b\b\u0002\u0010-\u001a\u00020.H\u0017J\u001c\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001e0\u001d2\u0006\u0010-\u001a\u00020.H\u0012J\u001e\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u001e0\u001d2\b\b\u0002\u0010-\u001a\u00020.H\u0017J&\u00101\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00180\u001ej\u0002`\u001f0\u001d2\f\u00102\u001a\b\u0012\u0004\u0012\u00020&0\u001eH\u0016J\u0014\u00103\u001a\u00020\u0018*\u0002042\u0006\u00105\u001a\u00020#H\u0012J\u0014\u00103\u001a\u00020\u0018*\u0002062\u0006\u00105\u001a\u00020#H\u0012J\u0014\u00103\u001a\u00020\u0018*\u0002072\u0006\u00105\u001a\u00020#H\u0012R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u00069"}, d2 = {"Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedOperations;", "", "recentlyPlayedStorage", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedStorage;", "scheduler", "Lio/reactivex/Scheduler;", "syncOperations", "Lcom/soundcloud/android/sync/SyncOperations;", "clearRecentlyPlayedCommand", "Lcom/soundcloud/android/collection/recentlyplayed/ClearRecentlyPlayedCommand;", "userRepository", "Lcom/soundcloud/android/users/UserItemRepository;", "playlistRepository", "Lcom/soundcloud/android/playlists/PlaylistItemRepository;", "stationsRepository", "Lcom/soundcloud/android/foundation/domain/stations/StationsRepository;", "sessionProvider", "Lcom/soundcloud/android/foundation/accounts/SessionProvider;", "(Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedStorage;Lio/reactivex/Scheduler;Lcom/soundcloud/android/sync/SyncOperations;Lcom/soundcloud/android/collection/recentlyplayed/ClearRecentlyPlayedCommand;Lcom/soundcloud/android/users/UserItemRepository;Lcom/soundcloud/android/playlists/PlaylistItemRepository;Lcom/soundcloud/android/foundation/domain/stations/StationsRepository;Lcom/soundcloud/android/foundation/accounts/SessionProvider;)V", "clearHistory", "Lio/reactivex/Single;", "", "isPublicOrOwnedPrivatePlaylist", "recentlyPlayedPlaylist", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlayableItem;", "loggedInUserUrn", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/foundation/domain/Urn;", "loadArtists", "Lio/reactivex/Observable;", "", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlayableItems;", "urns", "timestamps", "", "", "loadIfNotEmpty", "items", "Lcom/soundcloud/android/collection/playhistory/PlayHistoryRecord;", "loader", "Lkotlin/Function2;", "Lcom/soundcloud/android/collection/recentlyplayed/RecentlyPlayedPlayableItemsLoader;", "loadPlaylists", "loadStations", "recentlyPlayed", "limit", "", "recentlyPlayedItems", "refreshRecentlyPlayed", "resolveRecentlyPlayedMetadata", "playHistoryRecords", "toRecentlyPlayedPlayableItem", "Lcom/soundcloud/android/foundation/domain/playable/PlaylistItem;", "timestamp", "Lcom/soundcloud/android/foundation/domain/stations/StationMetadata;", "Lcom/soundcloud/android/users/UserItem;", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: RecentlyPlayedOperations.kt */
public class J {
    public static final a a = new a(null);
    private final Ga b;
    private final HPa c;
    private final ca d;
    private final C2805d e;
    private final C5141NFa f;
    private final C4785Bra g;
    private final Vda h;
    private final Ica i;

    /* compiled from: RecentlyPlayedOperations.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public J(Ga ga, HPa hPa, ca caVar, C2805d dVar, C5141NFa nFa, C4785Bra bra, Vda vda, Ica ica) {
        C7471uYa.b(ga, "recentlyPlayedStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(dVar, "clearRecentlyPlayedCommand");
        C7471uYa.b(nFa, "userRepository");
        C7471uYa.b(bra, "playlistRepository");
        C7471uYa.b(vda, "stationsRepository");
        C7471uYa.b(ica, "sessionProvider");
        this.b = ga;
        this.c = hPa;
        this.d = caVar;
        this.e = dVar;
        this.f = nFa;
        this.g = bra;
        this.h = vda;
        this.i = ica;
    }

    /* access modifiers changed from: private */
    public APa<List<C2804ca>> c(int i2) {
        APa<List<C2804ca>> c2 = this.b.b(i2).c((C7118pQa<? super T, ? extends EPa<? extends R>>) new Q<Object,Object>(this));
        C7471uYa.a((Object) c2, "recentlyPlayedStorage.lo…entlyPlayedMetadata(it) }");
        return c2;
    }

    public APa<List<C2804ca>> b(int i2) {
        APa<List<C2804ca>> d2 = this.d.a(na.RECENTLY_PLAYED).a(this.c).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new S<Object,Object>(this, i2));
        C7471uYa.a((Object) d2, "syncOperations.failSafeS…entlyPlayedItems(limit) }");
        return d2;
    }

    /* access modifiers changed from: private */
    public APa<List<C2804ca>> c(List<C3508cda> list, Map<C3508cda, Long> map) {
        APa<List<C2804ca>> j = this.h.b(list).e(new O(this, map)).j();
        C7471uYa.a((Object) j, "stationsRepository.stati….urn)) } }.toObservable()");
        return j;
    }

    /* access modifiers changed from: private */
    public APa<List<C2804ca>> b(List<C3508cda> list, Map<C3508cda, Long> map) {
        APa<List<C2804ca>> h2 = this.g.a((Collection<C3508cda>) list, true).h(new N(this, list, map));
        C7471uYa.a((Object) h2, "playlistRepository.liveU…urn)) }\n                }");
        return h2;
    }

    public APa<List<C2804ca>> a(int i2) {
        APa<List<C2804ca>> d2 = this.d.b(na.RECENTLY_PLAYED).a(this.c).a(IPa.a(ia.c())).d((C7118pQa<? super T, ? extends EPa<? extends R>>) new P<Object,Object>(this, i2));
        C7471uYa.a((Object) d2, "syncOperations.lazySyncI…entlyPlayedItems(limit) }");
        return d2;
    }

    public IPa<Boolean> a() {
        IPa<Boolean> b2 = this.e.c().b(this.c);
        C7471uYa.a((Object) b2, "clearRecentlyPlayedComma…().subscribeOn(scheduler)");
        return b2;
    }

    /* access modifiers changed from: private */
    public boolean a(C2804ca caVar, C4928GKa<C3508cda> gKa) {
        boolean z = !caVar.n();
        C3508cda cda = (C3508cda) caVar.g().b();
        if (z) {
            return true;
        }
        Object d2 = gKa.b((Function<? super T, V>) new K<Object,V>(cda)).d(Boolean.valueOf(false));
        C7471uYa.a(d2, "loggedInUserUrn.transfor…torUrn == urn }.or(false)");
        if (((Boolean) d2).booleanValue()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    public APa<List<C2804ca>> a(List<C3508cda> list, Map<C3508cda, Long> map) {
        APa<List<C2804ca>> h2 = this.f.a((Iterable<C3508cda>) list).h(new L(this, list, map));
        C7471uYa.a((Object) h2, "userRepository.liveUserI…urn)) }\n                }");
        return h2;
    }

    private APa<List<C2804ca>> a(List<? extends ua> list, C6308dYa<? super List<C3508cda>, ? super Map<C3508cda, Long>, ? extends APa<List<C2804ca>>> dya) {
        if (!list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(C7265rZa.a(LWa.a(C6986nWa.a((Iterable) list, 10)), 16));
            for (ua uaVar : list) {
                linkedHashMap.put(uaVar.b(), Long.valueOf(uaVar.h()));
            }
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable) list, 10));
            for (ua b2 : list) {
                arrayList.add(b2.b());
            }
            APa<List<C2804ca>> d2 = ((APa) dya.invoke(arrayList, linkedHashMap)).c((C6776kQa<? super Throwable>) M.a).d(C6918mWa.a());
            C7471uYa.a((Object) d2, "loader(urns, timestamps)…orReturnItem(emptyList())");
            return d2;
        }
        APa<List<C2804ca>> c2 = APa.c(C6918mWa.a());
        C7471uYa.a((Object) c2, "Observable.just(emptyList())");
        return c2;
    }

    /* access modifiers changed from: private */
    public C2804ca a(C3863rda rda, long j) {
        com.soundcloud.android.collection.recentlyplayed.C2804ca.a aVar = C2804ca.b;
        C3508cda a2 = rda.a();
        C7471uYa.a((Object) a2, "urn");
        C3508cda e2 = rda.e();
        C7471uYa.a((Object) e2, "creatorUrn()");
        C4928GKa b2 = rda.b();
        C7471uYa.a((Object) b2, "imageUrlTemplate");
        String B = rda.B();
        C7471uYa.a((Object) B, "title()");
        return aVar.a(a2, e2, b2, B, rda.L(), rda.F(), rda.r(), rda.o() | false, rda.m(), j);
    }

    /* access modifiers changed from: private */
    public C2804ca a(C4954HFa hFa, long j) {
        return C2804ca.b.a(hFa.a(), hFa.f(), hFa.b(), j, hFa.e());
    }

    /* access modifiers changed from: private */
    public C2804ca a(Rda rda, long j) {
        com.soundcloud.android.collection.recentlyplayed.C2804ca.a aVar = C2804ca.b;
        C3508cda c2 = rda.c();
        String b2 = rda.b();
        C4928GKa b3 = C4928GKa.b(rda.a());
        C7471uYa.a((Object) b3, "Optional.fromNullable(imageUrlTemplate)");
        return aVar.a(c2, b2, b3, j);
    }

    public APa<List<C2804ca>> a(List<? extends ua> list) {
        C7471uYa.b(list, "playHistoryRecords");
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (((ua) next).f()) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : list) {
            if (((ua) next2).d()) {
                arrayList2.add(next2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object next3 : list) {
            ua uaVar = (ua) next3;
            if (uaVar.g() || uaVar.e()) {
                arrayList3.add(next3);
            }
        }
        APa a2 = a((List<? extends ua>) arrayList, (C6308dYa<? super List<C3508cda>, ? super Map<C3508cda, Long>, ? extends APa<List<C2804ca>>>) new W<Object,Object,Object>(this)).a((EPa<? extends U>) this.i.c().f(X.a).g(), (C6504gQa<? super T, ? super U, ? extends R>) new Y<Object,Object,Object>(this));
        C7471uYa.a((Object) a2, "loadIfNotEmpty(recentlyP…nal) }\n                })");
        APa<List<C2804ca>> a3 = APa.a((EPa<? extends T1>) a2, (EPa<? extends T2>) a((List<? extends ua>) arrayList2, (C6308dYa<? super List<C3508cda>, ? super Map<C3508cda, Long>, ? extends APa<List<C2804ca>>>) new V<Object,Object,Object>(this)), (EPa<? extends T3>) a((List<? extends ua>) arrayList3, (C6308dYa<? super List<C3508cda>, ? super Map<C3508cda, Long>, ? extends APa<List<C2804ca>>>) new Z<Object,Object,Object>(this)), (C6844lQa<? super T1, ? super T2, ? super T3, ? extends R>) U.a);
        C7471uYa.a((Object) a3, "Observable.combineLatest…amp }.toList()\n        })");
        return a3;
    }
}
