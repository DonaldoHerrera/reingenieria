package com.soundcloud.android.collection;

import java.util.List;

@EVa(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0006¢\u0006\u0002\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0006HÆ\u0003JE\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\t\u0010\u001a\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/soundcloud/android/collection/PreviewCollectionItem;", "Lcom/soundcloud/android/collection/CollectionItem;", "likes", "", "Lcom/soundcloud/android/collection/LikedTrackPreview;", "playlistsAndAlbums", "Lcom/soundcloud/java/optional/Optional;", "Lcom/soundcloud/android/foundation/domain/ImageResource;", "stations", "Lcom/soundcloud/android/foundation/domain/stations/StationRecord;", "(Ljava/util/List;Lcom/soundcloud/java/optional/Optional;Lcom/soundcloud/java/optional/Optional;)V", "getLikes", "()Ljava/util/List;", "getPlaylistsAndAlbums", "()Lcom/soundcloud/java/optional/Optional;", "getStations", "component1", "component2", "component3", "copy", "equals", "", "other", "", "getType", "", "hashCode", "toString", "", "Companion", "base_release"}, mv = {1, 1, 15})
/* compiled from: PreviewCollectionItem.kt */
public final class La extends B {
    public static final a a = new a(null);
    private final List<Ga> b;
    private final C4928GKa<List<Vca>> c;
    private final C4928GKa<List<Sda>> d;

    /* compiled from: PreviewCollectionItem.kt */
    public static final class a {
        private a() {
        }

        @NXa
        public final La a(List<? extends Ga> list, C4928GKa<List<Vca>> gKa, List<? extends Sda> list2) {
            C7471uYa.b(list, "likes");
            C7471uYa.b(gKa, "playlistsAndAlbums");
            C7471uYa.b(list2, "stations");
            C4928GKa c = C4928GKa.c(list2);
            C7471uYa.a((Object) c, "Optional.of(stations)");
            return new La(list, gKa, c);
        }

        public /* synthetic */ a(C7264rYa rya) {
            this();
        }
    }

    public La(List<? extends Ga> list, C4928GKa<List<Vca>> gKa, C4928GKa<List<Sda>> gKa2) {
        C7471uYa.b(list, "likes");
        C7471uYa.b(gKa, "playlistsAndAlbums");
        C7471uYa.b(gKa2, "stations");
        this.b = list;
        this.c = gKa;
        this.d = gKa2;
    }

    public int c() {
        return 0;
    }

    public final List<Ga> d() {
        return this.b;
    }

    public final C4928GKa<List<Vca>> e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.d, (java.lang.Object) r3.d) != false) goto L_0x0029;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof La) {
                La la = (La) obj;
                if (C7471uYa.a((Object) this.b, (Object) la.b)) {
                    if (C7471uYa.a((Object) this.c, (Object) la.c)) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final C4928GKa<List<Sda>> f() {
        return this.d;
    }

    public int hashCode() {
        List<Ga> list = this.b;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C4928GKa<List<Vca>> gKa = this.c;
        int hashCode2 = (hashCode + (gKa != null ? gKa.hashCode() : 0)) * 31;
        C4928GKa<List<Sda>> gKa2 = this.d;
        if (gKa2 != null) {
            i = gKa2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PreviewCollectionItem(likes=");
        sb.append(this.b);
        sb.append(", playlistsAndAlbums=");
        sb.append(this.c);
        sb.append(", stations=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
