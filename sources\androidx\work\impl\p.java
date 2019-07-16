package androidx.work.impl;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.a.C0026a;
import androidx.work.ListenableWorker.a.c;
import androidx.work.WorkerParameters;
import androidx.work.b;
import androidx.work.e;
import androidx.work.h;
import androidx.work.i;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.f;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

/* compiled from: WorkerWrapper */
public class p implements Runnable {
    static final String a = i.a("WorkerWrapper");
    private Context b;
    private String c;
    private List<d> d;
    private androidx.work.WorkerParameters.a e;
    _e f;
    ListenableWorker g;
    androidx.work.ListenableWorker.a h = androidx.work.ListenableWorker.a.a();
    private b i;
    private C1811wf j;
    private WorkDatabase k;
    private C0305af l;
    private Ne m;
    private C1509mf n;
    private List<String> o;
    private String p;
    private C1781vf<Boolean> q = C1781vf.d();
    C3347xE<androidx.work.ListenableWorker.a> r = null;
    private volatile boolean s;

    /* compiled from: WorkerWrapper */
    public static class a {
        Context a;
        ListenableWorker b;
        C1811wf c;
        b d;
        WorkDatabase e;
        String f;
        List<d> g;
        androidx.work.WorkerParameters.a h = new androidx.work.WorkerParameters.a();

        public a(Context context, b bVar, C1811wf wfVar, WorkDatabase workDatabase, String str) {
            this.a = context.getApplicationContext();
            this.c = wfVar;
            this.d = bVar;
            this.e = workDatabase;
            this.f = str;
        }

        public a a(List<d> list) {
            this.g = list;
            return this;
        }

        public a a(androidx.work.WorkerParameters.a aVar) {
            if (aVar != null) {
                this.h = aVar;
            }
            return this;
        }

        public p a() {
            return new p(this);
        }
    }

    p(a aVar) {
        this.b = aVar.a;
        this.j = aVar.c;
        this.c = aVar.f;
        this.d = aVar.g;
        this.e = aVar.h;
        this.g = aVar.b;
        this.i = aVar.d;
        this.k = aVar.e;
        this.l = this.k.t();
        this.m = this.k.n();
        this.n = this.k.u();
    }

    private void d() {
        this.k.c();
        try {
            this.l.a(androidx.work.q.a.ENQUEUED, this.c);
            this.l.b(this.c, System.currentTimeMillis());
            this.l.a(this.c, -1);
            this.k.m();
        } finally {
            this.k.e();
            b(true);
        }
    }

    private void e() {
        this.k.c();
        try {
            this.l.b(this.c, System.currentTimeMillis());
            this.l.a(androidx.work.q.a.ENQUEUED, this.c);
            this.l.g(this.c);
            this.l.a(this.c, -1);
            this.k.m();
        } finally {
            this.k.e();
            b(false);
        }
    }

