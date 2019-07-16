package defpackage;

import java.util.List;

/* renamed from: LW reason: default package */
/* compiled from: UsersVault.kt */
public final class LW {
    private final C1349hW a;
    private final C1256eW b;
    private final HW c;
    private final BW d;
    private final WV e;
    private final C4643qga f;
    private final YV g;
    private final _V h;
    private final HPa i;

    public LW(C1349hW hWVar, C1256eW eWVar, HW hw, BW bw, WV wv, C4643qga qga, YV yv, _V _v, HPa hPa) {
        C7471uYa.b(hWVar, "userNetworkFetcher");
        C7471uYa.b(eWVar, "userKeyExtractor");
        C7471uYa.b(hw, "userStorageWriter");
        C7471uYa.b(bw, "userReader");
        C7471uYa.b(wv, "timeToLiveStorage");
        C7471uYa.b(qga, "timeToLiveStrategy");
        C7471uYa.b(yv, "tombstonesStorage");
        C7471uYa.b(_v, "tombstonesStrategy");
        C7471uYa.b(hPa, "scheduler");
        this.a = hWVar;
        this.b = eWVar;
        this.c = hw;
        this.d = bw;
        this.e = wv;
        this.f = qga;
        this.g = yv;
        this.h = _v;
        this.i = hPa;
    }

    public final Zfa<C3508cda, List<C3784hea>> a() {
        return _fa.a(this.a, this.c, this.d, this.i, this.b, this.e, this.f, this.g, this.h);
    }
}
