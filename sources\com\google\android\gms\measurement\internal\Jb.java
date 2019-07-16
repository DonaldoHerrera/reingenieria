package com.google.android.gms.measurement.internal;

import android.os.Process;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;

final class Jb extends Thread {
    private final Object a = new Object();
    private final BlockingQueue<Kb<?>> b;
    private final /* synthetic */ Gb c;

    public Jb(Gb gb, String str, BlockingQueue<Kb<?>> blockingQueue) {
        this.c = gb;
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(blockingQueue);
        this.b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.a) {
            this.a.notifyAll();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0065, code lost:
        r1 = r6.c.j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006b, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r6.c.k.release();
        r6.c.j.notifyAll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0084, code lost:
        if (r6 != r6.c.d) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0086, code lost:
        r6.c.d = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0092, code lost:
        if (r6 != r6.c.e) goto L_0x009a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0094, code lost:
        r6.c.e = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x009a, code lost:
        r6.c.e().s().a("Current scheduler thread is neither worker nor network");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a9, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        return;
     */
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.c.k.acquire();
                z = true;
            } catch (InterruptedException e) {
                a(e);
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                Kb kb = (Kb) this.b.poll();
                if (kb != null) {
                    Process.setThreadPriority(kb.b ? threadPriority : 10);
                    kb.run();
                } else {
                    synchronized (this.a) {
                        if (this.b.peek() == null && !this.c.l) {
                            try {
                                this.a.wait(30000);
                            } catch (InterruptedException e2) {
                                a(e2);
                            }
                        }
                    }
                    synchronized (this.c.j) {
                        if (this.b.peek() == null) {
                        }
                    }
                }
            }
        } catch (Throwable th) {
            synchronized (this.c.j) {
                this.c.k.release();
                this.c.j.notifyAll();
                if (this == this.c.d) {
                    this.c.d = null;
                } else if (this == this.c.e) {
                    this.c.e = null;
                } else {
                    this.c.e().s().a("Current scheduler thread is neither worker nor network");
                }
                throw th;
            }
        }
    }

    private final void a(InterruptedException interruptedException) {
        this.c.e().v().a(String.valueOf(getName()).concat(" was interrupted"), interruptedException);
    }
}
