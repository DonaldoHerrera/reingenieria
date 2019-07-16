package defpackage;

import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* renamed from: _Na reason: default package and case insensitive filesystem */
/* compiled from: PriorityAsyncTask */
public abstract class C5532_Na<Params, Progress, Result> extends C5299SNa<Params, Progress, Result> implements C5387VNa<C6434fOa>, C5702cOa, C6434fOa, C5358UNa {
    private final C6298dOa o = new C6298dOa();

    /* renamed from: _Na$a */
    /* compiled from: PriorityAsyncTask */
    private static class a<Result> implements Executor {
        private final Executor a;
        /* access modifiers changed from: private */
        public final C5532_Na b;

        public a(Executor executor, C5532_Na _na) {
            this.a = executor;
            this.b = _na;
        }

        public void execute(Runnable runnable) {
            this.a.execute(new C5503ZNa(this, runnable, null));
        }
    }

    public boolean b() {
        return ((C5387VNa) ((C5702cOa) g())).b();
    }

    public Collection<C6434fOa> c() {
        return ((C5387VNa) ((C5702cOa) g())).c();
    }

    public int compareTo(Object obj) {
        return C5474YNa.a(this, obj);
    }

    public <T extends C5387VNa<C6434fOa> & C5702cOa & C6434fOa> T g() {
        return this.o;
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a((Executor) new a(executorService, this), paramsArr);
    }

    public void a(C6434fOa foa) {
        if (d() == d.PENDING) {
            ((C5387VNa) ((C5702cOa) g())).a(foa);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public void a(boolean z) {
        ((C6434fOa) ((C5702cOa) g())).a(z);
    }

    public boolean a() {
        return ((C6434fOa) ((C5702cOa) g())).a();
    }

    public void a(Throwable th) {
        ((C6434fOa) ((C5702cOa) g())).a(th);
    }
}
