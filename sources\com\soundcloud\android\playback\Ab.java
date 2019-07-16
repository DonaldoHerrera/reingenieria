package com.soundcloud.android.playback;

import com.soundcloud.android.ads.Yb;
import com.soundcloud.android.playback.players.playback.local.d;

/* compiled from: PlaybackAnalyticsPublisher.kt */
public final class Ab implements d {
    private final C4525xb a;
    private final ee b;
    private final Yb c;
    private final C4421sb d;
    private final C5628bIa e;

    public Ab(C4525xb xbVar, ee eeVar, Yb yb, C4421sb sbVar, C5628bIa bia) {
        C7471uYa.b(xbVar, "playbackAnalyticsController");
        C7471uYa.b(eeVar, "videoAdPlaybackTrackingBridge");
        C7471uYa.b(yb, "playerAdsController");
        C7471uYa.b(sbVar, "playSessionStateStorage");
        C7471uYa.b(bia, "uuidProvider");
        this.a = xbVar;
        this.b = eeVar;
        this.c = yb;
        this.d = sbVar;
        this.e = bia;
    }

    public void a(Hla hla) {
        C7471uYa.b(hla, "playerStateChangeEvent");
        this.b.a(hla);
        boolean z = hla.e().c() && !this.d.g();
        String a2 = z ? this.e.a() : this.d.c();
        Ca ca = Ca.a;
        C7471uYa.a((Object) a2, "playId");
        Ba a3 = ca.a(hla, z, a2);
        if (a3.u()) {
            this.d.a(a3.c());
        }
        this.a.a(a3, Tma.b(hla.d()));
        if (hla.i()) {
            this.c.d();
        }
    }

    public void a(Ila ila) {
        C7471uYa.b(ila, "progressChangeEvent");
        C4519wc wcVar = new C4519wc(ila.c(), ila.a(), Tma.a(ila.b()));
        this.a.a(wcVar, Tma.b(ila.b()));
    }
}
