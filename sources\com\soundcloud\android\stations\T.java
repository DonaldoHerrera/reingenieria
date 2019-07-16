package com.soundcloud.android.stations;

import com.soundcloud.android.sync.ca;
import com.soundcloud.android.sync.la;
import com.soundcloud.android.sync.na;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 B2\u00020\u0001:\u0001BBI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u001c\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0014\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aH\u0016J$\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001eH\u0016J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0012J\u0018\u0010$\u001a\u00020\u00142\u0006\u0010%\u001a\u00020\u00182\u0006\u0010&\u001a\u00020\u001eH\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u001c0'2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0)H\u0016J*\u0010*\u001a\b\u0012\u0004\u0012\u00020+0'2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0)H\u0016J\"\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001b0\u001a2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0016J\u0010\u0010/\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u001cH\u0012J\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u000203H\u0012J\u001c\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0012J0\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0\u001b0\u001a2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\f\u00107\u001a\b\u0012\u0004\u0012\u00020-0\u001bH\u0012J*\u00108\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001a2\u0006\u0010\u0017\u001a\u00020\u00182\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c0)H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0016\u0010;\u001a\u00020\u00162\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00180\u001bH\u0016J\u0010\u0010<\u001a\u00020=2\u0006\u0010\u001d\u001a\u00020\u001eH\u0012J\u0018\u0010>\u001a\u00020\u00162\u0006\u0010?\u001a\u00020\u00182\u0006\u0010@\u001a\u00020:H\u0016J\u0014\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\u001b0\u001aH\u0016R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lcom/soundcloud/android/stations/DefaultStationsRepository;", "Lcom/soundcloud/android/foundation/domain/stations/StationsRepository;", "stationsStorage", "Lcom/soundcloud/android/stations/StationsStorage;", "scheduler", "Lio/reactivex/Scheduler;", "stationsApi", "Lcom/soundcloud/android/stations/StationsApi;", "trackWriter", "Lcom/soundcloud/android/foundation/domain/tracks/TrackWriter;", "syncStateStorage", "Lcom/soundcloud/android/sync/SyncStateStorage;", "syncInitiator", "Lcom/soundcloud/android/sync/SyncInitiator;", "syncOperations", "Lcom/soundcloud/android/sync/SyncOperations;", "errorReporter", "Lcom/soundcloud/android/error/reporting/ErrorReporter;", "(Lcom/soundcloud/android/stations/StationsStorage;Lio/reactivex/Scheduler;Lcom/soundcloud/android/stations/StationsApi;Lcom/soundcloud/android/foundation/domain/tracks/TrackWriter;Lcom/soundcloud/android/sync/SyncStateStorage;Lcom/soundcloud/android/sync/SyncInitiator;Lcom/soundcloud/android/sync/SyncOperations;Lcom/soundcloud/android/error/reporting/ErrorReporter;)V", "clearData", "", "clearExpiredPlayQueue", "Lio/reactivex/Completable;", "station", "Lcom/soundcloud/android/foundation/domain/Urn;", "collection", "Lio/reactivex/Single;", "", "Lcom/soundcloud/android/foundation/domain/stations/StationRecord;", "type", "", "likedStations", "loadStationPlayQueue", "Lcom/soundcloud/android/foundation/domain/stations/StationTrack;", "startPosition", "loadStationsCollection", "saveStationLastPlayedTrackPosition", "collectionUrn", "position", "Lio/reactivex/Maybe;", "stationMapper", "Lkotlin/Function1;", "stationWithTrackUrns", "Lcom/soundcloud/android/foundation/domain/stations/StationWithTrackUrns;", "stationsMetadata", "Lcom/soundcloud/android/foundation/domain/stations/StationMetadata;", "urns", "storeStation", "stationRecord", "storeStationTracks", "apiStation", "Lcom/soundcloud/android/stations/ApiStation;", "syncAndLoadStationsCollection", "syncMissingStationsMetadata", "requested", "obtained", "syncSingleStation", "syncStations", "", "syncStationsMetadata", "typeToSyncable", "Lcom/soundcloud/android/sync/Syncable;", "updateLocalStationLike", "stationUrn", "liked", "updatedLikedStations", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: DefaultStationsRepository.kt */
public class T implements Vda {
    private static final _Xa<Sda, Sda> a = S.a;
    public static final a b = new a(null);
    /* access modifiers changed from: private */
    public final kc c;
    private final HPa d;
    /* access modifiers changed from: private */
    public final Vb e;
    private final C3768fea f;
    private final la g;
    private final com.soundcloud.android.sync.T h;
    private final ca i;
    /* access modifiers changed from: private */
    public final C3469VY j;

