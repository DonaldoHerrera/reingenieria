package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy.Type;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: bzb reason: default package and case insensitive filesystem */
/* compiled from: RealConnectionPool */
public final class C5683bzb {
    private static final Executor a;
    private final int b;
    private final long c;
    private final Runnable d = new Wyb(this);
    private final Deque<C5615azb> e = new ArrayDeque();
    final C6279czb f = new C6279czb();
    boolean g;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, BaseClientBuilder.API_PRIORITY_OTHER, 60, TimeUnit.SECONDS, new SynchronousQueue(), Kyb.a("OkHttp ConnectionPool", true));
        a = threadPoolExecutor;
    }

    public C5683bzb(int i, long j, TimeUnit timeUnit) {
        this.b = i;
        this.c = timeUnit.toNanos(j);
        if (j <= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("keepAliveDuration <= 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0025 */
    public /* synthetic */ void a() {
        while (true) {
            long a2 = a(System.nanoTime());
            if (a2 != -1) {
                if (a2 > 0) {
                    long j = a2 / 1000000;
                    long j2 = a2 - (1000000 * j);
                    synchronized (this) {
                        wait(j, (int) j2);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void b(C5615azb azb) {
        if (!this.g) {
            this.g = true;
            a.execute(this.d);
        }
        this.e.add(azb);
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Qxb qxb, C6551gzb gzb, List<Dyb> list, boolean z) {
        for (C5615azb azb : this.e) {
            if ((!z || azb.c()) && azb.a(qxb, list)) {
                gzb.a(azb);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public boolean a(C5615azb azb) {
        if (azb.k || this.b == 0) {
            this.e.remove(azb);
            return true;
        }
        notifyAll();
        return false;
    }

    /* access modifiers changed from: 0000 */
    public long a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            C5615azb azb = null;
            int i = 0;
            int i2 = 0;
            for (C5615azb azb2 : this.e) {
                if (a(azb2, j) > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - azb2.q;
                    if (j3 > j2) {
                        azb = azb2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.c) {
                if (i <= this.b) {
                    if (i > 0) {
                        long j4 = this.c - j2;
                        return j4;
                    } else if (i2 > 0) {
                        long j5 = this.c;
                        return j5;
                    } else {
                        this.g = false;
                        return -1;
                    }
                }
            }
            this.e.remove(azb);
            Kyb.a(azb.f());
            return 0;
        }
    }

    private int a(C5615azb azb, long j) {
        List<Reference<C6551gzb>> list = azb.p;
        int i = 0;
        while (i < list.size()) {
            Reference reference = (Reference) list.get(i);
            if (reference.get() != null) {
                i++;
            } else {
                a aVar = (a) reference;
                StringBuilder sb = new StringBuilder();
                sb.append("A connection to ");
                sb.append(azb.e().a().k());
                sb.append(" was leaked. Did you forget to close a response body?");
                _zb.a().a(sb.toString(), aVar.a);
                list.remove(i);
                azb.k = true;
                if (list.isEmpty()) {
                    azb.q = j - this.c;
                    return 0;
                }
            }
        }
        return list.size();
    }

    public void a(Dyb dyb, IOException iOException) {
        if (dyb.b().type() != Type.DIRECT) {
            Qxb a2 = dyb.a();
            a2.h().connectFailed(a2.k().n(), dyb.b().address(), iOException);
        }
        this.f.b(dyb);
    }
}
