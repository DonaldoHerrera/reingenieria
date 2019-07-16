package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import com.google.android.exoplayer2.H;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: wo reason: default package and case insensitive filesystem */
/* compiled from: PsExtractor */
public final class C1820wo implements _m {
    public static final C0529cn a = Zn.a;
    private final Zq b;
    private final SparseArray<a> c;
    private final Pq d;
    private final C1790vo e;
    private boolean f;
    private boolean g;
    private boolean h;
    private long i;
    private C1760uo j;
    private C0498bn k;
    private boolean l;

    /* renamed from: wo$a */
    /* compiled from: PsExtractor */
    private static final class a {
        private final C1425jo a;
        private final Zq b;
        private final Oq c = new Oq(new byte[64]);
        private boolean d;
        private boolean e;
        private boolean f;
        private int g;
        private long h;

        public a(C1425jo joVar, Zq zq) {
            this.a = joVar;
            this.b = zq;
        }

        private void b() {
            this.c.c(8);
            this.d = this.c.e();
            this.e = this.c.e();
            this.c.c(6);
            this.g = this.c.a(8);
        }

        private void c() {
            this.h = 0;
            if (this.d) {
                this.c.c(4);
                long a2 = ((long) this.c.a(3)) << 30;
                this.c.c(1);
                long a3 = a2 | ((long) (this.c.a(15) << 15));
                this.c.c(1);
                long a4 = a3 | ((long) this.c.a(15));
                this.c.c(1);
                if (!this.f && this.e) {
                    this.c.c(4);
                    long a5 = ((long) this.c.a(3)) << 30;
                    this.c.c(1);
                    long a6 = a5 | ((long) (this.c.a(15) << 15));
                    this.c.c(1);
                    long a7 = a6 | ((long) this.c.a(15));
                    this.c.c(1);
                    this.b.b(a7);
                    this.f = true;
                }
                this.h = this.b.b(a4);
            }
        }

        public void a() {
            this.f = false;
            this.a.a();
        }

        public void a(Pq pq) throws H {
            pq.a(this.c.a, 0, 3);
            this.c.b(0);
            b();
            pq.a(this.c.a, 0, this.g);
            this.c.b(0);
            c();
            this.a.a(this.h, 4);
            this.a.a(pq);
            this.a.b();
        }
    }

    public C1820wo() {
        this(new Zq(0));
    }

    static /* synthetic */ _m[] a() {
        return new _m[]{new C1820wo()};
    }

    public void release() {
    }

    public C1820wo(Zq zq) {
        this.b = zq;
        this.d = new Pq(4096);
        this.c = new SparseArray<>();
        this.e = new C1790vo();
    }

    public boolean a(C0313an anVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        boolean z = false;
        anVar.a(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        anVar.a(bArr[13] & 7);
        anVar.a(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            z = true;
        }
        return z;
    }

    public void a(C0498bn bnVar) {
        this.k = bnVar;
    }

    public void a(long j2, long j3) {
        if ((this.b.c() == -9223372036854775807L) || !(this.b.a() == 0 || this.b.a() == j3)) {
            this.b.d();
            this.b.d(j3);
        }
        C1760uo uoVar = this.j;
        if (uoVar != null) {
            uoVar.b(j3);
        }
        for (int i2 = 0; i2 < this.c.size(); i2++) {
            ((a) this.c.valueAt(i2)).a();
        }
    }

    public int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        long length = anVar.getLength();
        int i2 = (length > -1 ? 1 : (length == -1 ? 0 : -1));
        if ((i2 != 0) && !this.e.c()) {
            return this.e.a(anVar, gnVar);
        }
        a(length);
        C1760uo uoVar = this.j;
        C1425jo joVar = null;
        if (uoVar != null && uoVar.b()) {
            return this.j.a(anVar, gnVar, (c) null);
        }
        anVar.a();
        long b2 = i2 != 0 ? length - anVar.b() : -1;
        if ((b2 != -1 && b2 < 4) || !anVar.a(this.d.a, 0, 4, true)) {
            return -1;
        }
        this.d.e(0);
        int h2 = this.d.h();
        if (h2 == 441) {
            return -1;
        }
        if (h2 == 442) {
            anVar.a(this.d.a, 0, 10);
            this.d.e(9);
            anVar.c((this.d.t() & 7) + 14);
            return 0;
        } else if (h2 == 443) {
            anVar.a(this.d.a, 0, 2);
            this.d.e(0);
            anVar.c(this.d.z() + 6);
            return 0;
        } else if (((h2 & -256) >> 8) != 1) {
            anVar.c(1);
            return 0;
        } else {
            int i3 = h2 & 255;
            a aVar = (a) this.c.get(i3);
            if (!this.f) {
                if (aVar == null) {
                    if (i3 == 189) {
                        joVar = new C0499bo();
                        this.g = true;
                        this.i = anVar.getPosition();
                    } else if ((i3 & 224) == 192) {
                        joVar = new C1641qo();
                        this.g = true;
                        this.i = anVar.getPosition();
                    } else if ((i3 & 240) == 224) {
                        joVar = new C1456ko();
                        this.h = true;
                        this.i = anVar.getPosition();
                    }
                    if (joVar != null) {
                        joVar.a(this.k, new d(i3, 256));
                        aVar = new a(joVar, this.b);
                        this.c.put(i3, aVar);
                    }
                }
                if (anVar.getPosition() > ((!this.g || !this.h) ? PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED : this.i + PlaybackStateCompat.ACTION_PLAY_FROM_URI)) {
                    this.f = true;
                    this.k.g();
                }
            }
            anVar.a(this.d.a, 0, 2);
            this.d.e(0);
            int z = this.d.z() + 6;
            if (aVar == null) {
                anVar.c(z);
            } else {
                this.d.c(z);
                anVar.readFully(this.d.a, 0, z);
                this.d.e(6);
                aVar.a(this.d);
                Pq pq = this.d;
                pq.d(pq.b());
            }
            return 0;
        }
    }

    private void a(long j2) {
        if (!this.l) {
            this.l = true;
            if (this.e.a() != -9223372036854775807L) {
                C1760uo uoVar = new C1760uo(this.e.b(), this.e.a(), j2);
                this.j = uoVar;
                this.k.a(this.j.a());
                return;
            }
            this.k.a(new b(this.e.a()));
        }
    }
}
