package com.evernote.android.job.v14;

import android.app.Service;
import android.content.Intent;
import com.evernote.android.job.n.a;

/* compiled from: PlatformAlarmServiceExact */
class b implements Runnable {
    final /* synthetic */ Intent a;
    final /* synthetic */ int b;
    final /* synthetic */ PlatformAlarmServiceExact c;

    b(PlatformAlarmServiceExact platformAlarmServiceExact, Intent intent, int i) {
        this.c = platformAlarmServiceExact;
        this.a = intent;
        this.b = i;
    }

    public void run() {
        try {
            PlatformAlarmService.a(this.a, (Service) this.c, PlatformAlarmServiceExact.a);
        } finally {
            a.a(this.a);
            this.c.a(this.b);
        }
    }
}
