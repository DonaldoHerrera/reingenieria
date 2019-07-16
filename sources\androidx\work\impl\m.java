package androidx.work.impl;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.work.WorkerParameters.a;
import androidx.work.b;
import androidx.work.b.C0027b;
import androidx.work.f;
import androidx.work.i;
import androidx.work.impl.background.systemjob.c;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.g;
import androidx.work.impl.utils.k;
import androidx.work.impl.utils.l;
import androidx.work.n;
import androidx.work.o;
import androidx.work.q;
import androidx.work.r;
import androidx.work.s;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: WorkManagerImpl */
public class m extends r {
    private static m a;
    private static m b;
    private static final Object c = new Object();
    private Context d;
    private b e;
    private WorkDatabase f;
    private C1811wf g;
    private List<d> h;
    private c i;
    private g j;
    private boolean k;
    private PendingResult l;

    public m(Context context, b bVar, C1811wf wfVar) {
        this(context, bVar, wfVar, context.getResources().getBoolean(o.workmanager_test_configuration));
    }

    @Deprecated
    public static m a() {
        synchronized (c) {
            if (a != null) {
                m mVar = a;
                return mVar;
            }
            m mVar2 = b;
            return mVar2;
        }
    }

    public Context b() {
        return this.d;
    }

    public b c() {
        return this.e;
    }

    public g d() {
        return this.j;
    }

    public c e() {
        return this.i;
    }

    public List<d> f() {
        return this.h;
    }

    public WorkDatabase g() {
        return this.f;
    }

    public C1811wf h() {
        return this.g;
    }

    public void i() {
        synchronized (c) {
            this.k = true;
            if (this.l != null) {
                this.l.finish();
                this.l = null;
            }
        }
    }

    public void j() {
        if (VERSION.SDK_INT >= 23) {
            c.a(b());
        }
        g().t().b();
        e.a(c(), g(), f());
    }

    private f b(String str, f fVar, n nVar) {
        androidx.work.g gVar;
        if (fVar == f.KEEP) {
            gVar = androidx.work.g.KEEP;
        } else {
            gVar = androidx.work.g.REPLACE;
        }
        return new f(this, str, gVar, Collections.singletonList(nVar));
    }

    public C3347xE<List<q>> c(String str) {
        k a2 = k.a(this, str);
        this.g.b().execute(a2);
        return a2.a();
    }

    public void d(String str) {
        a(str, (a) null);
    }

    public void e(String str) {
        this.g.a(new l(this, str));
    }

    public m(Context context, b bVar, C1811wf wfVar, boolean z) {
        Context applicationContext = context.getApplicationContext();
        WorkDatabase a2 = WorkDatabase.a(applicationContext, bVar.f(), z);
        i.a((i) new i.a(bVar.e()));
        Context context2 = context;
        b bVar2 = bVar;
        C1811wf wfVar2 = wfVar;
        WorkDatabase workDatabase = a2;
        List a3 = a(applicationContext, wfVar);
        c cVar = new c(context2, bVar2, wfVar2, workDatabase, a3);
        a(context2, bVar2, wfVar2, workDatabase, a3, cVar);
    }

    public static m a(Context context) {
        m a2;
        synchronized (c) {
            a2 = a();
            if (a2 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C0027b) {
                    a(applicationContext, ((C0027b) applicationContext).a());
                    a2 = a(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return a2;
    }

    public androidx.work.m b(String str) {
        androidx.work.impl.utils.c a2 = androidx.work.impl.utils.c.a(str, this, true);
        this.g.a(a2);
        return a2.a();
    }

    public static void a(Context context, b bVar) {
        synchronized (c) {
            if (a != null) {
                if (b != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class levelJavadoc for more information.");
                }
            }
            if (a == null) {
                Context applicationContext = context.getApplicationContext();
                if (b == null) {
                    b = new m(applicationContext, bVar, new C1871yf(bVar.f()));
                }
                a = b;
            }
        }
    }

    public androidx.work.m a(List<? extends s> list) {
        if (!list.isEmpty()) {
            return new f(this, list).a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    public androidx.work.m a(String str, f fVar, n nVar) {
        return b(str, fVar, nVar).a();
    }

    public androidx.work.m a(String str) {
        androidx.work.impl.utils.c a2 = androidx.work.impl.utils.c.a(str, this);
        this.g.a(a2);
        return a2.a();
    }

    public void a(String str, a aVar) {
        this.g.a(new androidx.work.impl.utils.i(this, str, aVar));
    }

    public void a(PendingResult pendingResult) {
        synchronized (c) {
            this.l = pendingResult;
            if (this.k) {
                this.l.finish();
                this.l = null;
            }
        }
    }

    private void a(Context context, b bVar, C1811wf wfVar, WorkDatabase workDatabase, List<d> list, c cVar) {
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext;
        this.e = bVar;
        this.g = wfVar;
        this.f = workDatabase;
        this.h = list;
        this.i = cVar;
        this.j = new g(this.d);
        this.k = false;
        this.g.a(new ForceStopRunnable(applicationContext, this));
    }

    public List<d> a(Context context, C1811wf wfVar) {
        return Arrays.asList(new d[]{e.a(context, this), new C1631qe(context, wfVar, this)});
    }
}
