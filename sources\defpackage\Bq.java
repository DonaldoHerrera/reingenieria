package defpackage;

/* renamed from: Bq reason: default package */
/* compiled from: ConditionVariable */
public final class Bq {
    private boolean a;

    public synchronized void a() throws InterruptedException {
        while (!this.a) {
            wait();
        }
    }

    public synchronized boolean b() {
        boolean z;
        z = this.a;
        this.a = false;
        return z;
    }

    public synchronized boolean c() {
        if (this.a) {
            return false;
        }
        this.a = true;
        notifyAll();
        return true;
    }
}
