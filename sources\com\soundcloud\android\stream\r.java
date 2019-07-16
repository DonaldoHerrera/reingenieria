package com.soundcloud.android.stream;

import com.soundcloud.android.foundation.playqueue.u;

/* compiled from: PlayablePostItem.kt */
public final class r {
    private final long a;
    private final u b;

    public r(long j, u uVar) {
        C7471uYa.b(uVar, "playableWithReposter");
        this.a = j;
        this.b = uVar;
    }

    public final long a() {
        return this.a;
    }

    public final u b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!(this.a == rVar.a) || !C7471uYa.a((Object) this.b, (Object) rVar.b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        long j = this.a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        u uVar = this.b;
        return i + (uVar != null ? uVar.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayablePostItem(id=");
        sb.append(this.a);
        sb.append(", playableWithReposter=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
