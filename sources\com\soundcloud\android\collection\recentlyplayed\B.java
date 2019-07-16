package com.soundcloud.android.collection.recentlyplayed;

import com.soundcloud.android.collection.recentlyplayed.E.a;

/* compiled from: RecentlyPlayedItem.kt */
public final class B extends E {
    private final int b;

    public B(int i) {
        super(a.HEADER, null);
        this.b = i;
    }

    public boolean a(E e) {
        C7471uYa.b(e, "other");
        return e.f() == a.HEADER;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof B) {
                if (this.b == ((B) obj).b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int g() {
        return this.b;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("RecentlyPlayedHeader(contextCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
