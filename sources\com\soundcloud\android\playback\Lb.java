package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Id.b;

/* compiled from: PlaybackItemFactory.kt */
final class Lb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Jb a;
    final /* synthetic */ long b;
    final /* synthetic */ C3509cea c;

    Lb(Jb jb, long j, C3509cea cea) {
        this.a = jb;
        this.b = j;
        this.c = cea;
    }

    /* renamed from: a */
    public final AudioPlaybackItem apply(b bVar) {
        C7471uYa.b(bVar, "it");
        AudioPlaybackItem a2 = AudioPlaybackItem.h.a(this.a.a(bVar.b()), this.a.a(bVar.a()), this.b, this.c.i());
        Tma.a(a2, this.c.y());
        return a2;
    }
}
