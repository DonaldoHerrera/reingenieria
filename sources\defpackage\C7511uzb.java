package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* renamed from: uzb reason: default package and case insensitive filesystem */
/* compiled from: Http1ExchangeCodec */
public final class C7511uzb implements C6755jzb {
    /* access modifiers changed from: private */
    public final C7440tyb a;
    /* access modifiers changed from: private */
    public final C5615azb b;
    /* access modifiers changed from: private */
    public final C6961nAb c;
    /* access modifiers changed from: private */
    public final C6893mAb d;
    /* access modifiers changed from: private */
    public int e = 0;
    private long f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;
    /* access modifiers changed from: private */
    public C7026nyb g;

    /* renamed from: uzb$a */
    /* compiled from: Http1ExchangeCodec */
    private abstract class a implements HAb {
        protected final C7237rAb a;
        protected boolean b;

        private a() {
            this.a = new C7237rAb(C7511uzb.this.c.k());
        }

        /* access modifiers changed from: 0000 */
        public final void a() {
            if (C7511uzb.this.e != 6) {
                if (C7511uzb.this.e == 5) {
                    C7511uzb.this.a(this.a);
                    C7511uzb.this.e = 6;
                    return;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("state: ");
                sb.append(C7511uzb.this.e);
                throw new IllegalStateException(sb.toString());
            }
        }

        public long b(C6825lAb lab, long j) throws IOException {
            try {
                return C7511uzb.this.c.b(lab, j);
            } catch (IOException e) {
                C7511uzb.this.b.d();
                a();
                throw e;
            }
        }

        public JAb k() {
            return this.a;
        }
    }

    /* renamed from: uzb$b */
    /* compiled from: Http1ExchangeCodec */
    private final class b implements GAb {
        private final C7237rAb a = new C7237rAb(C7511uzb.this.d.k());
        private boolean b;

        b() {
        }

        public void a(C6825lAb lab, long j) throws IOException {
            if (this.b) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C7511uzb.this.d.b(j);
                String str = "\r\n";
                C7511uzb.this.d.f(str);
                C7511uzb.this.d.a(lab, j);
                C7511uzb.this.d.f(str);
            }
        }

        public synchronized void close() throws IOException {
            if (!this.b) {
                this.b = true;
                C7511uzb.this.d.f("0\r\n\r\n");
                C7511uzb.this.a(this.a);
                C7511uzb.this.e = 3;
            }
        }

        public synchronized void flush() throws IOException {
            if (!this.b) {
                C7511uzb.this.d.flush();
            }
        }

        public JAb k() {
            return this.a;
        }
    }

    /* renamed from: uzb$c */
    /* compiled from: Http1ExchangeCodec */
    private class c extends a {
        private final C7095oyb d;
        private long e = -1;
        private boolean f = true;

        c(C7095oyb oyb) {
            super();
            this.d = oyb;
        }

        public long b(C6825lAb lab, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (!this.f) {
                return -1;
            } else {
                long j2 = this.e;
                if (j2 == 0 || j2 == -1) {
                    b();
                    if (!this.f) {
                        return -1;
                    }
                }
                long b = super.b(lab, Math.min(j, this.e));
                if (b != -1) {
                    this.e -= b;
                    return b;
                }
                C7511uzb.this.b.d();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (this.f && !Kyb.a((HAb) this, 100, TimeUnit.MILLISECONDS)) {
                    C7511uzb.this.b.d();
                    a();
                }
                this.b = true;
            }
        }

        private void b() throws IOException {
            if (this.e != -1) {
                C7511uzb.this.c.m();
            }
            try {
                this.e = C7511uzb.this.c.s();
                String trim = C7511uzb.this.c.m().trim();
                if (this.e < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("expected chunk size and optional extensions but was \"");
                    sb.append(this.e);
                    sb.append(trim);
                    sb.append("\"");
                    throw new ProtocolException(sb.toString());
                } else if (this.e == 0) {
                    this.f = false;
                    C7511uzb uzb = C7511uzb.this;
                    uzb.g = uzb.h();
                    C6959mzb.a(C7511uzb.this.a.p(), this.d, C7511uzb.this.g);
                    a();
                }
            } catch (NumberFormatException e2) {
                throw new ProtocolException(e2.getMessage());
            }
        }
    }

    /* renamed from: uzb$d */
    /* compiled from: Http1ExchangeCodec */
    private class d extends a {
        private long d;

        d(long j) {
            super();
            this.d = j;
            if (this.d == 0) {
                a();
            }
        }

