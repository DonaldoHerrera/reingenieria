package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* renamed from: tyb reason: default package and case insensitive filesystem */
/* compiled from: OkHttpClient */
public class C7440tyb implements Cloneable, defpackage.Yxb.a, Fyb {
    static final List<C7509uyb> a = Kyb.a((T[]) new C7509uyb[]{C7509uyb.HTTP_2, C7509uyb.HTTP_1_1});
    static final List<C6345dyb> b = Kyb.a((T[]) new C6345dyb[]{C6345dyb.d, C6345dyb.f});
    final int A;
    final int B;
    final int C;
    final int D;
    final C6617hyb c;
    final Proxy d;
    final List<C7509uyb> e;
    final List<C6345dyb> f;
    final List<C7164pyb> g;
    final List<C7164pyb> h;
    final defpackage.C6889lyb.a i;
    final ProxySelector j;
    final C6549gyb k;
    final Vxb l;
    final Vyb m;
    final SocketFactory n;
    final SSLSocketFactory o;
    final C6281dAb p;
    final HostnameVerifier q;
    final _xb r;
    final Sxb s;
    final Sxb t;
    final C6277cyb u;
    final C6753jyb v;
    final boolean w;
    final boolean x;
    final boolean y;
    final int z;

    /* renamed from: tyb$a */
    /* compiled from: OkHttpClient */
    public static final class a {
        int A;
        int B;
        C6617hyb a;
        Proxy b;
        List<C7509uyb> c;
        List<C6345dyb> d;
        final List<C7164pyb> e;
        final List<C7164pyb> f;
        defpackage.C6889lyb.a g;
        ProxySelector h;
        C6549gyb i;
        Vxb j;
        Vyb k;
        SocketFactory l;
        SSLSocketFactory m;
        C6281dAb n;
        HostnameVerifier o;
        _xb p;
        Sxb q;
        Sxb r;
        C6277cyb s;
        C6753jyb t;
        boolean u;
        boolean v;
        boolean w;
        int x;
        int y;
        int z;

        public a() {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = new C6617hyb();
            this.c = C7440tyb.a;
            this.d = C7440tyb.b;
            this.g = C6889lyb.a(C6889lyb.a);
            this.h = ProxySelector.getDefault();
            if (this.h == null) {
                this.h = new C5549aAb();
            }
            this.i = C6549gyb.a;
            this.l = SocketFactory.getDefault();
            this.o = C6349eAb.a;
            this.p = _xb.a;
            Sxb sxb = Sxb.a;
            this.q = sxb;
            this.r = sxb;
            this.s = new C6277cyb();
            this.t = C6753jyb.a;
            this.u = true;
            this.v = true;
            this.w = true;
            this.x = 0;
            this.y = 10000;
            this.z = 10000;
            this.A = 10000;
            this.B = 0;
        }

        public a a(long j2, TimeUnit timeUnit) {
            this.y = Kyb.a("timeout", j2, timeUnit);
            return this;
        }

        public a b(long j2, TimeUnit timeUnit) {
            this.z = Kyb.a("timeout", j2, timeUnit);
            return this;
        }

        public a c(long j2, TimeUnit timeUnit) {
            this.A = Kyb.a("timeout", j2, timeUnit);
            return this;
        }

        public a a(Vxb vxb) {
            this.j = vxb;
            this.k = null;
            return this;
        }

        public a b(C7164pyb pyb) {
            if (pyb != null) {
                this.f.add(pyb);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public a a(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            } else if (!(socketFactory instanceof SSLSocketFactory)) {
                this.l = socketFactory;
                return this;
            } else {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
        }

        public a a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier != null) {
                this.o = hostnameVerifier;
                return this;
            }
            throw new NullPointerException("hostnameVerifier == null");
        }

        public a a(boolean z2) {
            this.v = z2;
            return this;
        }

