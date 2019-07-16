package com.google.android.gms.internal.cast;

import android.os.Handler;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.concurrent.atomic.AtomicReference;

@VisibleForTesting
final class P extends C0702ea {
    private final AtomicReference<N> a;
    private final Handler b;

    public P(N n) {
        this.a = new AtomicReference<>(n);
        this.b = new Ca(n.getLooper());
    }

    public final boolean C() {
        return this.a.get() == null;
    }

    public final N D() {
        N n = (N) this.a.getAndSet(null);
        if (n == null) {
            return null;
        }
        n.e();
        return n;
    }

    public final void a(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) {
        N n = (N) this.a.get();
        if (n != null) {
            n.d = applicationMetadata;
            n.u = applicationMetadata.i();
            n.v = str2;
            n.k = str;
            synchronized (N.b) {
                if (n.z != null) {
                    ResultHolder b2 = n.z;
                    Q q = new Q(new Status(0), applicationMetadata, str, str2, z);
                    b2.setResult(q);
                    n.z = null;
                }
            }
        }
    }

    public final void b(int i) {
        N D = D();
        if (D != null) {
            N.a.a("ICastDeviceControllerListener.onDisconnected: %d", Integer.valueOf(i));
            if (i != 0) {
                D.triggerConnectionSuspended(2);
            }
        }
    }

    public final void c(int i) {
        N n = (N) this.a.get();
        if (n != null) {
            n.b(i);
        }
    }

    public final void f(int i) {
        N n = (N) this.a.get();
        if (n != null) {
            n.b(i);
        }
    }

    public final void h(int i) {
        N n = (N) this.a.get();
        if (n != null) {
            n.u = null;
            n.v = null;
            n.b(i);
            if (n.f != null) {
                this.b.post(new T(this, n, i));
            }
        }
    }

    public final void a(int i) {
        N n = (N) this.a.get();
        if (n != null) {
            n.a(i);
        }
    }

    public final void a(String str, double d, boolean z) {
        N.a.a("Deprecated callback: \"onStatusreceived\"", new Object[0]);
    }

    public final void a(zzdb zzdb) {
        N n = (N) this.a.get();
        if (n != null) {
            N.a.a("onDeviceStatusChanged", new Object[0]);
            this.b.post(new S(this, n, zzdb));
        }
    }

    public final void a(zzcj zzcj) {
        N n = (N) this.a.get();
        if (n != null) {
            N.a.a("onApplicationStatusChanged", new Object[0]);
            this.b.post(new W(this, n, zzcj));
        }
    }

    public final void a(String str, String str2) {
        N n = (N) this.a.get();
        if (n != null) {
            N.a.a("Receive (type=text, ns=%s) %s", str, str2);
            this.b.post(new U(this, n, str, str2));
        }
    }

    public final void a(String str, byte[] bArr) {
        if (((N) this.a.get()) != null) {
            N.a.a("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
        }
    }

    public final void a(String str, long j, int i) {
        N n = (N) this.a.get();
        if (n != null) {
            n.a(j, i);
        }
    }

    public final void a(String str, long j) {
        N n = (N) this.a.get();
        if (n != null) {
            n.a(j, 0);
        }
    }
}
