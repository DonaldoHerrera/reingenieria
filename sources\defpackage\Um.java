package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* renamed from: Um reason: default package */
/* compiled from: BinarySearchSeeker */
public abstract class Um {
    protected final a a;
    protected final g b;
    protected d c;
    private final int d;

    /* renamed from: Um$a */
    /* compiled from: BinarySearchSeeker */
    public static class a implements C1363hn {
        private final e a;
        private final long b;
        /* access modifiers changed from: private */
        public final long c;
        /* access modifiers changed from: private */
        public final long d;
        /* access modifiers changed from: private */
        public final long e;
        /* access modifiers changed from: private */
        public final long f;
        /* access modifiers changed from: private */
        public final long g;

        public a(e eVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.a = eVar;
            this.b = j;
            this.c = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
        }

        public boolean b() {
            return true;
        }

        public defpackage.C1363hn.a a(long j) {
            this.a.a(j);
            return new defpackage.C1363hn.a(new C1393in(j, d.a(j, this.c, this.d, this.e, this.f, this.g)));
        }

        public long c() {
            return this.b;
        }

        public long c(long j) {
            this.a.a(j);
            return j;
        }
    }

    /* renamed from: Um$b */
    /* compiled from: BinarySearchSeeker */
    public static final class b implements e {
        public long a(long j) {
            return j;
        }
    }

    /* renamed from: Um$c */
    /* compiled from: BinarySearchSeeker */
    public static final class c {
    }

    /* renamed from: Um$d */
    /* compiled from: BinarySearchSeeker */
    protected static class d {
        private final long a;
        private final long b;
        private final long c;
        private long d;
        private long e;
        private long f;
        private long g;
        private long h;

        protected d(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.a = j;
            this.b = j2;
            this.d = j3;
            this.e = j4;
            this.f = j5;
            this.g = j6;
            this.c = j7;
            this.h = a(j2, j3, j4, j5, j6, j7);
        }

        private void f() {
            this.h = a(this.b, this.d, this.e, this.f, this.g, this.c);
        }

        /* access modifiers changed from: private */
        public long c() {
            return this.h;
        }

        /* access modifiers changed from: private */
        public long d() {
            return this.a;
        }

        /* access modifiers changed from: private */
        public long e() {
            return this.b;
        }

        protected static long a(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 >= j5 || j2 + 1 >= j3) {
                return j4;
            }
            long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
            return C0471ar.b(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
        }

        /* access modifiers changed from: private */
        public long b() {
            return this.f;
        }

        /* access modifiers changed from: private */
        public void b(long j, long j2) {
            this.d = j;
            this.f = j2;
            f();
        }

        /* access modifiers changed from: private */
        public long a() {
            return this.g;
        }

        /* access modifiers changed from: private */
        public void a(long j, long j2) {
            this.e = j;
            this.g = j2;
            f();
        }
    }

    /* renamed from: Um$e */
    /* compiled from: BinarySearchSeeker */
    protected interface e {
        long a(long j);
    }

    /* renamed from: Um$f */
    /* compiled from: BinarySearchSeeker */
    public static final class f {
        public static final f a;
        /* access modifiers changed from: private */
        public final int b;
        /* access modifiers changed from: private */
        public final long c;
        /* access modifiers changed from: private */
        public final long d;

        static {
            f fVar = new f(-3, -9223372036854775807L, -1);
            a = fVar;
        }

        private f(int i, long j, long j2) {
            this.b = i;
            this.c = j;
            this.d = j2;
        }

        public static f a(long j, long j2) {
            f fVar = new f(-1, j, j2);
            return fVar;
        }

        public static f b(long j, long j2) {
            f fVar = new f(-2, j, j2);
            return fVar;
        }

        public static f a(long j) {
            f fVar = new f(0, -9223372036854775807L, j);
            return fVar;
        }
    }

    /* renamed from: Um$g */
    /* compiled from: BinarySearchSeeker */
    protected interface g {
        f a(C0313an anVar, long j, c cVar) throws IOException, InterruptedException;

        void a();
    }

    protected Um(e eVar, g gVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.b = gVar;
        this.d = i;
        a aVar = new a(eVar, j, j2, j3, j4, j5, j6);
        this.a = aVar;
    }

    public final C1363hn a() {
        return this.a;
    }

    public final void b(long j) {
        d dVar = this.c;
        if (dVar == null || dVar.d() != j) {
            this.c = a(j);
        }
    }

    /* access modifiers changed from: protected */
    public void b(boolean z, long j) {
    }

    public int a(C0313an anVar, C1332gn gnVar, c cVar) throws InterruptedException, IOException {
        g gVar = this.b;
        C1852xq.a(gVar);
        g gVar2 = gVar;
        while (true) {
            d dVar = this.c;
            C1852xq.a(dVar);
            d dVar2 = dVar;
            long b2 = dVar2.b();
            long c2 = dVar2.a();
            long d2 = dVar2.c();
            if (c2 - b2 <= ((long) this.d)) {
                a(false, b2);
                return a(anVar, b2, gnVar);
            } else if (!a(anVar, d2)) {
                return a(anVar, d2, gnVar);
            } else {
                anVar.a();
                f a2 = gVar2.a(anVar, dVar2.e(), cVar);
                int a3 = a2.b;
                if (a3 == -3) {
                    a(false, d2);
                    return a(anVar, d2, gnVar);
                } else if (a3 == -2) {
                    dVar2.b(a2.c, a2.d);
                } else if (a3 == -1) {
                    dVar2.a(a2.c, a2.d);
                } else if (a3 == 0) {
                    a(true, a2.d);
                    a(anVar, a2.d);
                    return a(anVar, a2.d, gnVar);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    public final boolean b() {
        return this.c != null;
    }

    /* access modifiers changed from: protected */
    public d a(long j) {
        long j2 = j;
        this.a.c(j2);
        d dVar = new d(j, j2, this.a.c, this.a.d, this.a.e, this.a.f, this.a.g);
        return dVar;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z, long j) {
        this.c = null;
        this.b.a();
        b(z, j);
    }

    /* access modifiers changed from: protected */
    public final boolean a(C0313an anVar, long j) throws IOException, InterruptedException {
        long position = j - anVar.getPosition();
        if (position < 0 || position > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        anVar.c((int) position);
        return true;
    }

    /* access modifiers changed from: protected */
    public final int a(C0313an anVar, long j, C1332gn gnVar) {
        if (j == anVar.getPosition()) {
            return 0;
        }
        gnVar.a = j;
        return 1;
    }
}
