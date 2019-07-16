package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: vyb reason: default package and case insensitive filesystem */
/* compiled from: RealCall */
final class C7578vyb implements Yxb {
    final C7440tyb a;
    /* access modifiers changed from: private */
    public C6551gzb b;
    final C7647wyb c;
    final boolean d;
    private boolean e;

    /* renamed from: vyb$a */
    /* compiled from: RealCall */
    final class a extends Jyb {
        private final Zxb b;
        private volatile AtomicInteger c = new AtomicInteger(0);

        a(Zxb zxb) {
            super("OkHttp %s", C7578vyb.this.c());
            this.b = zxb;
        }

        /* access modifiers changed from: 0000 */
        public void a(a aVar) {
            this.c = aVar.c;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x002d A[SYNTHETIC, Splitter:B:12:0x002d] */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x004d A[Catch:{ all -> 0x0026 }] */
        public void b() {
            boolean z;
            IOException e;
            C7578vyb.this.b.i();
            try {
                z = true;
                try {
                    this.b.a((Yxb) C7578vyb.this, C7578vyb.this.a());
                } catch (IOException e2) {
                    e = e2;
                    if (!z) {
                    }
                    C7578vyb.this.a.q().b(this);
                }
            } catch (IOException e3) {
                e = e3;
                z = false;
                if (!z) {
                    try {
                        _zb a = _zb.a();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Callback failure for ");
                        sb.append(C7578vyb.this.d());
                        a.a(4, sb.toString(), (Throwable) e);
                    } catch (Throwable th) {
                        C7578vyb.this.a.q().b(this);
                        throw th;
                    }
                } else {
                    this.b.a((Yxb) C7578vyb.this, e);
                }
                C7578vyb.this.a.q().b(this);
            }
            C7578vyb.this.a.q().b(this);
        }

        /* access modifiers changed from: 0000 */
        public AtomicInteger c() {
            return this.c;
        }

        /* access modifiers changed from: 0000 */
        public C7578vyb d() {
            return C7578vyb.this;
        }

        /* access modifiers changed from: 0000 */
        public String e() {
            return C7578vyb.this.c.g().g();
        }

        /* access modifiers changed from: 0000 */
        public void a(ExecutorService executorService) {
            try {
                executorService.execute(this);
            } catch (RejectedExecutionException e) {
                InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                interruptedIOException.initCause(e);
                C7578vyb.this.b.a((IOException) interruptedIOException);
                this.b.a((Yxb) C7578vyb.this, (IOException) interruptedIOException);
                C7578vyb.this.a.q().b(this);
            } catch (Throwable th) {
                C7578vyb.this.a.q().b(this);
                throw th;
            }
        }
    }

    private C7578vyb(C7440tyb tyb, C7647wyb wyb, boolean z) {
        this.a = tyb;
        this.c = wyb;
        this.d = z;
    }

    public boolean b() {
        return this.b.f();
    }

    /* access modifiers changed from: 0000 */
    public String c() {
        return this.c.g().l();
    }

    /* access modifiers changed from: 0000 */
    public String d() {
        StringBuilder sb = new StringBuilder();
        sb.append(b() ? "canceled " : "");
        sb.append(this.d ? "web socket" : "call");
        sb.append(" to ");
        sb.append(c());
        return sb.toString();
    }

    public Ayb execute() throws IOException {
        synchronized (this) {
            if (!this.e) {
                this.e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.b.i();
        this.b.a();
        try {
            this.a.q().a(this);
            return a();
        } finally {
            this.a.q().b(this);
        }
    }

    public C7647wyb x() {
        return this.c;
    }

    static C7578vyb a(C7440tyb tyb, C7647wyb wyb, boolean z) {
        C7578vyb vyb = new C7578vyb(tyb, wyb, z);
        vyb.b = new C6551gzb(tyb, vyb);
        return vyb;
    }

    public C7578vyb clone() {
        return a(this.a, this.c, this.d);
    }

    public void a(Zxb zxb) {
        synchronized (this) {
            if (!this.e) {
                this.e = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        this.b.a();
        this.a.q().a(new a(zxb));
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a5  */
    public Ayb a() throws IOException {
        Throwable th;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.a.B());
        arrayList.add(new C7304rzb(this.a));
        arrayList.add(new C6619hzb(this.a.p()));
        arrayList.add(new Nyb(this.a.C()));
        arrayList.add(new Xyb(this.a));
        if (!this.d) {
            arrayList.addAll(this.a.D());
        }
        arrayList.add(new C6687izb(this.d));
        C7097ozb ozb = new C7097ozb(arrayList, this.b, null, 0, this.c, this, this.a.m(), this.a.K(), this.a.O());
        boolean z = false;
        try {
            Ayb a2 = ozb.a(this.c);
            if (!this.b.f()) {
                this.b.a((IOException) null);
                return a2;
            }
            Kyb.a((Closeable) a2);
            throw new IOException("Canceled");
        } catch (IOException e2) {
            throw this.b.a(e2);
        } catch (Throwable th2) {
            th = th2;
            z = true;
            if (!z) {
            }
            throw th;
        }
    }
}
