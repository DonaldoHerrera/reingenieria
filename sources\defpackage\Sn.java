package defpackage;

import com.google.android.exoplayer2.Format;
import java.io.IOException;

/* renamed from: Sn reason: default package */
/* compiled from: StreamReader */
abstract class Sn {
    private final Nn a = new Nn();
    private C1424jn b;
    private C0498bn c;
    private Pn d;
    private long e;
    private long f;
    private long g;
    private int h;
    private int i;
    private a j;
    private long k;
    private boolean l;
    private boolean m;

    /* renamed from: Sn$a */
    /* compiled from: StreamReader */
    static class a {
        Format a;
        Pn b;

        a() {
        }
    }

    /* renamed from: Sn$b */
    /* compiled from: StreamReader */
    private static final class b implements Pn {
        private b() {
        }

        public long a(C0313an anVar) throws IOException, InterruptedException {
            return -1;
        }

        public long c(long j) {
            return 0;
        }

        public C1363hn d() {
            return new defpackage.C1363hn.b(-9223372036854775807L);
        }
    }

    private int b(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        C0313an anVar2 = anVar;
        long a2 = this.d.a(anVar2);
        if (a2 >= 0) {
            gnVar.a = a2;
            return 1;
        }
        if (a2 < -1) {
            c(-(a2 + 2));
        }
        if (!this.l) {
            this.c.a(this.d.d());
            this.l = true;
        }
        if (this.k > 0 || this.a.a(anVar2)) {
            this.k = 0;
            Pq b2 = this.a.b();
            long a3 = a(b2);
            if (a3 >= 0) {
                long j2 = this.g;
                if (j2 + a3 >= this.e) {
                    long a4 = a(j2);
                    this.b.a(b2, b2.d());
                    this.b.a(a4, 1, b2.d(), 0, null);
                    this.e = -1;
                }
            }
            this.g += a3;
            return 0;
        }
        this.h = 3;
        return -1;
    }

    /* access modifiers changed from: protected */
    public abstract long a(Pq pq);

    /* access modifiers changed from: 0000 */
    public void a(C0498bn bnVar, C1424jn jnVar) {
        this.c = bnVar;
        this.b = jnVar;
        a(true);
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(Pq pq, long j2, a aVar) throws IOException, InterruptedException;

    /* access modifiers changed from: protected */
    public void c(long j2) {
        this.g = j2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        if (z) {
            this.j = new a();
            this.f = 0;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1;
        this.g = 0;
    }

    /* access modifiers changed from: 0000 */
    public final void a(long j2, long j3) {
        this.a.c();
        if (j2 == 0) {
            a(!this.l);
        } else if (this.h != 0) {
            this.e = this.d.c(j3);
            this.h = 2;
        }
    }

    /* access modifiers changed from: 0000 */
    public final int a(C0313an anVar, C1332gn gnVar) throws IOException, InterruptedException {
        int i2 = this.h;
        if (i2 == 0) {
            return a(anVar);
        }
        if (i2 == 1) {
            anVar.c((int) this.f);
            this.h = 2;
            return 0;
        } else if (i2 == 2) {
            return b(anVar, gnVar);
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    public long b(long j2) {
        return (((long) this.i) * j2) / 1000000;
    }

    private int a(C0313an anVar) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            if (!this.a.a(anVar)) {
                this.h = 3;
                return -1;
            }
            this.k = anVar.getPosition() - this.f;
            z = a(this.a.b(), this.f, this.j);
            if (z) {
                this.f = anVar.getPosition();
            }
        }
        C0313an anVar2 = anVar;
        Format format = this.j.a;
        this.i = format.w;
        if (!this.m) {
            this.b.a(format);
            this.m = true;
        }
        Pn pn = this.j.b;
        if (pn != null) {
            this.d = pn;
        } else if (anVar.getLength() == -1) {
            this.d = new b();
        } else {
            On a2 = this.a.a();
            Kn kn = new Kn(this.f, anVar.getLength(), this, (long) (a2.i + a2.j), a2.d, (a2.c & 4) != 0);
            this.d = kn;
        }
        this.j = null;
        this.h = 2;
        this.a.d();
        return 0;
    }

    /* access modifiers changed from: protected */
    public long a(long j2) {
        return (j2 * 1000000) / ((long) this.i);
    }
}