        public long b(C6825lAb lab, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.b) {
                long j2 = this.d;
                if (j2 == 0) {
                    return -1;
                }
                long b = super.b(lab, Math.min(j2, j));
                if (b != -1) {
                    this.d -= b;
                    if (this.d == 0) {
                        a();
                    }
                    return b;
                }
                C7511uzb.this.b.d();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a();
                throw protocolException;
            } else {
                throw new IllegalStateException("closed");
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (this.d != 0 && !Kyb.a((HAb) this, 100, TimeUnit.MILLISECONDS)) {
                    C7511uzb.this.b.d();
                    a();
                }
                this.b = true;
            }
        }
    }

    /* renamed from: uzb$e */
    /* compiled from: Http1ExchangeCodec */
    private final class e implements GAb {
        private final C7237rAb a;
        private boolean b;

        private e() {
            this.a = new C7237rAb(C7511uzb.this.d.k());
        }

        public void a(C6825lAb lab, long j) throws IOException {
            if (!this.b) {
                Kyb.a(lab.size(), 0, j);
                C7511uzb.this.d.a(lab, j);
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() throws IOException {
            if (!this.b) {
                this.b = true;
                C7511uzb.this.a(this.a);
                C7511uzb.this.e = 3;
            }
        }

        public void flush() throws IOException {
            if (!this.b) {
                C7511uzb.this.d.flush();
            }
        }

        public JAb k() {
            return this.a;
        }
    }

    /* renamed from: uzb$f */
    /* compiled from: Http1ExchangeCodec */
    private class f extends a {
        private boolean d;

        private f() {
            super();
        }

        public long b(C6825lAb lab, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.b) {
                throw new IllegalStateException("closed");
            } else if (this.d) {
                return -1;
            } else {
                long b = super.b(lab, j);
                if (b != -1) {
                    return b;
                }
                this.d = true;
                a();
                return -1;
            }
        }

        public void close() throws IOException {
            if (!this.b) {
                if (!this.d) {
                    a();
                }
                this.b = true;
            }
        }
    }

    public C7511uzb(C7440tyb tyb, C5615azb azb, C6961nAb nab, C6893mAb mab) {
        this.a = tyb;
        this.b = azb;
        this.c = nab;
        this.d = mab;
    }

    /* access modifiers changed from: private */
    public C7026nyb h() throws IOException {
        defpackage.C7026nyb.a aVar = new defpackage.C7026nyb.a();
        while (true) {
            String g2 = g();
            if (g2.length() == 0) {
                return aVar.a();
            }
            Iyb.a.a(aVar, g2);
        }
    }

    public void cancel() {
        C5615azb azb = this.b;
        if (azb != null) {
            azb.a();
        }
    }

    private GAb d() {
        if (this.e == 1) {
            this.e = 2;
            return new b();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    private GAb e() {
        if (this.e == 1) {
            this.e = 2;
            return new e();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    private HAb f() {
        if (this.e == 4) {
            this.e = 5;
            this.b.d();
            return new f();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    private String g() throws IOException {
        String c2 = this.c.c(this.f);
        this.f -= (long) c2.length();
        return c2;
    }

    public long b(Ayb ayb) {
        if (!C6959mzb.b(ayb)) {
            return 0;
        }
        if ("chunked".equalsIgnoreCase(ayb.a("Transfer-Encoding"))) {
            return -1;
        }
        return C6959mzb.a(ayb);
    }

    public void c() throws IOException {
        this.d.flush();
    }

    public void c(Ayb ayb) throws IOException {
        long a2 = C6959mzb.a(ayb);
        if (a2 != -1) {
            HAb a3 = a(a2);
            Kyb.b(a3, (int) BaseClientBuilder.API_PRIORITY_OTHER, TimeUnit.MILLISECONDS);
            a3.close();
        }
    }

    public C5615azb a() {
        return this.b;
    }

    public void b() throws IOException {
        this.d.flush();
    }

    public GAb a(C7647wyb wyb, long j) throws IOException {
        if (wyb.a() == null || !wyb.a().c()) {
            if ("chunked".equalsIgnoreCase(wyb.a("Transfer-Encoding"))) {
                return d();
            }
            if (j != -1) {
                return e();
            }
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        }
        throw new ProtocolException("Duplex connections are not supported for HTTP/1");
    }

    public void a(C7647wyb wyb) throws IOException {
        a(wyb.c(), C7235qzb.a(wyb, this.b.e().b().type()));
    }

    public HAb a(Ayb ayb) {
        if (!C6959mzb.b(ayb)) {
            return a(0);
        }
        if ("chunked".equalsIgnoreCase(ayb.a("Transfer-Encoding"))) {
            return a(ayb.K().g());
        }
        long a2 = C6959mzb.a(ayb);
        if (a2 != -1) {
            return a(a2);
        }
        return f();
    }

    public void a(C7026nyb nyb, String str) throws IOException {
        if (this.e == 0) {
            String str2 = "\r\n";
            this.d.f(str).f(str2);
            int c2 = nyb.c();
            for (int i = 0; i < c2; i++) {
                this.d.f(nyb.a(i)).f(": ").f(nyb.b(i)).f(str2);
            }
            this.d.f(str2);
            this.e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    public defpackage.Ayb.a a(boolean z) throws IOException {
        int i = this.e;
        if (i == 1 || i == 3) {
            try {
                C7373szb a2 = C7373szb.a(g());
                defpackage.Ayb.a aVar = new defpackage.Ayb.a();
                aVar.a(a2.a);
                aVar.a(a2.b);
                aVar.a(a2.c);
                aVar.a(h());
                if (z && a2.b == 100) {
                    return null;
                }
                if (a2.b == 100) {
                    this.e = 3;
                    return aVar;
                }
                this.e = 4;
                return aVar;
            } catch (EOFException e2) {
                C5615azb azb = this.b;
                String l = azb != null ? azb.e().a().k().l() : "unknown";
                StringBuilder sb = new StringBuilder();
                sb.append("unexpected end of stream on ");
                sb.append(l);
                throw new IOException(sb.toString(), e2);
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("state: ");
            sb2.append(this.e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    private HAb a(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new d(j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    private HAb a(C7095oyb oyb) {
        if (this.e == 4) {
            this.e = 5;
            return new c(oyb);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state: ");
        sb.append(this.e);
        throw new IllegalStateException(sb.toString());
    }

    /* access modifiers changed from: private */
    public void a(C7237rAb rab) {
        JAb g2 = rab.g();
        rab.a(JAb.a);
        g2.a();
        g2.b();
    }
}
