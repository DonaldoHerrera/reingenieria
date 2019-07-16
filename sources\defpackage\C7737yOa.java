package defpackage;

import com.adjust.sdk.Constants;
import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: yOa reason: default package and case insensitive filesystem */
/* compiled from: DefaultHttpRequestFactory */
public class C7737yOa implements C4839DOa {
    private final C5701cNa a;
    private C4901FOa b;
    private SSLSocketFactory c;
    private boolean d;

    public C7737yOa() {
        this(new C5238QMa());
    }

    private synchronized SSLSocketFactory b() {
        SSLSocketFactory a2;
        this.d = true;
        try {
            a2 = C4870EOa.a(this.b);
            this.a.d("Fabric", "Custom SSL pinning enabled");
        } catch (Exception e) {
            this.a.e("Fabric", "Exception while validating pinned certs", e);
            return null;
        }
        return a2;
    }

    private synchronized void c() {
        this.d = false;
        this.c = null;
    }

    public void a(C4901FOa fOa) {
        if (this.b != fOa) {
            this.b = fOa;
            c();
        }
    }

    public C7737yOa(C5701cNa cna) {
        this.a = cna;
    }

    public C4777BOa a(C7806zOa zoa, String str, Map<String, String> map) {
        C4777BOa bOa;
        int i = C7668xOa.a[zoa.ordinal()];
        if (i == 1) {
            bOa = C4777BOa.a((CharSequence) str, map, true);
        } else if (i == 2) {
            bOa = C4777BOa.b((CharSequence) str, map, true);
        } else if (i == 3) {
            bOa = C4777BOa.e((CharSequence) str);
        } else if (i == 4) {
            bOa = C4777BOa.a((CharSequence) str);
        } else {
            throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (a(str) && this.b != null) {
            SSLSocketFactory a2 = a();
            if (a2 != null) {
                ((HttpsURLConnection) bOa.j()).setSSLSocketFactory(a2);
            }
        }
        return bOa;
    }

    private boolean a(String str) {
        return str != null && str.toLowerCase(Locale.US).startsWith(Constants.SCHEME);
    }

    private synchronized SSLSocketFactory a() {
        if (this.c == null && !this.d) {
            this.c = b();
        }
        return this.c;
    }
}
