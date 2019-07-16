package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.playhistory.Q.a;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: PlayHistoryItem.kt */
public final class U extends Q {
    private final C6185ma b;

    public U(C6185ma maVar) {
        C7471uYa.b(maVar, "trackItem");
        super(a.TRACK, null);
        this.b = maVar;
    }

    public final C6185ma b() {
        return this.b;
    }

    public final C3508cda c() {
        C3508cda a = this.b.a();
        C7471uYa.a((Object) a, "trackItem.urn");
        return a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.b, (java.lang.Object) ((com.soundcloud.android.collection.playhistory.U) r2).b) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof U) {
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
        sb.append("PlayHistoryItemTrack(trackItem=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
