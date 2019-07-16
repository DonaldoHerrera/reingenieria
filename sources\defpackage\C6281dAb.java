package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* renamed from: dAb reason: default package and case insensitive filesystem */
/* compiled from: CertificateChainCleaner */
public abstract class C6281dAb {
    public static C6281dAb a(X509TrustManager x509TrustManager) {
        return _zb.a().a(x509TrustManager);
    }

    public abstract List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
