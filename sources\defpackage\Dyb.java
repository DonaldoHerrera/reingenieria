package defpackage;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: Dyb reason: default package */
/* compiled from: Route */
public final class Dyb {
    final Qxb a;
    final Proxy b;
    final InetSocketAddress c;

    public Dyb(Qxb qxb, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (qxb == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.a = qxb;
            this.b = proxy;
            this.c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }

    public Qxb a() {
        return this.a;
    }

    public Proxy b() {
        return this.b;
    }

    public boolean c() {
        return this.a.i != null && this.b.type() == Type.HTTP;
    }

    public InetSocketAddress d() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Dyb) {
            Dyb dyb = (Dyb) obj;
            if (dyb.a.equals(this.a) && dyb.b.equals(this.b) && dyb.c.equals(this.c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Route{");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
