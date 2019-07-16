package com.soundcloud.android.playback;

import android.annotation.SuppressLint;
import android.view.View;
import com.soundcloud.android.foundation.ads.C3678e;
import com.soundcloud.android.foundation.ads.VideoAdTracking;
import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.C3702d;
import com.soundcloud.android.foundation.events.C3702d.a.c;
import com.soundcloud.android.playback.core.PlaybackItem;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"CheckResult"})
/* compiled from: VideoAdPlaybackTrackingBridge.kt */
public class ee {
    private final C2332VH<Hla> a;
    /* access modifiers changed from: private */
    public final C3678e b;
    private final ke c;
    private final C3700b d;

    public ee(C3678e eVar, ke keVar, C3700b bVar) {
        C7471uYa.b(eVar, "adViewabilityController");
        C7471uYa.b(keVar, "videoSurfaceProvider");
        C7471uYa.b(bVar, "analytics");
        this.b = eVar;
        this.c = keVar;
        this.d = bVar;
        C2332VH<Hla> s = C2332VH.s();
        C7471uYa.a((Object) s, "PublishRelay.create<PlayerStateChangeEvent>()");
        this.a = s;
        this.a.a((C7256rQa<? super T>) Yd.a).a((C7256rQa<? super T>) Zd.a).f((C6776kQa<? super T>) new _d<Object>(this));
        this.a.a((C7256rQa<? super T>) ae.a).a((C6572hQa<? super T, ? super T>) be.a).a((C7256rQa<? super T>) ce.a).f((C6776kQa<? super T>) new de<Object>(this));
    }

    /* access modifiers changed from: private */
    public VideoAdPlaybackItem b(Hla hla) {
        PlaybackItem d2 = hla.d();
        if (d2 != null) {
            return (VideoAdPlaybackItem) d2;
        }
        throw new OVa("null cannot be cast to non-null type com.soundcloud.android.playback.VideoAdPlaybackItem");
    }

    public void a(Hla hla) {
        C7471uYa.b(hla, "playerStateChangeEvent");
        this.a.accept(hla);
    }

    /* access modifiers changed from: private */
    public void a(VideoAdPlaybackItem videoAdPlaybackItem) {
        VideoAdTracking j = videoAdPlaybackItem.j();
        View c2 = this.c.c(j.e());
        List<WeakReference> a2 = this.c.a(j.e());
        C7471uYa.a((Object) a2, "videoSurfaceProvider.get…ons(videoAdTracking.uuid)");
        ArrayList arrayList = new ArrayList();
        for (WeakReference weakReference : a2) {
            View view = (View) weakReference.get();
            if (view != null) {
                arrayList.add(view);
            }
        }
        if (c2 != null) {
            a("start video ad tracking.");
            this.b.a(Tma.a(videoAdPlaybackItem), videoAdPlaybackItem.a(), c2, arrayList, j);
            this.b.a(j);
        } else {
            a("start video ad tracking is aborted because of missing ad view.");
            this.d.a((C3702d) c.c);
        }
        this.b.a(j.e(), videoAdPlaybackItem.e().c());
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        SDb.a("AD_TRACKING_BRIDGE").d(str, new Object[0]);
    }
}
