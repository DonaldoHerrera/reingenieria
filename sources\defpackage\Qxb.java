package defpackage;

import com.adjust.sdk.Constants;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: Qxb reason: default package */
/* compiled from: Address */
public final class Qxb {
    final C7095oyb a;
    final C6753jyb b;
    final SocketFactory c;
    final Sxb d;
    final List<C7509uyb> e;
    final List<C6345dyb> f;
    final ProxySelector g;
    final Proxy h;
    final SSLSocketFactory i;
    final HostnameVerifier j;
    final _xb k;

    public Qxb(String str, int i2, C6753jyb jyb, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, _xb _xb, Sxb sxb, Proxy proxy, List<C7509uyb> list, List<C6345dyb> list2, ProxySelector proxySelector) {
        a aVar = new a();
        aVar.f(sSLSocketFactory != null ? Constants.SCHEME : "http");
        aVar.c(str);
        aVar.a(i2);
        this.a = aVar.a();
        if (jyb != null) {
            this.b = jyb;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (sxb != null) {
                    this.d = sxb;
                    if (list != null) {
                        this.e = Kyb.a(list);
                        if (list2 != null) {
                            this.f = Kyb.a(list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = _xb;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public _xb a() {
        return this.k;
    }

    public List<C6345dyb> b() {
        return this.f;
    }

    public C6753jyb c() {
        return this.b;
    }

    public HostnameVerifier d() {
        return this.j;
    }

    public List<C7509uyb> e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Qxb) {
            Qxb qxb = (Qxb) obj;
            if (this.a.equals(qxb.a) && a(qxb)) {
                return true;
            }
        }
        return false;
    }

    public Proxy f() {
        return this.h;
    }

    public Sxb g() {
        return this.d;
    }

    public ProxySelector h() {
        return this.g;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + Objects.hashCode(this.h)) * 31) + Objects.hashCode(this.i)) * 31) + Objects.hashCode(this.j)) * 31) + Objects.hashCode(this.k);
    }

    public SocketFactory i() {
        return this.c;
    }

    public SSLSocketFactory j() {
        return this.i;
    }

    public C7095oyb k() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.a.g());
        sb.append(":");
        sb.append(this.a.j());
        if (this.h != null) {
            sb.append(", proxy=");
            sb.append(this.h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.g);
        }
        sb.append("}");
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public boolean a(Qxb qxb) {
        return this.b.equals(qxb.b) && this.d.equals(qxb.d) && this.e.equals(qxb.e) && this.f.equals(qxb.f) && this.g.equals(qxb.g) && Objects.equals(this.h, qxb.h) && Objects.equals(this.i, qxb.i) && Objects.equals(this.j, qxb.j) && Objects.equals(this.k, qxb.k) && k().j() == qxb.k().j();
    }
}
