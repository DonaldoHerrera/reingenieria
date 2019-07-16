package com.soundcloud.android.playback;

import com.soundcloud.android.playback.ui.view.g;

/* renamed from: com.soundcloud.android.playback.ta reason: case insensitive filesystem */
/* compiled from: ExpandPlayerCommand.kt */
public class C4425ta {
    private final g a;
    private final C5327TLa b;

    public C4425ta(g gVar, C5327TLa tLa) {
        C7471uYa.b(gVar, "playbackFeedbackHelper");
        C7471uYa.b(tLa, "eventBus");
        this.a = gVar;
        this.b = tLa;
    }

    public void a(C4536zc zcVar) {
        C7471uYa.b(zcVar, "result");
        if (zcVar.b()) {
            a();
        } else {
            this.a.a(zcVar.a());
        }
    }

    private void a() {
        C5327TLa tLa = this.b;
        C5443XLa<Haa> xLa = C3876taa.f;
        C7471uYa.a((Object) xLa, "EventQueue.PLAYER_COMMAND");
        tLa.c(xLa, Haa.u());
    }
}
