package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.foundation.playqueue.o;

/* renamed from: com.soundcloud.android.playback.kc reason: case insensitive filesystem */
/* compiled from: PlaybackMediaProvider.kt */
final class C4332kc<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ C3880tea a;
    final /* synthetic */ int b;
    final /* synthetic */ PlaySessionSource c;

    C4332kc(C3880tea tea, int i, PlaySessionSource playSessionSource) {
        this.a = tea;
        this.b = i;
        this.c = playSessionSource;
    }

    /* renamed from: a */
    public final d apply(o oVar) {
        C7471uYa.b(oVar, "playQueue");
        C3508cda b2 = this.a.b();
        int i = this.b;
        PlaySessionSource playSessionSource = this.c;
        C7471uYa.a((Object) playSessionSource, "playSessionSource");
        return new d(oVar, b2, i, playSessionSource);
    }
}
