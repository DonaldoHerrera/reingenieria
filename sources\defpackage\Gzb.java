package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: Gzb reason: default package */
/* compiled from: Http2Connection */
public final class Gzb implements Closeable {
    /* access modifiers changed from: private */
    public static final ExecutorService a;
    final boolean b;
    final b c;
    final Map<Integer, Nzb> d = new LinkedHashMap();
    final String e;
    int f;
    int g;
    boolean h;
    /* access modifiers changed from: private */
    public final ScheduledExecutorService i;
    private final ExecutorService j;
    final Rzb k;
    /* access modifiers changed from: private */
    public boolean l;
    long m = 0;
    long n;
    Szb o = new Szb();
    final Szb p = new Szb();
    boolean q = false;
    final Socket r;
    final Ozb s;
    final d t;
    final Set<Integer> u = new LinkedHashSet();

    /* renamed from: Gzb$a */
    /* compiled from: Http2Connection */
    public static class a {
        Socket a;
        String b;
        C6961nAb c;
        C6893mAb d;
        b e = b.a;
        Rzb f = Rzb.a;
        boolean g;
        int h;

        public a(boolean z) {
            this.g = z;
        }

        public a a(Socket socket, String str, C6961nAb nab, C6893mAb mab) {
            this.a = socket;
            this.b = str;
            this.c = nab;
            this.d = mab;
            return this;
        }

        public a a(b bVar) {
            this.e = bVar;
            return this;
        }

        public a a(int i) {
            this.h = i;
            return this;
        }

        public Gzb a() {
            return new Gzb(this);
        }
    }

    /* renamed from: Gzb$b */
    /* compiled from: Http2Connection */
    public static abstract class b {
        public static final b a = new Hzb();

        public void a(Gzb gzb) {
        }

        public abstract void a(Nzb nzb) throws IOException;
    }

    /* renamed from: Gzb$c */
    /* compiled from: Http2Connection */
    final class c extends Jyb {
        final boolean b;
        final int c;
        final int d;

        c(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", Gzb.this.e, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = z;
            this.c = i;
            this.d = i2;
        }

        public void b() {
            Gzb.this.a(this.b, this.c, this.d);
        }
    }

    /* renamed from: Gzb$d */
    /* compiled from: Http2Connection */
    class d extends Jyb implements b {
        final Mzb b;

        d(Mzb mzb) {
            super("OkHttp %s", Gzb.this.e);
            this.b = mzb;
        }

        public void a() {
        }

        public void a(int i, int i2, int i3, boolean z) {
        }

        public void a(boolean z, int i, C6961nAb nab, int i2) throws IOException {
            if (Gzb.this.b(i)) {
                Gzb.this.a(i, nab, i2, z);
                return;
            }
            Nzb a = Gzb.this.a(i);
            if (a == null) {
                Gzb.this.c(i, C7649wzb.PROTOCOL_ERROR);
                long j = (long) i2;
                Gzb.this.h(j);
                nab.skip(j);
                return;
            }
            a.a(nab, i2);
            if (z) {
                a.a(Kyb.c, true);
            }
        }

