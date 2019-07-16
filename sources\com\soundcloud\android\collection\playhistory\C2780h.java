package com.soundcloud.android.collection.playhistory;

import com.soundcloud.android.tracks.C6185ma;
import java.util.List;

/* renamed from: com.soundcloud.android.collection.playhistory.h reason: case insensitive filesystem */
/* compiled from: AutoValue_PlayHistoryBucketItem */
final class C2780h extends C2791t {
    private final int a;
    private final List<C6185ma> b;

    C2780h(int i, List<C6185ma> list) {
        this.a = i;
        if (list != null) {
            this.b = list;
            return;
        }
        throw new NullPointerException("Null listeningHistory");
    }

    public int c() {
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public List<C6185ma> d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2791t)) {
            return false;
        }
        C2791t tVar = (C2791t) obj;
        if (this.a != tVar.c() || !this.b.equals(tVar.d())) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayHistoryBucketItem{type=");
        sb.append(this.a);
        sb.append(", listeningHistory=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
