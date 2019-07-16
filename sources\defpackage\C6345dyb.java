package defpackage;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* renamed from: dyb reason: default package and case insensitive filesystem */
/* compiled from: ConnectionSpec */
public final class C6345dyb {
    private static final C5613ayb[] a = {C5613ayb.lb, C5613ayb.mb, C5613ayb.nb, C5613ayb.Ya, C5613ayb.bb, C5613ayb.Za, C5613ayb.cb, C5613ayb.ib, C5613ayb.hb};
    private static final C5613ayb[] b = {C5613ayb.lb, C5613ayb.mb, C5613ayb.nb, C5613ayb.Ya, C5613ayb.bb, C5613ayb.Za, C5613ayb.cb, C5613ayb.ib, C5613ayb.hb, C5613ayb.Ja, C5613ayb.Ka, C5613ayb.ha, C5613ayb.ia, C5613ayb.F, C5613ayb.J, C5613ayb.j};
    public static final C6345dyb c;
    public static final C6345dyb d;
    public static final C6345dyb e;
    public static final C6345dyb f = new a(false).a();
    final boolean g;
    final boolean h;
    final String[] i;
    final String[] j;

    /* renamed from: dyb$a */
    /* compiled from: ConnectionSpec */
    public static final class a {
        boolean a;
        String[] b;
        String[] c;
        boolean d;

        a(boolean z) {
            this.a = z;
        }

        public a a(C5613ayb... aybArr) {
            if (this.a) {
                String[] strArr = new String[aybArr.length];
                for (int i = 0; i < aybArr.length; i++) {
                    strArr[i] = aybArr[i].qb;
                }
                a(strArr);
                return this;
            }
            throw new IllegalStateException("no cipher suites for cleartext connections");
        }

        public a b(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        public a(C6345dyb dyb) {
            this.a = dyb.g;
            this.b = dyb.i;
            this.c = dyb.j;
            this.d = dyb.h;
        }

        public a a(String... strArr) {
            if (!this.a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        public a a(Eyb... eybArr) {
            if (this.a) {
                String[] strArr = new String[eybArr.length];
                for (int i = 0; i < eybArr.length; i++) {
                    strArr[i] = eybArr[i].g;
                }
                b(strArr);
                return this;
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }

        public a a(boolean z) {
            if (this.a) {
                this.d = z;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public C6345dyb a() {
            return new C6345dyb(this);
        }
    }

    static {
        a aVar = new a(true);
        aVar.a(a);
        aVar.a(Eyb.TLS_1_3, Eyb.TLS_1_2);
        aVar.a(true);
        c = aVar.a();
        a aVar2 = new a(true);
        aVar2.a(b);
        aVar2.a(Eyb.TLS_1_3, Eyb.TLS_1_2);
        aVar2.a(true);
        d = aVar2.a();
        a aVar3 = new a(true);
        aVar3.a(b);
        aVar3.a(Eyb.TLS_1_3, Eyb.TLS_1_2, Eyb.TLS_1_1, Eyb.TLS_1_0);
        aVar3.a(true);
        e = aVar3.a();
    }

    C6345dyb(a aVar) {
        this.g = aVar.a;
        this.i = aVar.b;
        this.j = aVar.c;
        this.h = aVar.d;
    }

    public List<C5613ayb> a() {
        String[] strArr = this.i;
        if (strArr != null) {
            return C5613ayb.a(strArr);
        }
        return null;
    }

    public boolean b() {
        return this.g;
    }

    public boolean c() {
        return this.h;
    }

    public List<Eyb> d() {
        String[] strArr = this.j;
        if (strArr != null) {
            return Eyb.a(strArr);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C6345dyb)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C6345dyb dyb = (C6345dyb) obj;
        boolean z = this.g;
        if (z != dyb.g) {
            return false;
        }
        return !z || (Arrays.equals(this.i, dyb.i) && Arrays.equals(this.j, dyb.j) && this.h == dyb.h);
    }

    public int hashCode() {
        if (this.g) {
            return ((((527 + Arrays.hashCode(this.i)) * 31) + Arrays.hashCode(this.j)) * 31) + (this.h ^ true ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.g) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ConnectionSpec(cipherSuites=");
        String str = "[all enabled]";
        sb.append(Objects.toString(a(), str));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(d(), str));
        sb.append(", supportsTlsExtensions=");
        sb.append(this.h);
        sb.append(")");
        return sb.toString();
    }

    private C6345dyb b(SSLSocket sSLSocket, boolean z) {
        String[] strArr;
        String[] strArr2;
        if (this.i != null) {
            strArr = Kyb.a(C5613ayb.a, sSLSocket.getEnabledCipherSuites(), this.i);
        } else {
            strArr = sSLSocket.getEnabledCipherSuites();
        }
        if (this.j != null) {
            strArr2 = Kyb.a(Kyb.j, sSLSocket.getEnabledProtocols(), this.j);
        } else {
            strArr2 = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int a2 = Kyb.a(C5613ayb.a, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && a2 != -1) {
            strArr = Kyb.a(strArr, supportedCipherSuites[a2]);
        }
        a aVar = new a(this);
        aVar.a(strArr);
        aVar.b(strArr2);
        return aVar.a();
    }

    /* access modifiers changed from: 0000 */
    public void a(SSLSocket sSLSocket, boolean z) {
        C6345dyb b2 = b(sSLSocket, z);
        String[] strArr = b2.j;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = b2.i;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    public boolean a(SSLSocket sSLSocket) {
        if (!this.g) {
            return false;
        }
        String[] strArr = this.j;
        if (strArr != null && !Kyb.b(Kyb.j, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.i;
        if (strArr2 == null || Kyb.b(C5613ayb.a, strArr2, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
