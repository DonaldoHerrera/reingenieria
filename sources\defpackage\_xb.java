package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: _xb reason: default package */
/* compiled from: CertificatePinner */
public final class _xb {
    public static final _xb a = new a().a();
    private final Set<b> b;
    private final C6281dAb c;

    /* renamed from: _xb$a */
    /* compiled from: CertificatePinner */
    public static final class a {
        private final List<b> a = new ArrayList();

        public _xb a() {
            return new _xb(new LinkedHashSet(this.a), null);
        }
    }

    /* renamed from: _xb$b */
    /* compiled from: CertificatePinner */
    static final class b {
        final String a;
        final String b;
        final String c;
        final C7030oAb d;

        /* access modifiers changed from: 0000 */
        /* JADX WARNING: Code restructure failed: missing block: B:5:0x002e, code lost:
            if (r11.regionMatches(false, r6, r7, 0, r7.length()) != false) goto L_0x0032;
         */
        public boolean a(String str) {
            if (!this.a.startsWith("*.")) {
                return str.equals(this.b);
            }
            int indexOf = str.indexOf(46);
            boolean z = true;
            if ((str.length() - indexOf) - 1 == this.b.length()) {
                int i = indexOf + 1;
                String str2 = this.b;
            }
            z = false;
            return z;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.a.equals(bVar.a) && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return ((((527 + this.a.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.c);
            sb.append(this.d.a());
            return sb.toString();
        }
    }

    _xb(Set<b> set, C6281dAb dab) {
        this.b = set;
        this.c = dab;
    }

    static C7030oAb b(X509Certificate x509Certificate) {
        return C7030oAb.a(x509Certificate.getPublicKey().getEncoded()).e();
    }

    public void a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        String str2;
        List a2 = a(str);
        if (!a2.isEmpty()) {
            C6281dAb dab = this.c;
            if (dab != null) {
                list = dab.a(list, str);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) list.get(i);
                int size2 = a2.size();
                C7030oAb oab = null;
                C7030oAb oab2 = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    b bVar = (b) a2.get(i2);
                    if (bVar.c.equals("sha256/")) {
                        if (oab == null) {
                            oab = b(x509Certificate);
                        }
                        if (bVar.d.equals(oab)) {
                            return;
                        }
                    } else if (bVar.c.equals("sha1/")) {
                        if (oab2 == null) {
                            oab2 = a(x509Certificate);
                        }
                        if (bVar.d.equals(oab2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("unsupported hashAlgorithm: ");
                        sb.append(bVar.c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list.size();
            int i3 = 0;
            while (true) {
                str2 = "\n    ";
                if (i3 >= size3) {
                    break;
                }
                X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
                sb2.append(str2);
                sb2.append(a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
                i3++;
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str);
            sb2.append(":");
            int size4 = a2.size();
            for (int i4 = 0; i4 < size4; i4++) {
                b bVar2 = (b) a2.get(i4);
                sb2.append(str2);
                sb2.append(bVar2);
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3.b.equals(r4.b) != false) goto L_0x0020;
     */
    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (obj instanceof _xb) {
            _xb _xb = (_xb) obj;
            if (Objects.equals(this.c, _xb.c)) {
            }
        }
        z = false;
        return z;
    }

    public int hashCode() {
        return (Objects.hashCode(this.c) * 31) + this.b.hashCode();
    }

    /* access modifiers changed from: 0000 */
    public List<b> a(String str) {
        List<b> emptyList = Collections.emptyList();
        for (b bVar : this.b) {
            if (bVar.a(str)) {
                if (emptyList.isEmpty()) {
                    emptyList = new ArrayList<>();
                }
                emptyList.add(bVar);
            }
        }
        return emptyList;
    }

    /* access modifiers changed from: 0000 */
    public _xb a(C6281dAb dab) {
        if (Objects.equals(this.c, dab)) {
            return this;
        }
        return new _xb(this.b, dab);
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder();
            sb.append("sha256/");
            sb.append(b((X509Certificate) certificate).a());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    static C7030oAb a(X509Certificate x509Certificate) {
        return C7030oAb.a(x509Certificate.getPublicKey().getEncoded()).d();
    }
}
