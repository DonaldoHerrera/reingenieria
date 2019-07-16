package com.soundcloud.android.playback.ui;

import com.soundcloud.android.foundation.events.C3700b;
import com.soundcloud.android.foundation.events.J;
import com.soundcloud.android.foundation.events.K;
import com.soundcloud.android.playback.C4412qb;
import com.soundcloud.android.playback.C4518wb;
import com.soundcloud.android.playback.Ic;

/* renamed from: com.soundcloud.android.playback.ui.lb reason: case insensitive filesystem */
/* compiled from: PageListener */
class C4469lb {
    protected final C4412qb a;
    protected final C5327TLa b;
    private final Ic c;
    protected final C3700b d;

    C4469lb(C4412qb qbVar, C5327TLa tLa, Ic ic, C3700b bVar) {
        this.a = qbVar;
        this.b = tLa;
        this.c = ic;
        this.d = bVar;
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        this.d.a((J) K.c(true));
        this.b.c(C3876taa.f, Haa.d());
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        a(C4518wb.MINI);
        this.a.j();
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.d.a((J) K.b(true));
        this.b.c(C3876taa.f, Haa.b());
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        a(C4518wb.FULL);
        this.a.j();
    }

    /* access modifiers changed from: 0000 */
    public void e() {
        this.b.c(C3876taa.f, Haa.a());
    }

    private void a(C4518wb wbVar) {
        if (this.a.isPlaying()) {
            this.c.c(wbVar);
        } else {
            this.c.d(wbVar);
        }
    }
}
