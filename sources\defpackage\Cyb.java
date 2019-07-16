package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* renamed from: Cyb reason: default package */
/* compiled from: ResponseBody */
public abstract class Cyb implements Closeable {
    private Reader reader;

    /* renamed from: Cyb$a */
    /* compiled from: ResponseBody */
    static final class a extends Reader {
        private final C6961nAb a;
        private final Charset b;
        private boolean c;
        private Reader d;

        a(C6961nAb nab, Charset charset) {
            this.a = nab;
            this.b = charset;
        }

        public void close() throws IOException {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }

        public int read(char[] cArr, int i, int i2) throws IOException {
            if (!this.c) {
                Reader reader = this.d;
                if (reader == null) {
                    Reader inputStreamReader = new InputStreamReader(this.a.t(), Kyb.a(this.a, this.b));
                    this.d = inputStreamReader;
                    reader = inputStreamReader;
                }
                return reader.read(cArr, i, i2);
            }
            throw new IOException("Stream closed");
        }
    }

    private static /* synthetic */ void $closeResource(Throwable th, AutoCloseable autoCloseable) {
        if (th != null) {
            try {
                autoCloseable.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        } else {
            autoCloseable.close();
        }
    }

    private Charset charset() {
        C7233qyb contentType = contentType();
        return contentType != null ? contentType.a(StandardCharsets.UTF_8) : StandardCharsets.UTF_8;
    }

    public static Cyb create(C7233qyb qyb, String str) {
        Charset charset = StandardCharsets.UTF_8;
        if (qyb != null) {
            charset = qyb.a();
            if (charset == null) {
                charset = StandardCharsets.UTF_8;
                StringBuilder sb = new StringBuilder();
                sb.append(qyb);
                sb.append("; charset=utf-8");
                qyb = C7233qyb.b(sb.toString());
            }
        }
        C6825lAb lab = new C6825lAb();
        lab.a(str, charset);
        return create(qyb, lab.size(), lab);
    }

    public final InputStream byteStream() {
        return source().t();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0052, code lost:
        $closeResource(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0055, code lost:
        throw r0;
     */
    public final byte[] bytes() throws IOException {
        long contentLength = contentLength();
        if (contentLength <= 2147483647L) {
            C6961nAb source = source();
            byte[] o = source.o();
            if (source != null) {
                $closeResource(null, source);
            }
            if (contentLength == -1 || contentLength == ((long) o.length)) {
                return o;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Content-Length (");
            sb.append(contentLength);
            sb.append(") and stream length (");
            sb.append(o.length);
            sb.append(") disagree");
            throw new IOException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cannot buffer entire body for content length: ");
        sb2.append(contentLength);
        throw new IOException(sb2.toString());
    }

    public final Reader charStream() {
        Reader reader2 = this.reader;
        if (reader2 != null) {
            return reader2;
        }
        a aVar = new a(source(), charset());
        this.reader = aVar;
        return aVar;
    }

    public void close() {
        Kyb.a((Closeable) source());
    }

    public abstract long contentLength();

    public abstract C7233qyb contentType();

    public abstract C6961nAb source();

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 != null) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        $closeResource(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        r2 = move-exception;
     */
    public final String string() throws IOException {
        C6961nAb source = source();
        String a2 = source.a(Kyb.a(source, charset()));
        if (source != null) {
            $closeResource(null, source);
        }
        return a2;
    }

    public static Cyb create(C7233qyb qyb, byte[] bArr) {
        C6825lAb lab = new C6825lAb();
        lab.write(bArr);
        return create(qyb, (long) bArr.length, lab);
    }

    public static Cyb create(C7233qyb qyb, C7030oAb oab) {
        C6825lAb lab = new C6825lAb();
        lab.a(oab);
        return create(qyb, (long) oab.f(), lab);
    }

    public static Cyb create(C7233qyb qyb, long j, C6961nAb nab) {
        if (nab != null) {
            return new Byb(qyb, j, nab);
        }
        throw new NullPointerException("source == null");
    }
}
