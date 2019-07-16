package com.google.android.exoplayer2;

import android.util.Pair;

/* compiled from: Timeline */
public abstract class X {
    public static final X a = new W();

    /* compiled from: Timeline */
    public static final class a {
        public Object a;
        public Object b;
        public int c;
        public long d;
        private long e;
        private So f = So.a;

        public a a(Object obj, Object obj2, int i, long j, long j2) {
            a(obj, obj2, i, j, j2, So.a);
            return this;
        }

        public long b(int i) {
            return this.f.c[i];
        }

        public long c() {
            return this.d;
        }

        public long d() {
            return C0615o.b(this.e);
        }

        public long e() {
            return this.e;
        }

        public a a(Object obj, Object obj2, int i, long j, long j2, So so) {
            this.a = obj;
            this.b = obj2;
            this.c = i;
            this.d = j;
            this.e = j2;
            this.f = so;
            return this;
        }

        public int b(int i, int i2) {
            return this.f.d[i].a(i2);
        }

        public int c(int i) {
            return this.f.d[i].a();
        }

        public int b(long j) {
            return this.f.a(j);
        }

        public boolean c(int i, int i2) {
            defpackage.So.a aVar = this.f.d[i];
            return (aVar.a == -1 || aVar.c[i2] == 0) ? false : true;
        }

        public long b() {
            return this.f.e;
        }

        public int a() {
            return this.f.b;
        }

        public int a(long j) {
            return this.f.a(j, this.d);
        }

        public int a(int i) {
            return this.f.d[i].a;
        }

        public long a(int i, int i2) {
            defpackage.So.a aVar = this.f.d[i];
            if (aVar.a != -1) {
                return aVar.d[i2];
            }
            return -9223372036854775807L;
        }
    }

    /* compiled from: Timeline */
    public static final class b {
        public Object a;
        public long b;
        public long c;
        public boolean d;
        public boolean e;
        public int f;
        public int g;
        public long h;
        public long i;
        public long j;

        public b a(Object obj, long j2, long j3, boolean z, boolean z2, long j4, long j5, int i2, int i3, long j6) {
            this.a = obj;
            this.b = j2;
            this.c = j3;
            this.d = z;
            this.e = z2;
            this.h = j4;
            this.i = j5;
            this.f = i2;
            this.g = i3;
            this.j = j6;
            return this;
        }

        public long b() {
            return this.h;
        }

        public long c() {
            return C0615o.b(this.i);
        }

        public long d() {
            return this.j;
        }

        public long a() {
            return C0615o.b(this.h);
        }
    }

    public abstract int a();

    public int a(int i, int i2, boolean z) {
        if (i2 == 0) {
            return i == b(z) ? -1 : i + 1;
        } else if (i2 == 1) {
            return i;
        } else {
            if (i2 == 2) {
                return i == b(z) ? a(z) : i + 1;
            }
            throw new IllegalStateException();
        }
    }

    public abstract int a(Object obj);

    public abstract a a(int i, a aVar, boolean z);

    public abstract b a(int i, b bVar, boolean z, long j);

    public abstract Object a(int i);

    public abstract int b();

    public int b(boolean z) {
        if (c()) {
            return -1;
        }
        return b() - 1;
    }

    public final boolean c() {
        return b() == 0;
    }

    public final boolean b(int i, a aVar, b bVar, int i2, boolean z) {
        return a(i, aVar, bVar, i2, z) == -1;
    }

    public int a(boolean z) {
        return c() ? -1 : 0;
    }

    public final b a(int i, b bVar) {
        return a(i, bVar, false);
    }

    public final b a(int i, b bVar, boolean z) {
        return a(i, bVar, z, 0);
    }

    public final int a(int i, a aVar, b bVar, int i2, boolean z) {
        int i3 = a(i, aVar).c;
        if (a(i3, bVar).g != i) {
            return i + 1;
        }
        int a2 = a(i3, i2, z);
        if (a2 == -1) {
            return -1;
        }
        return a(a2, bVar).f;
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i, long j) {
        Pair<Object, Long> a2 = a(bVar, aVar, i, j, 0);
        C1852xq.a(a2);
        return a2;
    }

    public final Pair<Object, Long> a(b bVar, a aVar, int i, long j, long j2) {
        C1852xq.a(i, 0, b());
        a(i, bVar, false, j2);
        if (j == -9223372036854775807L) {
            j = bVar.b();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = bVar.f;
        long d = bVar.d() + j;
        long c = a(i2, aVar, true).c();
        while (c != -9223372036854775807L && d >= c && i2 < bVar.g) {
            d -= c;
            i2++;
            c = a(i2, aVar, true).c();
        }
        Object obj = aVar.b;
        C1852xq.a(obj);
        return Pair.create(obj, Long.valueOf(d));
    }

    public a a(Object obj, a aVar) {
        return a(a(obj), aVar, true);
    }

    public final a a(int i, a aVar) {
        return a(i, aVar, false);
    }
}
