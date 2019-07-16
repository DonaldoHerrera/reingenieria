package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import com.evernote.android.job.c;
import com.evernote.android.job.g;
import com.evernote.android.job.l;

@TargetApi(21)
public class PlatformJobService extends JobService {
    /* access modifiers changed from: private */
    public static final Dj a = new Dj("PlatformJobService");

    public boolean onStartJob(JobParameters jobParameters) {
        g.b().execute(new c(this, jobParameters));
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        c b = l.a((Context) this).b(jobParameters.getJobId());
        if (b != null) {
            b.a();
            a.a("Called onStopJob for %s", b);
        } else {
            a.a("Called onStopJob, job %d not found", Integer.valueOf(jobParameters.getJobId()));
        }
        return false;
    }

    /* access modifiers changed from: private */
    @TargetApi(26)
    public Bundle a(JobParameters jobParameters) {
        if (VERSION.SDK_INT >= 26) {
            return jobParameters.getTransientExtras();
        }
        return Bundle.EMPTY;
    }
}
