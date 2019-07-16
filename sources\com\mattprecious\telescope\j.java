package com.mattprecious.telescope;

import android.media.projection.MediaProjection;

/* compiled from: TelescopeLayout */
class j implements Runnable {
    final /* synthetic */ MediaProjection a;
    final /* synthetic */ k b;

    j(k kVar, MediaProjection mediaProjection) {
        this.b = kVar;
        this.a = mediaProjection;
    }

    public void run() {
        this.b.a.a(this.a);
    }
}
