package defpackage;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: oq reason: default package and case insensitive filesystem */
/* compiled from: Loader */
public final class C1582oq implements C1613pq {
    public static final b a = a(false, -9223372036854775807L);
    public static final b b = a(true, -9223372036854775807L);
    public static final b c = new b(2, -9223372036854775807L);
    public static final b d = new b(3, -9223372036854775807L);
    /* access modifiers changed from: private */
    public final ExecutorService e;
    /* access modifiers changed from: private */
    public c<? extends d> f;
    /* access modifiers changed from: private */
    public IOException g;

    /* renamed from: oq$a */
    /* compiled from: Loader */
    public interface a<T extends d> {
        b a(T t, long j, long j2, IOException iOException, int i);

        void a(T t, long j, long j2);

        void a(T t, long j, long j2, boolean z);
    }

    /* renamed from: oq$b */
    /* compiled from: Loader */
    public static final class b {
        /* access modifiers changed from: private */
        public final int a;
        /* access modifiers changed from: private */
        public final long b;

        private b(int i, long j) {
            this.a = i;
            this.b = j;
        }

        public boolean a() {
            int i = this.a;
            return i == 0 || i == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: oq$c */
    /* compiled from: Loader */
    private final class c<T extends d> extends Handler implements Runnable {
        public final int a;
        private final T b;
        private final long c;
        private a<T> d;
        private IOException e;
        private int f;
        private volatile Thread g;
        private volatile boolean h;
        private volatile boolean i;

        public c(Looper looper, T t, a<T> aVar, int i2, long j2) {
            super(looper);
            this.b = t;
            this.d = aVar;
            this.a = i2;
            this.c = j2;
        }

        private void b() {
            C1582oq.this.f = null;
        }

        private long c() {
            return (long) Math.min((this.f - 1) * 1000, 5000);
        }

        public void a(int i2) throws IOException {
            IOException iOException = this.e;
            if (iOException != null && this.f > i2) {
                throw iOException;
            }
        }

        public void handleMessage(Message message) {
            long j2;
            if (!this.i) {
                int i2 = message.what;
                if (i2 == 0) {
                    a();
                } else if (i2 != 4) {
                    b();
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j3 = elapsedRealtime - this.c;
                    if (this.h) {
                        this.d.a(this.b, elapsedRealtime, j3, false);
                        return;
                    }
                    int i3 = message.what;
                    if (i3 == 1) {
                        this.d.a(this.b, elapsedRealtime, j3, false);
                    } else if (i3 == 2) {
                        try {
                            this.d.a(this.b, elapsedRealtime, j3);
                        } catch (RuntimeException e2) {
                            Iq.a("LoadTask", "Unexpected exception handling load completed", e2);
                            C1582oq.this.g = new g(e2);
                        }
                    } else if (i3 == 3) {
                        this.e = (IOException) message.obj;
                        this.f++;
                        b a2 = this.d.a(this.b, elapsedRealtime, j3, this.e, this.f);
                        if (a2.a == 3) {
                            C1582oq.this.g = this.e;
                        } else if (a2.a != 2) {
                            if (a2.a == 1) {
                                this.f = 1;
                            }
                            if (a2.b != -9223372036854775807L) {
                                j2 = a2.b;
                            } else {
                                j2 = c();
                            }
                            a(j2);
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            String str = "LoadTask";
            try {
                this.g = Thread.currentThread();
                if (!this.h) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("load:");
                    sb.append(this.b.getClass().getSimpleName());
                    _q.a(sb.toString());
                    this.b.a();
                    _q.a();
                }
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e2) {
                if (!this.i) {
                    obtainMessage(3, e2).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C1852xq.b(this.h);
                if (!this.i) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e3) {
                Iq.a(str, "Unexpected exception loading stream", e3);
                if (!this.i) {
                    obtainMessage(3, new g(e3)).sendToTarget();
                }
            } catch (OutOfMemoryError e4) {
                Iq.a(str, "OutOfMemory error loading stream", e4);
                if (!this.i) {
                    obtainMessage(3, new g(e4)).sendToTarget();
                }
            } catch (Error e5) {
                Iq.a(str, "Unexpected error loading stream", e5);
                if (!this.i) {
                    obtainMessage(4, e5).sendToTarget();
                }
                throw e5;
            } catch (Throwable th) {
                _q.a();
                throw th;
            }
        }

        public void a(long j2) {
            C1852xq.b(C1582oq.this.f == null);
            C1582oq.this.f = this;
            if (j2 > 0) {
                sendEmptyMessageDelayed(0, j2);
            } else {
                a();
            }
        }

        public void a(boolean z) {
            this.i = z;
            this.e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.h = true;
                this.b.b();
                if (this.g != null) {
                    this.g.interrupt();
                }
            }
            if (z) {
                b();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.d.a(this.b, elapsedRealtime, elapsedRealtime - this.c, true);
                this.d = null;
            }
        }

        private void a() {
            this.e = null;
            C1582oq.this.e.execute(C1582oq.this.f);
        }
    }

    /* renamed from: oq$d */
    /* compiled from: Loader */
    public interface d {
        void a() throws IOException, InterruptedException;

        void b();
    }

    /* renamed from: oq$e */
    /* compiled from: Loader */
    public interface e {
        void f();
    }

    /* renamed from: oq$f */
    /* compiled from: Loader */
    private static final class f implements Runnable {
        private final e a;

        public f(e eVar) {
            this.a = eVar;
        }

        public void run() {
            this.a.f();
        }
    }

    /* renamed from: oq$g */
    /* compiled from: Loader */
    public static final class g extends IOException {
        public g(Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            super(sb.toString(), th);
        }
    }

    public C1582oq(String str) {
        this.e = C0471ar.e(str);
    }

    public boolean b() {
        return this.f != null;
    }

    public static b a(boolean z, long j) {
        return new b(z ? 1 : 0, j);
    }

    public <T extends d> long a(T t, a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C1852xq.b(myLooper != null);
        this.g = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        c cVar = new c(myLooper, t, aVar, i, elapsedRealtime);
        cVar.a(0);
        return elapsedRealtime;
    }

    public void a() {
        this.f.a(false);
    }

    public void a(e eVar) {
        c<? extends d> cVar = this.f;
        if (cVar != null) {
            cVar.a(true);
        }
        if (eVar != null) {
            this.e.execute(new f(eVar));
        }
        this.e.shutdown();
    }

    public void a(int i) throws IOException {
        IOException iOException = this.g;
        if (iOException == null) {
            c<? extends d> cVar = this.f;
            if (cVar != null) {
                if (i == Integer.MIN_VALUE) {
                    i = cVar.a;
                }
                cVar.a(i);
                return;
            }
            return;
        }
        throw iOException;
    }
}
