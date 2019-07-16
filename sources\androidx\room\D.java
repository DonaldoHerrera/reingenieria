package androidx.room;

/* compiled from: TransactionExecutor */
class D implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ E b;

    D(E e, Runnable runnable) {
        this.b = e;
        this.a = runnable;
    }

    public void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
