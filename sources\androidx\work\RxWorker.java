package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.m;
import java.util.concurrent.Executor;

public abstract class RxWorker extends ListenableWorker {
    static final Executor e = new m();
    private a<androidx.work.ListenableWorker.a> f;

    static class a<T> implements KPa<T>, Runnable {
        final C1781vf<T> a = C1781vf.d();
        private VPa b;

        a() {
            this.a.a((Runnable) this, RxWorker.e);
        }

        public void a(VPa vPa) {
            this.b = vPa;
        }

        public void onSuccess(T t) {
            this.a.b(t);
        }

        public void run() {
            if (this.a.isCancelled()) {
                a();
            }
        }

        public void a(Throwable th) {
            this.a.a(th);
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            VPa vPa = this.b;
            if (vPa != null) {
                vPa.dispose();
            }
        }
    }

    public RxWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public void i() {
        super.i();
        a<androidx.work.ListenableWorker.a> aVar = this.f;
        if (aVar != null) {
            aVar.a();
            this.f = null;
        }
    }

    public C3347xE<androidx.work.ListenableWorker.a> k() {
        this.f = new a<>();
        m().b(n()).a(C6645iVa.a(f().b())).a((KPa<? super T>) this.f);
        return this.f.a;
    }

    public abstract IPa<androidx.work.ListenableWorker.a> m();

    /* access modifiers changed from: protected */
    public HPa n() {
        return C6645iVa.a(b());
    }
}
