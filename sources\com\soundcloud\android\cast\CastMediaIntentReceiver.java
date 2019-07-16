package com.soundcloud.android.cast;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.cast.framework.media.MediaIntentReceiver;
import com.google.android.gms.cast.framework.r;
import com.soundcloud.android.SoundCloudApplication;
import com.soundcloud.android.playback.C4412qb;

public class CastMediaIntentReceiver extends MediaIntentReceiver {
    C4412qb a;

    /* access modifiers changed from: protected */
    public void a(r rVar, long j) {
        this.a.h();
    }

    /* access modifiers changed from: protected */
    public void b(r rVar, long j) {
        this.a.k();
    }

    public void onReceive(Context context, Intent intent) {
        SoundCloudApplication.f().a(this);
        super.onReceive(context, intent);
    }
}
