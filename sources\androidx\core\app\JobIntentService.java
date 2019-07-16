package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobInfo.Builder;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.IBinder;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class JobIntentService extends Service {
    static final Object a = new Object();
    static final HashMap<ComponentName, h> b = new HashMap<>();
    b c;
    h d;
    a e;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    final ArrayList<d> i;

    final class a extends AsyncTask<Void, Void, Void> {
        a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                e a2 = JobIntentService.this.a();
                if (a2 == null) {
                    return null;
                }
                JobIntentService.this.a(a2.getIntent());
                a2.i();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.d();
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onCancelled(Void voidR) {
            JobIntentService.this.d();
        }
    }

    interface b {
        IBinder a();

        e b();
    }

    static final class c extends h {
        private final Context d;
        private final WakeLock e;
        private final WakeLock f;
        boolean g;
        boolean h;

        c(Context context, ComponentName componentName) {
            super(componentName);
            this.d = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getClassName());
            sb.append(":launch");
            this.e = powerManager.newWakeLock(1, sb.toString());
            this.e.setReferenceCounted(false);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(componentName.getClassName());
            sb2.append(":run");
            this.f = powerManager.newWakeLock(1, sb2.toString());
            this.f.setReferenceCounted(false);
        }

        /* access modifiers changed from: 0000 */
        public void a(Intent intent) {
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.a);
            if (this.d.startService(intent2) != null) {
                synchronized (this) {
                    if (!this.g) {
                        this.g = true;
                        if (!this.h) {
                            this.e.acquire(60000);
                        }
                    }
                }
            }
        }

        public void b() {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    this.f.acquire(600000);
                    this.e.release();
                }
            }
        }

        public void c() {
            synchronized (this) {
                this.g = false;
            }
        }

        public void a() {
            synchronized (this) {
                if (this.h) {
                    if (this.g) {
                        this.e.acquire(60000);
                    }
                    this.h = false;
                    this.f.release();
                }
            }
        }
    }

    final class d implements e {
        final Intent a;
        final int b;

        d(Intent intent, int i) {
            this.a = intent;
            this.b = i;
        }

        public Intent getIntent() {
            return this.a;
        }

        public void i() {
            JobIntentService.this.stopSelf(this.b);
        }
    }

    interface e {
        Intent getIntent();

        void i();
    }

    static final class f extends JobServiceEngine implements b {
        final JobIntentService a;
        final Object b = new Object();
        JobParameters c;

        final class a implements e {
            final JobWorkItem a;

            a(JobWorkItem jobWorkItem) {
                this.a = jobWorkItem;
            }

            public Intent getIntent() {
                return this.a.getIntent();
            }

            public void i() {
                synchronized (f.this.b) {
                    if (f.this.c != null) {
                        f.this.c.completeWork(this.a);
                    }
                }
            }
        }

        f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.a = jobIntentService;
        }

        public IBinder a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
            r1.getIntent().setExtrasClassLoader(r3.a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0025, code lost:
            return new androidx.core.app.JobIntentService.f.a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r1 == null) goto L_0x0026;
         */
        public e b() {
            synchronized (this.b) {
                if (this.c == null) {
                    return null;
                }
                JobWorkItem dequeueWork = this.c.dequeueWork();
            }
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

    static final class g extends h {
        private final JobInfo d;
        private final JobScheduler e;

        g(Context context, ComponentName componentName, int i) {
            super(componentName);
            a(i);
            this.d = new Builder(i, this.a).setOverrideDeadline(0).build();
            this.e = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        /* access modifiers changed from: 0000 */
        public void a(Intent intent) {
            this.e.enqueue(this.d, new JobWorkItem(intent));
        }
    }

    static abstract class h {
        final ComponentName a;
        boolean b;
        int c;

        h(ComponentName componentName) {
            this.a = componentName;
        }

        public void a() {
        }

        /* access modifiers changed from: 0000 */
        public void a(int i) {
            if (!this.b) {
                this.b = true;
                this.c = i;
            } else if (this.c != i) {
                StringBuilder sb = new StringBuilder();
                sb.append("Given job ID ");
                sb.append(i);
                sb.append(" is different than previous ");
                sb.append(this.c);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        /* access modifiers changed from: 0000 */
        public abstract void a(Intent intent);

        public void b() {
        }

        public void c() {
        }
    }

    public JobIntentService() {
        if (VERSION.SDK_INT >= 26) {
            this.i = null;
        } else {
            this.i = new ArrayList<>();
        }
    }

    public static void a(Context context, Class cls, int i2, Intent intent) {
        a(context, new ComponentName(context, cls), i2, intent);
    }

    /* access modifiers changed from: protected */
    public abstract void a(Intent intent);

    /* access modifiers changed from: 0000 */
    public boolean b() {
        a aVar = this.e;
        if (aVar != null) {
            aVar.cancel(this.f);
        }
        this.g = true;
        return c();
    }

    public boolean c() {
        return true;
    }

    /* access modifiers changed from: 0000 */
    public void d() {
        ArrayList<d> arrayList = this.i;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.e = null;
                if (this.i != null && this.i.size() > 0) {
                    a(false);
                } else if (!this.h) {
                    this.d.a();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (VERSION.SDK_INT >= 26) {
            this.c = new f(this);
            this.d = null;
            return;
        }
        this.c = null;
        this.d = a((Context) this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<d> arrayList = this.i;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.h = true;
                this.d.a();
            }
        }
    }

    public int onStartCommand(Intent intent, int i2, int i3) {
        if (this.i == null) {
            return 2;
        }
        this.d.c();
        synchronized (this.i) {
            ArrayList<d> arrayList = this.i;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new d(intent, i3));
            a(true);
        }
        return 3;
    }

    public static void a(Context context, ComponentName componentName, int i2, Intent intent) {
        if (intent != null) {
            synchronized (a) {
                h a2 = a(context, componentName, true, i2);
                a2.a(i2);
                a2.a(intent);
            }
            return;
        }
        throw new IllegalArgumentException("work must not be null");
    }

    static h a(Context context, ComponentName componentName, boolean z, int i2) {
        h hVar;
        h hVar2 = (h) b.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (VERSION.SDK_INT < 26) {
            hVar = new c(context, componentName);
        } else if (z) {
            hVar = new g(context, componentName, i2);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        h hVar3 = hVar;
        b.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) {
        if (this.e == null) {
            this.e = new a();
            h hVar = this.d;
            if (hVar != null && z) {
                hVar.b();
            }
            this.e.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: 0000 */
    public e a() {
        b bVar = this.c;
        if (bVar != null) {
            return bVar.b();
        }
        synchronized (this.i) {
            if (this.i.size() <= 0) {
                return null;
            }
            e eVar = (e) this.i.remove(0);
            return eVar;
        }
    }
}
