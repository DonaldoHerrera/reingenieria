package defpackage;

import androidx.work.c;
import androidx.work.e;
import androidx.work.i;
import androidx.work.q;
import java.util.List;
import java.util.UUID;

/* renamed from: _e reason: default package */
/* compiled from: WorkSpec */
public class _e {
    private static final String a = i.a("WorkSpec");
    public static final K<List<b>, List<q>> b = new Ze();
    public String c;
    public androidx.work.q.a d = androidx.work.q.a.ENQUEUED;
    public String e;
    public String f;
    public e g;
    public e h;
    public long i;
    public long j;
    public long k;
    public c l;
    public int m;
    public androidx.work.a n;
    public long o;
    public long p;
    public long q;
    public long r;

    /* renamed from: _e$a */
    /* compiled from: WorkSpec */
    public static class a {
        public String a;
        public androidx.work.q.a b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (this.b != aVar.b) {
                return false;
            }
            return this.a.equals(aVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    /* renamed from: _e$b */
    /* compiled from: WorkSpec */
    public static class b {
        public String a;
        public androidx.work.q.a b;
        public e c;
        public int d;
        public List<String> e;

        public q a() {
            q qVar = new q(UUID.fromString(this.a), this.b, this.c, this.e, this.d);
            return qVar;
        }

        public boolean equals(Object obj) {
            boolean z = true;
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            if (this.d != bVar.d) {
                return false;
            }
            String str = this.a;
            if (str == null ? bVar.a != null : !str.equals(bVar.a)) {
                return false;
            }
            if (this.b != bVar.b) {
                return false;
            }
            e eVar = this.c;
            if (eVar == null ? bVar.c != null : !eVar.equals(bVar.c)) {
                return false;
            }
            List<String> list = this.e;
            if (list != null) {
                z = list.equals(bVar.e);
            } else if (bVar.e != null) {
                z = false;
            }
            return z;
        }

        public int hashCode() {
            String str = this.a;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            androidx.work.q.a aVar = this.b;
            int hashCode2 = (hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31;
            e eVar = this.c;
            int hashCode3 = (((hashCode2 + (eVar != null ? eVar.hashCode() : 0)) * 31) + this.d) * 31;
            List<String> list = this.e;
            if (list != null) {
                i = list.hashCode();
            }
            return hashCode3 + i;
        }
    }

    public _e(String str, String str2) {
        e eVar = e.b;
        this.g = eVar;
        this.h = eVar;
        this.l = c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000;
        this.r = -1;
        this.c = str;
        this.e = str2;
    }

    public void a(long j2, long j3) {
        if (j2 < 900000) {
            i.a().e(a, String.format("Interval duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(900000)}), new Throwable[0]);
            j2 = 900000;
        }
        if (j3 < 300000) {
            i.a().e(a, String.format("Flex duration lesser than minimum allowed value; Changed to %s", new Object[]{Long.valueOf(300000)}), new Throwable[0]);
            j3 = 300000;
        }
        if (j3 > j2) {
            i.a().e(a, String.format("Flex duration greater than interval duration; Changed to %s", new Object[]{Long.valueOf(j2)}), new Throwable[0]);
            j3 = j2;
        }
        this.j = j2;
        this.k = j3;
    }

    public boolean b() {
        return !c.a.equals(this.l);
    }

    public boolean c() {
        return this.d == androidx.work.q.a.ENQUEUED && this.m > 0;
    }

    public boolean d() {
        return this.j != 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this == obj) {
            return true;
        }
        if (obj == null || _e.class != obj.getClass()) {
            return false;
        }
        _e _eVar = (_e) obj;
        if (this.i != _eVar.i || this.j != _eVar.j || this.k != _eVar.k || this.m != _eVar.m || this.o != _eVar.o || this.p != _eVar.p || this.q != _eVar.q || this.r != _eVar.r || !this.c.equals(_eVar.c) || this.d != _eVar.d || !this.e.equals(_eVar.e)) {
            return false;
        }
        String str = this.f;
        if (str == null ? _eVar.f != null : !str.equals(_eVar.f)) {
            return false;
        }
        if (!this.g.equals(_eVar.g) || !this.h.equals(_eVar.h) || !this.l.equals(_eVar.l)) {
            return false;
        }
        if (this.n != _eVar.n) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        int hashCode = ((((this.c.hashCode() * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        String str = this.f;
        int hashCode2 = (((((hashCode + (str != null ? str.hashCode() : 0)) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31;
        long j2 = this.i;
        int i2 = (hashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.j;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        long j4 = this.k;
        int hashCode3 = (((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.l.hashCode()) * 31) + this.m) * 31) + this.n.hashCode()) * 31;
        long j5 = this.o;
        int i4 = (hashCode3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.p;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.q;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31;
        long j8 = this.r;
        return i6 + ((int) (j8 ^ (j8 >>> 32)));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{WorkSpec: ");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public _e(_e _eVar) {
        e eVar = e.b;
        this.g = eVar;
        this.h = eVar;
        this.l = c.a;
        this.n = androidx.work.a.EXPONENTIAL;
        this.o = 30000;
        this.r = -1;
        this.c = _eVar.c;
        this.e = _eVar.e;
        this.d = _eVar.d;
        this.f = _eVar.f;
        this.g = new e(_eVar.g);
        this.h = new e(_eVar.h);
        this.i = _eVar.i;
        this.j = _eVar.j;
        this.k = _eVar.k;
        this.l = new c(_eVar.l);
        this.m = _eVar.m;
        this.n = _eVar.n;
        this.o = _eVar.o;
        this.p = _eVar.p;
        this.q = _eVar.q;
        this.r = _eVar.r;
    }

    public long a() {
        long j2;
        boolean z = false;
        if (c()) {
            if (this.n == androidx.work.a.LINEAR) {
                z = true;
            }
            if (z) {
                j2 = this.o * ((long) this.m);
            } else {
                j2 = (long) Math.scalb((float) this.o, this.m - 1);
            }
            return this.p + Math.min(18000000, j2);
        }
        long j3 = 0;
        if (d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j4 = this.p;
            if (j4 == 0) {
                j4 = this.i + currentTimeMillis;
            }
            if (this.k != this.j) {
                z = true;
            }
            if (z) {
                if (this.p == 0) {
                    j3 = this.k * -1;
                }
                return j4 + this.j + j3;
            }
            if (this.p != 0) {
                j3 = this.j;
            }
            return j4 + j3;
        }
        long j5 = this.p;
        if (j5 == 0) {
            j5 = System.currentTimeMillis();
        }
        return j5 + this.i;
    }
}
