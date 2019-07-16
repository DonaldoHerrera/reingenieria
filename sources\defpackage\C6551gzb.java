package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: gzb reason: default package and case insensitive filesystem */
/* compiled from: Transmitter */
public final class C6551gzb {
    private final C7440tyb a;
    private final C5683bzb b;
    private final Yxb c;
    private final C6889lyb d;
    private final C6621iAb e = new C6483fzb(this);
    private Object f;
    private C7647wyb g;
    private _yb h;
    public C5615azb i;
    private Zyb j;
    private boolean k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;

    /* renamed from: gzb$a */
    /* compiled from: Transmitter */
    static final class a extends WeakReference<C6551gzb> {
        final Object a;

        a(C6551gzb gzb, Object obj) {
            super(gzb);
            this.a = obj;
        }
    }

    public C6551gzb(C7440tyb tyb, Yxb yxb) {
        this.a = tyb;
        this.b = Iyb.a.a(tyb.n());
        this.c = yxb;
        this.d = tyb.s().a(yxb);
        this.e.a((long) tyb.k(), TimeUnit.MILLISECONDS);
    }

    private IOException b(IOException iOException) {
        if (this.n || !this.e.i()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public void a() {
        this.f = _zb.a().a("response.body().close()");
        this.d.b(this.c);
    }

    public void c() {
        Zyb zyb;
        C5615azb azb;
        synchronized (this.b) {
            this.m = true;
            zyb = this.j;
            if (this.h == null || this.h.a() == null) {
                azb = this.i;
            } else {
                azb = this.h.a();
            }
        }
        if (zyb != null) {
            zyb.a();
        } else if (azb != null) {
            azb.a();
        }
    }

    public void d() {
        synchronized (this.b) {
            if (!this.o) {
                this.j = null;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.j != null;
        }
        return z;
    }

    public boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.m;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public Socket g() {
        int i2 = 0;
        int size = this.i.p.size();
        while (true) {
            if (i2 >= size) {
                i2 = -1;
                break;
            } else if (((Reference) this.i.p.get(i2)).get() == this) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 != -1) {
            C5615azb azb = this.i;
            azb.p.remove(i2);
            this.i = null;
            if (!azb.p.isEmpty()) {
                return null;
            }
            azb.q = System.nanoTime();
            if (this.b.a(azb)) {
                return azb.f();
            }
            return null;
        }
        throw new IllegalStateException();
    }

    public void h() {
        if (!this.n) {
            this.n = true;
            this.e.i();
            return;
        }
        throw new IllegalStateException();
    }

    public void i() {
        this.e.h();
    }

    public void a(C7647wyb wyb) {
        C7647wyb wyb2 = this.g;
        if (wyb2 != null) {
            if (Kyb.a(wyb2.g(), wyb.g()) && this.h.b()) {
                return;
            }
            if (this.j != null) {
                throw new IllegalStateException();
            } else if (this.h != null) {
                a((IOException) null, true);
                this.h = null;
            }
        }
        this.g = wyb;
        _yb _yb = new _yb(this, this.b, a(wyb.g()), this.c, this.d);
        this.h = _yb;
    }

    public boolean b() {
        return this.h.c() && this.h.b();
    }

    private Qxb a(C7095oyb oyb) {
        _xb _xb;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        if (oyb.h()) {
            SSLSocketFactory N = this.a.N();
            hostnameVerifier = this.a.A();
            sSLSocketFactory = N;
            _xb = this.a.l();
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            _xb = null;
        }
        Qxb qxb = new Qxb(oyb.g(), oyb.j(), this.a.r(), this.a.M(), sSLSocketFactory, hostnameVerifier, _xb, this.a.I(), this.a.H(), this.a.G(), this.a.o(), this.a.J());
        return qxb;
    }

    /* access modifiers changed from: 0000 */
    public Zyb a(defpackage.C7164pyb.a aVar, boolean z) {
        synchronized (this.b) {
            if (this.o) {
                throw new IllegalStateException("released");
            } else if (this.j != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        Zyb zyb = new Zyb(this, this.c, this.d, this.h, this.h.a(this.a, aVar, z));
        synchronized (this.b) {
            this.j = zyb;
            this.k = false;
            this.l = false;
        }
        return zyb;
    }

    /* access modifiers changed from: 0000 */
    public void a(C5615azb azb) {
        if (this.i == null) {
            this.i = azb;
            azb.p.add(new a(this, this.f));
            return;
        }
        throw new IllegalStateException();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        if (r1 == false) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        r6 = a(r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003e, code lost:
        return r6;
     */
    public IOException a(Zyb zyb, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.b) {
            if (zyb != this.j) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.k;
                this.k = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.l) {
                    z3 = true;
                }
                this.l = true;
            }
            if (!this.k || !this.l || !z3) {
                z4 = false;
            } else {
                C5615azb b2 = this.j.b();
                b2.m++;
                this.j = null;
            }
        }
    }

    public IOException a(IOException iOException) {
        synchronized (this.b) {
            this.o = true;
        }
        return a(iOException, false);
    }

    private IOException a(IOException iOException, boolean z) {
        C5615azb azb;
        Socket g2;
        boolean z2;
        boolean z3;
        synchronized (this.b) {
            if (z) {
                if (this.j != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            azb = this.i;
            g2 = (this.i == null || this.j != null || (!z && !this.o)) ? null : g();
            if (this.i != null) {
                azb = null;
            }
            z2 = true;
            z3 = this.o && this.j == null;
        }
        Kyb.a(g2);
        if (azb != null) {
            this.d.b(this.c, (C5681byb) azb);
        }
        if (z3) {
            if (iOException == null) {
                z2 = false;
            }
            iOException = b(iOException);
            if (z2) {
                this.d.a(this.c, iOException);
            } else {
                this.d.a(this.c);
            }
        }
        return iOException;
    }
}
