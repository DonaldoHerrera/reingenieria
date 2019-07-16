package defpackage;

/* renamed from: Zq reason: default package */
/* compiled from: TimestampAdjuster */
public final class Zq {
    private long a;
    private long b;
    private volatile long c = -9223372036854775807L;

    public Zq(long j) {
        d(j);
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public long a() {
        return this.a;
    }

    public long b() {
        if (this.c != -9223372036854775807L) {
            return this.b + this.c;
        }
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public long c() {
        if (this.a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b;
    }

    public synchronized void d(long j) {
        C1852xq.b(this.c == -9223372036854775807L);
        this.a = j;
    }

    public static long c(long j) {
        return (j * 1000000) / 90000;
    }

    public long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            this.c = j;
        } else {
            long j2 = this.a;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - j;
            }
            synchronized (this) {
                this.c = j;
                notifyAll();
            }
        }
        return j + this.b;
    }

    public long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long e = e(this.c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return a(c(j));
    }

    public void d() {
        this.c = -9223372036854775807L;
    }
}
