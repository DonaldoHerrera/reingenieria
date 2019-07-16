package com.soundcloud.android.collection;

import com.soundcloud.android.collection.recentlyplayed.C2804ca;
import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.y reason: case insensitive filesystem */
/* compiled from: CollectionDomainModel.kt */
public final class C2843y {
    private final List<Ga> a;
    private final List<Vca> b;
    private final List<Sda> c;
    private final List<C6185ma> d;
    private final List<C2804ca> e;

    public C2843y() {
        this(null, null, null, null, null, 31, null);
    }

    public C2843y(List<? extends Ga> list, List<? extends Vca> list2, List<? extends Sda> list3, List<? extends C6185ma> list4, List<? extends C2804ca> list5) {
        C7471uYa.b(list, "likes");
        C7471uYa.b(list3, "stations");
        C7471uYa.b(list4, "playHistoryTracks");
        C7471uYa.b(list5, "recentlyPlayedPlayableItems");
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = list4;
        this.e = list5;
    }

    public final List<Ga> a() {
        return this.a;
    }

    public final List<C6185ma> b() {
        return this.d;
    }

    public final List<Vca> c() {
        return this.b;
    }

    public final List<C2804ca> d() {
        return this.e;
    }

    public final List<Sda> e() {
        return this.c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.e, (java.lang.Object) r3.e) != false) goto L_0x003d;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2843y) {
                C2843y yVar = (C2843y) obj;
                if (C7471uYa.a((Object) this.a, (Object) yVar.a)) {
                    if (C7471uYa.a((Object) this.b, (Object) yVar.b)) {
                        if (C7471uYa.a((Object) this.c, (Object) yVar.c)) {
                            if (C7471uYa.a((Object) this.d, (Object) yVar.d)) {
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<Ga> list = this.a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Vca> list2 = this.b;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<Sda> list3 = this.c;
        int hashCode3 = (hashCode2 + (list3 != null ? list3.hashCode() : 0)) * 31;
        List<C6185ma> list4 = this.d;
        int hashCode4 = (hashCode3 + (list4 != null ? list4.hashCode() : 0)) * 31;
        List<C2804ca> list5 = this.e;
        if (list5 != null) {
            i = list5.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CollectionDomainModel(likes=");
        sb.append(this.a);
        sb.append(", playlistsAndAlbums=");
        sb.append(this.b);
        sb.append(", stations=");
        sb.append(this.c);
        sb.append(", playHistoryTracks=");
        sb.append(this.d);
        sb.append(", recentlyPlayedPlayableItems=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ C2843y(List list, List list2, List list3, List list4, List list5, int i, C7264rYa rya) {
        if ((i & 1) != 0) {
            list = C6918mWa.a();
        }
        if ((i & 2) != 0) {
            list2 = null;
        }
        List list6 = list2;
        if ((i & 4) != 0) {
            list3 = C6918mWa.a();
        }
        List list7 = list3;
        if ((i & 8) != 0) {
            list4 = C6918mWa.a();
        }
        List list8 = list4;
        if ((i & 16) != 0) {
            list5 = C6918mWa.a();
        }
        this(list, list6, list7, list8, list5);
    }
}
