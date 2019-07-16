package com.mattprecious.telescope;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.projection.MediaProjection;

/* compiled from: TelescopeLayout */
class k extends BroadcastReceiver {
    final /* synthetic */ TelescopeLayout a;

    k(TelescopeLayout telescopeLayout) {
        this.a = telescopeLayout;
    }

    @TargetApi(21)
    public void onReceive(Context context, Intent intent) {
        this.a.l();
        MediaProjection mediaProjection = this.a.c.getMediaProjection(intent.getIntExtra("code", 0), (Intent) intent.getParcelableExtra("data"));
        if (mediaProjection == null) {
            this.a.d();
            return;
        }
        if (intent.getBooleanExtra("prompt-shown", true)) {
            this.a.postDelayed(new j(this, mediaProjection), 500);
        } else {
            this.a.a(mediaProjection);
        }
    }
}
