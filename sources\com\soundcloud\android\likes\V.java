package com.soundcloud.android.likes;

import com.soundcloud.android.likes.la.a;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: TrackLikesUniflowItem.kt */
public final class V extends la {
    private final C6185ma b;

    public V(C6185ma maVar) {
        C7471uYa.b(maVar, "trackItem");
        super(a.TRACK, null);
        this.b = maVar;
    }

    public final C6185ma b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.likes.V) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof V) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C6185ma maVar = this.b;
        if (maVar != null) {
            return maVar.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesTrackUniflowItem(trackItem=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
