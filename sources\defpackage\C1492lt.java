package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;

/* renamed from: lt reason: default package and case insensitive filesystem */
final class C1492lt extends C1245dt {
    private final HttpURLConnection e;

    C1492lt(HttpURLConnection httpURLConnection) {
        this.e = httpURLConnection;
        httpURLConnection.setInstanceFollowRedirects(false);
    }

    public final void a(String str, String str2) {
        this.e.addRequestProperty(str, str2);
    }

    public final C1215ct e() throws IOException {
        HttpURLConnection httpURLConnection = this.e;
        if (d() != null) {
            String c = c();
            if (c != null) {
                a(HttpHeaders.CONTENT_TYPE, c);
            }
            String a = a();
            if (a != null) {
                a("Content-Encoding", a);
            }
            long b = b();
            int i = (b > 0 ? 1 : (b == 0 ? 0 : -1));
            if (i >= 0) {
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Long.toString(b));
            }
            String requestMethod = httpURLConnection.getRequestMethod();
            if ("POST".equals(requestMethod) || "PUT".equals(requestMethod)) {
                httpURLConnection.setDoOutput(true);
                if (i < 0 || b > 2147483647L) {
                    httpURLConnection.setChunkedStreamingMode(0);
                } else {
                    httpURLConnection.setFixedLengthStreamingMode((int) b);
                }
                OutputStream outputStream = httpURLConnection.getOutputStream();
                try {
                    d().writeTo(outputStream);
                    try {
                    } catch (IOException e2) {
                        throw e2;
                    }
                } finally {
                    try {
                        outputStream.close();
                    } catch (IOException unused) {
                    }
                }
            } else {
                Object[] objArr = {requestMethod};
                if (!(i == 0)) {
                    throw new IllegalArgumentException(Uu.a("%s with non-zero content length is not supported", objArr));
                }
            }
        }
        try {
            httpURLConnection.connect();
            return new C1461kt(httpURLConnection);
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }

    public final void a(int i, int i2) {
        this.e.setReadTimeout(i2);
        this.e.setConnectTimeout(i);
    }
}
