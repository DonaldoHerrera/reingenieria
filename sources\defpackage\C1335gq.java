package defpackage;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.adjust.sdk.Constants;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: gq reason: default package and case insensitive filesystem */
/* compiled from: DefaultHttpDataSource */
public class C1335gq extends Vp implements C1489lq {
    private static final Pattern e = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> f = new AtomicReference<>();
    private final boolean g;
    private final int h;
    private final int i;
    private final String j;
    private final Rq<String> k;
    private final f l;
    private final f m = new f();
    private C0470aq n;
    private HttpURLConnection o;
    private InputStream p;
    private boolean q;
    private long r;
    private long s;
    private long t;
    private long u;

    public C1335gq(String str, Rq<String> rq, int i2, int i3, boolean z, f fVar) {
        super(true);
        C1852xq.a(str);
        this.j = str;
        this.k = rq;
        this.h = i2;
        this.i = i3;
        this.g = z;
        this.l = fVar;
    }

    private HttpURLConnection d(C0470aq aqVar) throws IOException {
        HttpURLConnection a;
        C0470aq aqVar2 = aqVar;
        URL url = new URL(aqVar2.a.toString());
        int i2 = aqVar2.b;
        byte[] bArr = aqVar2.c;
        long j2 = aqVar2.f;
        long j3 = aqVar2.g;
        boolean b = aqVar2.b(1);
        boolean b2 = aqVar2.b(2);
        if (!this.g) {
            return a(url, i2, bArr, j2, j3, b, b2, true);
        }
        int i3 = 0;
        while (true) {
            int i4 = i3 + 1;
            if (i3 <= 20) {
                int i5 = i4;
                long j4 = j3;
                long j5 = j2;
                a = a(url, i2, bArr, j2, j3, b, b2, false);
                int responseCode = a.getResponseCode();
                String headerField = a.getHeaderField("Location");
                if ((i2 == 1 || i2 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                    a.disconnect();
                    url = a(url, headerField);
                } else if (i2 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return a;
                } else {
                    a.disconnect();
                    url = a(url, headerField);
                    bArr = null;
                    i2 = 1;
                }
                i3 = i5;
                j3 = j4;
                j2 = j5;
            } else {
                int i6 = i4;
                StringBuilder sb = new StringBuilder();
                sb.append("Too many redirects: ");
                sb.append(i6);
                throw new NoRouteToHostException(sb.toString());
            }
        }
        return a;
    }

    private void e() throws IOException {
        if (this.t != this.r) {
            byte[] bArr = (byte[]) f.getAndSet(null);
            if (bArr == null) {
                bArr = new byte[4096];
            }
            while (true) {
                long j2 = this.t;
                long j3 = this.r;
                if (j2 != j3) {
                    int read = this.p.read(bArr, 0, (int) Math.min(j3 - j2, (long) bArr.length));
                    if (Thread.currentThread().isInterrupted()) {
                        throw new InterruptedIOException();
                    } else if (read != -1) {
                        this.t += (long) read;
                        a(read);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    f.set(bArr);
                    return;
                }
            }
        }
    }

    public Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.o;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    /* access modifiers changed from: protected */
    public final long c() {
        long j2 = this.s;
        return j2 == -1 ? j2 : j2 - this.u;
    }

    public void close() throws c {
        try {
            if (this.p != null) {
                a(this.o, c());
                this.p.close();
            }
            this.p = null;
            d();
            if (this.q) {
                this.q = false;
                b();
            }
        } catch (IOException e2) {
            throw new c(e2, this.n, 3);
        } catch (Throwable th) {
            this.p = null;
            d();
            if (this.q) {
                this.q = false;
                b();
            }
            throw th;
        }
    }

    public Uri getUri() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public int read(byte[] bArr, int i2, int i3) throws c {
        try {
            e();
            return a(bArr, i2, i3);
        } catch (IOException e2) {
            throw new c(e2, this.n, 2);
        }
    }

    public long a(C0470aq aqVar) throws c {
        String str = "Unable to connect to ";
        this.n = aqVar;
        long j2 = 0;
        this.u = 0;
        this.t = 0;
        b(aqVar);
        try {
            this.o = d(aqVar);
            try {
                int responseCode = this.o.getResponseCode();
                String responseMessage = this.o.getResponseMessage();
                if (responseCode < 200 || responseCode > 299) {
                    Map headerFields = this.o.getHeaderFields();
                    d();
                    e eVar = new e(responseCode, responseMessage, headerFields, aqVar);
                    if (responseCode == 416) {
                        eVar.initCause(new _p(0));
                    }
                    throw eVar;
                }
                String contentType = this.o.getContentType();
                Rq<String> rq = this.k;
                if (rq == null || rq.evaluate(contentType)) {
                    if (responseCode == 200) {
                        long j3 = aqVar.f;
                        if (j3 != 0) {
                            j2 = j3;
                        }
                    }
                    this.r = j2;
                    if (!aqVar.b(1)) {
                        long j4 = aqVar.g;
                        long j5 = -1;
                        if (j4 != -1) {
                            this.s = j4;
                        } else {
                            long a = a(this.o);
                            if (a != -1) {
                                j5 = a - this.r;
                            }
                            this.s = j5;
                        }
                    } else {
                        this.s = aqVar.g;
                    }
                    try {
                        this.p = this.o.getInputStream();
                        this.q = true;
                        c(aqVar);
                        return this.s;
                    } catch (IOException e2) {
                        d();
                        throw new c(e2, aqVar, 1);
                    }
                } else {
                    d();
                    throw new d(contentType, aqVar);
                }
            } catch (IOException e3) {
                d();
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(aqVar.a.toString());
                throw new c(sb.toString(), e3, aqVar, 1);
            }
        } catch (IOException e4) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(aqVar.a.toString());
            throw new c(sb2.toString(), e4, aqVar, 1);
        }
    }

    private void d() {
        HttpURLConnection httpURLConnection = this.o;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Iq.a("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.o = null;
        }
    }

    private HttpURLConnection a(URL url, int i2, byte[] bArr, long j2, long j3, boolean z, boolean z2, boolean z3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.h);
        httpURLConnection.setReadTimeout(this.i);
        f fVar = this.l;
        if (fVar != null) {
            for (Entry entry : fVar.a().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
        }
        for (Entry entry2 : this.m.a().entrySet()) {
            httpURLConnection.setRequestProperty((String) entry2.getKey(), (String) entry2.getValue());
        }
        if (!(j2 == 0 && j3 == -1)) {
            StringBuilder sb = new StringBuilder();
            sb.append("bytes=");
            sb.append(j2);
            sb.append("-");
            String sb2 = sb.toString();
            if (j3 != -1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append((j2 + j3) - 1);
                sb2 = sb3.toString();
            }
            httpURLConnection.setRequestProperty("Range", sb2);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.j);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        if (z2) {
            httpURLConnection.setRequestProperty("Icy-MetaData", "1");
        }
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(C0470aq.a(i2));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    private static URL a(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (Constants.SCHEME.equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Unsupported protocol redirect: ");
            sb.append(protocol);
            throw new ProtocolException(sb.toString());
        }
        throw new ProtocolException("Null location redirect");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003a  */
    private static long a(HttpURLConnection httpURLConnection) {
        long j2;
        String headerField;
        String headerField2 = httpURLConnection.getHeaderField(HttpHeaders.CONTENT_LENGTH);
        String str = "]";
        String str2 = "DefaultHttpDataSource";
        if (!TextUtils.isEmpty(headerField2)) {
            try {
                j2 = Long.parseLong(headerField2);
            } catch (NumberFormatException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append("Unexpected Content-Length [");
                sb.append(headerField2);
                sb.append(str);
                Iq.b(str2, sb.toString());
            }
            headerField = httpURLConnection.getHeaderField("Content-Range");
            if (!TextUtils.isEmpty(headerField)) {
                return j2;
            }
            Matcher matcher = e.matcher(headerField);
            if (!matcher.find()) {
                return j2;
            }
            try {
                long parseLong = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                if (j2 < 0) {
                    return parseLong;
                }
                if (j2 == parseLong) {
                    return j2;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent headers [");
                sb2.append(headerField2);
                sb2.append("] [");
                sb2.append(headerField);
                sb2.append(str);
                Iq.d(str2, sb2.toString());
                return Math.max(j2, parseLong);
            } catch (NumberFormatException unused2) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Unexpected Content-Range [");
                sb3.append(headerField);
                sb3.append(str);
                Iq.b(str2, sb3.toString());
                return j2;
            }
        }
        j2 = -1;
        headerField = httpURLConnection.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
        }
    }

    private int a(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j2 = this.s;
        if (j2 != -1) {
            long j3 = j2 - this.u;
            if (j3 == 0) {
                return -1;
            }
            i3 = (int) Math.min((long) i3, j3);
        }
        int read = this.p.read(bArr, i2, i3);
        if (read != -1) {
            this.u += (long) read;
            a(read);
            return read;
        } else if (this.s == -1) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j2) {
        int i2 = C0471ar.a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j2 == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j2 <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }
}
