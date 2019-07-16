package com.soundcloud.android.likes;

import com.soundcloud.android.foundation.playqueue.PlaySessionSource;
import com.soundcloud.android.playback.C4536zc;

/* compiled from: TrackLikesUniflowPresenter.kt */
final class oa<T, R> implements C7118pQa<T, MPa<? extends R>> {
    final /* synthetic */ ma a;

    oa(ma maVar) {
        this.a = maVar;
    }

    /* renamed from: a */
    public final IPa<C4536zc> apply(RVa rVa) {
        C7471uYa.b(rVa, "it");
        return this.a.s.a(this.a.m.a(), new PlaySessionSource(Yca.LIKES)).a((C6436fQa<? super T, ? super Throwable>) new na<Object,Object>(this));
    }
}
