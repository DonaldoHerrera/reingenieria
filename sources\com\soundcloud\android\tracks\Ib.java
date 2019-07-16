package com.soundcloud.android.tracks;

import java.util.List;

/* compiled from: TracksVault.kt */
public final class Ib {
    private final Ja a;
    private final Ga b;
    private final Eb c;
    private final wb d;
    private final WV e;
    private final C4643qga f;
    private final YV g;
    private final _V h;
    private final HPa i;

    public Ib(Ja ja, Ga ga, Eb eb, wb wbVar, WV wv, C4643qga qga, YV yv, _V _v, HPa hPa) {
        C7471uYa.b(ja, "trackNetworkFetcher");
        C7471uYa.b(ga, "trackKeyExtractor");
        C7471uYa.b(eb, "trackStorageWriter");
        C7471uYa.b(wbVar, "trackReader");
        C7471uYa.b(wv, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(yv, "tombstonesStorage");
        C7471uYa.b(_v, "tombstonesStrategy");
        C7471uYa.b(hPa, "scheduler");
        this.a = ja;
        this.b = ga;
        this.c = eb;
        this.d = wbVar;
        this.e = wv;
        this.f = qga;
        this.g = yv;
        this.h = _v;
        this.i = hPa;
    }

    public final Zfa<C3508cda, List<C3509cea>> a() {
        return _fa.a(this.a, this.c, this.d, this.i, this.b, this.e, this.f, this.g, this.h);
    }
}