    private void f() {
        androidx.work.q.a b2 = this.l.b(this.c);
        if (b2 == androidx.work.q.a.RUNNING) {
            i.a().a(a, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", new Object[]{this.c}), new Throwable[0]);
            b(true);
            return;
        }
        i.a().a(a, String.format("Status for %s is %s; not doing any work", new Object[]{this.c, b2}), new Throwable[0]);
        b(false);
    }

    private void g() {
        e a2;
        if (!i()) {
            this.k.c();
            try {
                this.f = this.l.c(this.c);
                if (this.f == null) {
                    i.a().b(a, String.format("Didn't find WorkSpec for id %s", new Object[]{this.c}), new Throwable[0]);
                    b(false);
                } else if (this.f.d != androidx.work.q.a.ENQUEUED) {
                    f();
                    this.k.m();
                    i.a().a(a, String.format("%s is not in ENQUEUED state. Nothing more to do.", new Object[]{this.f.e}), new Throwable[0]);
                    this.k.e();
                } else {
                    if (this.f.d() || this.f.c()) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (!(this.f.p == 0) && currentTimeMillis < this.f.a()) {
                            i.a().a(a, String.format("Delaying execution for %s because it is being executed before schedule.", new Object[]{this.f.e}), new Throwable[0]);
                            b(true);
                            this.k.e();
                            return;
                        }
                    }
                    this.k.m();
                    this.k.e();
                    if (this.f.d()) {
                        a2 = this.f.g;
                    } else {
                        h a3 = h.a(this.f.f);
                        if (a3 == null) {
                            i.a().b(a, String.format("Could not create Input Merger %s", new Object[]{this.f.f}), new Throwable[0]);
                            c();
                            return;
                        }
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f.g);
                        arrayList.addAll(this.l.e(this.c));
                        a2 = a3.a((List<e>) arrayList);
                    }
                    WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.c), a2, this.o, this.e, this.f.m, this.i.a(), this.j, this.i.g());
                    if (this.g == null) {
                        this.g = this.i.g().b(this.b, this.f.e, workerParameters);
                    }
                    ListenableWorker listenableWorker = this.g;
                    if (listenableWorker == null) {
                        i.a().b(a, String.format("Could not create Worker %s", new Object[]{this.f.e}), new Throwable[0]);
                        c();
                    } else if (listenableWorker.h()) {
                        i.a().b(a, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", new Object[]{this.f.e}), new Throwable[0]);
                        c();
                    } else {
                        this.g.j();
                        if (!j()) {
                            f();
                        } else if (!i()) {
                            C1781vf d2 = C1781vf.d();
                            this.j.a().execute(new n(this, d2));
                            d2.a((Runnable) new o(this, d2, this.p), this.j.b());
                        }
                    }
                }
            } finally {
                this.k.e();
            }
        }
    }

    private void h() {
        this.k.c();
        try {
            this.l.a(androidx.work.q.a.SUCCEEDED, this.c);
            this.l.a(this.c, ((c) this.h).d());
            long currentTimeMillis = System.currentTimeMillis();
            for (String str : this.m.a(this.c)) {
                if (this.l.b(str) == androidx.work.q.a.BLOCKED && this.m.b(str)) {
                    i.a().c(a, String.format("Setting status to enqueued for %s", new Object[]{str}), new Throwable[0]);
                    this.l.a(androidx.work.q.a.ENQUEUED, str);
                    this.l.b(str, currentTimeMillis);
                }
            }
            this.k.m();
        } finally {
            this.k.e();
            b(false);
        }
    }

    private boolean i() {
        if (!this.s) {
            return false;
        }
        i.a().a(a, String.format("Work interrupted for %s", new Object[]{this.p}), new Throwable[0]);
        androidx.work.q.a b2 = this.l.b(this.c);
        if (b2 == null) {
            b(false);
        } else {
            b(!b2.a());
        }
        return true;
    }

    private boolean j() {
        this.k.c();
        try {
            boolean z = true;
            if (this.l.b(this.c) == androidx.work.q.a.ENQUEUED) {
                this.l.a(androidx.work.q.a.RUNNING, this.c);
                this.l.i(this.c);
            } else {
                z = false;
            }
            this.k.m();
            return z;
        } finally {
            this.k.e();
        }
    }

    public C3347xE<Boolean> a() {
        return this.q;
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        boolean z = false;
        if (!i()) {
            this.k.c();
            try {
                androidx.work.q.a b2 = this.l.b(this.c);
                if (b2 == null) {
                    b(false);
                    z = true;
                } else if (b2 == androidx.work.q.a.RUNNING) {
                    a(this.h);
                    z = this.l.b(this.c).a();
                } else if (!b2.a()) {
                    d();
                }
                this.k.m();
            } finally {
                this.k.e();
            }
        }
        List<d> list = this.d;
        if (list != null) {
            if (z) {
                for (d a2 : list) {
                    a2.a(this.c);
                }
            }
            e.a(this.i, this.k, this.d);
        }
    }

    /* access modifiers changed from: 0000 */
    public void c() {
        this.k.c();
        try {
            a(this.c);
            this.l.a(this.c, ((C0026a) this.h).d());
            this.k.m();
        } finally {
            this.k.e();
            b(false);
        }
    }

    public void run() {
        this.o = this.n.a(this.c);
        this.p = a(this.o);
        g();
    }

    public void a(boolean z) {
        this.s = true;
        i();
        C3347xE<androidx.work.ListenableWorker.a> xEVar = this.r;
        if (xEVar != null) {
            xEVar.cancel(true);
        }
        ListenableWorker listenableWorker = this.g;
        if (listenableWorker != null) {
            listenableWorker.l();
        }
    }

    private void a(androidx.work.ListenableWorker.a aVar) {
        if (aVar instanceof c) {
            i.a().c(a, String.format("Worker result SUCCESS for %s", new Object[]{this.p}), new Throwable[0]);
            if (this.f.d()) {
                e();
            } else {
                h();
            }
        } else if (aVar instanceof androidx.work.ListenableWorker.a.b) {
            i.a().c(a, String.format("Worker result RETRY for %s", new Object[]{this.p}), new Throwable[0]);
            d();
        } else {
            i.a().c(a, String.format("Worker result FAILURE for %s", new Object[]{this.p}), new Throwable[0]);
            if (this.f.d()) {
                e();
            } else {
                c();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x001e A[Catch:{ all -> 0x0039 }] */
    private void b(boolean z) {
        boolean z2;
        this.k.c();
        try {
            List d2 = this.k.t().d();
            if (d2 != null) {
                if (!d2.isEmpty()) {
                    z2 = false;
                    if (z2) {
                        f.a(this.b, RescheduleReceiver.class, false);
                    }
                    this.k.m();
                    this.k.e();
                    this.q.b(Boolean.valueOf(z));
                }
            }
            z2 = true;
            if (z2) {
            }
            this.k.m();
            this.k.e();
            this.q.b(Boolean.valueOf(z));
        } catch (Throwable th) {
            this.k.e();
            throw th;
        }
    }

    private void a(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.l.b(str2) != androidx.work.q.a.CANCELLED) {
                this.l.a(androidx.work.q.a.FAILED, str2);
            }
            linkedList.addAll(this.m.a(str2));
        }
    }

    private String a(List<String> list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.c);
        sb.append(", tags={ ");
        boolean z = true;
        for (String str : list) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }
}
