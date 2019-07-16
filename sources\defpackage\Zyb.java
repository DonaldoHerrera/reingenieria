package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: Zyb reason: default package */
/* compiled from: Exchange */
public final class Zyb {
    final C6551gzb a;
    final Yxb b;
    final C6889lyb c;
    final _yb d;
    final C6755jzb e;
    private boolean f;

    /* renamed from: Zyb$a */
    /* compiled from: Exchange */
    private final class a extends C7099pAb {
        private boolean b;
        private long c;
        private long d;
        private boolean e;

        a(GAb gAb, long j) {
            super(gAb);
            this.c = j;
        }

        public void a(C6825lAb lab, long j) throws IOException {
            if (!this.e) {
                long j2 = this.c;
                if (j2 == -1 || this.d + j <= j2) {
                    try {
                        super.a(lab, j);
                        this.d += j;
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected ");
                    sb.append(this.c);
                    sb.append(" bytes but received ");
                    sb.append(this.d + j);
                    throw new ProtocolException(sb.toString());
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.e) {
                this.e = true;
                long j = this.c;
                if (j == -1 || this.d == j) {
                    try {
                        super.close();
                        a(null);
                    } catch (IOException e2) {
                        throw a(e2);
                    }
                } else {
                    throw new ProtocolException("unexpected end of stream");
                }
            }
        }

        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e2) {
                throw a(e2);
            }
        }

        private IOException a(IOException iOException) {
            if (this.b) {
                return iOException;
            }
            this.b = true;
            return Zyb.this.a(this.d, false, true, iOException);
        }
    }

    /* renamed from: Zyb$b */
    /* compiled from: Exchange */
    final class b extends C7168qAb {
        private final long b;
        private long c;
        private boolean d;
        private boolean e;

        b(HAb hAb, long j) {
            super(hAb);
            this.b = j;
            if (j == 0) {
                a(null);
            }
        }

        /* access modifiers changed from: 0000 */
        public IOException a(IOException iOException) {
            if (this.d) {
                return iOException;
            }
            this.d = true;
            return Zyb.this.a(this.c, true, false, iOException);
        }

        public long b(C6825lAb lab, long j) throws IOException {
            if (!this.e) {
                try {
                    long b2 = a().b(lab, j);
                    if (b2 == -1) {
                        a(null);
                        return -1;
                    }
                    long j2 = this.c + b2;
                    if (this.b != -1) {
                        if (j2 > this.b) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("expected ");
                            sb.append(this.b);
                            sb.append(" bytes but received ");
                            sb.append(j2);
                            throw new ProtocolException(sb.toString());
                        }
                    }
                    this.c = j2;
                    if (j2 == this.b) {
                        a(null);
                    }
                    return b2;
                } catch (IOException e2) {
                    throw a(e2);
                }
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.e) {
                this.e = true;
                try {
                    super.close();
                    a(null);
                } catch (IOException e2) {
                    throw a(e2);
                }
            }
        }
    }

    public Zyb(C6551gzb gzb, Yxb yxb, C6889lyb lyb, _yb _yb, C6755jzb jzb) {
        this.a = gzb;
        this.b = yxb;
        this.c = lyb;
        this.d = _yb;
        this.e = jzb;
    }

    public void a(C7647wyb wyb) throws IOException {
        try {
            this.c.d(this.b);
            this.e.a(wyb);
            this.c.a(this.b, wyb);
        } catch (IOException e2) {
            this.c.b(this.b, e2);
            a(e2);
            throw e2;
        }
    }

    public C5615azb b() {
        return this.e.a();
    }

    public void c() {
        this.e.cancel();
        this.a.a(this, true, true, null);
    }

    public void d() throws IOException {
        try {
            this.e.b();
        } catch (IOException e2) {
            this.c.b(this.b, e2);
            a(e2);
            throw e2;
        }
    }

    public void e() throws IOException {
        try {
            this.e.c();
        } catch (IOException e2) {
            this.c.b(this.b, e2);
            a(e2);
            throw e2;
        }
    }

    public boolean f() {
        return this.f;
    }

    public void g() {
        this.e.a().d();
    }

    public void h() {
        this.a.a(this, true, false, null);
    }

    public void i() {
        this.c.f(this.b);
    }

    public void b(Ayb ayb) {
        this.c.a(this.b, ayb);
    }

    public GAb a(C7647wyb wyb, boolean z) throws IOException {
        this.f = z;
        long a2 = wyb.a().a();
        this.c.c(this.b);
        return new a(this.e.a(wyb, a2), a2);
    }

    public defpackage.Ayb.a a(boolean z) throws IOException {
        try {
            defpackage.Ayb.a a2 = this.e.a(z);
            if (a2 != null) {
                Iyb.a.a(a2, this);
            }
            return a2;
        } catch (IOException e2) {
            this.c.c(this.b, e2);
            a(e2);
            throw e2;
        }
    }

    public Cyb a(Ayb ayb) throws IOException {
        try {
            this.c.e(this.b);
            String a2 = ayb.a(HttpHeaders.CONTENT_TYPE);
            long b2 = this.e.b(ayb);
            return new C7166pzb(a2, b2, C7720yAb.a((HAb) new b(this.e.a(ayb), b2)));
        } catch (IOException e2) {
            this.c.c(this.b, e2);
            a(e2);
            throw e2;
        }
    }

    public void a() {
        this.e.cancel();
    }

    /* access modifiers changed from: 0000 */
    public void a(IOException iOException) {
        this.d.d();
        this.e.a().a(iOException);
    }

    /* access modifiers changed from: 0000 */
    public IOException a(long j, boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        if (z2) {
            if (iOException != null) {
                this.c.b(this.b, iOException);
            } else {
                this.c.a(this.b, j);
            }
        }
        if (z) {
            if (iOException != null) {
                this.c.c(this.b, iOException);
            } else {
                this.c.b(this.b, j);
            }
        }
        return this.a.a(this, z2, z, iOException);
    }
}
