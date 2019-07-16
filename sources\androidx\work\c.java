package androidx.work;

import android.os.Build.VERSION;

/* compiled from: Constraints */
public final class c {
    public static final c a = new a().a();
    private j b = j.NOT_REQUIRED;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private long g = -1;
    private long h = -1;
    private d i = new d();

    /* compiled from: Constraints */
    public static final class a {
        boolean a = false;
        boolean b = false;
        j c = j.NOT_REQUIRED;
        boolean d = false;
        boolean e = false;
        long f = -1;
        long g = -1;
        d h = new d();

        public a a(j jVar) {
            this.c = jVar;
            return this;
        }

        public a b(boolean z) {
            this.a = z;
            return this;
        }

        public a c(boolean z) {
            this.b = z;
            return this;
        }

        public a d(boolean z) {
            this.e = z;
            return this;
        }

        public a a(boolean z) {
            this.d = z;
            return this;
        }

        public c a() {
            return new c(this);
        }
    }

    public c() {
    }

    public void a(j jVar) {
        this.b = jVar;
    }

    public j b() {
        return this.b;
    }

    public void c(boolean z) {
        this.d = z;
    }

    public void d(boolean z) {
        this.f = z;
    }

    public boolean e() {
        return this.i.b() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        if (this.c == cVar.c && this.d == cVar.d && this.e == cVar.e && this.f == cVar.f && this.g == cVar.g && this.h == cVar.h && this.b == cVar.b) {
            return this.i.equals(cVar.i);
        }
        return false;
    }

    public boolean f() {
        return this.e;
    }

    public boolean g() {
        return this.c;
    }

    public boolean h() {
        return this.d;
    }

    public int hashCode() {
        int hashCode = ((((((((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31) + (this.f ? 1 : 0)) * 31;
        long j = this.g;
        int i2 = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        return ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.i.hashCode();
    }

    public boolean i() {
        return this.f;
    }

    public void a(boolean z) {
        this.e = z;
    }

    public void b(boolean z) {
        this.c = z;
    }

    public long c() {
        return this.g;
    }

    public long d() {
        return this.h;
    }

    public void a(long j) {
        this.g = j;
    }

    public void b(long j) {
        this.h = j;
    }

    public void a(d dVar) {
        this.i = dVar;
    }

    public d a() {
        return this.i;
    }

    c(a aVar) {
        this.c = aVar.a;
        this.d = VERSION.SDK_INT >= 23 && aVar.b;
        this.b = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        if (VERSION.SDK_INT >= 24) {
            this.i = aVar.h;
            this.g = aVar.f;
            this.h = aVar.g;
        }
    }

    public c(c cVar) {
        this.c = cVar.c;
        this.d = cVar.d;
        this.b = cVar.b;
        this.e = cVar.e;
        this.f = cVar.f;
        this.i = cVar.i;
    }
}
