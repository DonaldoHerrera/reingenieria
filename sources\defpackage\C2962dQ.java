package defpackage;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* renamed from: dQ reason: default package and case insensitive filesystem */
/* compiled from: lambda */
public final /* synthetic */ class C2962dQ implements HostnameVerifier {
    public static final /* synthetic */ C2962dQ a = new C2962dQ();

    private /* synthetic */ C2962dQ() {
    }

    public final boolean verify(String str, SSLSession sSLSession) {
        return C2981eQ.a(str, sSLSession);
    }
}