    /* compiled from: DefaultStationsRepository.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public T(kc kcVar, HPa hPa, Vb vb, C3768fea fea, la laVar, com.soundcloud.android.sync.T t, ca caVar, C3469VY vy) {
        C7471uYa.b(kcVar, "stationsStorage");
        C7471uYa.b(hPa, "scheduler");
        C7471uYa.b(vb, "stationsApi");
        C7471uYa.b(fea, "trackWriter");
        C7471uYa.b(laVar, "syncStateStorage");
        C7471uYa.b(t, "syncInitiator");
        C7471uYa.b(caVar, "syncOperations");
        C7471uYa.b(vy, "errorReporter");
        this.c = kcVar;
        this.d = hPa;
        this.e = vb;
        this.f = fea;
        this.g = laVar;
        this.h = t;
        this.i = caVar;
        this.j = vy;
    }

    private IPa<List<Sda>> d(int i2) {
        IPa<List<Sda>> a2 = a(i2).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5994ba<Object,Object>(this, i2));
        C7471uYa.a((Object) a2, "syncStations(type).flatM…tationsCollection(type) }");
        return a2;
    }

    private na e(int i2) {
        if (i2 == 7) {
            return na.LIKED_STATIONS;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unknown station's type: ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public C7531vPa<Sda> b(C3508cda cda, _Xa<? super Sda, ? extends Sda> _xa) {
        C7471uYa.b(cda, "station");
        C7471uYa.b(_xa, "stationMapper");
        C7531vPa<Sda> a2 = this.c.a(cda).a((C7256rQa<? super T>) X.a).a((C7669xPa<? extends T>) c(cda, _xa).i());
        C7471uYa.a((Object) a2, "stationsStorage.station(…stationMapper).toMaybe())");
        return a2;
    }

    public IPa<List<Sda>> c() {
        IPa<List<Sda>> a2 = this.i.a(na.LIKED_STATIONS).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C6015ia<Object,Object>(this));
        C7471uYa.a((Object) a2, "syncOperations.failSafeS…CollectionsTypes.LIKED) }");
        return a2;
    }

    public IPa<Sda> c(C3508cda cda, _Xa<? super Sda, ? extends Sda> _xa) {
        C7471uYa.b(cda, "station");
        C7471uYa.b(_xa, "stationMapper");
        IPa<Sda> c2 = this.e.a(cda).c((C6776kQa<? super T>) new C5997ca<Object>(this)).e(new W(_xa)).c((C6776kQa<? super T>) new C6000da<Object>(this));
        C7471uYa.a((Object) c2, "stationsApi.fetchStation…{ this.storeStation(it) }");
        return c2;
    }

    public IPa<List<Sda>> b(int i2) {
        IPa<List<Sda>> iPa;
        if (this.g.c(e(i2))) {
            iPa = c(i2);
        } else {
            iPa = d(i2);
        }
        iPa.b(this.d);
        return iPa;
    }

    public C7531vPa<Sda> a(C3508cda cda) {
        C7471uYa.b(cda, "station");
        return b(cda, a);
    }

    public C6979nPa a(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        C6979nPa e2 = IPa.c((Callable<? extends T>) new C6006fa<Object>(this, list)).c((C6776kQa<? super T>) new C6009ga<Object>(this)).a((C6776kQa<? super Throwable>) new C6012ha<Object>(this)).e();
        C7471uYa.a((Object) e2, "Single.fromCallable { st…         .ignoreElement()");
        return e2;
    }

    /* access modifiers changed from: private */
    public IPa<List<Sda>> c(int i2) {
        IPa<List<Sda>> b2 = this.c.a(i2).b(this.d);
        C7471uYa.a((Object) b2, "stationsStorage.getStati…e).subscribeOn(scheduler)");
        return b2;
    }

