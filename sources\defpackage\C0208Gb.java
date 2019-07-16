package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Gb reason: default package and case insensitive filesystem */
/* compiled from: SelfDestructiveThread */
public class C0208Gb {
    private final Object a = new Object();
    private HandlerThread b;
    private Handler c;
    private int d;
    private Callback e = new C0196Cb(this);
    private final int f;
    private final int g;
    private final String h;

    /* renamed from: Gb$a */
    /* compiled from: SelfDestructiveThread */
    public interface a<T> {
        void a(T t);
    }

    public C0208Gb(String str, int i, int i2) {
        this.h = str;
        this.g = i;
        this.f = i2;
        this.d = 0;
    }

    private void b(Runnable runnable) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new HandlerThread(this.h, this.g);
                this.b.start();
                this.c = new Handler(this.b.getLooper(), this.e);
                this.d++;
            }
            this.c.removeMessages(0);
            this.c.sendMessage(this.c.obtainMessage(1, runnable));
        }
    }

    public <T> void a(Callable<T> callable, a<T> aVar) {
        b(new C0202Eb(this, callable, new Handler(), aVar));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|11|12|(4:25|14|15|16)(1:17)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0045 A[SYNTHETIC] */
    public <T> T a(Callable<T> callable, int i) throws InterruptedException {
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition newCondition = reentrantLock.newCondition();
        AtomicReference atomicReference = new AtomicReference();
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
        C0205Fb fb = new C0205Fb(this, atomicReference, callable, reentrantLock, atomicBoolean, newCondition);
        b(fb);
        reentrantLock.lock();
        try {
            if (!atomicBoolean.get()) {
                return atomicReference.get();
            }
            long nanos = TimeUnit.MILLISECONDS.toNanos((long) i);
            do {
                nanos = newCondition.awaitNanos(nanos);
                if (atomicBoolean.get()) {
                    T t = atomicReference.get();
                    reentrantLock.unlock();
                    return t;
                }
            } while (nanos > 0);
            throw new InterruptedException("timeout");
        } finally {
            reentrantLock.unlock();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Runnable runnable) {
        runnable.run();
        synchronized (this.a) {
            this.c.removeMessages(0);
            this.c.sendMessageDelayed(this.c.obtainMessage(0), (long) this.f);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() {
        synchronized (this.a) {
            if (!this.c.hasMessages(1)) {
                this.b.quit();
                this.b = null;
                this.c = null;
            }
        }
    }
}
