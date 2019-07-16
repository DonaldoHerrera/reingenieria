package androidx.core.app;

import android.app.job.JobParameters;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: SafeJobServiceEngineImpl */
public class p extends JobServiceEngine implements b {
    final JobIntentService a;
    final Object b = new Object();
    JobParameters c;

    /* compiled from: SafeJobServiceEngineImpl */
    final class a implements e {
        final JobWorkItem a;

        a(JobWorkItem jobWorkItem) {
            this.a = jobWorkItem;
        }

        public Intent getIntent() {
            return this.a.getIntent();
        }

        public void i() {
            synchronized (p.this.b) {
                if (p.this.c != null) {
                    try {
                        p.this.c.completeWork(this.a);
                    } catch (SecurityException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    p(JobIntentService jobIntentService) {
        super(jobIntentService);
        this.a = jobIntentService;
    }

    public IBinder a() {
        return getBinder();
    }

    public e b() {
        JobWorkItem jobWorkItem;
        synchronized (this.b) {
            if (this.c == null) {
                return null;
            }
            try {
                jobWorkItem = this.c.dequeueWork();
            } catch (SecurityException e) {
                e.printStackTrace();
                jobWorkItem = null;
            }
        }
        if (jobWorkItem == null) {
            return null;
        }
        jobWorkItem.getIntent().setExtrasClassLoader(this.a.getClassLoader());
        return new a(jobWorkItem);
    }

    public boolean onStartJob(JobParameters jobParameters) {
        this.c = jobParameters;
        this.a.a(false);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        boolean b2 = this.a.b();
        synchronized (this.b) {
            this.c = null;
        }
        return b2;
    }
}
