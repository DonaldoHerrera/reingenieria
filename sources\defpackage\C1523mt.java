package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.Arrays;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: mt reason: default package and case insensitive filesystem */
public final class C1523mt extends C0473at {
    private static final String[] c;
    private final C1430jt d;
    private final SSLSocketFactory e;
    private final HostnameVerifier f;

    static {
        String[] strArr = {"DELETE", "GET", "HEAD", "OPTIONS", "POST", "PUT", "TRACE"};
        c = strArr;
        Arrays.sort(strArr);
    }

    public C1523mt() {
        this(null, null, null);
    }

    public final boolean a(String str) {
        return Arrays.binarySearch(c, str) >= 0;
    }

    private C1523mt(C1430jt jtVar, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        C1399it itVar;
        if (System.getProperty("com.google.api.client.should_use_proxy") != null) {
            itVar = new C1399it(new Proxy(Type.HTTP, new InetSocketAddress(System.getProperty("https.proxyHost"), Integer.parseInt(System.getProperty("https.proxyPort")))));
        } else {
            itVar = new C1399it();
        }
        this.d = itVar;
        this.e = null;
        this.f = null;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ C1245dt a(String str, String str2) throws IOException {
        Object[] objArr = {str};
        if (a(str)) {
            HttpURLConnection a = this.d.a(new URL(str2));
            a.setRequestMethod(str);
            boolean z = a instanceof HttpsURLConnection;
            return new C1492lt(a);
        }
        throw new IllegalArgumentException(Uu.a("HTTP method %s not supported", objArr));
    }
}
