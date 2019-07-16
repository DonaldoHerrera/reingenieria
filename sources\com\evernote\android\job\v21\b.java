package com.evernote.android.job.v21;

import android.annotation.TargetApi;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.evernote.android.job.n;
import com.evernote.android.job.n.a;
import com.evernote.android.job.o;
import com.evernote.android.job.s;
import com.evernote.android.job.s.d;
import java.util.List;

@TargetApi(21)
/* compiled from: JobProxy21 */
public class b implements n {
    protected final Context a;
    protected final Dj b;

    public b(Context context) {
        this(context, "JobProxy21");
    }

    protected static String b(int i) {
        return i == 1 ? "success" : "failure";
    }

    public void a(s sVar) {
        long i = sVar.i();
        long h = sVar.h();
        int a2 = a(b(a(sVar, true), i, h).build());
        if (a2 == -123) {
            a2 = a(b(a(sVar, false), i, h).build());
        }
        this.b.a("Schedule periodic jobInfo %s, %s, interval %s, flex %s", b(a2), sVar, Gj.a(i), Gj.a(h));
    }

    public boolean b(s sVar) {
        try {
            List<JobInfo> allPendingJobs = a().getAllPendingJobs();
            if (allPendingJobs != null && !allPendingJobs.isEmpty()) {
                for (JobInfo a2 : allPendingJobs) {
                    if (a(a2, sVar)) {
                        return true;
                    }
                }
            }
            return false;
        } catch (Exception e) {
            this.b.a((Throwable) e);
            return false;
        }
    }

    public void c(s sVar) {
        long g = a.g(sVar);
        long d = a.d(sVar);
        int a2 = a(a(a(sVar, true), g, d).build());
        if (a2 == -123) {
            a2 = a(a(a(sVar, false), g, d).build());
        }
        this.b.a("Schedule periodic (flex support) jobInfo %s, %s, start %s, end %s, flex %s", b(a2), sVar, Gj.a(g), Gj.a(d), Gj.a(sVar.h()));
    }

    public void d(s sVar) {
        long f = a.f(sVar);
        long a2 = a.a(sVar, true);
        int a3 = a(a(a(sVar, true), f, a2).build());
        if (a3 == -123) {
            a3 = a(a(a(sVar, false), f, a2).build());
        }
        this.b.a("Schedule one-off jobInfo %s, %s, start %s, end %s (from now), reschedule count %d", b(a3), sVar, Gj.a(f), Gj.a(a.a(sVar, false)), Integer.valueOf(a.e(sVar)));
    }

    protected b(Context context, String str) {
        this.a = context;
        this.b = new Dj(str);
    }

    /* access modifiers changed from: protected */
    public Builder b(Builder builder, long j, long j2) {
        return builder.setPeriodic(j);
    }

    public void a(int i) {
        try {
            a().cancel(i);
        } catch (Exception e) {
            this.b.a((Throwable) e);
        }
        d.a(this.a, i, null);
    }

    /* access modifiers changed from: protected */
    public boolean a(JobInfo jobInfo, s sVar) {
        boolean z = true;
        if (!(jobInfo != null && jobInfo.getId() == sVar.k())) {
            return false;
        }
        if (sVar.w() && !d.a(this.a, sVar.k())) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public Builder a(s sVar, boolean z) {
        return a(sVar, new Builder(sVar.k(), new ComponentName(this.a, PlatformJobService.class)).setRequiresCharging(sVar.B()).setRequiresDeviceIdle(sVar.C()).setRequiredNetworkType(a(sVar.y())).setPersisted(z && !sVar.w() && Gj.a(this.a)));
    }

    /* access modifiers changed from: protected */
    public Builder a(Builder builder, long j, long j2) {
        return builder.setMinimumLatency(j).setOverrideDeadline(j2);
    }

    /* access modifiers changed from: protected */
    public Builder a(s sVar, Builder builder) {
        if (sVar.w()) {
            d.a(this.a, sVar);
        }
        return builder;
    }

    /* access modifiers changed from: protected */
    public int a(d dVar) {
        int i = a.a[dVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3 || i == 4) {
            return 2;
        }
        if (i == 5) {
            return 1;
        }
        throw new IllegalStateException("not implemented");
    }

    /* access modifiers changed from: protected */
    public final JobScheduler a() {
        return (JobScheduler) this.a.getSystemService("jobscheduler");
    }

    /* access modifiers changed from: protected */
    public final int a(JobInfo jobInfo) {
        JobScheduler a2 = a();
        if (a2 != null) {
            try {
                return a2.schedule(jobInfo);
            } catch (IllegalArgumentException e) {
                this.b.a((Throwable) e);
                String message = e.getMessage();
                if (message != null && message.contains("RECEIVE_BOOT_COMPLETED")) {
                    return -123;
                }
                if (message == null || !message.contains("No such service ComponentInfo")) {
                    throw e;
                }
                throw new o((Throwable) e);
            } catch (NullPointerException e2) {
                this.b.a((Throwable) e2);
                throw new o((Throwable) e2);
            }
        } else {
            throw new o("JobScheduler is null");
        }
    }
}
