package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.collection.playhistory.Q.a;

/* compiled from: PlayHistoryItem.kt */
public final class T extends Q {
    private final int b;

    public T(int i) {
        super(a.HEADER, null);
        this.b = i;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof T) {
                if (this.b == ((T) obj).b) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayHistoryItemHeader(trackCount=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
