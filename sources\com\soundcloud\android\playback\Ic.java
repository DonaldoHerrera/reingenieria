package com.soundcloud.android.playback;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.foundation.events.K.h;

/* compiled from: PlayerInteractionsTracker */
public class Ic {
    private final C3700b a;

    public Ic(C3700b bVar) {
        this.a = bVar;
    }

    private h g(C4518wb wbVar) {
        int i = Hc.a[wbVar.ordinal()];
        if (i == 1) {
            return h.FULLSCREEN;
        }
        if (i == 2) {
            return h.MINI;
        }
        if (i == 3) {
            return h.NOTIFICATION_OR_HEADSET;
        }
        if (i != 4) {
            return h.OTHER;
        }
        return h.WIDGET;
    }

    public void a(C4518wb wbVar) {
        a(K.a(g(wbVar)));
    }

    public void b(C4518wb wbVar) {
        a(K.b(g(wbVar)));
    }

    public void c(C4518wb wbVar) {
        a(K.c(g(wbVar)));
    }

    public void d(C4518wb wbVar) {
        a(K.d(g(wbVar)));
    }

    public void e(C4518wb wbVar) {
        a(K.e(g(wbVar)));
    }

    public void f(C4518wb wbVar) {
        a(K.f(g(wbVar)));
    }

    public void a() {
        a(K.j());
    }

    public void b() {
        a(K.k());
    }

    private void a(K k) {
        this.a.a((J) k);
    }
}
