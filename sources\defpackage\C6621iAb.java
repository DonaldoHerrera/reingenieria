package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: iAb reason: default package and case insensitive filesystem */
/* compiled from: AsyncTimeout */
public class C6621iAb extends JAb {
    private static final long e = TimeUnit.SECONDS.toMillis(60);
    private static final long f = TimeUnit.MILLISECONDS.toNanos(e);
    static C6621iAb g;
    private boolean h;
    private C6621iAb i;
    private long j;

    /* renamed from: iAb$a */
    /* compiled from: AsyncTimeout */
    private static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r1.j();
         */
        public void run() {
            while (true) {
                try {
                    synchronized (C6621iAb.class) {
                        C6621iAb g = C6621iAb.g();
                        if (g != null) {
                            if (g == C6621iAb.g) {
                                C6621iAb.g = null;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException unused) {
                }
            }
        }
    }

    private static synchronized void a(C6621iAb iab, long j2, boolean z) {
        synchronized (C6621iAb.class) {
            if (g == null) {
                g = new C6621iAb();
                new a().start();
            }
            long nanoTime = System.nanoTime();
            int i2 = (j2 > 0 ? 1 : (j2 == 0 ? 0 : -1));
            if (i2 != 0 && z) {
                iab.j = Math.min(j2, iab.c() - nanoTime) + nanoTime;
            } else if (i2 != 0) {
                iab.j = j2 + nanoTime;
            } else if (z) {
                iab.j = iab.c();
            } else {
                throw new AssertionError();
            }
            long b = iab.b(nanoTime);
            C6621iAb iab2 = g;
            while (true) {
                if (iab2.i == null) {
                    break;
                } else if (b < iab2.i.b(nanoTime)) {
                    break;
                } else {
                    iab2 = iab2.i;
                }
            }
            iab.i = iab2.i;
            iab2.i = iab;
            if (iab2 == g) {
                C6621iAb.class.notify();
            }
        }
    }

    private long b(long j2) {
        return this.j - j2;
    }

    static C6621iAb g() throws InterruptedException {
        C6621iAb iab = g.i;
        C6621iAb iab2 = null;
        if (iab == null) {
            long nanoTime = System.nanoTime();
            C6621iAb.class.wait(e);
            if (g.i == null && System.nanoTime() - nanoTime >= f) {
                iab2 = g;
            }
            return iab2;
        }
        long b = iab.b(System.nanoTime());
        if (b > 0) {
            long j2 = b / 1000000;
            C6621iAb.class.wait(j2, (int) (b - (1000000 * j2)));
            return null;
        }
        g.i = iab.i;
        iab.i = null;
        return iab;
    }

    public final void h() {
        if (!this.h) {
            long f2 = f();
            boolean d = d();
            if (f2 != 0 || d) {
                this.h = true;
                a(this, f2, d);
                return;
            }
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean i() {
        if (!this.h) {
            return false;
        }
        this.h = false;
        return a(this);
    }

    /* access modifiers changed from: protected */
    public void j() {
    }

    /* access modifiers changed from: protected */
    public IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    private static synchronized boolean a(C6621iAb iab) {
        synchronized (C6621iAb.class) {
            for (C6621iAb iab2 = g; iab2 != null; iab2 = iab2.i) {
                if (iab2.i == iab) {
                    iab2.i = iab.i;
                    iab.i = null;
                    return false;
                }
            }
            return true;
        }
    }

    public final GAb a(GAb gAb) {
        return new C6485gAb(this, gAb);
    }

    public final HAb a(HAb hAb) {
        return new C6553hAb(this, hAb);
    }

    /* access modifiers changed from: 0000 */
    public final void a(boolean z) throws IOException {
        if (i() && z) {
            throw b((IOException) null);
        }
    }

    /* access modifiers changed from: 0000 */
    public final IOException a(IOException iOException) throws IOException {
        if (!i()) {
            return iOException;
        }
        return b(iOException);
    }
}
