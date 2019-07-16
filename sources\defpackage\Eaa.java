package defpackage;

import com.soundcloud.android.foundation.playqueue.k;
import com.soundcloud.android.playback.C4431ub;

/* renamed from: Eaa reason: default package */
/* compiled from: PlayQueueItemStateChangedEvent.kt */
public final class Eaa {
    private final k a;
    private final C4431ub b;

    public Eaa(k kVar, C4431ub ubVar) {
        C7471uYa.b(kVar, "currentPlayQueueItemEvent");
        C7471uYa.b(ubVar, "playState");
        this.a = kVar;
        this.b = ubVar;
    }

    public final k a() {
        return this.a;
    }

    public final C4431ub b() {
        return this.b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (defpackage.C7471uYa.a((java.lang.Object) r2.b, (java.lang.Object) r3.b) != false) goto L_0x001f;
     */
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof Eaa) {
                Eaa eaa = (Eaa) obj;
                if (C7471uYa.a((Object) this.a, (Object) eaa.a)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        k kVar = this.a;
        int i = 0;
        int hashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        C4431ub ubVar = this.b;
        if (ubVar != null) {
            i = ubVar.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("PlayQueueItemStateChangedEvent(currentPlayQueueItemEvent=");
        sb.append(this.a);
        sb.append(", playState=");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }
}
