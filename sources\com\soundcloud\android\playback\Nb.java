package com.soundcloud.android.playback;

import com.soundcloud.android.playback.Id.b;
import com.soundcloud.android.playback.core.PreloadItem;

/* compiled from: PlaybackItemFactory.kt */
final class Nb<T, R> implements C7118pQa<T, R> {
    final /* synthetic */ Jb a;

    Nb(Jb jb) {
        this.a = jb;
    }

    /* renamed from: a */
    public final PreloadItem apply(b bVar) {
        C7471uYa.b(bVar, "it");
        return new PreloadItem(this.a.a(bVar.a()));
    }
}
