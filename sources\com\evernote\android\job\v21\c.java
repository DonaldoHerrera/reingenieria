package com.evernote.android.job.v21;

import android.app.job.JobParameters;
import android.os.Build.VERSION;
import com.evernote.android.job.n.a;
import com.evernote.android.job.s;

/* compiled from: PlatformJobService */
class c implements Runnable {
    final /* synthetic */ JobParameters a;
    final /* synthetic */ PlatformJobService b;

    c(PlatformJobService platformJobService, JobParameters jobParameters) {
        this.b = platformJobService;
        this.a = jobParameters;
    }

    public void run() {
        try {
            a aVar = new a(this.b, PlatformJobService.a, this.a.getJobId());
            s a2 = aVar.a(true, false);
            if (a2 != null) {
                if (a2.w()) {
                    if (d.b(this.b, a2)) {
                        if (VERSION.SDK_INT >= 26) {
                            PlatformJobService.a.a("PendingIntent for transient bundle is not null although running on O, using compat mode, request %s", a2);
                        }
                    } else if (VERSION.SDK_INT < 26) {
                        PlatformJobService.a.a("PendingIntent for transient job %s expired", a2);
                    }
                }
                aVar.h(a2);
                aVar.a(a2, this.b.a(this.a));
                this.b.jobFinished(this.a, false);
            }
        } finally {
            this.b.jobFinished(this.a, false);
        }
    }
}
