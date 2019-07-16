package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* compiled from: PlayQueueExtenderOperations.kt */
final class _a<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3508cda a;
    final /* synthetic */ boolean b;
    final /* synthetic */ PlaySessionSource c;

    _a(C3508cda cda, boolean z, PlaySessionSource playSessionSource) {
        this.a = cda;
        this.b = z;
        this.c = playSessionSource;
    }

    /* renamed from: a */
    public final o apply(Qca qca) {
        C7471uYa.b(qca, "recommendedTracks");
        if (qca.f().isEmpty()) {
            return o.g();
        }
        return o.a(this.a, this.b, qca, this.c);
    }
}
