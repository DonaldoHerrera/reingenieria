package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3693u;
import com.soundcloud.android.playback.Id.b;

/* compiled from: PlaybackItemFactory.kt */
final class Kb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Jb a;
    final /* synthetic */ long b;
    final /* synthetic */ C3693u c;

    Kb(Jb jb, long j, C3693u uVar) {
        this.a = jb;
        this.b = j;
        this.c = uVar;
    }

    /* renamed from: a */
    public final AudioAdPlaybackItem apply(b bVar) {
        C7471uYa.b(bVar, "it");
        AudioAdPlaybackItem audioAdPlaybackItem = new AudioAdPlaybackItem(this.a.a(bVar.b()), this.a.a(bVar.a()), this.b, 0, null, 24, null);
        Tma.a(audioAdPlaybackItem, this.c.f());
        return audioAdPlaybackItem;
    }
}
