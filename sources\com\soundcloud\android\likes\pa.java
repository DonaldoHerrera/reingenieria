package com.soundcloud.android.likes;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;
import java.util.List;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class pa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ qa a;

    pa(qa qaVar) {
        this.a = qaVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(List<C3508cda> list) {
        C7471uYa.b(list, "it");
        return this.a.a.s.b(list, 0, new PlaySessionSource(Yca.LIKES));
    }
}
