package com.soundcloud.android.stations;

import java.util.List;

/* renamed from: com.soundcloud.android.stations.u reason: case insensitive filesystem */
/* compiled from: AutoValue_ApiStationsCollections */
final class C6049u extends C6046t {
    private final List<C6043s> a;

    C6049u(List<C6043s> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null recents");
    }

    public List<C6043s> a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6046t)) {
            return false;
        }
        return this.a.equals(((C6046t) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ApiStationsCollections{recents=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
