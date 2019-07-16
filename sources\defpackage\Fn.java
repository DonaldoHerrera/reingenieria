package defpackage;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.H;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.Metadata.Entry;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: Fn reason: default package */
/* compiled from: Mp3Extractor */
public final class Fn implements _m {
    public static final C0529cn a = Bn.a;
    private static final com.google.android.exoplayer2.metadata.id3.h.a b = Cn.a;
    private static final int c = C0471ar.b("Xing");
    private static final int d = C0471ar.b("Info");
    private static final int e = C0471ar.b("VBRI");
    private final int f;
    private final long g;
    private final Pq h;
    private final C1301fn i;
    private final C1240dn j;
    private final C1270en k;
    private C0498bn l;
    private C1424jn m;
    private int n;
    private Metadata o;
    private a p;
    private long q;
    private long r;
    private int s;

    /* renamed from: Fn$a */
    /* compiled from: Mp3Extractor */
    interface a extends C1363hn {
        long a();

        long b(long j);
    }

    public Fn() {
        this(0);
    }

    static /* synthetic */ boolean a(int i2, int i3, int i4, int i5, int i6) {
        return (i3 == 67 && i4 == 79 && i5 == 77 && (i6 == 77 || i2 == 2)) || (i3 == 77 && i4 == 76 && i5 == 76 && (i6 == 84 || i2 == 2));
    }

