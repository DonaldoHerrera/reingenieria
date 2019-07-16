package androidx.work.impl.workers;

/* compiled from: ConstraintTrackingWorker */
class b implements Runnable {
    final /* synthetic */ C3347xE a;
    final /* synthetic */ ConstraintTrackingWorker b;

    b(ConstraintTrackingWorker constraintTrackingWorker, C3347xE xEVar) {
        this.b = constraintTrackingWorker;
        this.a = xEVar;
    }

    public void run() {
        synchronized (this.b.g) {
            if (this.b.h) {
                this.b.o();
            } else {
                this.b.i.b(this.a);
            }
        }
    }
}
