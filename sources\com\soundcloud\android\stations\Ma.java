package com.soundcloud.android.stations;

@EVa(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fJ\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/soundcloud/android/stations/StationInfoAdapter;", "Lcom/soundcloud/android/uniflow/android/UniflowAdapter;", "Lcom/soundcloud/android/stations/StationInfoItem;", "headerRenderer", "Lcom/soundcloud/android/stations/StationInfoHeaderRenderer;", "trackBucketRenderer", "Lcom/soundcloud/android/stations/StationInfoTracksBucketRenderer;", "(Lcom/soundcloud/android/stations/StationInfoHeaderRenderer;Lcom/soundcloud/android/stations/StationInfoTracksBucketRenderer;)V", "getBasicItemViewType", "", "position", "playStationClick", "Lio/reactivex/Observable;", "", "toggleLikeClick", "Lcom/soundcloud/android/stations/StationInfoPageClickParams$LikeStationClickParams;", "trackClick", "Factory", "base_release"}, mv = {1, 1, 15})
/* compiled from: StationInfoAdapter.kt */
public final class Ma extends C5407WEa<Za> {
    private final Xa g;
    private final C6045sb h;

    /* compiled from: StationInfoAdapter.kt */
    public static final class a {
        private final Xa a;
        private final C6045sb b;

        public a(Xa xa, C6045sb sbVar) {
            C7471uYa.b(xa, "stationInfoHeaderRenderer");
            C7471uYa.b(sbVar, "stationInfoTracksBucketRenderer");
            this.a = xa;
            this.b = sbVar;
        }

        public final Ma a() {
            return new Ma(this.a, this.b);
        }
    }

    public Ma(Xa xa, C6045sb sbVar) {
        C7471uYa.b(xa, "headerRenderer");
        C7471uYa.b(sbVar, "trackBucketRenderer");
        super((C5693cFa<? extends T>[]) new C5693cFa[]{new C5693cFa(com.soundcloud.android.stations.Za.a.STATION_HEADER.ordinal(), xa), new C5693cFa(com.soundcloud.android.stations.Za.a.STATION_TRACKS_BUCKET.ordinal(), sbVar)});
        this.g = xa;
        this.h = sbVar;
    }

    public int f(int i) {
        return ((Za) g(i)).f().ordinal();
    }

    public final APa<RVa> j() {
        C6781kVa<RVa> kva = this.g.a;
        C7471uYa.a((Object) kva, "headerRenderer.playClicked");
        return kva;
    }

    public final APa<com.soundcloud.android.stations._a.a> k() {
        C6781kVa<com.soundcloud.android.stations._a.a> kva = this.g.b;
        C7471uYa.a((Object) kva, "headerRenderer.toggleLikeClicked");
        return kva;
    }

    public final APa<Integer> l() {
        APa<Integer> a2 = this.h.a();
        C7471uYa.a((Object) a2, "trackBucketRenderer.trackClick()");
        return a2;
    }
}
