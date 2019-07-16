package defpackage;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;

/* renamed from: it reason: default package and case insensitive filesystem */
public final class C1399it implements C1430jt {
    private final Proxy a;

    public C1399it() {
        this(null);
    }

    public final HttpURLConnection a(URL url) throws IOException {
        Proxy proxy = this.a;
        return (HttpURLConnection) (proxy == null ? url.openConnection() : url.openConnection(proxy));
    }

    public C1399it(Proxy proxy) {
        this.a = proxy;
    }
}
