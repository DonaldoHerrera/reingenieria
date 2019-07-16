package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;
import java.util.List;

/* compiled from: StationsOperations.kt */
final class cc<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;
    final /* synthetic */ PlaySessionSource b;

    cc(C3508cda cda, PlaySessionSource playSessionSource) {
        this.a = cda;
        this.b = playSessionSource;
    }

    /* renamed from: a */
    public final o apply(List<Tda> list) {
        C7471uYa.b(list, "tracks");
        return o.a(this.a, list, this.b);
    }
}
