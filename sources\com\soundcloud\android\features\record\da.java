package com.soundcloud.android.features.record;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* compiled from: SoundRecorderService */
class da extends BroadcastReceiver {
    final /* synthetic */ SoundRecorderService a;

    da(SoundRecorderService soundRecorderService) {
        this.a = soundRecorderService;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        String a2 = SoundRecorderService.a;
        StringBuilder sb = new StringBuilder();
        sb.append("BroadcastReceiver#onReceive(");
        sb.append(action);
        sb.append(")");
        Log.d(a2, sb.toString());
        String str = "shouldUseNotifications";
        if ("com.soundcloud.android.playbackstarted".equals(action)) {
            if (intent.getBooleanExtra(str, true)) {
                SoundRecorderService soundRecorderService = this.a;
                soundRecorderService.a(soundRecorderService.c.e());
            }
        } else if ("com.soundcloud.android.playbackstopped".equals(action) || "com.soundcloud.android.playbackcomplete".equals(action) || "com.soundcloud.android.playbackerror".equals(action)) {
            this.a.a(1);
        } else if ("com.soundcloud.android.recordstarted".equals(action)) {
            this.a.b();
            if (intent.getBooleanExtra(str, true)) {
                this.a.f();
            }
        } else if ("com.soundcloud.android.recordprogress".equals(action)) {
            long longExtra = intent.getLongExtra("elapsedTime", -1) / 1000;
            if (!C7315sGa.a((double) this.a.i, (double) longExtra)) {
                this.a.i = longExtra;
                this.a.a(longExtra);
            }
        } else if ("com.soundcloud.android.recordfinished".equals(action)) {
            this.a.a(0);
        } else if ("com.soundcloud.android.recorderror".equals(action)) {
            this.a.a(0);
        } else if (!"com.soundcloud.android.notificationState".equals(action)) {
        } else {
            if (!intent.getBooleanExtra(str, true)) {
                this.a.i = -1;
                this.a.b(1);
                this.a.b(0);
            } else if (this.a.c.l()) {
                this.a.f();
            } else if (this.a.c.k()) {
                SoundRecorderService soundRecorderService2 = this.a;
                soundRecorderService2.a(soundRecorderService2.c.e());
            }
        }
    }
}
