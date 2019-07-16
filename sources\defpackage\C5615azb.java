package defpackage;

import com.comscore.android.id.IdHelperAndroid;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;

/* renamed from: azb reason: default package and case insensitive filesystem */
/* compiled from: RealConnection */
public final class C5615azb extends b implements C5681byb {
    public final C5683bzb b;
    private final Dyb c;
    private Socket d;
    private Socket e;
    private C6957myb f;
    private C7509uyb g;
    private Gzb h;
    private C6961nAb i;
    private C6893mAb j;
    boolean k;
    int l;
    int m;
    private int n;
    private int o = 1;
    final List<Reference<C6551gzb>> p = new ArrayList();
    long q = Long.MAX_VALUE;

    public C5615azb(C5683bzb bzb, Dyb dyb) {
        this.b = bzb;
        this.c = dyb;
    }

    private C7647wyb g() throws IOException {
        a aVar = new a();
        aVar.a(this.c.a().k());
        aVar.a("CONNECT", (C7854zyb) null);
        aVar.b("Host", Kyb.a(this.c.a().k(), true));
        aVar.b("Proxy-Connection", "Keep-Alive");
        aVar.b("User-Agent", Lyb.a());
        C7647wyb a = aVar.a();
        a aVar2 = new a();
        aVar2.a(a);
        aVar2.a(C7509uyb.HTTP_1_1);
        aVar2.a(407);
        aVar2.a("Preemptive Authenticate");
        aVar2.a(Kyb.d);
        aVar2.b(-1);
        aVar2.a(-1);
        aVar2.b("Proxy-Authenticate", "OkHttp-Preemptive");
        C7647wyb a2 = this.c.a().g().a(this.c, aVar2.a());
        return a2 != null ? a2 : a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x012f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0143 A[EDGE_INSN: B:63:0x0143->B:56:0x0143 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    public void a(int i2, int i3, int i4, int i5, boolean z, Yxb yxb, C6889lyb lyb) {
        Yxb yxb2 = yxb;
        C6889lyb lyb2 = lyb;
        if (this.g == null) {
            List b2 = this.c.a().b();
            Yyb yyb = new Yyb(b2);
            if (this.c.a().j() == null) {
                if (b2.contains(C6345dyb.f)) {
                    String g2 = this.c.a().k().g();
                    if (!_zb.a().b(g2)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CLEARTEXT communication to ");
                        sb.append(g2);
                        sb.append(" not permitted by network security policy");
                        throw new C6347dzb(new UnknownServiceException(sb.toString()));
                    }
                } else {
                    throw new C6347dzb(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
                }
            } else if (this.c.a().e().contains(C7509uyb.H2_PRIOR_KNOWLEDGE)) {
                throw new C6347dzb(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
            C6347dzb dzb = null;
            do {
                try {
                    if (this.c.c()) {
                        a(i2, i3, i4, yxb, lyb);
                        if (this.d != null) {
                            int i6 = i2;
                            int i7 = i3;
                        } else if (!this.c.c() && this.d == null) {
                            throw new C6347dzb(new ProtocolException("Too many tunnel connections attempted: 21"));
                        } else if (this.h == null) {
                            synchronized (this.b) {
                                this.o = this.h.c();
                            }
                            return;
                        } else {
                            return;
                        }
                    } else {
                        try {
                            a(i2, i3, yxb2, lyb2);
                        } catch (IOException e2) {
                            e = e2;
                            int i8 = i5;
                            Kyb.a(this.e);
                            Kyb.a(this.d);
                            this.e = null;
                            this.d = null;
                            this.i = null;
                            this.j = null;
                            this.f = null;
                            this.g = null;
                            this.h = null;
                            lyb.a(yxb, this.c.d(), this.c.b(), null, e);
                            if (dzb != null) {
                            }
                            if (z) {
                            }
                            throw dzb;
                        }
                    }
                    try {
                        a(yyb, i5, yxb2, lyb2);
                        lyb2.a(yxb2, this.c.d(), this.c.b(), this.g);
                        if (!this.c.c()) {
                        }
                        if (this.h == null) {
                        }
                    } catch (IOException e3) {
                        e = e3;
                    }
                } catch (IOException e4) {
                    e = e4;
                    int i9 = i2;
                    int i10 = i3;
                    int i82 = i5;
                    Kyb.a(this.e);
                    Kyb.a(this.d);
                    this.e = null;
                    this.d = null;
                    this.i = null;
                    this.j = null;
                    this.f = null;
                    this.g = null;
                    this.h = null;
                    lyb.a(yxb, this.c.d(), this.c.b(), null, e);
                    if (dzb != null) {
                        dzb = new C6347dzb(e);
                    } else {
                        dzb.a(e);
                    }
                    if (z) {
                        break;
                    } else if (!yyb.a(e)) {
                    }
                    throw dzb;
                }
            } while (!yyb.a(e));
            throw dzb;
        }
        throw new IllegalStateException("already connected");
    }

    public C6957myb b() {
        return this.f;
    }

    public boolean c() {
        return this.h != null;
    }

    public void d() {
        synchronized (this.b) {
            this.k = true;
        }
    }

    public Dyb e() {
        return this.c;
    }

    public Socket f() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Connection{");
        sb.append(this.c.a().k().g());
        sb.append(":");
        sb.append(this.c.a().k().j());
        sb.append(", proxy=");
        sb.append(this.c.b());
        sb.append(" hostAddress=");
        sb.append(this.c.d());
        sb.append(" cipherSuite=");
        C6957myb myb = this.f;
        sb.append(myb != null ? myb.a() : IdHelperAndroid.NO_ID_AVAILABLE);
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    private void a(int i2, int i3, int i4, Yxb yxb, C6889lyb lyb) throws IOException {
        C7647wyb g2 = g();
        C7095oyb g3 = g2.g();
        int i5 = 0;
        while (i5 < 21) {
            a(i2, i3, yxb, lyb);
            g2 = a(i3, i4, g2, g3);
            if (g2 != null) {
                Kyb.a(this.d);
                this.d = null;
                this.j = null;
                this.i = null;
                lyb.a(yxb, this.c.d(), this.c.b(), null);
                i5++;
            } else {
                return;
            }
        }
    }

    private void a(int i2, int i3, Yxb yxb, C6889lyb lyb) throws IOException {
        Socket socket;
        Proxy b2 = this.c.b();
        Qxb a = this.c.a();
        if (b2.type() == Type.DIRECT || b2.type() == Type.HTTP) {
            socket = a.i().createSocket();
        } else {
            socket = new Socket(b2);
        }
        this.d = socket;
        lyb.a(yxb, this.c.d(), b2);
        this.d.setSoTimeout(i3);
        try {
            _zb.a().a(this.d, this.c.d(), i2);
            try {
                this.i = C7720yAb.a(C7720yAb.b(this.d));
                this.j = C7720yAb.a(C7720yAb.a(this.d));
            } catch (NullPointerException e2) {
                if ("throw with null exception".equals(e2.getMessage())) {
                    throw new IOException(e2);
                }
            }
        } catch (ConnectException e3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to connect to ");
            sb.append(this.c.d());
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e3);
            throw connectException;
        }
    }

    private void a(Yyb yyb, int i2, Yxb yxb, C6889lyb lyb) throws IOException {
        if (this.c.a().j() != null) {
            lyb.g(yxb);
            a(yyb);
            lyb.a(yxb, this.f);
            if (this.g == C7509uyb.HTTP_2) {
                a(i2);
            }
        } else if (this.c.a().e().contains(C7509uyb.H2_PRIOR_KNOWLEDGE)) {
            this.e = this.d;
            this.g = C7509uyb.H2_PRIOR_KNOWLEDGE;
            a(i2);
        } else {
            this.e = this.d;
            this.g = C7509uyb.HTTP_1_1;
        }
    }

    private void a(int i2) throws IOException {
        this.e.setSoTimeout(0);
        a aVar = new a(true);
        aVar.a(this.e, this.c.a().k().g(), this.i, this.j);
        aVar.a((b) this);
        aVar.a(i2);
        this.h = aVar.a();
        this.h.d();
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v9 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0139 A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x013f A[Catch:{ all -> 0x012f }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0142  */
    /* JADX WARNING: Unknown variable types count: 2 */
    private void a(Yyb yyb) throws IOException {
        ? r1;
        ? r2;
        C7509uyb uyb;
        Qxb a = this.c.a();
        String str = 0;
        try {
            SSLSocket sSLSocket = (SSLSocket) a.j().createSocket(this.d, a.k().g(), a.k().j(), true);
            try {
                C6345dyb a2 = yyb.a(sSLSocket);
                if (a2.c()) {
                    _zb.a().a(sSLSocket, a.k().g(), a.e());
                }
                sSLSocket.startHandshake();
                SSLSession session = sSLSocket.getSession();
                C6957myb a3 = C6957myb.a(session);
                if (!a.d().verify(a.k().g(), session)) {
                    List c2 = a3.c();
                    String str2 = "Hostname ";
                    if (!c2.isEmpty()) {
                        X509Certificate x509Certificate = (X509Certificate) c2.get(0);
                        StringBuilder sb = new StringBuilder();
                        sb.append(str2);
                        sb.append(a.k().g());
                        sb.append(" not verified:\n    certificate: ");
                        sb.append(_xb.a((Certificate) x509Certificate));
                        sb.append("\n    DN: ");
                        sb.append(x509Certificate.getSubjectDN().getName());
                        sb.append("\n    subjectAltNames: ");
                        sb.append(C6349eAb.a(x509Certificate));
                        throw new SSLPeerUnverifiedException(sb.toString());
                    }
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(a.k().g());
                    sb2.append(" not verified (no certificates)");
                    throw new SSLPeerUnverifiedException(sb2.toString());
                }
                a.a().a(a.k().g(), a3.c());
                if (a2.c()) {
                    str = _zb.a().b(sSLSocket);
                }
                this.e = sSLSocket;
                this.i = C7720yAb.a(C7720yAb.b(this.e));
                this.j = C7720yAb.a(C7720yAb.a(this.e));
                this.f = a3;
                if (str != 0) {
                    uyb = C7509uyb.a(str);
                } else {
                    uyb = C7509uyb.HTTP_1_1;
                }
                this.g = uyb;
                if (sSLSocket != 0) {
                    _zb.a().a(sSLSocket);
                }
            } catch (AssertionError e2) {
                e = e2;
                r2 = sSLSocket;
                try {
                    if (!Kyb.a(e)) {
                    }
                } catch (Throwable th) {
                    th = th;
                    r1 = r2;
                    if (r1 != 0) {
                    }
                    Kyb.a((Socket) r1);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = sSLSocket;
                if (r1 != 0) {
                    _zb.a().a((SSLSocket) r1);
                }
                Kyb.a((Socket) r1);
                throw th;
            }
        } catch (AssertionError e3) {
            e = e3;
            r2 = str;
            if (!Kyb.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    private C7647wyb a(int i2, int i3, C7647wyb wyb, C7095oyb oyb) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append("CONNECT ");
        sb.append(Kyb.a(oyb, true));
        sb.append(" HTTP/1.1");
        String sb2 = sb.toString();
        while (true) {
            C7511uzb uzb = new C7511uzb(null, null, this.i, this.j);
            this.i.k().a((long) i2, TimeUnit.MILLISECONDS);
            this.j.k().a((long) i3, TimeUnit.MILLISECONDS);
            uzb.a(wyb.c(), sb2);
            uzb.b();
            a a = uzb.a(false);
            a.a(wyb);
            Ayb a2 = a.a();
            uzb.c(a2);
            int d2 = a2.d();
            if (d2 != 200) {
                if (d2 == 407) {
                    C7647wyb a3 = this.c.a().g().a(this.c, a2);
                    if (a3 != null) {
                        if ("close".equalsIgnoreCase(a2.a("Connection"))) {
                            return a3;
                        }
                        wyb = a3;
                    } else {
                        throw new IOException("Failed to authenticate with proxy");
                    }
                } else {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unexpected response code for CONNECT: ");
                    sb3.append(a2.d());
                    throw new IOException(sb3.toString());
                }
            } else if (this.i.getBuffer().p() && this.j.j().p()) {
                return null;
            } else {
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Qxb qxb, List<Dyb> list) {
        if (this.p.size() >= this.o || this.k || !Iyb.a.a(this.c.a(), qxb)) {
            return false;
        }
        if (qxb.k().g().equals(e().a().k().g())) {
            return true;
        }
        if (this.h == null || list == null || !a(list) || qxb.d() != C6349eAb.a || !a(qxb.k())) {
            return false;
        }
        try {
            qxb.a().a(qxb.k().g(), b().c());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    private boolean a(List<Dyb> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Dyb dyb = (Dyb) list.get(i2);
            if (dyb.b().type() == Type.DIRECT && this.c.b().type() == Type.DIRECT && this.c.d().equals(dyb.d())) {
                return true;
            }
        }
        return false;
    }

    public boolean a(C7095oyb oyb) {
        if (oyb.j() != this.c.a().k().j()) {
            return false;
        }
        boolean z = true;
        if (!oyb.g().equals(this.c.a().k().g()) && (this.f == null || !C6349eAb.a.verify(oyb.g(), (X509Certificate) this.f.c().get(0)))) {
            z = false;
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    public C6755jzb a(C7440tyb tyb, a aVar) throws SocketException {
        Gzb gzb = this.h;
        if (gzb != null) {
            return new Lzb(tyb, this, aVar, gzb);
        }
        this.e.setSoTimeout(aVar.b());
        this.i.k().a((long) aVar.b(), TimeUnit.MILLISECONDS);
        this.j.k().a((long) aVar.c(), TimeUnit.MILLISECONDS);
        return new C7511uzb(tyb, this, this.i, this.j);
    }

    public void a() {
        Kyb.a(this.d);
    }

    public boolean a(boolean z) {
        int soTimeout;
        if (this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        Gzb gzb = this.h;
        if (gzb != null) {
            return !gzb.b();
        }
        if (z) {
            try {
                soTimeout = this.e.getSoTimeout();
                this.e.setSoTimeout(1);
                if (this.i.p()) {
                    this.e.setSoTimeout(soTimeout);
                    return false;
                }
                this.e.setSoTimeout(soTimeout);
                return true;
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            } catch (Throwable th) {
                this.e.setSoTimeout(soTimeout);
                throw th;
            }
        }
        return true;
    }

    public void a(Nzb nzb) throws IOException {
        nzb.a(C7649wzb.REFUSED_STREAM, (IOException) null);
    }

    public void a(Gzb gzb) {
        synchronized (this.b) {
            this.o = gzb.c();
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(IOException iOException) {
        synchronized (this.b) {
            if (iOException instanceof Tzb) {
                C7649wzb wzb = ((Tzb) iOException).a;
                if (wzb == C7649wzb.REFUSED_STREAM) {
                    this.n++;
                    if (this.n > 1) {
                        this.k = true;
                        this.l++;
                    }
                } else if (wzb != C7649wzb.CANCEL) {
                    this.k = true;
                    this.l++;
                }
            } else if (!c() || (iOException instanceof C7580vzb)) {
                this.k = true;
                if (this.m == 0) {
                    if (iOException != null) {
                        this.b.a(this.c, iOException);
                    }
                    this.l++;
                }
            }
        }
    }
}
