package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: JAb reason: default package */
/* compiled from: Timeout */
public class JAb {
    public static final JAb a = new IAb();
    private boolean b;
    private long c;
    private long d;

    public JAb a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("timeout < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (timeUnit != null) {
            this.d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public JAb b() {
        this.d = 0;
        return this;
    }

    public long c() {
        if (this.b) {
            return this.c;
        }
        throw new IllegalStateException("No deadline");
    }

    public boolean d() {
        return this.b;
    }

    public void e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.b && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long f() {
        return this.d;
    }

    public JAb a(long j) {
        this.b = true;
        this.c = j;
        return this;
    }

    public JAb a() {
        this.b = false;
        return this;
    }
}
