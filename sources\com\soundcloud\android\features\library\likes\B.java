package com.soundcloud.android.features.library.likes;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;

/* compiled from: TrackLikesPresenter.kt */
final class B<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ z a;

    B(z zVar) {
        this.a = zVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(RVa rVa) {
        C7471uYa.b(rVa, "it");
        return this.a.u.a(this.a.n.a(), new PlaySessionSource(Yca.LIKES)).a((C6436fQa<? super T, ? super Throwable>) new A<Object,Object>(this));
    }
}
