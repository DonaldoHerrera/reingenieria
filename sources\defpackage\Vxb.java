package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: Vxb reason: default package */
/* compiled from: Cache */
public final class Vxb implements Closeable, Flushable {
    final Vyb a;
    final Tyb b;
    int c;
    int d;
    private int e;
    private int f;
    private int g;

    /* renamed from: Vxb$a */
    /* compiled from: Cache */
    private final class a implements Oyb {
        private final defpackage.Tyb.a a;
        private GAb b;
        private GAb c;
        boolean d;

        a(defpackage.Tyb.a aVar) {
            this.a = aVar;
            this.b = aVar.a(1);
            this.c = new Uxb(this, this.b, Vxb.this, aVar);
        }

        /* JADX INFO: used method not loaded: Kyb.a(java.io.Closeable):null, types can be incorrect */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r4.a.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
            defpackage.Kyb.a((java.io.Closeable) r4.b);
         */
        public void abort() {
            synchronized (Vxb.this) {
                if (!this.d) {
                    this.d = true;
                    Vxb.this.d++;
                }
            }
        }

        public GAb body() {
            return this.c;
        }
    }

    /* renamed from: Vxb$b */
    /* compiled from: Cache */
    private static class b extends Cyb {
        final defpackage.Tyb.c a;
        private final C6961nAb b;
        private final String c;
        private final String d;

        b(defpackage.Tyb.c cVar, String str, String str2) {
            this.a = cVar;
            this.c = str;
            this.d = str2;
            this.b = C7720yAb.a((HAb) new Wxb(this, cVar.a(1), cVar));
        }

