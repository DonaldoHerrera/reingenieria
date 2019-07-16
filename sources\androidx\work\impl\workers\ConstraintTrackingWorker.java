package androidx.work.impl.workers;

import android.content.Context;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.ListenableWorker.a;
import androidx.work.WorkerParameters;
import androidx.work.i;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.m;
import java.util.Collections;
import java.util.List;

public class ConstraintTrackingWorker extends ListenableWorker implements C1720te {
    private static final String e = i.a("ConstraintTrkngWrkr");
    private WorkerParameters f;
    final Object g = new Object();
    volatile boolean h = false;
    C1781vf<a> i = C1781vf.d();
    private ListenableWorker j;

    public ConstraintTrackingWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f = workerParameters;
    }

    public void a(List<String> list) {
        i.a().a(e, String.format("Constraints changed for %s", new Object[]{list}), new Throwable[0]);
        synchronized (this.g) {
            this.h = true;
        }
    }

    public void b(List<String> list) {
    }

    public C1811wf f() {
        return m.a(a()).h();
    }

    public void i() {
        super.i();
        ListenableWorker listenableWorker = this.j;
        if (listenableWorker != null) {
            listenableWorker.l();
        }
    }

    public C3347xE<a> k() {
        b().execute(new a(this));
        return this.i;
    }

    public WorkDatabase m() {
        return m.a(a()).g();
    }

    /* access modifiers changed from: 0000 */
    public void n() {
        this.i.b(a.a());
    }

    /* access modifiers changed from: 0000 */
    public void o() {
        this.i.b(a.b());
    }

    /* access modifiers changed from: 0000 */
    public void p() {
        String a = d().a("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(a)) {
            i.a().b(e, "No worker to delegate to.", new Throwable[0]);
            n();
            return;
        }
        this.j = g().b(a(), a, this.f);
        if (this.j == null) {
            i.a().a(e, "No worker to delegate to.", new Throwable[0]);
            n();
            return;
        }
        _e c = m().t().c(c().toString());
        if (c == null) {
            n();
            return;
        }
        C1750ue ueVar = new C1750ue(a(), f(), this);
        ueVar.c(Collections.singletonList(c));
        if (ueVar.a(c().toString())) {
            i.a().a(e, String.format("Constraints met for delegate %s", new Object[]{a}), new Throwable[0]);
            try {
                C3347xE k = this.j.k();
                k.a(new b(this, k), b());
            } catch (Throwable th) {
                i.a().a(e, String.format("Delegated worker %s threw exception in startWork.", new Object[]{a}), th);
                synchronized (this.g) {
                    if (this.h) {
                        i.a().a(e, "Constraints were unmet, Retrying.", new Throwable[0]);
                        o();
                    } else {
                        n();
                    }
                }
            }
        } else {
            i.a().a(e, String.format("Constraints not met for delegate %s. Requesting retry.", new Object[]{a}), new Throwable[0]);
            o();
        }
    }
}
