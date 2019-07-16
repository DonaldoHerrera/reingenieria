package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.q;
import com.soundcloud.android.playback.C4302ec.b;

/* renamed from: com.soundcloud.android.playback.ic reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4322ic<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C4302ec a;
    final /* synthetic */ Long b;

    C4322ic(C4302ec ecVar, Long l) {
        this.a = ecVar;
        this.b = l;
    }

    /* renamed from: a */
    public final b apply(q qVar) {
        C7471uYa.b(qVar, "it");
        return this.a.a(qVar, this.b);
    }
}
