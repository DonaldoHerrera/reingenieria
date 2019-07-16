package com.google.android.gms.internal.cast;

import android.content.Intent;
import android.support.v4.media.session.MediaSessionCompat.Callback;
import android.view.KeyEvent;

/* renamed from: com.google.android.gms.internal.cast.m reason: case insensitive filesystem */
final class C0717m extends Callback {
    private final /* synthetic */ C0709i a;

    C0717m(C0709i iVar) {
        this.a = iVar;
    }

    public final boolean onMediaButtonEvent(Intent intent) {
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (keyEvent != null && (keyEvent.getKeyCode() == 127 || keyEvent.getKeyCode() == 126)) {
            this.a.i.x();
        }
        return true;
    }

    public final void onPause() {
        this.a.i.x();
    }

    public final void onPlay() {
        this.a.i.x();
    }

    public final void onStop() {
        if (this.a.i.o()) {
            this.a.i.x();
        }
    }
}
