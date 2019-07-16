package com.soundcloud.android.offline;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.soundcloud.android.SoundCloudApplication;

public class MediaMountedReceiver extends BroadcastReceiver {
    C4136ne a;

    public void onReceive(Context context, Intent intent) {
        if ("android.intent.action.MEDIA_MOUNTED".equals(intent.getAction())) {
            SoundCloudApplication.f().a(this);
            this.a.a();
            this.a.b();
        }
    }
}
