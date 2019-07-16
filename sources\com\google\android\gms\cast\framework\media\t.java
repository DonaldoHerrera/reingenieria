package com.google.android.gms.cast.framework.media;

import java.util.TimerTask;

final class t extends TimerTask {
    private final /* synthetic */ C0650e a;
    private final /* synthetic */ j b;

    t(j jVar, C0650e eVar) {
        this.b = jVar;
        this.a = eVar;
    }

    public final void run() {
        j jVar = this.b;
        C0650e.this.a(jVar.a);
        C0650e.this.c.postDelayed(this, this.b.b);
    }
}
