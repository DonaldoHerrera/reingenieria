package defpackage;

import com.google.android.exoplayer2.H;
import java.io.IOException;

/* renamed from: eo reason: default package and case insensitive filesystem */
/* compiled from: AdtsExtractor */
public final class C1271eo implements _m {
    public static final C0529cn a = Yn.a;
    private static final int b = C0471ar.b("ID3");
    private final int c;
    private final C1302fo d;
    private final Pq e;
    private final Pq f;
    private final Oq g;
    private final long h;
    private C0498bn i;
    private long j;
    private long k;
    private int l;
    private boolean m;
    private boolean n;
    private boolean o;

    public C1271eo() {
        this(0);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new C1271eo()};
    }

    private void b(C0313an anVar) throws IOException, InterruptedException {
        if (!this.m) {
            this.l = -1;
            anVar.a();
            long j2 = 0;
            if (anVar.getPosition() == 0) {
                c(anVar);
            }
            int i2 = 0;
            while (true) {
                if (!anVar.a(this.f.a, 0, 2, true)) {
                    break;
                }
                this.f.e(0);
                if (!C1302fo.a(this.f.z())) {
                    i2 = 0;
                    break;
                } else if (!anVar.a(this.f.a, 0, 4, true)) {
                    break;
                } else {
                    this.g.b(14);
                    int a2 = this.g.a(13);
                    if (a2 > 6) {
                        j2 += (long) a2;
                        i2++;
                        if (i2 != 1000) {
                            if (!anVar.a(a2 - 6, true)) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        this.m = true;
                        throw new H("Malformed ADTS stream");
                    }
                }
            }
            anVar.a();
            if (i2 > 0) {
                this.l = (int) (j2 / ((long) i2));
            } else {
                this.l = -1;
            }
            this.m = true;
        }
    }

    private int c(C0313an anVar) throws IOException, InterruptedException {
        int i2 = 0;
        while (true) {
            anVar.a(this.f.a, 0, 10);
            this.f.e(0);
            if (this.f.w() != b) {
                break;
            }
            this.f.f(3);
            int s = this.f.s();
            i2 += s + 10;
            anVar.a(s);
        }
        anVar.a();
        anVar.a(i2);
        if (this.k == -1) {
            this.k = (long) i2;
        }
        return i2;
    }

    public void release() {
    }

    public C1271eo(long j2) {
        this(j2, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r9.a();
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002a, code lost:
        if ((r3 - r0) < 8192) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002c, code lost:
        return false;
     */
    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        int c2 = c(anVar);
        int i2 = c2;
        while (true) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                anVar.a(this.f.a, 0, 2);
                this.f.e(0);
                if (!C1302fo.a(this.f.z())) {
                    break;
                }
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                anVar.a(this.f.a, 0, 4);
                this.g.b(14);
                int a2 = this.g.a(13);
                if (a2 <= 6) {
                    return false;
                }
                anVar.a(a2 - 6);
                i4 += a2;
            }
            anVar.a(i2);
        }
    }

    public C1271eo(long j2, int i2) {
        this.h = j2;
        this.j = j2;
        this.c = i2;
        this.d = new C1302fo(true);
        this.e = new Pq(2048);
        this.l = -1;
        this.k = -1;
        this.f = new Pq(10);
        this.g = new Oq(this.f.a);
    }

    public void a(C0498bn bnVar) {
        this.i = bnVar;
        this.d.a(bnVar, new d(0, 1));
        bnVar.g();
    }

    public void a(long j2, long j3) {
        this.n = false;
        this.d.a();
        this.j = this.h + j3;
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        long length = anVar.getLength();
        boolean z = ((this.c & 1) == 0 || length == -1) ? false : true;
        if (z) {
            b(anVar);
        }
        int read = anVar.read(this.e.a, 0, 2048);
        boolean z2 = read == -1;
        a(length, z, z2);
        if (z2) {
            return -1;
        }
        this.e.e(0);
        this.e.d(read);
        if (!this.n) {
            this.d.a(this.j, 4);
            this.n = true;
        }
        this.d.a(this.e);
        return 0;
    }

    private void a(long j2, boolean z, boolean z2) {
        if (!this.o) {
            boolean z3 = z && this.l > 0;
            if (!z3 || this.d.c() != -9223372036854775807L || z2) {
                C0498bn bnVar = this.i;
                C1852xq.a(bnVar);
                C0498bn bnVar2 = bnVar;
                if (!z3 || this.d.c() == -9223372036854775807L) {
                    bnVar2.a(new b(-9223372036854775807L));
                } else {
                    bnVar2.a(a(j2));
                }
                this.o = true;
            }
        }
    }

    private C1363hn a(long j2) {
        long j3 = j2;
        Wm wm = new Wm(j3, this.k, a(this.l, this.d.c()), this.l);
        return wm;
    }

    private static int a(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }
}
