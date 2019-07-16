package com.soundcloud.android.playback.playqueue;

import com.soundcloud.android.foundation.playqueue.F;
import com.soundcloud.android.tracks.C6185ma;

/* compiled from: TrackAndPlayQueueItem */
public class eb {
    public final C6185ma a;
    public final F b;

    eb(C6185ma maVar, F f) {
        this.a = maVar;
        this.b = f;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || eb.class != obj.getClass()) {
            return false;
        }
        eb ebVar = (eb) obj;
        if (!C4804CKa.a(this.a, ebVar.a) || !C4804CKa.a(this.b, ebVar.b)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return C4804CKa.a(this.a, this.b);
    }
}