        public a a(C7164pyb pyb) {
            if (pyb != null) {
                this.e.add(pyb);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        public C7440tyb a() {
            return new C7440tyb(this);
        }

        a(C7440tyb tyb) {
            this.e = new ArrayList();
            this.f = new ArrayList();
            this.a = tyb.c;
            this.b = tyb.d;
            this.c = tyb.e;
            this.d = tyb.f;
            this.e.addAll(tyb.g);
            this.f.addAll(tyb.h);
            this.g = tyb.i;
            this.h = tyb.j;
            this.i = tyb.k;
            this.k = tyb.m;
            this.j = tyb.l;
            this.l = tyb.n;
            this.m = tyb.o;
            this.n = tyb.p;
            this.o = tyb.q;
            this.p = tyb.r;
            this.q = tyb.s;
            this.r = tyb.t;
            this.s = tyb.u;
            this.t = tyb.v;
            this.u = tyb.w;
            this.v = tyb.x;
            this.w = tyb.y;
            this.x = tyb.z;
            this.y = tyb.A;
            this.z = tyb.B;
            this.A = tyb.C;
            this.B = tyb.D;
        }
    }

    static {
        Iyb.a = new C7371syb();
    }

    public C7440tyb() {
        this(new a());
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext c2 = _zb.a().c();
            c2.init(null, new TrustManager[]{x509TrustManager}, null);
            return c2.getSocketFactory();
        } catch (GeneralSecurityException e2) {
            throw new AssertionError("No System TLS", e2);
        }
    }

    public HostnameVerifier A() {
        return this.q;
    }

    public List<C7164pyb> B() {
        return this.g;
    }

    /* access modifiers changed from: 0000 */
    public Vyb C() {
        Vxb vxb = this.l;
        return vxb != null ? vxb.a : this.m;
    }

    public List<C7164pyb> D() {
        return this.h;
    }

    public a E() {
        return new a(this);
    }

    public int F() {
        return this.D;
    }

    public List<C7509uyb> G() {
        return this.e;
    }

    public Proxy H() {
        return this.d;
    }

    public Sxb I() {
        return this.s;
    }

    public ProxySelector J() {
        return this.j;
    }

    public int K() {
        return this.B;
    }

    public boolean L() {
        return this.y;
    }

    public SocketFactory M() {
        return this.n;
    }

    public SSLSocketFactory N() {
        return this.o;
    }

    public int O() {
        return this.C;
    }

    public Sxb i() {
        return this.t;
    }

    public Vxb j() {
        return this.l;
    }

    public int k() {
        return this.z;
    }

    public _xb l() {
        return this.r;
    }

    public int m() {
        return this.A;
    }

    public C6277cyb n() {
        return this.u;
    }

    public List<C6345dyb> o() {
        return this.f;
    }

    public C6549gyb p() {
        return this.k;
    }

    public C6617hyb q() {
        return this.c;
    }

    public C6753jyb r() {
        return this.v;
    }

    public defpackage.C6889lyb.a s() {
        return this.i;
    }

    public boolean t() {
        return this.x;
    }

    public boolean z() {
        return this.w;
    }

    C7440tyb(a aVar) {
        boolean z2;
        this.c = aVar.a;
        this.d = aVar.b;
        this.e = aVar.c;
        this.f = aVar.d;
        this.g = Kyb.a(aVar.e);
        this.h = Kyb.a(aVar.f);
        this.i = aVar.g;
        this.j = aVar.h;
        this.k = aVar.i;
        this.l = aVar.j;
        this.m = aVar.k;
        this.n = aVar.l;
        Iterator it = this.f.iterator();
        loop0:
        while (true) {
            z2 = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C6345dyb dyb = (C6345dyb) it.next();
                if (z2 || dyb.b()) {
                    z2 = true;
                }
            }
        }
        if (aVar.m != null || !z2) {
            this.o = aVar.m;
            this.p = aVar.n;
        } else {
            X509TrustManager a2 = Kyb.a();
            this.o = a(a2);
            this.p = C6281dAb.a(a2);
        }
        if (this.o != null) {
            _zb.a().a(this.o);
        }
        this.q = aVar.o;
        this.r = aVar.p.a(this.p);
        this.s = aVar.q;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        if (this.g.contains(null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Null interceptor: ");
            sb.append(this.g);
            throw new IllegalStateException(sb.toString());
        } else if (this.h.contains(null)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Null network interceptor: ");
            sb2.append(this.h);
            throw new IllegalStateException(sb2.toString());
        }
    }

    public Yxb a(C7647wyb wyb) {
        return C7578vyb.a(this, wyb, false);
    }
}
