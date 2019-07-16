package defpackage;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.H;
import java.io.IOException;
import java.net.URLDecoder;

/* renamed from: Xp reason: default package */
/* compiled from: DataSchemeDataSource */
public final class Xp extends Vp {
    private C0470aq e;
    private int f;
    private byte[] g;

    public Xp() {
        super(false);
    }

    public long a(C0470aq aqVar) throws IOException {
        b(aqVar);
        this.e = aqVar;
        Uri uri = aqVar.a;
        String scheme = uri.getScheme();
        if ("data".equals(scheme)) {
            String[] a = C0471ar.a(uri.getSchemeSpecificPart(), ",");
            if (a.length == 2) {
                String str = a[1];
                if (a[0].contains(";base64")) {
                    try {
                        this.g = Base64.decode(str, 0);
                    } catch (IllegalArgumentException e2) {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error while parsing Base64 encoded string: ");
                        sb.append(str);
                        throw new H(sb.toString(), e2);
                    }
                } else {
                    this.g = C0471ar.c(URLDecoder.decode(str, "US-ASCII"));
                }
                c(aqVar);
                return (long) this.g.length;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Unexpected URI format: ");
            sb2.append(uri);
            throw new H(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Unsupported scheme: ");
        sb3.append(scheme);
        throw new H(sb3.toString());
    }

    public void close() throws IOException {
        if (this.g != null) {
            this.g = null;
            b();
        }
        this.e = null;
    }

    public Uri getUri() {
        C0470aq aqVar = this.e;
        if (aqVar != null) {
            return aqVar.a;
        }
        return null;
    }

    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.g.length - this.f;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.g, this.f, bArr, i, min);
        this.f += min;
        a(min);
        return min;
    }
}
