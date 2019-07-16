package defpackage;

import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import org.conscrypt.Conscrypt;

/* renamed from: Xzb reason: default package */
/* compiled from: ConscryptPlatform */
public class Xzb extends _zb {
    private Xzb() {
    }

    public static Xzb e() {
        try {
            Class.forName("org.conscrypt.Conscrypt");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            return new Xzb();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    private Provider f() {
        return Conscrypt.newProviderBuilder().provideTrustManager().build();
    }

    public void a(SSLSocket sSLSocket, String str, List<C7509uyb> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) _zb.a(list).toArray(new String[0]));
            return;
        }
        super.a(sSLSocket, str, list);
    }

    public String b(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.b(sSLSocket);
    }

    public SSLContext c() {
        try {
            return SSLContext.getInstance("TLSv1.3", f());
        } catch (NoSuchAlgorithmException e) {
            try {
                return SSLContext.getInstance("TLS", f());
            } catch (NoSuchAlgorithmException unused) {
                throw new IllegalStateException("No TLS provider", e);
            }
        }
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
        if (Conscrypt.isConscrypt(sSLSocketFactory)) {
            Conscrypt.setUseEngineSocket(sSLSocketFactory, true);
        }
    }
}
