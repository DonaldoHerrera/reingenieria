package defpackage;

import com.facebook.stetho.server.http.HttpHeaders;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* renamed from: ryb reason: default package and case insensitive filesystem */
/* compiled from: MultipartBody */
public final class C7302ryb extends C7854zyb {
    public static final C7233qyb a = C7233qyb.a("multipart/mixed");
    public static final C7233qyb b = C7233qyb.a("multipart/alternative");
    public static final C7233qyb c = C7233qyb.a("multipart/digest");
    public static final C7233qyb d = C7233qyb.a("multipart/parallel");
    public static final C7233qyb e = C7233qyb.a("multipart/form-data");
    private static final byte[] f = {58, 32};
    private static final byte[] g = {Ascii.CR, 10};
    private static final byte[] h = {Framer.STDIN_FRAME_PREFIX, Framer.STDIN_FRAME_PREFIX};
    private final C7030oAb i;
    private final C7233qyb j;
    private final C7233qyb k;
    private final List<b> l;
    private long m = -1;

    /* renamed from: ryb$a */
    /* compiled from: MultipartBody */
    public static final class a {
        private final C7030oAb a;
        private C7233qyb b;
        private final List<b> c;

        public a() {
            this(UUID.randomUUID().toString());
        }

        public a a(C7233qyb qyb) {
            if (qyb == null) {
                throw new NullPointerException("type == null");
            } else if (qyb.b().equals("multipart")) {
                this.b = qyb;
                return this;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("multipart != ");
                sb.append(qyb);
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public a(String str) {
            this.b = C7302ryb.a;
            this.c = new ArrayList();
            this.a = C7030oAb.c(str);
        }

        public a a(String str, String str2) {
            a(b.a(str, str2));
            return this;
        }

        public a a(String str, String str2, C7854zyb zyb) {
            a(b.a(str, str2, zyb));
            return this;
        }

        public a a(b bVar) {
            if (bVar != null) {
                this.c.add(bVar);
                return this;
            }
            throw new NullPointerException("part == null");
        }

        public C7302ryb a() {
            if (!this.c.isEmpty()) {
                return new C7302ryb(this.a, this.b, this.c);
            }
            throw new IllegalStateException("Multipart body must have at least one part.");
        }
    }

    /* renamed from: ryb$b */
    /* compiled from: MultipartBody */
    public static final class b {
        final C7026nyb a;
        final C7854zyb b;

        private b(C7026nyb nyb, C7854zyb zyb) {
            this.a = nyb;
            this.b = zyb;
        }

        public static b a(C7026nyb nyb, C7854zyb zyb) {
            if (zyb == null) {
                throw new NullPointerException("body == null");
            } else if (nyb != null && nyb.b(HttpHeaders.CONTENT_TYPE) != null) {
                throw new IllegalArgumentException("Unexpected header: Content-Type");
            } else if (nyb == null || nyb.b(HttpHeaders.CONTENT_LENGTH) == null) {
                return new b(nyb, zyb);
            } else {
                throw new IllegalArgumentException("Unexpected header: Content-Length");
            }
        }

        public static b a(String str, String str2) {
            return a(str, null, C7854zyb.a((C7233qyb) null, str2));
        }

        public static b a(String str, String str2, C7854zyb zyb) {
            if (str != null) {
                StringBuilder sb = new StringBuilder("form-data; name=");
                C7302ryb.a(sb, str);
                if (str2 != null) {
                    sb.append("; filename=");
                    C7302ryb.a(sb, str2);
                }
                defpackage.C7026nyb.a aVar = new defpackage.C7026nyb.a();
                aVar.c("Content-Disposition", sb.toString());
                return a(aVar.a(), zyb);
            }
            throw new NullPointerException("name == null");
        }
    }

    C7302ryb(C7030oAb oab, C7233qyb qyb, List<b> list) {
        this.i = oab;
        this.j = qyb;
        StringBuilder sb = new StringBuilder();
        sb.append(qyb);
        sb.append("; boundary=");
        sb.append(oab.v());
        this.k = C7233qyb.a(sb.toString());
        this.l = Kyb.a(list);
    }

    public long a() throws IOException {
        long j2 = this.m;
        if (j2 != -1) {
            return j2;
        }
        long a2 = a((C6893mAb) null, true);
        this.m = a2;
        return a2;
    }

    public C7233qyb b() {
        return this.k;
    }

    public void a(C6893mAb mab) throws IOException {
        a(mab, false);
    }

    /* JADX WARNING: type inference failed for: r13v1, types: [mAb] */
    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r13v3, types: [lAb] */
    /* JADX WARNING: type inference failed for: r13v4 */
    /* JADX WARNING: type inference failed for: r13v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 3 */
    private long a(C6893mAb mab, boolean z) throws IOException {
        C6825lAb lab;
        if (z) {
            r13 = new C6825lAb();
            lab = r13;
            r13 = r13;
        } else {
            r13 = mab;
            lab = 0;
        }
        int size = this.l.size();
        long j2 = 0;
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = (b) this.l.get(i2);
            C7026nyb nyb = bVar.a;
            C7854zyb zyb = bVar.b;
            r13.write(h);
            r13.a(this.i);
            r13.write(g);
            if (nyb != null) {
                int c2 = nyb.c();
                for (int i3 = 0; i3 < c2; i3++) {
                    r13.f(nyb.a(i3)).write(f).f(nyb.b(i3)).write(g);
                }
            }
            C7233qyb b2 = zyb.b();
            if (b2 != null) {
                r13.f("Content-Type: ").f(b2.toString()).write(g);
            }
            long a2 = zyb.a();
            if (a2 != -1) {
                r13.f("Content-Length: ").a(a2).write(g);
            } else if (z) {
                lab.i();
                return -1;
            }
            r13.write(g);
            if (z) {
                j2 += a2;
            } else {
                zyb.a(r13);
            }
            r13.write(g);
        }
        r13.write(h);
        r13.a(this.i);
        r13.write(h);
        r13.write(g);
        if (z) {
            j2 += lab.size();
            lab.i();
        }
        return j2;
    }

    static void a(StringBuilder sb, String str) {
        sb.append('\"');
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt == 10) {
                sb.append("%0A");
            } else if (charAt == 13) {
                sb.append("%0D");
            } else if (charAt != '\"') {
                sb.append(charAt);
            } else {
                sb.append("%22");
            }
        }
        sb.append('\"');
    }
}
