package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: COa reason: default package and case insensitive filesystem */
/* compiled from: HttpRequest */
class C4808COa implements b {
    C4808COa() {
    }

    public HttpURLConnection a(URL url) throws IOException {
        return (HttpURLConnection) url.openConnection();
    }

    public HttpURLConnection a(URL url, Proxy proxy) throws IOException {
        return (HttpURLConnection) url.openConnection(proxy);
    }
}
