package defpackage;

import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;

/* renamed from: EOa reason: default package and case insensitive filesystem */
/* compiled from: NetworkUtils */
public final class C4870EOa {
    public static final SSLSocketFactory a(C4901FOa fOa) throws KeyManagementException, NoSuchAlgorithmException {
        SSLContext instance = SSLContext.getInstance("TLS");
        instance.init(null, new TrustManager[]{new C4932GOa(new C4963HOa(fOa.b(), fOa.a()), fOa)}, null);
        return instance.getSocketFactory();
    }
}
