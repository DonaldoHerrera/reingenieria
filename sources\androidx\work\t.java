package androidx.work;

/* compiled from: Worker */
class t implements Runnable {
    final /* synthetic */ Worker a;

    t(Worker worker) {
        this.a = worker;
    }

    public void run() {
        try {
            this.a.e.b(this.a.m());
        } catch (Throwable th) {
            this.a.e.a(th);
        }
    }
}
