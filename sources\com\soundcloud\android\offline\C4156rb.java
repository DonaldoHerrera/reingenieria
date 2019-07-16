package com.soundcloud.android.offline;

import java.util.Collection;

/* renamed from: com.soundcloud.android.offline.rb reason: case insensitive filesystem */
/* compiled from: AutoValue_TrackCollections */
final class C4156rb extends ze {
    private final Collection<C3508cda> b;
    private final boolean c;

    C4156rb(Collection<C3508cda> collection, boolean z) {
        if (collection != null) {
            this.b = collection;
            this.c = z;
            return;
        }
        throw new NullPointerException("Null playlists");
    }

    /* access modifiers changed from: 0000 */
    public boolean a() {
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public Collection<C3508cda> b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ze)) {
            return false;
        }
        ze zeVar = (ze) obj;
        if (!this.b.equals(zeVar.b()) || this.c != zeVar.a()) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackCollections{playlists=");
        sb.append(this.b);
        sb.append(", likesCollection=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
