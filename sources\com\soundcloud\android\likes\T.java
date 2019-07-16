package com.soundcloud.android.likes;

import com.soundcloud.android.collections.data.C2862s;
import java.util.List;

/* compiled from: TrackLikesPage.kt */
public final class T {
    private final List<C2862s> a;
    private final int b;

    public T(List<C2862s> list, int i) {
        C7471uYa.b(list, "likes");
        this.a = list;
        this.b = i;
    }

    public final List<C2862s> a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof T) {
                T t = (T) obj;
                if (C7471uYa.a((Object) this.a, (Object) t.a)) {
                    if (this.b == t.b) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        List<C2862s> list = this.a;
        return ((list != null ? list.hashCode() : 0) * 31) + this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("TrackLikesPage(likes=");
        sb.append(this.a);
        sb.append(", totalLikesCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
