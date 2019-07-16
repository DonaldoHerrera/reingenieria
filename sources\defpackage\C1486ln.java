package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: ln reason: default package and case insensitive filesystem */
/* compiled from: AmrExtractor */
public final class C1486ln implements _m {
    public static final C0529cn a = C1455kn.a;
    private static final int[] b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    private static final int[] c = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
    private static final byte[] d = C0471ar.c("#!AMR\n");
    private static final byte[] e = C0471ar.c("#!AMR-WB\n");
    private static final int f = c[8];
    private final byte[] g;
    private final int h;
    private boolean i;
    private long j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private int o;
    private int p;
    private long q;
    private C0498bn r;
    private C1424jn s;
    private C1363hn t;
    private boolean u;

    public C1486ln() {
        this(0);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new C1486ln()};
    }

    private void b() {
        if (!this.u) {
            this.u = true;
            this.s.a(Format.a((String) null, this.i ? "audio/amr-wb" : "audio/3gpp", (String) null, -1, f, 1, this.i ? 16000 : 8000, -1, null, (DrmInitData) null, 0, (String) null));
        }
    }

    private boolean c(C0313an anVar) throws IOException, InterruptedException {
        if (a(anVar, d)) {
            this.i = false;
            anVar.c(d.length);
            return true;
        } else if (!a(anVar, e)) {
            return false;
        } else {
            this.i = true;
            anVar.c(e.length);
            return true;
        }
    }

    private int d(C0313an anVar) throws IOException, InterruptedException {
        if (this.l == 0) {
            try {
                this.k = b(anVar);
                this.l = this.k;
                if (this.o == -1) {
                    this.n = anVar.getPosition();
                    this.o = this.k;
                }
                if (this.o == this.k) {
                    this.p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a2 = this.s.a(anVar, this.l, true);
        if (a2 == -1) {
            return -1;
        }
        this.l -= a2;
        if (this.l > 0) {
            return 0;
        }
        this.s.a(this.q + this.j, 1, this.k, 0, null);
        this.j += 20000;
        return 0;
    }

    public void release() {
    }

    public C1486ln(int i2) {
        this.h = i2;
        this.g = new byte[1];
        this.o = -1;
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        return c(anVar);
    }

    public void a(C0498bn bnVar) {
        this.r = bnVar;
        this.s = bnVar.a(0, 1);
        bnVar.g();
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        if (anVar.getPosition() != 0 || c(anVar)) {
            b();
            int d2 = d(anVar);
            a(anVar.getLength(), d2);
            return d2;
        }
        throw new H("Could not find AMR header.");
    }

    private boolean c(int i2) {
        return i2 >= 0 && i2 <= 15 && (d(i2) || b(i2));
    }

    private int b(C0313an anVar) throws IOException, InterruptedException {
        anVar.a();
        anVar.a(this.g, 0, 1);
        byte b2 = this.g[0];
        if ((b2 & 131) <= 0) {
            return a((b2 >> 3) & 15);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid padding bits for frame header ");
        sb.append(b2);
        throw new H(sb.toString());
    }

    public void a(long j2, long j3) {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        if (j2 != 0) {
            C1363hn hnVar = this.t;
            if (hnVar instanceof Wm) {
                this.q = ((Wm) hnVar).c(j2);
                return;
            }
        }
        this.q = 0;
    }

    private boolean b(int i2) {
        return !this.i && (i2 < 12 || i2 > 14);
    }

    private boolean d(int i2) {
        return this.i && (i2 < 10 || i2 > 13);
    }

    private boolean a(C0313an anVar, byte[] bArr) throws IOException, InterruptedException {
        anVar.a();
        byte[] bArr2 = new byte[bArr.length];
        anVar.a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private int a(int i2) throws H {
        if (c(i2)) {
            return this.i ? c[i2] : b[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw new H(sb.toString());
    }

    private void a(long j2, int i2) {
        if (!this.m) {
            if (!((this.h & 1) == 0 || j2 == -1)) {
                int i3 = this.o;
                if (i3 == -1 || i3 == this.k) {
                    if (this.p >= 20 || i2 == -1) {
                        this.t = a(j2);
                        this.r.a(this.t);
                        this.m = true;
                    }
                }
            }
            this.t = new b(-9223372036854775807L);
            this.r.a(this.t);
            this.m = true;
        }
    }

    private C1363hn a(long j2) {
        long j3 = j2;
        Wm wm = new Wm(j3, this.n, a(this.o, 20000), this.o);
        return wm;
    }

    private static int a(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }
}
