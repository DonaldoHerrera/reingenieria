package bo.app;

import com.adjust.sdk.Constants;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;

public class i {
    private static final String a = Hg.a(i.class);
    private static g b;

    static {
        try {
            b = new g();
        } catch (Exception e) {
            Hg.b(a, "Exception initializing static TLS socket factory.", e);
        }
    }

    public static URLConnection a(URL url) {
        URLConnection openConnection = url.openConnection();
        if (url.getProtocol().equals(Constants.SCHEME)) {
            try {
                ((HttpsURLConnection) openConnection).setSSLSocketFactory(b);
            } catch (Exception e) {
                Hg.b(a, "Exception setting TLS socket factory on url connection.", e);
            }
        }
        return openConnection;
    }
}
