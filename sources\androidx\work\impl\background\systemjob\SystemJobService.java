package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.i;
import androidx.work.impl.a;
import androidx.work.impl.m;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements a {
    private static final String a = i.a("SystemJobService");
    private m b;
    private final Map<String, JobParameters> c = new HashMap();

    public void a(String str, boolean z) {
        JobParameters jobParameters;
        i.a().a(a, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.c) {
            jobParameters = (JobParameters) this.c.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            this.b = m.a(getApplicationContext());
            this.b.e().a((a) this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                i.a().e(a, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        m mVar = this.b;
        if (mVar != null) {
            mVar.e().b((a) this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0082, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0089, code lost:
        r2 = new androidx.work.WorkerParameters.a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0092, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        r2.b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a2, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a4, code lost:
        r2.a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b2, code lost:
        if (android.os.Build.VERSION.SDK_INT < 28) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        r2.c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ba, code lost:
        r8.b.a(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00bf, code lost:
        return true;
     */
    public boolean onStartJob(JobParameters jobParameters) {
        if (this.b == null) {
            i.a().a(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            i.a().b(a, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            i.a().b(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.c) {
            if (this.c.containsKey(string)) {
                i.a().a(a, String.format("Job is already being executed by SystemJobService: %s", new Object[]{string}), new Throwable[0]);
                return false;
            }
            i.a().a(a, String.format("onStartJob for %s", new Object[]{string}), new Throwable[0]);
            this.c.put(string, jobParameters);
        }
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.b == null) {
            i.a().a(a, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        PersistableBundle extras = jobParameters.getExtras();
        if (extras == null) {
            i.a().b(a, "No extras in JobParameters.", new Throwable[0]);
            return false;
        }
        String string = extras.getString("EXTRA_WORK_SPEC_ID");
        if (TextUtils.isEmpty(string)) {
            i.a().b(a, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        i.a().a(a, String.format("onStopJob for %s", new Object[]{string}), new Throwable[0]);
        synchronized (this.c) {
            this.c.remove(string);
        }
        this.b.e(string);
        return !this.b.e().a(string);
    }
}
