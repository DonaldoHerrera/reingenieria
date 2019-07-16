package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3699a;
import com.soundcloud.android.foundation.events.C3703e;

/* compiled from: TrackSessionAnalyticsDispatcher.kt */
final class Od<T> implements C6776kQa<T> {
    final /* synthetic */ Jd a;

    Od(Jd jd) {
        this.a = jd;
    }

    /* renamed from: a */
    public final void accept(C3699a aVar) {
        Jd jd = this.a;
        C7471uYa.a((Object) aVar, "it");
        jd.e = aVar.b() ? C3703e.FOREGROUND : C3703e.BACKGROUND;
    }
}
