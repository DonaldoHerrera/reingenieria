package com.soundcloud.android.features.record;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.soundcloud.android.features.record.G.n;
import com.soundcloud.android.features.record.RecordFragment.a;

/* compiled from: RecordPresenter */
class L extends BroadcastReceiver {
    final /* synthetic */ N a;

    L(N n) {
        this.a = n;
    }

    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if ("com.soundcloud.android.recordstarted".equals(action)) {
            this.a.a(a.RECORD);
            return;
        }
        boolean z = true;
        if ("com.soundcloud.android.recordsample".equals(action)) {
            if (this.a.t == a.IDLE_RECORD || this.a.t == a.RECORD) {
                N n = this.a;
                float floatExtra = intent.getFloatExtra("amplitude", -1.0f);
                if (this.a.t != a.RECORD) {
                    z = false;
                }
                n.a(floatExtra, z);
            }
        } else if ("com.soundcloud.android.recordprogress".equals(action)) {
            this.a.a(intent.getLongExtra("elapsedTime", -1));
        } else if ("com.soundcloud.android.recorderror".equals(action)) {
            this.a.a(a.IDLE_RECORD);
        } else if ("com.soundcloud.android.recordfinished".equals(action)) {
            if (intent.getLongExtra("time_remaining", -1) == 0) {
                Toast.makeText(this.a.w.getActivity(), n.record_storage_is_full, 1).show();
            }
            this.a.a(a.IDLE_PLAYBACK);
        } else if ("com.soundcloud.android.playbackstarted".equals(action)) {
            N n2 = this.a;
            n2.a((n2.t == a.EDIT || this.a.t == a.EDIT_PLAYBACK) ? a.EDIT_PLAYBACK : a.PLAYBACK);
        } else if ("com.soundcloud.android.playbackprogress".equals(action)) {
            this.a.a(intent.getLongExtra("position", 0), intent.getLongExtra("duration", 0));
        } else if ("com.soundcloud.android.playbackcomplete".equals(action) || "com.soundcloud.android.playbackstopped".equals(action) || "com.soundcloud.android.playbackerror".equals(action)) {
            if (this.a.t == a.PLAYBACK || this.a.t == a.EDIT_PLAYBACK) {
                N n3 = this.a;
                n3.a(n3.t == a.EDIT_PLAYBACK ? a.EDIT : a.IDLE_PLAYBACK);
            }
        } else if ("android.intent.action.MEDIA_MOUNTED".equals(action) || "android.intent.action.MEDIA_REMOVED".equals(action)) {
            a a2 = this.a.t;
            a aVar = a.IDLE_RECORD;
            if (a2 == aVar) {
                this.a.a(aVar);
            }
        }
    }
}
