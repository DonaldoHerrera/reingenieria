package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

/* renamed from: Xs reason: default package and case insensitive filesystem */
public final class C0279Xs {
    private InputStream a;
    private final String b;
    private final String c;
    private final C1890yy d;
    private C1215ct e;
    private final int f;
    private final String g;
    private final C0274Ws h;
    private int i;
    private boolean j;
    private boolean k;

    C0279Xs(C0274Ws ws, C1215ct ctVar) throws IOException {
        StringBuilder sb;
        this.h = ws;
        this.i = ws.h();
        this.j = ws.i();
        this.e = ctVar;
        this.b = ctVar.c();
        int f2 = ctVar.f();
        boolean z = false;
        if (f2 < 0) {
            f2 = 0;
        }
        this.f = f2;
        String e2 = ctVar.e();
        this.g = e2;
        Logger logger = C0473at.a;
        if (this.j && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        C1890yy yyVar = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(C1339gu.a);
            String g2 = ctVar.g();
            if (g2 != null) {
                sb.append(g2);
            } else {
                sb.append(this.f);
                if (e2 != null) {
                    sb.append(' ');
                    sb.append(e2);
                }
            }
            sb.append(C1339gu.a);
        } else {
            sb = null;
        }
        ws.k().a(ctVar, z ? sb : null);
        String d2 = ctVar.d();
        if (d2 == null) {
            d2 = ws.k().k();
        }
        this.c = d2;
        if (d2 != null) {
            yyVar = new C1890yy(d2);
        }
        this.d = yyVar;
        if (z) {
            logger.logp(Level.CONFIG, "com.google.api.client.http.HttpResponse", "<init>", sb.toString());
        }
    }

    private final Charset j() {
        C1890yy yyVar = this.d;
        return (yyVar == null || yyVar.b() == null) ? Jt.b : this.d.b();
    }

    public final void a() throws IOException {
        f();
        this.e.a();
    }

    public final InputStream b() throws IOException {
        if (!this.k) {
            InputStream b2 = this.e.b();
            if (b2 != null) {
                try {
                    String str = this.b;
                    if (str != null && str.contains("gzip")) {
                        b2 = new GZIPInputStream(b2);
                    }
                    Logger logger = C0473at.a;
                    if (this.j && logger.isLoggable(Level.CONFIG)) {
                        b2 = new _t(b2, logger, Level.CONFIG, this.i);
                    }
                    this.a = b2;
                } catch (EOFException unused) {
                    b2.close();
                } catch (Throwable th) {
                    b2.close();
                    throw th;
                }
            }
            this.k = true;
        }
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.f;
    }

    public final String e() {
        return this.g;
    }

    public final void f() throws IOException {
        InputStream b2 = b();
        if (b2 != null) {
            b2.close();
        }
    }

    public final boolean g() {
        int i2 = this.f;
        return i2 >= 200 && i2 < 300;
    }

    /* JADX INFO: finally extract failed */
    public final String h() throws IOException {
        InputStream b2 = b();
        if (b2 == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            Pu.a(b2);
            Pu.a(byteArrayOutputStream);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = b2.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    b2.close();
                    return byteArrayOutputStream.toString(j().name());
                }
            }
        } catch (Throwable th) {
            b2.close();
            throw th;
        }
    }

    public final C1830wy i() {
        return this.h.k();
    }

    public final <T> T a(Class<T> cls) throws IOException {
        int i2 = this.f;
        boolean z = true;
        if (this.h.a().equals("HEAD") || i2 / 100 == 1 || i2 == 204 || i2 == 304) {
            f();
            z = false;
        }
        if (!z) {
            return null;
        }
        return this.h.b().a(b(), j(), cls);
    }
}
