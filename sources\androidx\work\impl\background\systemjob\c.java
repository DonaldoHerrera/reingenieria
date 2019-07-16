package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PersistableBundle;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.d;
import androidx.work.impl.m;
import androidx.work.impl.utils.e;
import androidx.work.q.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: SystemJobScheduler */
public class c implements d {
    private static final String a = i.a("SystemJobScheduler");
    private final Context b;
    private final JobScheduler c;
    private final m d;
    private final e e;
    private final b f;

    public c(Context context, m mVar) {
        this(context, mVar, (JobScheduler) context.getSystemService("jobscheduler"), new b(context));
    }

    public static void b(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a2 = a(context, jobScheduler);
            if (a2 != null && !a2.isEmpty()) {
                for (JobInfo jobInfo : a2) {
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                        a(jobScheduler, jobInfo.getId());
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public void a(_e... _eVarArr) {
        int i;
        int i2;
        WorkDatabase g = this.d.g();
        int length = _eVarArr.length;
        int i3 = 0;
        while (i3 < length) {
            _e _eVar = _eVarArr[i3];
            g.c();
            try {
                _e c2 = g.t().c(_eVar.c);
                String str = "Skipping scheduling ";
                if (c2 == null) {
                    i a2 = i.a();
                    String str2 = a;
                    StringBuilder sb = new StringBuilder();
                    sb.append(str);
                    sb.append(_eVar.c);
                    sb.append(" because it's no longer in the DB");
                    a2.e(str2, sb.toString(), new Throwable[0]);
                    g.m();
                } else if (c2.d != a.ENQUEUED) {
                    i a3 = i.a();
                    String str3 = a;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(_eVar.c);
                    sb2.append(" because it is no longer enqueued");
                    a3.e(str3, sb2.toString(), new Throwable[0]);
                    g.m();
                } else {
                    Qe a4 = g.r().a(_eVar.c);
                    if (a4 != null) {
                        i = a4.b;
                    } else {
                        i = this.e.a(this.d.c().d(), this.d.c().b());
                    }
                    if (a4 == null) {
                        this.d.g().r().a(new Qe(_eVar.c, i));
                    }
                    a(_eVar, i);
                    if (VERSION.SDK_INT == 23) {
                        List a5 = a(this.b, this.c, _eVar.c);
                        if (a5 != null) {
                            int indexOf = a5.indexOf(Integer.valueOf(i));
                            if (indexOf >= 0) {
                                a5.remove(indexOf);
                            }
                            if (!a5.isEmpty()) {
                                i2 = ((Integer) a5.get(0)).intValue();
                            } else {
                                i2 = this.e.a(this.d.c().d(), this.d.c().b());
                            }
                            a(_eVar, i2);
                        }
                    }
                    g.m();
                }
                g.e();
                i3++;
            } catch (Throwable th) {
                g.e();
                throw th;
            }
        }
    }

    public c(Context context, m mVar, JobScheduler jobScheduler, b bVar) {
        this.b = context;
        this.d = mVar;
        this.c = jobScheduler;
        this.e = new e(context);
        this.f = bVar;
    }

    public void a(_e _eVar, int i) {
        JobInfo a2 = this.f.a(_eVar, i);
        i.a().a(a, String.format("Scheduling work ID %s Job ID %s", new Object[]{_eVar.c, Integer.valueOf(i)}), new Throwable[0]);
        try {
            this.c.schedule(a2);
        } catch (IllegalStateException e2) {
            List a3 = a(this.b, this.c);
            String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", new Object[]{Integer.valueOf(a3 != null ? a3.size() : 0), Integer.valueOf(this.d.g().t().a().size()), Integer.valueOf(this.d.c().c())});
            i.a().b(a, format, new Throwable[0]);
            throw new IllegalStateException(format, e2);
        } catch (Throwable th) {
            i.a().b(a, String.format("Unable to schedule %s", new Object[]{_eVar}), th);
        }
    }

    public void a(String str) {
        List<Integer> a2 = a(this.b, this.c, str);
        if (a2 != null && !a2.isEmpty()) {
            for (Integer intValue : a2) {
                a(this.c, intValue.intValue());
            }
            this.d.g().r().b(str);
        }
    }

    private static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            i.a().b(a, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", new Object[]{Integer.valueOf(i)}), th);
        }
    }

    public static void a(Context context) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            List<JobInfo> a2 = a(context, jobScheduler);
            if (a2 != null && !a2.isEmpty()) {
                for (JobInfo id : a2) {
                    a(jobScheduler, id.getId());
                }
            }
        }
    }

    private static List<JobInfo> a(Context context, JobScheduler jobScheduler) {
        List<JobInfo> list;
        try {
            list = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            i.a().b(a, "getAllPendingJobs() is not reliable on this device.", th);
            list = null;
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        ComponentName componentName = new ComponentName(context, SystemJobService.class);
        for (JobInfo jobInfo : list) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    private static List<Integer> a(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> a2 = a(context, jobScheduler);
        if (a2 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : a2) {
            PersistableBundle extras = jobInfo.getExtras();
            if (extras != null) {
                String str2 = "EXTRA_WORK_SPEC_ID";
                if (extras.containsKey(str2) && str.equals(extras.getString(str2))) {
                    arrayList.add(Integer.valueOf(jobInfo.getId()));
                }
            }
        }
        return arrayList;
    }
}
