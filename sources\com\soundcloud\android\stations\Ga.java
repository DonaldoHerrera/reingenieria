package com.soundcloud.android.stations;

import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.u;
import com.soundcloud.android.foundation.playqueue.m;

/* compiled from: StartStationHandler */
public class Ga {
    private final C4655rja a;
    private final C2014EO b;

    public Ga(C4655rja rja, C2014EO eo) {
        this.a = rja;
        this.b = eo;
    }

    public void a(C3508cda cda, m mVar) {
        a();
        this.a.a(C4621nja.b(cda, C4928GKa.a(), C4928GKa.c(mVar), C4928GKa.a()));
    }

    public void a(C3508cda cda) {
        a(cda, m.STATIONS);
    }

    public void a(C3508cda cda, K k) {
        a();
        this.a.a(C4621nja.b(C3508cda.e(cda.c()), C4928GKa.c(cda), C4928GKa.c(m.STATIONS), C4928GKa.c(k)));
    }

    private void a() {
        this.b.a(u.LOAD_STATION);
    }
}
