package defpackage;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

/* renamed from: hB reason: default package and case insensitive filesystem */
final class C1347hB extends C1316gB {
    private byte[] b;

    public C1347hB(X509Certificate x509Certificate, byte[] bArr) {
        super(x509Certificate);
        this.b = bArr;
    }

    public final byte[] getEncoded() throws CertificateEncodingException {
        return this.b;
    }
}
