package com.soundcloud.android.utilities.android;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: LimitInputStream */
public final class i extends FilterInputStream {
    private long a;
    private long b = -1;

    public i(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    public int available() throws IOException {
        return (int) Math.min((long) this.in.available(), this.a);
    }

    public synchronized void mark(int i) {
        this.in.mark(i);
        this.b = this.a;
    }

    public int read() throws IOException {
        if (this.a == 0) {
            return -1;
        }
        int read = this.in.read();
        if (read != -1) {
            this.a--;
        }
        return read;
    }

    public synchronized void reset() throws IOException {
        if (!this.in.markSupported()) {
            throw new IOException("Mark not supported");
        } else if (this.b != -1) {
            this.in.reset();
            this.a = this.b;
        } else {
            throw new IOException("Mark not set");
        }
    }

    public long skip(long j) throws IOException {
        long skip = this.in.skip(Math.min(j, this.a));
        this.a -= skip;
        return skip;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.a;
        if (j == 0) {
            return -1;
        }
        int read = this.in.read(bArr, i, (int) Math.min((long) i2, j));
        if (read != -1) {
            this.a -= (long) read;
        }
        return read;
    }
}
