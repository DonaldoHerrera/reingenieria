package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* renamed from: myb reason: default package and case insensitive filesystem */
/* compiled from: Handshake */
public final class C6957myb {
    private final Eyb a;
    private final C5613ayb b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private C6957myb(Eyb eyb, C5613ayb ayb, List<Certificate> list, List<Certificate> list2) {
        this.a = eyb;
        this.b = ayb;
        this.c = list;
        this.d = list2;
    }

    public static C6957myb a(SSLSession sSLSession) throws IOException {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        } else if (!"SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            C5613ayb a2 = C5613ayb.a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol == null) {
                throw new IllegalStateException("tlsVersion == null");
            } else if (!"NONE".equals(protocol)) {
                Eyb a3 = Eyb.a(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = Kyb.a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = Kyb.a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C6957myb(a3, a2, list, list2);
            } else {
                throw new IOException("tlsVersion == NONE");
            }
        } else {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
    }

    public List<Certificate> b() {
        return this.d;
    }

    public List<Certificate> c() {
        return this.c;
    }

    public Eyb d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (!(obj instanceof C6957myb)) {
            return false;
        }
        C6957myb myb = (C6957myb) obj;
        if (this.a.equals(myb.a) && this.b.equals(myb.b) && this.c.equals(myb.c) && this.d.equals(myb.d)) {
            z = true;
        }
        return z;
    }

    public int hashCode() {
        return ((((((527 + this.a.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Handshake{tlsVersion=");
        sb.append(this.a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(a(this.c));
        sb.append(" localCertificates=");
        sb.append(a(this.d));
        sb.append('}');
        return sb.toString();
    }

    public static C6957myb a(Eyb eyb, C5613ayb ayb, List<Certificate> list, List<Certificate> list2) {
        if (eyb == null) {
            throw new NullPointerException("tlsVersion == null");
        } else if (ayb != null) {
            return new C6957myb(eyb, ayb, Kyb.a(list), Kyb.a(list2));
        } else {
            throw new NullPointerException("cipherSuite == null");
        }
    }

    public C5613ayb a() {
        return this.b;
    }

    private List<String> a(List<Certificate> list) {
        ArrayList arrayList = new ArrayList();
        for (Certificate certificate : list) {
            if (certificate instanceof X509Certificate) {
                arrayList.add(String.valueOf(((X509Certificate) certificate).getSubjectDN()));
            } else {
                arrayList.add(certificate.getType());
            }
        }
        return arrayList;
    }
}