        public long contentLength() {
            try {
                if (this.d != null) {
                    return Long.parseLong(this.d);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public C7233qyb contentType() {
            String str = this.c;
            if (str != null) {
                return C7233qyb.b(str);
            }
            return null;
        }

        public C6961nAb source() {
            return this.b;
        }
    }

    /* renamed from: Vxb$c */
    /* compiled from: Cache */
    private static final class c {
        private static final String a;
        private static final String b;
        private final String c;
        private final C7026nyb d;
        private final String e;
        private final C7509uyb f;
        private final int g;
        private final String h;
        private final C7026nyb i;
        private final C6957myb j;
        private final long k;
        private final long l;

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(_zb.a().b());
            sb.append("-Sent-Millis");
            a = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(_zb.a().b());
            sb2.append("-Received-Millis");
            b = sb2.toString();
        }

        c(HAb hAb) throws IOException {
            Eyb eyb;
            try {
                C6961nAb a2 = C7720yAb.a(hAb);
                this.c = a2.m();
                this.e = a2.m();
                defpackage.C7026nyb.a aVar = new defpackage.C7026nyb.a();
                int a3 = Vxb.a(a2);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar.a(a2.m());
                }
                this.d = aVar.a();
                C7373szb a4 = C7373szb.a(a2.m());
                this.f = a4.a;
                this.g = a4.b;
                this.h = a4.c;
                defpackage.C7026nyb.a aVar2 = new defpackage.C7026nyb.a();
                int a5 = Vxb.a(a2);
                for (int i3 = 0; i3 < a5; i3++) {
                    aVar2.a(a2.m());
                }
                String b2 = aVar2.b(a);
                String b3 = aVar2.b(b);
                aVar2.c(a);
                aVar2.c(b);
                long j2 = 0;
                this.k = b2 != null ? Long.parseLong(b2) : 0;
                if (b3 != null) {
                    j2 = Long.parseLong(b3);
                }
                this.l = j2;
                this.i = aVar2.a();
                if (a()) {
                    String m = a2.m();
                    if (m.length() <= 0) {
                        C5613ayb a6 = C5613ayb.a(a2.m());
                        List a7 = a(a2);
                        List a8 = a(a2);
                        if (!a2.p()) {
                            eyb = Eyb.a(a2.m());
                        } else {
                            eyb = Eyb.SSL_3_0;
                        }
                        this.j = C6957myb.a(eyb, a6, a7, a8);
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("expected \"\" but was \"");
                        sb.append(m);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.j = null;
                }
            } finally {
                hAb.close();
            }
        }

        public void a(defpackage.Tyb.a aVar) throws IOException {
            String str;
            C6893mAb a2 = C7720yAb.a(aVar.a(0));
            a2.f(this.c).writeByte(10);
            a2.f(this.e).writeByte(10);
            a2.a((long) this.d.c()).writeByte(10);
            int c2 = this.d.c();
            int i2 = 0;
            while (true) {
                str = ": ";
                if (i2 >= c2) {
                    break;
                }
                a2.f(this.d.a(i2)).f(str).f(this.d.b(i2)).writeByte(10);
                i2++;
            }
            a2.f(new C7373szb(this.f, this.g, this.h).toString()).writeByte(10);
            a2.a((long) (this.i.c() + 2)).writeByte(10);
            int c3 = this.i.c();
            for (int i3 = 0; i3 < c3; i3++) {
                a2.f(this.i.a(i3)).f(str).f(this.i.b(i3)).writeByte(10);
            }
            a2.f(a).f(str).a(this.k).writeByte(10);
            a2.f(b).f(str).a(this.l).writeByte(10);
            if (a()) {
                a2.writeByte(10);
                a2.f(this.j.a().a()).writeByte(10);
                a(a2, this.j.c());
                a(a2, this.j.b());
                a2.f(this.j.d().a()).writeByte(10);
            }
            a2.close();
        }

        private boolean a() {
            return this.c.startsWith("https://");
        }

        c(Ayb ayb) {
            this.c = ayb.K().g().toString();
            this.d = C6959mzb.d(ayb);
            this.e = ayb.K().e();
            this.f = ayb.I();
            this.g = ayb.d();
            this.h = ayb.i();
            this.i = ayb.f();
            this.j = ayb.e();
            this.k = ayb.L();
            this.l = ayb.J();
        }

        private List<Certificate> a(C6961nAb nab) throws IOException {
            int a2 = Vxb.a(nab);
            if (a2 == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a2);
                for (int i2 = 0; i2 < a2; i2++) {
                    String m = nab.m();
                    C6825lAb lab = new C6825lAb();
                    lab.a(C7030oAb.a(m));
                    arrayList.add(instance.generateCertificate(lab.t()));
                }
                return arrayList;
            } catch (CertificateException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        private void a(C6893mAb mab, List<Certificate> list) throws IOException {
            try {
                mab.a((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    mab.f(C7030oAb.a(((Certificate) list.get(i2)).getEncoded()).a()).writeByte(10);
                }
            } catch (CertificateEncodingException e2) {
                throw new IOException(e2.getMessage());
            }
        }

        public boolean a(C7647wyb wyb, Ayb ayb) {
            return this.c.equals(wyb.g().toString()) && this.e.equals(wyb.e()) && C6959mzb.a(ayb, this.d, wyb);
        }

        public Ayb a(defpackage.Tyb.c cVar) {
            String b2 = this.i.b(HttpHeaders.CONTENT_TYPE);
            String b3 = this.i.b(HttpHeaders.CONTENT_LENGTH);
            defpackage.C7647wyb.a aVar = new defpackage.C7647wyb.a();
            aVar.b(this.c);
            aVar.a(this.e, (C7854zyb) null);
            aVar.a(this.d);
            C7647wyb a2 = aVar.a();
            defpackage.Ayb.a aVar2 = new defpackage.Ayb.a();
            aVar2.a(a2);
            aVar2.a(this.f);
            aVar2.a(this.g);
            aVar2.a(this.h);
            aVar2.a(this.i);
            aVar2.a((Cyb) new b(cVar, b2, b3));
            aVar2.a(this.j);
            aVar2.b(this.k);
            aVar2.a(this.l);
            return aVar2.a();
        }
    }

    public Vxb(File file, long j) {
        this(file, j, Vzb.a);
    }

    public static String a(C7095oyb oyb) {
        return C7030oAb.c(oyb.toString()).c().b();
    }

    /* access modifiers changed from: 0000 */
    public void b(C7647wyb wyb) throws IOException {
        this.b.c(a(wyb.g()));
    }

    public void close() throws IOException {
        this.b.close();
    }

    public void flush() throws IOException {
        this.b.flush();
    }

    Vxb(File file, long j, Vzb vzb) {
        this.a = new Txb(this);
        this.b = Tyb.a(vzb, file, 201105, 2, j);
    }

    /* access modifiers changed from: 0000 */
    public Ayb a(C7647wyb wyb) {
        try {
            defpackage.Tyb.c b2 = this.b.b(a(wyb.g()));
            if (b2 == null) {
                return null;
            }
            try {
                c cVar = new c(b2.a(0));
                Ayb a2 = cVar.a(b2);
                if (cVar.a(wyb, a2)) {
                    return a2;
                }
                Kyb.a((Closeable) a2.a());
                return null;
            } catch (IOException unused) {
                Kyb.a((Closeable) b2);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public Oyb a(Ayb ayb) {
        defpackage.Tyb.a aVar;
        String e2 = ayb.K().e();
        if (C7028nzb.a(ayb.K().e())) {
            try {
                b(ayb.K());
            } catch (IOException unused) {
            }
            return null;
        } else if (!e2.equals("GET") || C6959mzb.c(ayb)) {
            return null;
        } else {
            c cVar = new c(ayb);
            try {
                aVar = this.b.a(a(ayb.K().g()));
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.a(aVar);
                    return new a(aVar);
                } catch (IOException unused2) {
                    a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                a(aVar);
                return null;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(Ayb ayb, Ayb ayb2) {
        defpackage.Tyb.a aVar;
        c cVar = new c(ayb2);
        try {
            aVar = ((b) ayb.a()).a.a();
            if (aVar != null) {
                try {
                    cVar.a(aVar);
                    aVar.b();
                } catch (IOException unused) {
                }
            }
        } catch (IOException unused2) {
            aVar = null;
            a(aVar);
        }
    }

    private void a(defpackage.Tyb.a aVar) {
        if (aVar != null) {
            try {
                aVar.a();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a(Pyb pyb) {
        this.g++;
        if (pyb.a != null) {
            this.e++;
        } else if (pyb.b != null) {
            this.f++;
        }
    }

    /* access modifiers changed from: 0000 */
    public synchronized void a() {
        this.f++;
    }

    static int a(C6961nAb nab) throws IOException {
        try {
            long q = nab.q();
            String m = nab.m();
            if (q >= 0 && q <= 2147483647L && m.isEmpty()) {
                return (int) q;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("expected an int but was \"");
            sb.append(q);
            sb.append(m);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e2) {
            throw new IOException(e2.getMessage());
        }
    }
}
