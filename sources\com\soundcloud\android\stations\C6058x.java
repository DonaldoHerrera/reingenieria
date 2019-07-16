package com.soundcloud.android.stations;

import com.soundcloud.android.tracks.C6185ma;

/* renamed from: com.soundcloud.android.stations.x reason: case insensitive filesystem */
/* compiled from: AutoValue_StationInfoTrack */
final class C6058x extends C6040qb {
    private final C6185ma a;

    C6058x(C6185ma maVar) {
        if (maVar != null) {
            this.a = maVar;
            return;
        }
        throw new NullPointerException("Null track");
    }

    public C6185ma c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6040qb)) {
            return false;
        }
        return this.a.equals(((C6040qb) obj).c());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("StationInfoTrack{track=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
