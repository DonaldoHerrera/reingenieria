package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.ads.C3678e;

/* compiled from: VideoAdPlaybackTrackingBridge.kt */
final class _d<T> implements C6776kQa<Hla> {
    final /* synthetic */ ee a;

    _d(ee eeVar) {
        this.a = eeVar;
    }

    /* renamed from: a */
    public final void accept(Hla hla) {
        this.a.a("Error play state event is reported for the current video ad item.");
        C3678e a2 = this.a.b;
        ee eeVar = this.a;
        C7471uYa.a((Object) hla, "it");
        a2.d(eeVar.b(hla).j().e());
    }
}
