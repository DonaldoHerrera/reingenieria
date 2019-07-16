package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: Nzb reason: default package */
/* compiled from: Http2Stream */
public final class Nzb {
    long a = 0;
    long b;
    final int c;
    final Gzb d;
    private final Deque<C7026nyb> e = new ArrayDeque();
    private boolean f;
    private final b g;
    final a h;
    final c i = new c();
    final c j = new c();
    C7649wzb k;
    IOException l;

    /* renamed from: Nzb$a */
    /* compiled from: Http2Stream */
    final class a implements GAb {
        private final C6825lAb a = new C6825lAb();
        private C7026nyb b;
        boolean c;
        boolean d;

        a() {
        }

        public void a(C6825lAb lab, long j) throws IOException {
            this.a.a(lab, j);
            while (this.a.size() >= PlaybackStateCompat.ACTION_PREPARE) {
                a(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            if (r8.a.size() <= 0) goto L_0x0022;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
            r2 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
            if (r8.b == null) goto L_0x0029;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
            r3 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
            if (r3 == false) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
            if (r8.a.size() <= 0) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
            a(false);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
            r0 = r8.e;
            r0.d.a(r0.c, true, defpackage.Kyb.a(r8.b));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
            if (r2 == false) goto L_0x005a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
            if (r8.a.size() <= 0) goto L_0x0067;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0056, code lost:
            a(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x005a, code lost:
            r0 = r8.e;
            r0.d.a(r0.c, true, (defpackage.C6825lAb) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0067, code lost:
            r2 = r8.e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0069, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            r8.c = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x006c, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x006d, code lost:
            r8.e.d.flush();
            r8.e.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.e.h.d != false) goto L_0x0067;
         */
        public void close() throws IOException {
            synchronized (Nzb.this) {
                if (this.c) {
                }
            }
        }

        public void flush() throws IOException {
            synchronized (Nzb.this) {
                Nzb.this.b();
            }
            while (this.a.size() > 0) {
                a(false);
                Nzb.this.d.flush();
            }
        }

        public JAb k() {
            return Nzb.this.j;
        }

        /* JADX INFO: finally extract failed */
        private void a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (Nzb.this) {
                Nzb.this.j.h();
                while (Nzb.this.b <= 0 && !this.d && !this.c && Nzb.this.k == null) {
                    try {
                        Nzb.this.j();
                    } catch (Throwable th) {
                        Nzb.this.j.k();
                        throw th;
                    }
                }
                Nzb.this.j.k();
                Nzb.this.b();
                min = Math.min(Nzb.this.b, this.a.size());
                Nzb.this.b -= min;
            }
            Nzb.this.j.h();
            if (z) {
                try {
                    if (min == this.a.size()) {
                        z2 = true;
                        Nzb.this.d.a(Nzb.this.c, z2, this.a, min);
                        Nzb.this.j.k();
                    }
                } catch (Throwable th2) {
                    Nzb.this.j.k();
                    throw th2;
                }
            }
            z2 = false;
            Nzb.this.d.a(Nzb.this.c, z2, this.a, min);
            Nzb.this.j.k();
        }
    }

    /* renamed from: Nzb$b */
    /* compiled from: Http2Stream */
    private final class b implements HAb {
        private final C6825lAb a = new C6825lAb();
        private final C6825lAb b = new C6825lAb();
        private final long c;
        /* access modifiers changed from: private */
        public C7026nyb d;
        boolean e;
        boolean f;

        b(long j) {
            this.c = j;
        }

        public long b(C6825lAb lab, long j) throws IOException {
            Throwable th;
            long b2;
            if (j >= 0) {
                while (true) {
                    th = null;
                    synchronized (Nzb.this) {
                        Nzb.this.i.h();
                        try {
                            if (Nzb.this.k != null) {
                                if (Nzb.this.l != null) {
                                    th = Nzb.this.l;
                                } else {
                                    th = new Tzb(Nzb.this.k);
                                }
                            }
                            if (this.e) {
                                throw new IOException("stream closed");
                            } else if (this.b.size() > 0) {
                                b2 = this.b.b(lab, Math.min(j, this.b.size()));
                                Nzb.this.a += b2;
                                if (th == null && Nzb.this.a >= ((long) (Nzb.this.d.o.c() / 2))) {
                                    Nzb.this.d.b(Nzb.this.c, Nzb.this.a);
                                    Nzb.this.a = 0;
                                }
                            } else if (this.f || th != null) {
                                b2 = -1;
                            } else {
                                Nzb.this.j();
                            }
                        } finally {
                            Nzb.this.i.k();
                        }
                    }
                }
                b2 = -1;
                Nzb.this.i.k();
                if (b2 != -1) {
                    a(b2);
                    return b2;
                } else if (th == null) {
                    return -1;
                } else {
                    throw th;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public void close() throws IOException {
            long size;
            synchronized (Nzb.this) {
                this.e = true;
                size = this.b.size();
                this.b.i();
                Nzb.this.notifyAll();
            }
            if (size > 0) {
                a(size);
            }
            Nzb.this.a();
        }

        public JAb k() {
            return Nzb.this.i;
        }

        private void a(long j) {
            Nzb.this.d.h(j);
        }

        /* access modifiers changed from: 0000 */
        public void a(C6961nAb nab, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (Nzb.this) {
                    z = this.f;
                    z2 = true;
                    z3 = this.b.size() + j > this.c;
                }
                if (z3) {
                    nab.skip(j);
                    Nzb.this.a(C7649wzb.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    nab.skip(j);
                    return;
                } else {
                    long b2 = nab.b(this.a, j);
                    if (b2 != -1) {
                        j -= b2;
                        synchronized (Nzb.this) {
                            if (this.b.size() != 0) {
                                z2 = false;
                            }
                            this.b.a((HAb) this.a);
                            if (z2) {
                                Nzb.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }
    }

    /* renamed from: Nzb$c */
    /* compiled from: Http2Stream */
    class c extends C6621iAb {
        c() {
        }

        /* access modifiers changed from: protected */
        public IOException b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        /* access modifiers changed from: protected */
        public void j() {
            Nzb.this.a(C7649wzb.CANCEL);
        }

        public void k() throws IOException {
            if (i()) {
                throw b(null);
            }
        }
    }

    Nzb(int i2, Gzb gzb, boolean z, boolean z2, C7026nyb nyb) {
        if (gzb != null) {
            this.c = i2;
            this.d = gzb;
            this.b = (long) gzb.p.c();
            this.g = new b((long) gzb.o.c());
            this.h = new a();
            this.g.f = z2;
            this.h.d = z;
            if (nyb != null) {
                this.e.add(nyb);
            }
            if (f() && nyb != null) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            } else if (!f() && nyb == null) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            throw new NullPointerException("connection == null");
        }
    }

    private boolean b(C7649wzb wzb, IOException iOException) {
        synchronized (this) {
            if (this.k != null) {
                return false;
            }
            if (this.g.f && this.h.d) {
                return false;
            }
            this.k = wzb;
            this.l = iOException;
            notifyAll();
            this.d.d(this.c);
            return true;
        }
    }

    public void a(C7649wzb wzb, IOException iOException) throws IOException {
        if (b(wzb, iOException)) {
            this.d.b(this.c, wzb);
        }
    }

    public int c() {
        return this.c;
    }

    public GAb d() {
        synchronized (this) {
            if (!this.f) {
                if (!f()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.h;
    }

    public HAb e() {
        return this.g;
    }

    public boolean f() {
        if (this.d.b == ((this.c & 1) == 1)) {
            return true;
        }
        return false;
    }

    public synchronized boolean g() {
        if (this.k != null) {
            return false;
        }
        if ((this.g.f || this.g.e) && ((this.h.d || this.h.c) && this.f)) {
            return false;
        }
        return true;
    }

    public JAb h() {
        return this.i;
    }

    /* JADX INFO: finally extract failed */
    public synchronized C7026nyb i() throws IOException {
        this.i.h();
        while (this.e.isEmpty() && this.k == null) {
            try {
                j();
            } catch (Throwable th) {
                this.i.k();
                throw th;
            }
        }
        this.i.k();
        if (this.e.isEmpty()) {
            throw (this.l != null ? this.l : new Tzb(this.k));
        }
        return (C7026nyb) this.e.removeFirst();
    }

    /* access modifiers changed from: 0000 */
    public void j() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public JAb k() {
        return this.j;
    }

    public void a(C7649wzb wzb) {
        if (b(wzb, null)) {
            this.d.c(this.c, wzb);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(C6961nAb nab, int i2) throws IOException {
        this.g.a(nab, (long) i2);
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    public void a(C7026nyb nyb, boolean z) {
        boolean g2;
        synchronized (this) {
            if (this.f) {
                if (z) {
                    this.g.d = nyb;
                    if (z) {
                        this.g.f = true;
                    }
                    g2 = g();
                    notifyAll();
                }
            }
            this.f = true;
            this.e.add(nyb);
            if (z) {
            }
            g2 = g();
            notifyAll();
        }
        if (!g2) {
            this.d.d(this.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void b(C7649wzb wzb) {
        if (this.k == null) {
            this.k = wzb;
            notifyAll();
        }
    }

    /* access modifiers changed from: 0000 */
    public void b() throws IOException {
        a aVar = this.h;
        if (aVar.c) {
            throw new IOException("stream closed");
        } else if (!aVar.d) {
            C7649wzb wzb = this.k;
            if (wzb != null) {
                Throwable th = this.l;
                if (th == null) {
                    th = new Tzb(wzb);
                }
                throw th;
            }
        } else {
            throw new IOException("stream finished");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a() throws IOException {
        boolean z;
        boolean g2;
        synchronized (this) {
            z = !this.g.f && this.g.e && (this.h.d || this.h.c);
            g2 = g();
        }
        if (z) {
            a(C7649wzb.CANCEL, (IOException) null);
        } else if (!g2) {
            this.d.d(this.c);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(long j2) {
        this.b += j2;
        if (j2 > 0) {
            notifyAll();
        }
    }
}
