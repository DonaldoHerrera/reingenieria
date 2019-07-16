package com.evernote.android.job;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.evernote.android.job.JobCreator.AddJobCreatorReceiver;
import com.evernote.android.job.n.a;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: JobManager */
public final class l {
    private static final Dj a = new Dj("JobManager");
    @SuppressLint({"StaticFieldLeak"})
    private static volatile l b;
    private final Context c;
    private final h d = new h();
    private final j e = new j();
    /* access modifiers changed from: private */
    public volatile u f;
    /* access modifiers changed from: private */
    public final CountDownLatch g;

    private l(Context context) {
        this.c = context;
        if (!g.i()) {
            JobRescheduleService.a(this.c);
        }
        this.g = new CountDownLatch(1);
        new k(this, "AndroidJob-storage-init", context).start();
    }

    private synchronized int c(String str) {
        int i;
        i = 0;
        for (s b2 : a(str, true, false)) {
            if (b(b2)) {
                i++;
            }
        }
        for (c a2 : TextUtils.isEmpty(str) ? b() : b(str)) {
            if (a(a2)) {
                i++;
            }
        }
        return i;
    }

    public static l g() {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    throw new IllegalStateException("You need to call create() at least once to create the singleton");
                }
            }
        }
        return b;
    }

    public c b(int i) {
        return this.e.a(i);
    }

    /* access modifiers changed from: 0000 */
    public h d() {
        return this.d;
    }

    /* access modifiers changed from: 0000 */
    public j e() {
        return this.e;
    }

    /* access modifiers changed from: 0000 */
    public u f() {
        if (this.f == null) {
            try {
                this.g.await(20, TimeUnit.SECONDS);
            } catch (InterruptedException e2) {
                throw new RuntimeException(e2);
            }
        }
        if (this.f != null) {
            return this.f;
        }
        throw new IllegalStateException("Job storage shouldn't be null");
    }

    public Set<c> b() {
        return this.e.c();
    }

    public static l a(Context context) throws m {
        if (b == null) {
            synchronized (l.class) {
                if (b == null) {
                    Fj.a(context, (Object) "Context cannot be null");
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    e a2 = e.a(context);
                    if (a2 == e.V_14) {
                        if (!a2.c(context)) {
                            throw new m("All APIs are disabled, cannot schedule any job");
                        }
                    }
                    b = new l(context);
                    if (!Gj.b(context)) {
                        a.d("No wake lock permission");
                    }
                    if (!Gj.a(context)) {
                        a.d("No boot permission");
                    }
                    b(context);
                }
            }
        }
        return b;
    }

    public Set<c> b(String str) {
        return this.e.a(str);
    }

    private boolean b(s sVar) {
        if (sVar == null) {
            return false;
        }
        a.c("Found pending job %s, canceling", sVar);
        a(sVar.j()).a(sVar.k());
        f().b(sVar);
        sVar.a(0);
        return true;
    }

    private static void b(Context context) {
        List<ResolveInfo> list;
        String packageName = context.getPackageName();
        Intent intent = new Intent("com.evernote.android.job.ADD_JOB_CREATOR");
        intent.setPackage(packageName);
        try {
            list = context.getPackageManager().queryBroadcastReceivers(intent, 0);
        } catch (Exception unused) {
            list = Collections.emptyList();
        }
        for (ResolveInfo resolveInfo : list) {
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (activityInfo != null && !activityInfo.exported && packageName.equals(activityInfo.packageName) && !TextUtils.isEmpty(activityInfo.name)) {
                try {
                    ((AddJobCreatorReceiver) Class.forName(activityInfo.name).newInstance()).a(context, b);
                } catch (Exception unused2) {
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public Context c() {
        return this.c;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0074 */
    public synchronized void a(s sVar) {
        e j;
        boolean u;
        boolean z;
        if (this.d.a()) {
            a.d("you haven't registered a JobCreator with addJobCreator(), it's likely that your job never will be executed");
        }
        if (sVar.n() <= 0) {
            if (sVar.x()) {
                a(sVar.p());
            }
            a.a(this.c, sVar.k());
            j = sVar.j();
            u = sVar.u();
            z = u && j.b() && sVar.h() < sVar.i();
            sVar.a(g.a().currentTimeMillis());
            sVar.b(z);
            f().a(sVar);
            try {
                a(sVar, j, u, z);
            } catch (Exception e2) {
                f().b(sVar);
                throw e2;
            } catch (Exception e3) {
                if (j == e.V_14 || j == e.V_19) {
                    f().b(sVar);
                    throw e3;
                } else {
                    a(sVar, e.V_19.c(this.c) ? e.V_19 : e.V_14, u, z);
                }
            } catch (o ) {
                j.a();
                a(sVar, j, u, z);
            } catch (Exception e4) {
                f().b(sVar);
                throw e4;
            }
        }
    }

    private void a(s sVar, e eVar, boolean z, boolean z2) {
        n a2 = a(eVar);
        if (!z) {
            a2.d(sVar);
        } else if (z2) {
            a2.c(sVar);
        } else {
            a2.a(sVar);
        }
    }

    /* access modifiers changed from: 0000 */
    public s a(int i, boolean z) {
        s a2 = f().a(i);
        if (z || a2 == null || !a2.v()) {
            return a2;
        }
        return null;
    }

    public Set<s> a() {
        return a(null, false, true);
    }

    /* access modifiers changed from: 0000 */
    public Set<s> a(String str, boolean z, boolean z2) {
        Set<s> a2 = f().a(str, z);
        if (z2) {
            Iterator it = a2.iterator();
            while (it.hasNext()) {
                s sVar = (s) it.next();
                if (sVar.w() && !sVar.j().b(this.c).b(sVar)) {
                    f().b(sVar);
                    it.remove();
                }
            }
        }
        return a2;
    }

    public boolean a(int i) {
        boolean b2 = b(a(i, true)) | a(b(i));
        a.a(this.c, i);
        return b2;
    }

    public int a(String str) {
        return c(str);
    }

    private boolean a(c cVar) {
        if (cVar == null || !cVar.a(true)) {
            return false;
        }
        a.c("Cancel running %s", cVar);
        return true;
    }

    public void a(JobCreator jobCreator) {
        this.d.a(jobCreator);
    }

    /* access modifiers changed from: 0000 */
    public n a(e eVar) {
        return eVar.b(this.c);
    }
}
