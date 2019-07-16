package com.soundcloud.android.features.library.likes.search;

import java.util.List;

/* compiled from: TrackLikesSearchPresenter.kt */
public final class N {
    private final int a;
    private final List<x> b;

    public N(int i, List<x> list) {
        C7471uYa.b(list, "trackLikesItems");
        this.a = i;
        this.b = list;
    }

    public final List<x> a() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N) {
                N n = (N) obj;
                if (!(this.a == n.a) || !C7471uYa.a((Object) this.b, (Object) n.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.a * 31;
        List<x> list = this.b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesSearchViewModel(likesCount=");
        sb.append(this.a);
        sb.append(", trackLikesItems=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
