package defpackage;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: ezb reason: default package and case insensitive filesystem */
/* compiled from: RouteSelector */
final class C6415ezb {
    private final Qxb a;
    private final C6279czb b;
    private final Yxb c;
    private final C6889lyb d;
    private List<Proxy> e = Collections.emptyList();
    private int f;
    private List<InetSocketAddress> g = Collections.emptyList();
    private final List<Dyb> h = new ArrayList();

    /* renamed from: ezb$a */
    /* compiled from: RouteSelector */
    public static final class a {
        private final List<Dyb> a;
        private int b = 0;

        a(List<Dyb> list) {
            this.a = list;
        }

        public List<Dyb> a() {
            return new ArrayList(this.a);
        }

        public boolean b() {
            return this.b < this.a.size();
        }

        public Dyb c() {
            if (b()) {
                List<Dyb> list = this.a;
                int i = this.b;
                this.b = i + 1;
                return (Dyb) list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    C6415ezb(Qxb qxb, C6279czb czb, Yxb yxb, C6889lyb lyb) {
        this.a = qxb;
        this.b = czb;
        this.c = yxb;
        this.d = lyb;
        a(qxb.k(), qxb.f());
    }

    private boolean c() {
        return this.f < this.e.size();
    }

    private Proxy d() throws IOException {
        if (c()) {
            List<Proxy> list = this.e;
            int i = this.f;
            this.f = i + 1;
            Proxy proxy = (Proxy) list.get(i);
            a(proxy);
            return proxy;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("No route to ");
        sb.append(this.a.k().g());
        sb.append("; exhausted proxy configurations: ");
        sb.append(this.e);
        throw new SocketException(sb.toString());
    }

    public boolean a() {
        return c() || !this.h.isEmpty();
    }

    public a b() throws IOException {
        if (a()) {
            ArrayList arrayList = new ArrayList();
            while (c()) {
                Proxy d2 = d();
                int size = this.g.size();
                for (int i = 0; i < size; i++) {
                    Dyb dyb = new Dyb(this.a, d2, (InetSocketAddress) this.g.get(i));
                    if (this.b.c(dyb)) {
                        this.h.add(dyb);
                    } else {
                        arrayList.add(dyb);
                    }
                }
                if (!arrayList.isEmpty()) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.h);
                this.h.clear();
            }
            return new a(arrayList);
        }
        throw new NoSuchElementException();
    }

    private void a(C7095oyb oyb, Proxy proxy) {
        List<Proxy> list;
        if (proxy != null) {
            this.e = Collections.singletonList(proxy);
        } else {
            List select = this.a.h().select(oyb.n());
            if (select == null || select.isEmpty()) {
                list = Kyb.a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = Kyb.a(select);
            }
            this.e = list;
        }
        this.f = 0;
    }

    private void a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.a.k().g();
            i = this.a.k().j();
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                str = a(inetSocketAddress);
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i < 1 || i > 65535) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.d.a(this.c, str);
            List lookup = this.a.c().lookup(str);
            if (!lookup.isEmpty()) {
                this.d.a(this.c, str, lookup);
                int size = lookup.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.g.add(new InetSocketAddress((InetAddress) lookup.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.a.c());
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    static String a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        if (address == null) {
            return inetSocketAddress.getHostName();
        }
        return address.getHostAddress();
    }
}
