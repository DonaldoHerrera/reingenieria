package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* renamed from: com.soundcloud.android.playback.ca reason: case insensitive filesystem */
/* compiled from: DefaultPlaySessionController.kt */
final class C4290ca<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ S a;
    final /* synthetic */ o b;
    final /* synthetic */ C3508cda c;
    final /* synthetic */ PlaySessionSource d;

    C4290ca(S s, o oVar, C3508cda cda, PlaySessionSource playSessionSource) {
        this.a = s;
        this.b = oVar;
        this.c = cda;
        this.d = playSessionSource;
    }

    /* renamed from: a */
    public final IPa<o> apply(Integer num) {
        C7471uYa.b(num, "fixedTrackIndex");
        return this.a.s.a(this.b, this.c, num.intValue(), this.d);
    }
}
