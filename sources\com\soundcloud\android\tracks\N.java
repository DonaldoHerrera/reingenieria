package com.soundcloud.android.tracks;

import java.util.List;

/* compiled from: FullTracksVault.kt */
public final class N {
    private final Ja a;
    private final G b;
    private final Eb c;
    private final K d;
    private final WV e;
    private final C4643qga f;
    private final YV g;
    private final _V h;
    private final HPa i;

    public N(Ja ja, G g2, Eb eb, K k, WV wv, C4643qga qga, YV yv, _V _v, HPa hPa) {
        C7471uYa.b(ja, "fullTrackNetworkFetcher");
        C7471uYa.b(g2, "fullTrackKeyExtractor");
        C7471uYa.b(eb, "fullTrackStorageWriter");
        C7471uYa.b(k, "fullTrackReader");
        C7471uYa.b(wv, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(yv, "tombstonesStorage");
        C7471uYa.b(_v, "tombstonesStrategy");
        C7471uYa.b(hPa, "scheduler");
        this.a = ja;
        this.b = g2;
        this.c = eb;
        this.d = k;
        this.e = wv;
        this.f = qga;
        this.g = yv;
        this.h = _v;
        this.i = hPa;
    }

    public final Zfa<C3508cda, List<C3493aea>> a() {
        return _fa.a(this.a, this.c, this.d, this.i, this.b, this.e, this.f, this.g, this.h);
    }
}