    public IPa<List<Sda>> b() {
        IPa<List<Sda>> a2 = this.i.b(na.LIKED_STATIONS).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new U<Object,Object>(this));
        C7471uYa.a((Object) a2, "syncOperations.lazySyncI…CollectionsTypes.LIKED) }");
        return a2;
    }

    public IPa<Boolean> a(int i2) {
        IPa<Boolean> e2 = this.h.a(e(i2)).e(C6003ea.a);
        C7471uYa.a((Object) e2, "syncInitiator.sync(typeT… .map { it.wasSuccess() }");
        return e2;
    }

    public IPa<List<Rda>> b(List<C3508cda> list) {
        C7471uYa.b(list, "urns");
        IPa<List<Rda>> a2 = this.c.b(list).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new C5991aa<Object,Object>(this, list));
        C7471uYa.a((Object) a2, "stationsStorage.loadStat…tionsMetadata(urns, it) }");
        return a2;
    }

    public IPa<List<Tda>> a(C3508cda cda, int i2) {
        C7471uYa.b(cda, "station");
        IPa<List<Tda>> a2 = c(cda, a).a((C7118pQa<? super T, ? extends MPa<? extends R>>) new V<Object,Object>(this, cda, i2));
        C7471uYa.a((Object) a2, "syncSingleStation(statio…station, startPosition) }");
        return a2;
    }

    public void b(C3508cda cda, int i2) {
        C7471uYa.b(cda, "collectionUrn");
        this.c.a(cda, Integer.valueOf(i2));
    }

    public C6979nPa b(C3508cda cda) {
        C7471uYa.b(cda, "station");
        return this.c.b(cda);
    }

    public void a() {
        this.c.clear();
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "stationUrn");
        return this.c.a(cda, z);
    }

    public C7531vPa<Uda> a(C3508cda cda, _Xa<? super Sda, ? extends Sda> _xa) {
        C7471uYa.b(cda, "station");
        C7471uYa.b(_xa, "stationMapper");
        C7531vPa<Uda> a2 = this.c.c(cda).a((C7256rQa<? super T>) Y.a).a((C7669xPa<? extends T>) c(cda, _xa).c((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new Z<Object,Object>(this, cda)));
        C7471uYa.a((Object) a2, "stationsStorage.stationW…WithTrackUrns(station) })");
        return a2;
    }

    /* access modifiers changed from: private */
    public void a(r rVar) {
        C3768fea fea = this.f;
        List f2 = rVar.f();
        C7471uYa.a((Object) f2, "apiStation.trackRecords");
        fea.a(f2);
    }

    /* access modifiers changed from: private */
    public void a(Sda sda) {
        this.c.a(sda);
    }

    /* access modifiers changed from: private */
    public IPa<List<Rda>> a(List<C3508cda> list, List<Rda> list2) {
        if (list.size() == list2.size()) {
            IPa<List<Rda>> a2 = IPa.a(list2);
            C7471uYa.a((Object) a2, "Single.just(obtained)");
            return a2;
        }
        ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) list2, 10));
        for (Rda c2 : list2) {
            arrayList.add(c2.c());
        }
        IPa<List<Rda>> b2 = a(C7676xWa.c((Iterable) list, (Iterable) arrayList)).a((MPa<T>) this.c.b(list)).b(list2);
        C7471uYa.a((Object) b2, "syncStationsMetadata(sta…ErrorReturnItem(obtained)");
        return b2;
    }
}
