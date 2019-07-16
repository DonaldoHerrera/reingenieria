package com.soundcloud.android.offline;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* renamed from: com.soundcloud.android.offline.rc reason: case insensitive filesystem */
/* compiled from: ExpectedOfflineContent */
class C4157rc {
    public static final C4157rc a = new C4157rc(Collections.emptyList(), Collections.emptyList(), false, Collections.emptyList());
    public final Collection<C3508cda> b;
    public final Collection<C4146pc> c;
    public final boolean d;
    public final Collection<C3508cda> e;

    public C4157rc(Collection<C4146pc> collection, Collection<C3508cda> collection2, boolean z, List<C3508cda> list) {
        this.d = z;
        this.e = list;
        this.b = Collections.unmodifiableCollection(collection2);
        this.c = Collections.unmodifiableCollection(collection);
    }

    public boolean a() {
        return this.c.isEmpty();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExpectedOfflineContent{emptyPlaylists=");
        sb.append(this.b);
        sb.append(", requests=");
        sb.append(this.c);
        sb.append(", isLikedTracksExpected=");
        sb.append(this.d);
        sb.append(", likedTracks=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
