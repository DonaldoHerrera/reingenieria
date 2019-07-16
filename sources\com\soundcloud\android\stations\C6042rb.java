package com.soundcloud.android.stations;

import java.util.ArrayList;
import java.util.List;

@EVa(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/soundcloud/android/stations/StationInfoTracksBucket;", "Lcom/soundcloud/android/stations/StationInfoItem;", "stationTracks", "", "Lcom/soundcloud/android/stations/StationInfoTrack;", "lastPlayedPosition", "", "(Ljava/util/List;I)V", "getLastPlayedPosition", "()I", "getStationTracks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* renamed from: com.soundcloud.android.stations.rb reason: case insensitive filesystem */
/* compiled from: StationInfoTracksBucket.kt */
public final class C6042rb extends Za {
    public static final a b = new a(null);
    private final List<C6040qb> c;
    private final int d;

    /* renamed from: com.soundcloud.android.stations.rb$a */
    /* compiled from: StationInfoTracksBucket.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final C6042rb a(Pb pb, C3508cda cda) {
            C7471uYa.b(pb, "stationWithTracks");
            List<C6040qb> d = pb.d();
            C7471uYa.a((Object) d, "stationWithTracks.stationInfoTracks");
            ArrayList arrayList = new ArrayList(C6986nWa.a((Iterable<? extends T>) d, 10));
            for (C6040qb qbVar : d) {
                C7471uYa.a((Object) qbVar, "it");
                arrayList.add(C6040qb.a(qbVar.c().a(C7471uYa.a((Object) cda, (Object) qbVar.a()))));
            }
            return new C6042rb(arrayList, pb.c());
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public C6042rb(List<? extends C6040qb> list, int i) {
        C7471uYa.b(list, "stationTracks");
        super(com.soundcloud.android.stations.Za.a.STATION_TRACKS_BUCKET);
        this.c = list;
        this.d = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6042rb) {
                C6042rb rbVar = (C6042rb) obj;
                if (C7471uYa.a((Object) this.c, (Object) rbVar.c)) {
                    if (this.d == rbVar.d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int g() {
        return this.d;
    }

    public final List<C6040qb> h() {
        return this.c;
    }

    public int hashCode() {
        List<C6040qb> list = this.c;
        return ((list != null ? list.hashCode() : 0) * 31) + this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationInfoTracksBucket(stationTracks=");
        sb.append(this.c);
        sb.append(", lastPlayedPosition=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
