package defpackage;

import java.io.Serializable;

/* renamed from: FDb reason: default package */
/* compiled from: ValueRange */
public final class FDb implements Serializable {
    private final long a;
    private final long b;
    private final long c;
    private final long d;

    private FDb(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public static FDb a(long j, long j2) {
        if (j <= j2) {
            FDb fDb = new FDb(j, j, j2, j2);
            return fDb;
        }
        throw new IllegalArgumentException("Minimum value must be less than maximum value");
    }

    public long b() {
        return this.a;
    }

    public boolean c() {
        return this.a == this.b && this.c == this.d;
    }

    public boolean d() {
        return b() >= -2147483648L && a() <= 2147483647L;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FDb)) {
            return false;
        }
        FDb fDb = (FDb) obj;
        if (!(this.a == fDb.a && this.b == fDb.b && this.c == fDb.c && this.d == fDb.d)) {
            z = false;
        }
        return z;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        long j3 = (j + j2) << ((int) (j2 + 16));
        long j4 = this.c;
        long j5 = (j3 >> ((int) (j4 + 48))) << ((int) (j4 + 32));
        long j6 = this.d;
        long j7 = ((j5 >> ((int) (32 + j6))) << ((int) (j6 + 48))) >> 16;
        return (int) (j7 ^ (j7 >>> 32));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        if (this.a != this.b) {
            sb.append('/');
            sb.append(this.b);
        }
        sb.append(" - ");
        sb.append(this.c);
        if (this.c != this.d) {
            sb.append('/');
            sb.append(this.d);
        }
        return sb.toString();
    }

    public boolean b(long j) {
        return j >= b() && j <= a();
    }

    public static FDb a(long j, long j2, long j3) {
        return a(j, j, j2, j3);
    }

    public long b(long j, C7381tDb tdb) {
        if (b(j)) {
            return j;
        }
        String str = "): ";
        if (tdb != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid value for ");
            sb.append(tdb);
            sb.append(" (valid values ");
            sb.append(this);
            sb.append(str);
            sb.append(j);
            throw new C5687cBb(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Invalid value (valid values ");
        sb2.append(this);
        sb2.append(str);
        sb2.append(j);
        throw new C5687cBb(sb2.toString());
    }

    public static FDb a(long j, long j2, long j3, long j4) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        } else if (j3 > j4) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        } else if (j2 <= j4) {
            FDb fDb = new FDb(j, j2, j3, j4);
            return fDb;
        } else {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
    }

    public long a() {
        return this.d;
    }

    public boolean a(long j) {
        return d() && b(j);
    }

    public int a(long j, C7381tDb tdb) {
        if (a(j)) {
            return (int) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Invalid int value for ");
        sb.append(tdb);
        sb.append(": ");
        sb.append(j);
        throw new C5687cBb(sb.toString());
    }
}
