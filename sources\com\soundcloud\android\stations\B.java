package com.soundcloud.android.stations;

import android.database.Cursor;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

@EVa(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 G2\u00020\u0001:\u0001GB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00150\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u0014\u001a\u00020\u0019H\u0016J$\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00180\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u001bH\u0016J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\"\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00180\u00172\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0016J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00180(2\u0006\u0010\u0014\u001a\u00020\u0015H\u0012J\u0016\u0010)\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u0018H\u0012J\u001f\u0010+\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00152\b\u0010-\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0002\u0010.J$\u0010/\u001a\u00020\u00112\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00150\u00182\f\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0018H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00190(2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0016\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0(2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u00103\u001a\u0002042\u0006\u0010\u0014\u001a\u00020\u0019H\u0016J\u0016\u00105\u001a\u00020\u00112\f\u00106\u001a\b\u0012\u0004\u0012\u0002010\u0018H\u0016J\u0018\u00107\u001a\u00020\u00132\u0006\u0010,\u001a\u00020\u00152\u0006\u00108\u001a\u000204H\u0016J\u0016\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150(2\u0006\u0010:\u001a\u00020;H\u0016J0\u0010<\u001a&\u0012\f\u0012\n >*\u0004\u0018\u00010;0; >*\u0012\u0012\f\u0012\n >*\u0004\u0018\u00010;0;\u0018\u00010=0=*\u00020?H\u0012J\f\u0010@\u001a\u000204*\u00020?H\u0012J\f\u0010A\u001a\u00020\u001b*\u00020?H\u0012J0\u0010:\u001a&\u0012\f\u0012\n >*\u0004\u0018\u00010;0; >*\u0012\u0012\f\u0012\n >*\u0004\u0018\u00010;0;\u0018\u00010=0=*\u00020?H\u0012J\f\u0010B\u001a\u00020\u0015*\u00020?H\u0012J\u0014\u0010C\u001a\n >*\u0004\u0018\u00010;0;*\u00020?H\u0012J\f\u0010D\u001a\u00020\u0015*\u00020?H\u0012J\u0014\u0010E\u001a\n >*\u0004\u0018\u00010;0;*\u00020?H\u0012J\f\u0010F\u001a\u00020\u0015*\u00020?H\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\bX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006H"}, d2 = {"Lcom/soundcloud/android/stations/BriteStationStorage;", "Lcom/soundcloud/android/stations/StationsStorage;", "stationDatabase", "Lcom/soundcloud/android/stations/StationDatabase;", "dateProvider", "Lcom/soundcloud/android/utilities/android/date/DateProvider;", "(Lcom/soundcloud/android/stations/StationDatabase;Lcom/soundcloud/android/utilities/android/date/DateProvider;)V", "stationMapper", "Lcom/squareup/sqldelight/prerelease/RowMapper;", "Lcom/soundcloud/android/foundation/domain/stations/Station;", "stationMetadataMapper", "Lcom/soundcloud/android/foundation/domain/stations/StationMetadata;", "stationTrackMapper", "Lcom/soundcloud/android/foundation/domain/stations/StationTrack;", "stationWithTrackUrnsMapper", "Lcom/soundcloud/android/foundation/domain/stations/StationWithTrackUrns;", "clear", "", "clearExpiredPlayQueue", "Lio/reactivex/Completable;", "station", "Lcom/soundcloud/android/foundation/domain/Urn;", "getStationsCollection", "Lio/reactivex/Single;", "", "Lcom/soundcloud/android/foundation/domain/stations/StationRecord;", "collectionType", "", "loadAllStationsTracks", "", "loadLocalLikedStations", "loadLocalUnlikedStations", "loadPlayQueueSize", "", "loadStationPlayQueue", "startPosition", "loadStationUrns", "loadStationsMetadata", "stations", "loadTrackUrns", "Lio/reactivex/Maybe;", "overwriteLikedStations", "remoteLikedStations", "saveLastPlayedTrackPosition", "stationUrn", "position", "(Lcom/soundcloud/android/foundation/domain/Urn;Ljava/lang/Integer;)V", "setLikedStationsAndAddNewMetaData", "newStationsMetadata", "Lcom/soundcloud/android/stations/ApiStationMetadata;", "stationWithTrackUrns", "storeStation", "", "storeStationsMetadata", "apiStationMetadata", "updateLocalStationLike", "liked", "urnForPermalink", "permalink", "", "imageUrlTemplate", "Lcom/soundcloud/java/optional/Optional;", "kotlin.jvm.PlatformType", "Landroid/database/Cursor;", "inCollection", "lastPosition", "queryUrn", "title", "trackUrn", "type", "urn", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: BriteStationStorage.kt */
public class B implements kc {
    /* access modifiers changed from: private */
    public static final long a = TimeUnit.HOURS.toMillis(24);
    public static final a b = new a(null);
    private final C6772kMa<Tda> c = new K(this);
    private final C6772kMa<Uda> d = new M(this);
    private final C6772kMa<Rda> e = new J(this);
    private final C6772kMa<Qda> f = new I(this);
    /* access modifiers changed from: private */
    public final Ia g;
    /* access modifiers changed from: private */
    public final C5694cGa h;

    /* compiled from: BriteStationStorage.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public B(Ia ia, C5694cGa cga) {
        C7471uYa.b(ia, "stationDatabase");
        C7471uYa.b(cga, "dateProvider");
        this.g = ia;
        this.h = cga;
    }

    public void clear() {
        new b(this.g.a()).execute();
        new b(this.g.a()).execute();
        new b(this.g.a()).execute();
    }

    /* access modifiers changed from: private */
    public void c(List<C3508cda> list) {
        this.g.a((PXa<RVa>) new F<RVa>(this, list));
    }

    /* access modifiers changed from: private */
    public String f(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex("title"));
    }

    /* access modifiers changed from: private */
    public C3508cda g(Cursor cursor) {
        return new C3508cda(cursor.getString(cursor.getColumnIndex("track_urn")));
    }

    /* access modifiers changed from: private */
    public String h(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndex(C1325gg.TYPE));
    }

    /* access modifiers changed from: private */
    public C3508cda i(Cursor cursor) {
        return new C3508cda(cursor.getString(cursor.getColumnIndex("urn")));
    }

    public Set<C3508cda> e() {
        Ia ia = this.g;
        C6840lMa b2 = c.b.b();
        C7471uYa.a((Object) b2, "StationsDbModel.StationP…e.FACTORY.loadTrackUrns()");
        C6772kMa c2 = c.b.c();
        C7471uYa.a((Object) c2, "StationsDbModel.StationP…ORY.loadTrackUrnsMapper()");
        return C7676xWa.t(ia.c((Xd) b2, c2));
    }

    private C7531vPa<List<C3508cda>> d(C3508cda cda) {
        Ia ia = this.g;
        C6840lMa b2 = c.b.b(cda);
        C7471uYa.a((Object) b2, "StationsDbModel.StationP…ckUrnsForStation(station)");
        C6772kMa c2 = c.b.c();
        C7471uYa.a((Object) c2, "StationsDbModel.StationP…ORY.loadTrackUrnsMapper()");
        C7531vPa<List<C3508cda>> i = ia.a((Xd) b2, c2).i();
        C7471uYa.a((Object) i, "stationDatabase.executeA…ckUrnsMapper()).toMaybe()");
        return i;
    }

    /* access modifiers changed from: private */
    public C3508cda e(Cursor cursor) {
        return new C3508cda(cursor.getString(cursor.getColumnIndex("query_urn")));
    }

    public long b(Sda sda) {
        C7471uYa.b(sda, "station");
        Ia ia = this.g;
        C6840lMa a2 = c.b.a(sda.a());
        C7471uYa.a((Object) a2, "StationsDbModel.StationP…layQueueSize(station.urn)");
        C6772kMa a3 = c.b.a();
        C7471uYa.a((Object) a3, "StationsDbModel.StationP…loadPlayQueueSizeMapper()");
        Object f2 = C7676xWa.f(ia.c((Xd) a2, a3));
        C7471uYa.a(f2, "stationDatabase.executeQ…ueueSizeMapper()).first()");
        return ((Number) f2).longValue();
    }

    public C7531vPa<Uda> c(C3508cda cda) {
        C7471uYa.b(cda, "station");
        Ia ia = this.g;
        C6840lMa a2 = a.b.a(b.b, (long) 7, cda, cda);
        C7471uYa.a((Object) a2, "FACTORY.loadStationMetad…Long(), station, station)");
        C7531vPa<Uda> a3 = ia.b((Xd) a2, this.d).a((C7669xPa<? extends U>) d(cda), (C6504gQa<? super T, ? super U, ? extends R>) L.a);
        C7471uYa.a((Object) a3, "stationWithLike.zipWith(…s = trackList)\n        })");
        return a3;
    }

    /* access modifiers changed from: private */
    public C4928GKa<String> d(Cursor cursor) {
        return C4928GKa.b(cursor.getString(cursor.getColumnIndex("permalink")));
    }

    public boolean a(Sda sda) {
        C7471uYa.b(sda, "station");
        this.g.a((PXa<RVa>) new N<RVa>(this, sda));
        return true;
    }

    public void a(List<C6043s> list) {
        C7471uYa.b(list, "apiStationMetadata");
        this.g.a((PXa<RVa>) new O<RVa>(this, list));
    }

    public C7531vPa<C3508cda> a(String str) {
        C7471uYa.b(str, "permalink");
        if (str.charAt(0) != '/') {
            String b2 = new C7162pxb("stations/").b(str, "");
            Ia ia = this.g;
            C6840lMa a2 = a.b.a(b2);
            C7471uYa.a((Object) a2, "FACTORY.stationForPermalink(normalizedPermalink)");
            C6772kMa c2 = a.b.c();
            C7471uYa.a((Object) c2, "FACTORY.stationForPermalinkMapper()");
            return ia.b((Xd) a2, c2);
        }
        throw new C6021ka("Permalink must not start with a '/' and must not be a url.");
    }

    public IPa<List<Rda>> b(List<C3508cda> list) {
        C7471uYa.b(list, "stations");
        Ia ia = this.g;
        d<a> dVar = a.b;
        Object[] array = list.toArray(new C3508cda[0]);
        if (array != null) {
            C6840lMa a2 = dVar.a((C3508cda[]) array);
            C7471uYa.a((Object) a2, "FACTORY.loadStationMetad…(stations.toTypedArray())");
            return ia.a((Xd) a2, this.e);
        }
        throw new OVa("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public List<C3508cda> c() {
        Ia ia = this.g;
        C6840lMa a2 = a.b.a();
        C7471uYa.a((Object) a2, "StationsDbModel.Station.FACTORY.loadStationUrns()");
        C6772kMa b2 = a.b.b();
        C7471uYa.a((Object) b2, "StationsDbModel.Station.…Y.loadStationUrnsMapper()");
        return ia.c((Xd) a2, b2);
    }

    public C6979nPa a(C3508cda cda, boolean z) {
        C7471uYa.b(cda, "stationUrn");
        C6979nPa a2 = C6979nPa.a((Callable<?>) new P<Object>(this, cda, z));
        C7471uYa.a((Object) a2, "Completable.fromCallable…executeInsert()\n        }");
        return a2;
    }

    public void a(C3508cda cda, Integer num) {
        C7471uYa.b(cda, "stationUrn");
        j jVar = new j(this.g.a(), a.b);
        jVar.a(num != null ? Long.valueOf((long) num.intValue()) : null, cda);
        jVar.v();
    }

    public List<C3508cda> b() {
        Ia ia = this.g;
        C6840lMa b2 = b.b.b((long) 7);
        C7471uYa.a((Object) b2, "StationsDbModel.StationC…ionsTypes.LIKED.toLong())");
        C6772kMa b3 = b.b.b();
        C7471uYa.a((Object) b3, "StationsDbModel.StationC…ectionStationUrnsMapper()");
        return ia.c((Xd) b2, b3);
    }

    /* access modifiers changed from: private */
    public int c(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex("last_played_track_position");
        Integer valueOf = cursor.isNull(columnIndex) ? null : Integer.valueOf(cursor.getInt(columnIndex));
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return -1;
    }

    public List<C3508cda> a() {
        Ia ia = this.g;
        C6840lMa a2 = b.b.a((long) 7);
        C7471uYa.a((Object) a2, "StationsDbModel.StationC…ionsTypes.LIKED.toLong())");
        C6772kMa a3 = b.b.a();
        C7471uYa.a((Object) a3, "StationsDbModel.StationC…ectionStationUrnsMapper()");
        return ia.c((Xd) a2, a3);
    }

    public C6979nPa b(C3508cda cda) {
        C7471uYa.b(cda, "station");
        return this.g.b(new C(this, cda));
    }

    /* access modifiers changed from: private */
    public boolean b(Cursor cursor) {
        return cursor.getInt(cursor.getColumnIndex("in_collection")) == 1;
    }

    public void a(List<C3508cda> list, List<C6043s> list2) {
        C7471uYa.b(list, "remoteLikedStations");
        C7471uYa.b(list2, "newStationsMetadata");
        this.g.a((PXa<RVa>) new G<RVa>(this, list2, list));
    }

    public C7531vPa<Sda> a(C3508cda cda) {
        C7471uYa.b(cda, "station");
        Ia ia = this.g;
        C6840lMa a2 = a.b.a(new C3508cda[]{cda});
        C7471uYa.a((Object) a2, "FACTORY.loadStationMetadata(arrayOf(station))");
        C7531vPa b2 = ia.b((Xd) a2, this.f);
        Ia ia2 = this.g;
        C6840lMa a3 = c.b.a(cda, Long.valueOf(-1));
        C7471uYa.a((Object) a3, "StationsDbModel.StationP…tation, Consts.NOT_SET_L)");
        C7531vPa i = ia2.a((Xd) a3, this.c).i();
        C7471uYa.a((Object) i, "stationDatabase.executeA…ionTrackMapper).toMaybe()");
        C7531vPa<Sda> a4 = b2.a((C7669xPa<? extends U>) i, (C6504gQa<? super T, ? super U, ? extends R>) H.a);
        C7471uYa.a((Object) a4, "stationMetadata.zipWith(…ta, trackList)\n        })");
        return a4;
    }

    public IPa<List<Tda>> a(C3508cda cda, int i) {
        C7471uYa.b(cda, "station");
        Ia ia = this.g;
        C6840lMa a2 = c.b.a(cda, Long.valueOf((long) i));
        C7471uYa.a((Object) a2, "StationsDbModel.StationP…, startPosition.toLong())");
        return ia.a((Xd) a2, this.c);
    }

    public IPa<List<Sda>> a(int i) {
        Ia ia = this.g;
        C6840lMa c2 = b.b.c((long) i);
        C7471uYa.a((Object) c2, "StationsDbModel.StationC…(collectionType.toLong())");
        C6772kMa c3 = b.b.c();
        C7471uYa.a((Object) c3, "StationsDbModel.StationC…UrnsForCollectionMapper()");
        IPa<List<Sda>> r = ia.a((Xd) c2, c3).d((C7118pQa<? super T, ? extends EPa<? extends R>>) D.a).f((C7118pQa<? super T, ? extends C7669xPa<? extends R>>) new E<Object,Object>(this)).r();
        C7471uYa.a((Object) r, "stationDatabase.executeA…                .toList()");
        return r;
    }

    /* access modifiers changed from: private */
    public C4928GKa<String> a(Cursor cursor) {
        return C4928GKa.b(cursor.getString(cursor.getColumnIndex("artwork_url_template")));
    }
}
