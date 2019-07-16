package androidx.work.impl;

import androidx.work.i;

/* compiled from: WorkerWrapper */
class n implements Runnable {
    final /* synthetic */ C1781vf a;
    final /* synthetic */ p b;

    n(p pVar, C1781vf vfVar) {
        this.b = pVar;
        this.a = vfVar;
    }

    public void run() {
        try {
            i.a().a(p.a, String.format("Starting work for %s", new Object[]{this.b.f.e}), new Throwable[0]);
            this.b.r = this.b.g.k();
            this.a.b(this.b.r);
        } catch (Throwable th) {
            this.a.a(th);
        }
    }
}
