package com.soundcloud.android.profile;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.u;
import java.util.List;

/* compiled from: UserPlayableItem.kt */
public final class ce {
    private final int a;
    private final List<u> b;
    private final PlaySessionSource c;

    public ce(int i, List<? extends u> list, PlaySessionSource playSessionSource) {
        C7471uYa.b(list, "allPlayables");
        C7471uYa.b(playSessionSource, "playSessionSource");
        this.a = i;
        this.b = list;
        this.c = playSessionSource;
    }

    public final List<u> a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final PlaySessionSource c() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ce) {
                ce ceVar = (ce) obj;
                if (!(this.a == ceVar.a) || !C7471uYa.a((Object) this.b, (Object) ceVar.b) || !C7471uYa.a((Object) this.c, (Object) ceVar.c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.a * 31;
        List<u> list = this.b;
        int i2 = 0;
        int hashCode = (i + (list != null ? list.hashCode() : 0)) * 31;
        PlaySessionSource playSessionSource = this.c;
        if (playSessionSource != null) {
            i2 = playSessionSource.hashCode();
        }
        return hashCode + i2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("UserTracksItemClickParams(clickedPosition=");
        sb.append(this.a);
        sb.append(", allPlayables=");
        sb.append(this.b);
        sb.append(", playSessionSource=");
        sb.append(this.c);
        sb.append(")");
        return sb.toString();
    }
}
