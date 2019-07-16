package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;

@TargetApi(21)
public final class PlatformScheduler implements b {

    public static final class PlatformSchedulerService extends JobService {
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.b("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (new Requirements(extras.getInt("requirements")).a((Context) this)) {
                PlatformScheduler.b("Requirements are met");
                String string = extras.getString("service_action");
                String string2 = extras.getString("service_package");
                Intent intent = new Intent(string).setPackage(string2);
                StringBuilder sb = new StringBuilder();
                sb.append("Starting service action: ");
                sb.append(string);
                sb.append(" package: ");
                sb.append(string2);
                PlatformScheduler.b(sb.toString());
                C0471ar.a((Context) this, intent);
            } else {
                PlatformScheduler.b("Requirements are not met");
                jobFinished(jobParameters, true);
            }
            return false;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }
    }

    /* access modifiers changed from: private */
    public static void b(String str) {
    }
}
