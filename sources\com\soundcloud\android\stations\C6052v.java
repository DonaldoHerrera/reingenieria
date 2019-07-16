package com.soundcloud.android.stations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.v reason: case insensitive filesystem */
/* compiled from: AutoValue_LikedStationsPostBody */
final class C6052v extends C6036pa {
    private final List<C3508cda> a;
    private final List<C3508cda> b;

    C6052v(List<C3508cda> list, List<C3508cda> list2) {
        if (list != null) {
            this.a = list;
            if (list2 != null) {
                this.b = list2;
                return;
            }
            throw new NullPointerException("Null likedStations");
        }
        throw new NullPointerException("Null unlikedStations");
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("liked")
    public List<C3508cda> a() {
        return this.b;
    }

    /* access modifiers changed from: 0000 */
    @JsonProperty("unliked")
    public List<C3508cda> b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6036pa)) {
            return false;
        }
        C6036pa paVar = (C6036pa) obj;
        if (!this.a.equals(paVar.b()) || !this.b.equals(paVar.a())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikedStationsPostBody{unlikedStations=");
        sb.append(this.a);
        sb.append(", likedStations=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
