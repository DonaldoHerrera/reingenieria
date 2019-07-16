package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.q;
import java.util.List;

/* renamed from: com.soundcloud.android.stations.vb reason: case insensitive filesystem */
/* compiled from: StationInfoPresenter.kt */
public class C6054vb {
    public List<Za> a(Pb pb, q qVar) {
        C7471uYa.b(pb, "station");
        C7471uYa.b(qVar, "currentPlayQueueItem");
        return C6918mWa.b((Object[]) new Za[]{Wa.a(pb), C6042rb.b.a(pb, qVar.d())});
    }
}
