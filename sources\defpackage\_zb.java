package defpackage;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: _zb reason: default package */
/* compiled from: Platform */
public class _zb {
    private static final _zb a = e();
    private static final Logger b = Logger.getLogger(C7440tyb.class.getName());

    public static _zb a() {
        return a;
    }

    static byte[] b(List<C7509uyb> list) {
        C6825lAb lab = new C6825lAb();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7509uyb uyb = (C7509uyb) list.get(i);
            if (uyb != C7509uyb.HTTP_1_0) {
                lab.writeByte(uyb.toString().length());
                lab.f(uyb.toString());
            }
        }
        return lab.o();
    }

    public static boolean d() {
        if ("conscrypt".equals(Kyb.a("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    private static _zb e() {
        _zb e = Wzb.e();
        if (e != null) {
            return e;
        }
        if (d()) {
            Xzb e2 = Xzb.e();
            if (e2 != null) {
                return e2;
            }
        }
        Zzb e3 = Zzb.e();
        if (e3 != null) {
            return e3;
        }
        _zb e4 = Yzb.e();
        if (e4 != null) {
            return e4;
        }
        return new _zb();
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void a(SSLSocket sSLSocket, String str, List<C7509uyb> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public String b() {
        return "OkHttp";
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public boolean b(String str) {
        return true;
    }

    public SSLContext c() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) throws IOException {
        socket.connect(inetSocketAddress, i);
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object a(String str) {
        if (b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = sb.toString();
        }
        a(5, str, (Throwable) obj);
    }

    public C6417fAb b(X509TrustManager x509TrustManager) {
        return new C5685cAb(x509TrustManager.getAcceptedIssuers());
    }

    public static List<String> a(List<C7509uyb> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C7509uyb uyb = (C7509uyb) list.get(i);
            if (uyb != C7509uyb.HTTP_1_0) {
                arrayList.add(uyb.toString());
            }
        }
        return arrayList;
    }

    public C6281dAb a(X509TrustManager x509TrustManager) {
        return new C5617bAb(b(x509TrustManager));
    }
}
