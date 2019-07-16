package com.soundcloud.android.features.record;

import android.content.Intent;
import android.media.AudioRecord;
import android.media.AudioRecord.OnRecordPositionUpdateListener;
import com.soundcloud.android.features.record.ba.c;

/* compiled from: SoundRecorder */
class Y implements OnRecordPositionUpdateListener {
    final /* synthetic */ ba a;

    Y(ba baVar) {
        this.a = baVar;
    }

    public void onMarkerReached(AudioRecord audioRecord) {
    }

    public void onPeriodicNotification(AudioRecord audioRecord) {
        if (this.a.t == c.RECORDING) {
            ba baVar = this.a;
            baVar.B = baVar.j.c();
            String str = "duration";
            String str2 = "time_remaining";
            this.a.q.a(new Intent("com.soundcloud.android.recordprogress").putExtra("elapsedTime", this.a.f()).putExtra(str, this.a.c()).putExtra(str2, this.a.B));
        }
    }
}
