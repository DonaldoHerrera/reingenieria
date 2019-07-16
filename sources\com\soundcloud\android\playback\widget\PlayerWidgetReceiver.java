package com.soundcloud.android.playback.widget;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;

public class PlayerWidgetReceiver extends BroadcastReceiver {
    l a;

    public void onReceive(Context context, Intent intent) {
        if (l.a.equals(intent.getAction())) {
            SoundCloudApplication.f().a(this);
            this.a.a(intent.getBooleanExtra("isLike", false));
        }
    }
}