        /* access modifiers changed from: protected */
        public void b() {
            C7649wzb wzb;
            C7649wzb wzb2;
            C7649wzb wzb3 = C7649wzb.INTERNAL_ERROR;
            e = null;
            try {
                this.b.a((b) this);
                while (this.b.a(false, (b) this)) {
                }
                wzb = C7649wzb.NO_ERROR;
                try {
                    wzb2 = C7649wzb.CANCEL;
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                wzb = wzb3;
                try {
                    wzb = C7649wzb.PROTOCOL_ERROR;
                    wzb2 = C7649wzb.PROTOCOL_ERROR;
                    Gzb.this.a(wzb, wzb2, e);
                    Kyb.a((Closeable) this.b);
                } catch (Throwable th) {
                    th = th;
                    Gzb.this.a(wzb, wzb3, e);
                    Kyb.a((Closeable) this.b);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                wzb = wzb3;
                Gzb.this.a(wzb, wzb3, e);
                Kyb.a((Closeable) this.b);
                throw th;
            }
            Gzb.this.a(wzb, wzb2, e);
            Kyb.a((Closeable) this.b);
        }

        public void a(boolean z, int i, int i2, List<C7718xzb> list) {
            if (Gzb.this.b(i)) {
                Gzb.this.a(i, list, z);
                return;
            }
            synchronized (Gzb.this) {
                Nzb a = Gzb.this.a(i);
                if (a != null) {
                    a.a(Kyb.b(list), z);
                } else if (!Gzb.this.h) {
                    if (i > Gzb.this.f) {
                        if (i % 2 != Gzb.this.g % 2) {
                            int i3 = i;
                            Nzb nzb = new Nzb(i3, Gzb.this, false, z, Kyb.b(list));
                            Gzb.this.f = i;
                            Gzb.this.d.put(Integer.valueOf(i), nzb);
                            Gzb.a.execute(new Izb(this, "OkHttp %s stream %d", new Object[]{Gzb.this.e, Integer.valueOf(i)}, nzb));
                        }
                    }
                }
            }
        }

        public void a(int i, C7649wzb wzb) {
            if (Gzb.this.b(i)) {
                Gzb.this.a(i, wzb);
                return;
            }
            Nzb d = Gzb.this.d(i);
            if (d != null) {
                d.b(wzb);
            }
        }

        public void a(boolean z, Szb szb) {
            Nzb[] nzbArr;
            long j;
            int i;
            synchronized (Gzb.this) {
                int c2 = Gzb.this.p.c();
                if (z) {
                    Gzb.this.p.a();
                }
                Gzb.this.p.a(szb);
                a(szb);
                int c3 = Gzb.this.p.c();
                nzbArr = null;
                if (c3 == -1 || c3 == c2) {
                    j = 0;
                } else {
                    j = (long) (c3 - c2);
                    if (!Gzb.this.q) {
                        Gzb.this.q = true;
                    }
                    if (!Gzb.this.d.isEmpty()) {
                        nzbArr = (Nzb[]) Gzb.this.d.values().toArray(new Nzb[Gzb.this.d.size()]);
                    }
                }
                Gzb.a.execute(new Jzb(this, "OkHttp %s settings", Gzb.this.e));
            }
            if (nzbArr != null && j != 0) {
                for (Nzb nzb : nzbArr) {
                    synchronized (nzb) {
                        nzb.a(j);
                    }
                }
            }
        }

        private void a(Szb szb) {
            try {
                Gzb.this.i.execute(new Kzb(this, "OkHttp %s ACK Settings", new Object[]{Gzb.this.e}, szb));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void a(boolean z, int i, int i2) {
            if (z) {
                synchronized (Gzb.this) {
                    Gzb.this.l = false;
                    Gzb.this.notifyAll();
                }
                return;
            }
            try {
                Gzb.this.i.execute(new c(true, i, i2));
            } catch (RejectedExecutionException unused) {
            }
        }

        public void a(int i, C7649wzb wzb, C7030oAb oab) {
            Nzb[] nzbArr;
            oab.f();
            synchronized (Gzb.this) {
                nzbArr = (Nzb[]) Gzb.this.d.values().toArray(new Nzb[Gzb.this.d.size()]);
                Gzb.this.h = true;
            }
            for (Nzb nzb : nzbArr) {
                if (nzb.c() > i && nzb.f()) {
                    nzb.b(C7649wzb.REFUSED_STREAM);
                    Gzb.this.d(nzb.c());
                }
            }
        }

        public void a(int i, long j) {
            if (i == 0) {
                synchronized (Gzb.this) {
                    Gzb.this.n += j;
                    Gzb.this.notifyAll();
                }
                return;
            }
            Nzb a = Gzb.this.a(i);
            if (a != null) {
                synchronized (a) {
                    a.a(j);
                }
            }
        }

        public void a(int i, int i2, List<C7718xzb> list) {
            Gzb.this.a(i2, list);
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Kyb.a("OkHttp Http2Connection", true));
        a = threadPoolExecutor;
    }

    Gzb(a aVar) {
        a aVar2 = aVar;
        this.k = aVar2.f;
        boolean z = aVar2.g;
        this.b = z;
        this.c = aVar2.e;
        this.g = z ? 1 : 2;
        if (aVar2.g) {
            this.g += 2;
        }
        if (aVar2.g) {
            this.o.a(7, 16777216);
        }
        this.e = aVar2.b;
        this.i = new ScheduledThreadPoolExecutor(1, Kyb.a(Kyb.a("OkHttp %s Writer", this.e), false));
        if (aVar2.h != 0) {
            ScheduledExecutorService scheduledExecutorService = this.i;
            c cVar = new c(false, 0, 0);
            int i2 = aVar2.h;
            scheduledExecutorService.scheduleAtFixedRate(cVar, (long) i2, (long) i2, TimeUnit.MILLISECONDS);
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), Kyb.a(Kyb.a("OkHttp %s Push Observer", this.e), true));
        this.j = threadPoolExecutor;
        this.p.a(7, 65535);
        this.p.a(5, 16384);
        this.n = (long) this.p.c();
        this.r = aVar2.a;
        this.s = new Ozb(aVar2.d, this.b);
        this.t = new d(new Mzb(aVar2.c, this.b));
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0043  */
    private Nzb b(int i2, List<C7718xzb> list, boolean z) throws IOException {
        int i3;
        Nzb nzb;
        boolean z2;
        boolean z3 = !z;
        synchronized (this.s) {
            synchronized (this) {
                if (this.g > 1073741823) {
                    a(C7649wzb.REFUSED_STREAM);
                }
                if (!this.h) {
                    i3 = this.g;
                    this.g += 2;
                    nzb = new Nzb(i3, this, z3, false, null);
                    if (z && this.n != 0) {
                        if (nzb.b != 0) {
                            z2 = false;
                            if (nzb.g()) {
                                this.d.put(Integer.valueOf(i3), nzb);
                            }
                        }
                    }
                    z2 = true;
                    if (nzb.g()) {
                    }
                } else {
                    throw new C7580vzb();
                }
            }
            if (i2 == 0) {
                this.s.a(z3, i3, list);
            } else if (!this.b) {
                this.s.a(i2, i3, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (z2) {
            this.s.flush();
        }
        return nzb;
    }

    /* access modifiers changed from: 0000 */
    public boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public synchronized int c() {
        return this.p.b(BaseClientBuilder.API_PRIORITY_OTHER);
    }

    public void close() {
        a(C7649wzb.NO_ERROR, C7649wzb.CANCEL, (IOException) null);
    }

    /* access modifiers changed from: 0000 */
    public synchronized Nzb d(int i2) {
        Nzb nzb;
        nzb = (Nzb) this.d.remove(Integer.valueOf(i2));
        notifyAll();
        return nzb;
    }

    public void flush() throws IOException {
        this.s.flush();
    }

    /* access modifiers changed from: 0000 */
    public synchronized void h(long j2) {
        this.m += j2;
        if (this.m >= ((long) (this.o.c() / 2))) {
            b(0, this.m);
            this.m = 0;
        }
    }

    /* access modifiers changed from: 0000 */
    public void c(int i2, C7649wzb wzb) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.i;
            Azb azb = new Azb(this, "OkHttp %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, wzb);
            scheduledExecutorService.execute(azb);
        } catch (RejectedExecutionException unused) {
        }
    }

    public void d() throws IOException {
        a(true);
    }

    /* access modifiers changed from: 0000 */
    public synchronized Nzb a(int i2) {
        return (Nzb) this.d.get(Integer.valueOf(i2));
    }

    public Nzb a(List<C7718xzb> list, boolean z) throws IOException {
        return b(0, list, z);
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, boolean z, List<C7718xzb> list) throws IOException {
        this.s.a(z, i2, list);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:26|27|28) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r8.n), r8.s.b());
        r6 = (long) r3;
        r8.n -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0066, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x005a */
    public void a(int i2, boolean z, C6825lAb lab, long j2) throws IOException {
        int min;
        long j3;
        if (j2 == 0) {
            this.s.a(z, i2, lab, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    if (this.n > 0) {
                        break;
                    } else if (this.d.containsKey(Integer.valueOf(i2))) {
                        wait();
                    } else {
                        throw new IOException("stream closed");
                    }
                }
            }
            j2 -= j3;
            this.s.a(z && j2 == 0, i2, lab, min);
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z, int i2, int i3) {
        boolean z2;
        if (!z) {
            synchronized (this) {
                z2 = this.l;
                this.l = true;
            }
            if (z2) {
                a((IOException) null);
                return;
            }
        }
        try {
            this.s.a(z, i2, i3);
        } catch (IOException e2) {
            a(e2);
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, C7649wzb wzb) throws IOException {
        this.s.a(i2, wzb);
    }

    /* access modifiers changed from: 0000 */
    public void b(int i2, long j2) {
        try {
            ScheduledExecutorService scheduledExecutorService = this.i;
            Bzb bzb = new Bzb(this, "OkHttp Window Update %s stream %d", new Object[]{this.e, Integer.valueOf(i2)}, i2, j2);
            scheduledExecutorService.execute(bzb);
        } catch (RejectedExecutionException unused) {
        }
    }

    public synchronized boolean b() {
        return this.h;
    }

    public void a(C7649wzb wzb) throws IOException {
        synchronized (this.s) {
            synchronized (this) {
                if (!this.h) {
                    this.h = true;
                    int i2 = this.f;
                    this.s.a(i2, wzb, Kyb.a);
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003a */
    public void a(C7649wzb wzb, C7649wzb wzb2, IOException iOException) {
        try {
            a(wzb);
        } catch (IOException unused) {
        }
        Nzb[] nzbArr = null;
        synchronized (this) {
            if (!this.d.isEmpty()) {
                nzbArr = (Nzb[]) this.d.values().toArray(new Nzb[this.d.size()]);
                this.d.clear();
            }
        }
        if (nzbArr != null) {
            for (Nzb a2 : nzbArr) {
                try {
                    a2.a(wzb2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        this.s.close();
        try {
            this.r.close();
        } catch (IOException unused3) {
        }
        this.i.shutdown();
        this.j.shutdown();
    }

    /* access modifiers changed from: private */
    public void a(IOException iOException) {
        C7649wzb wzb = C7649wzb.PROTOCOL_ERROR;
        a(wzb, wzb, iOException);
    }

    /* access modifiers changed from: 0000 */
    public void a(boolean z) throws IOException {
        if (z) {
            this.s.a();
            this.s.b(this.o);
            int c2 = this.o.c();
            if (c2 != 65535) {
                this.s.b(0, (long) (c2 - 65535));
            }
        }
        new Thread(this.t).start();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r3 = r8;
        r2 = new defpackage.Czb(r3, "OkHttp %s Push Request[%s]", new java.lang.Object[]{r8.e, java.lang.Integer.valueOf(r9)}, r9, r10);
        a((defpackage.Jyb) r2);
     */
    public void a(int i2, List<C7718xzb> list) {
        synchronized (this) {
            if (this.u.contains(Integer.valueOf(i2))) {
                c(i2, C7649wzb.PROTOCOL_ERROR);
                return;
            }
            this.u.add(Integer.valueOf(i2));
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, List<C7718xzb> list, boolean z) {
        try {
            Dzb dzb = new Dzb(this, "OkHttp %s Push Headers[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, list, z);
            a((Jyb) dzb);
        } catch (RejectedExecutionException unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, C6961nAb nab, int i3, boolean z) throws IOException {
        C6825lAb lab = new C6825lAb();
        long j2 = (long) i3;
        nab.e(j2);
        nab.b(lab, j2);
        if (lab.size() == j2) {
            Ezb ezb = new Ezb(this, "OkHttp %s Push Data[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, lab, i3, z);
            a((Jyb) ezb);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(lab.size());
        sb.append(" != ");
        sb.append(i3);
        throw new IOException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    public void a(int i2, C7649wzb wzb) {
        Fzb fzb = new Fzb(this, "OkHttp %s Push Reset[%s]", new Object[]{this.e, Integer.valueOf(i2)}, i2, wzb);
        a((Jyb) fzb);
    }

    private synchronized void a(Jyb jyb) {
        if (!b()) {
            this.j.execute(jyb);
        }
    }
}
