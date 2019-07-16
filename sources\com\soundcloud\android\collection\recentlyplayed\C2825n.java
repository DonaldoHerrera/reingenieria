package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.B;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.recentlyplayed.n reason: case insensitive filesystem */
/* compiled from: RecentlyPlayedBucketItem.kt */
public final class C2825n extends B {
    private final List<C2804ca> a;

    public C2825n(List<? extends C2804ca> list) {
        C7471uYa.b(list, "recentlyPlayedPlayableItems");
        this.a = list;
    }

    public int c() {
        return 4;
    }

    public final List<C2804ca> d() {
        return this.a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r1.a, (java.lang.Object) ((com.soundcloud.android.collection.recentlyplayed.C2825n) r2).a) != false) goto L_0x0015;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2825n) {
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C2804ca> list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecentlyPlayedBucketItem(recentlyPlayedPlayableItems=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
