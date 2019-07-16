package com.soundcloud.android.stations;

/* renamed from: com.soundcloud.android.stations.la reason: case insensitive filesystem */
/* compiled from: LikedStationViewModelItem.kt */
public final class C6024la {
    private final Nb a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.stations.C6024la) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C6024la) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        Nb nb = this.a;
        if (nb != null) {
            return nb.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LikedStationViewModelItem(likedStationItem=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