    private static boolean a(int i2, long j2) {
        return ((long) (i2 & -128000)) == (j2 & -128000);
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new Fn()};
    }

    private a b(C0313an anVar) throws IOException, InterruptedException {
        anVar.a(this.h.a, 0, 4);
        this.h.e(0);
        C1301fn.a(this.h.h(), this.i);
        Dn dn = new Dn(anVar.getLength(), anVar.getPosition(), this.i);
        return dn;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    private a c(C0313an anVar) throws IOException, InterruptedException {
        int i2;
        int a2;
        a aVar;
        Pq pq = new Pq(this.i.j);
        anVar.a(pq.a, 0, this.i.j);
        C1301fn fnVar = this.i;
        if ((fnVar.h & 1) != 0) {
            if (fnVar.l != 1) {
                i2 = 36;
                a2 = a(pq, i2);
                if (a2 != c || a2 == d) {
                    aVar = Hn.a(anVar.getLength(), anVar.getPosition(), this.i, pq);
                    if (aVar != null && !this.j.a()) {
                        anVar.a();
                        anVar.a(i2 + 141);
                        anVar.a(this.h.a, 0, 3);
                        this.h.e(0);
                        this.j.a(this.h.w());
                    }
                    anVar.c(this.i.j);
                    if (aVar != null && !aVar.b() && a2 == d) {
                        return b(anVar);
                    }
                } else if (a2 == e) {
                    aVar = Gn.a(anVar.getLength(), anVar.getPosition(), this.i, pq);
                    anVar.c(this.i.j);
                } else {
                    aVar = null;
                    anVar.a();
                }
                return aVar;
            }
        } else if (fnVar.l == 1) {
            i2 = 13;
            a2 = a(pq, i2);
            if (a2 != c) {
            }
            aVar = Hn.a(anVar.getLength(), anVar.getPosition(), this.i, pq);
            anVar.a();
            anVar.a(i2 + 141);
            anVar.a(this.h.a, 0, 3);
            this.h.e(0);
            this.j.a(this.h.w());
            anVar.c(this.i.j);
            return b(anVar);
        }
        i2 = 21;
        a2 = a(pq, i2);
        if (a2 != c) {
        }
        aVar = Hn.a(anVar.getLength(), anVar.getPosition(), this.i, pq);
        anVar.a();
        anVar.a(i2 + 141);
        anVar.a(this.h.a, 0, 3);
        this.h.e(0);
        this.j.a(this.h.w());
        anVar.c(this.i.j);
        return b(anVar);
    }

    private boolean d(C0313an anVar) throws IOException, InterruptedException {
        a aVar = this.p;
        if (aVar != null) {
            long a2 = aVar.a();
            if (a2 != -1 && anVar.b() > a2 - 4) {
                return true;
            }
        }
        try {
            return !anVar.a(this.h.a, 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private int e(C0313an anVar) throws IOException, InterruptedException {
        if (this.s == 0) {
            anVar.a();
            if (d(anVar)) {
                return -1;
            }
            this.h.e(0);
            int h2 = this.h.h();
            if (!a(h2, (long) this.n) || C1301fn.a(h2) == -1) {
                anVar.c(1);
                this.n = 0;
                return 0;
            }
            C1301fn.a(h2, this.i);
            if (this.q == -9223372036854775807L) {
                this.q = this.p.b(anVar.getPosition());
                if (this.g != -9223372036854775807L) {
                    this.q += this.g - this.p.b(0);
                }
            }
            this.s = this.i.j;
        }
        int a2 = this.m.a(anVar, this.s, true);
        if (a2 == -1) {
            return -1;
        }
        this.s -= a2;
        if (this.s > 0) {
            return 0;
        }
        long j2 = this.q;
        long j3 = this.r * 1000000;
        C1301fn fnVar = this.i;
        this.m.a(j2 + (j3 / ((long) fnVar.k)), 1, fnVar.j, 0, null);
        this.r += (long) this.i.n;
        this.s = 0;
        return 0;
    }

    public void release() {
    }

    public Fn(int i2) {
        this(i2, -9223372036854775807L);
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        return a(anVar, true);
    }

    public Fn(int i2, long j2) {
        this.f = i2;
        this.g = j2;
        this.h = new Pq(10);
        this.i = new C1301fn();
        this.j = new C1240dn();
        this.q = -9223372036854775807L;
        this.k = new C1270en();
    }

    public void a(C0498bn bnVar) {
        this.l = bnVar;
        this.m = this.l.a(0, 1);
        this.l.g();
    }

    public void a(long j2, long j3) {
        this.n = 0;
        this.q = -9223372036854775807L;
        this.r = 0;
        this.s = 0;
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        if (this.n == 0) {
            try {
                a(anVar, false);
            } catch (EOFException unused) {
                return -1;
            }
        } else {
            C0313an anVar2 = anVar;
        }
        if (this.p == null) {
            a c2 = c(anVar);
            En a2 = a(this.o, anVar.getPosition());
            if (a2 != null) {
                this.p = a2;
            } else if (c2 != null) {
                this.p = c2;
            }
            a aVar = this.p;
            if (aVar == null || (!aVar.b() && (this.f & 1) != 0)) {
                this.p = b(anVar);
            }
            this.l.a(this.p);
            C1424jn jnVar = this.m;
            C1301fn fnVar = this.i;
            String str = fnVar.i;
            int i2 = fnVar.l;
            int i3 = fnVar.k;
            C1240dn dnVar = this.j;
            jnVar.a(Format.a((String) null, str, (String) null, -1, 4096, i2, i3, -1, dnVar.b, dnVar.c, null, (DrmInitData) null, 0, (String) null, (this.f & 2) != 0 ? null : this.o));
        }
        return e(anVar);
    }

    private boolean a(C0313an anVar, boolean z) throws IOException, InterruptedException {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        com.google.android.exoplayer2.metadata.id3.h.a aVar;
        int i7 = z ? 16384 : 131072;
        anVar.a();
        if (anVar.getPosition() == 0) {
            if ((this.f & 2) == 0) {
                aVar = null;
            } else {
                aVar = b;
            }
            this.o = this.k.a(anVar, aVar);
            Metadata metadata = this.o;
            if (metadata != null) {
                this.j.a(metadata);
            }
            int b2 = (int) anVar.b();
            if (!z) {
                anVar.c(b2);
            }
            i2 = b2;
            i5 = 0;
            i4 = 0;
            i3 = 0;
        } else {
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        while (true) {
            if (!d(anVar)) {
                this.h.e(0);
                int h2 = this.h.h();
                if (i5 == 0 || a(h2, (long) i5)) {
                    int a2 = C1301fn.a(h2);
                    if (a2 != -1) {
                        i6 = i4 + 1;
                        if (i6 != 1) {
                            if (i6 == 4) {
                                break;
                            }
                        } else {
                            C1301fn.a(h2, this.i);
                            i5 = h2;
                        }
                        anVar.a(a2 - 4);
                    }
                }
                int i8 = i3 + 1;
                if (i3 != i7) {
                    if (z) {
                        anVar.a();
                        anVar.a(i2 + i8);
                    } else {
                        anVar.c(1);
                    }
                    i3 = i8;
                    i5 = 0;
                    i6 = 0;
                } else if (z) {
                    return false;
                } else {
                    throw new H("Searched too many bytes.");
                }
            } else if (i4 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            anVar.c(i2 + i3);
        } else {
            anVar.a();
        }
        this.n = i5;
        return true;
    }

    private static int a(Pq pq, int i2) {
        if (pq.d() >= i2 + 4) {
            pq.e(i2);
            int h2 = pq.h();
            if (h2 == c || h2 == d) {
                return h2;
            }
        }
        if (pq.d() >= 40) {
            pq.e(36);
            int h3 = pq.h();
            int i3 = e;
            if (h3 == i3) {
                return i3;
            }
        }
        return 0;
    }

    private static En a(Metadata metadata, long j2) {
        if (metadata != null) {
            int a2 = metadata.a();
            for (int i2 = 0; i2 < a2; i2++) {
                Entry a3 = metadata.a(i2);
                if (a3 instanceof MlltFrame) {
                    return En.a(j2, (MlltFrame) a3);
                }
            }
        }
        return null;
    }
}
