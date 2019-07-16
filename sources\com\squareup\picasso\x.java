package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: MarkableInputStream */
final class x extends InputStream {
    private final InputStream a;
    private long b;
    private long c;
    private long d;
    private long e;
    private boolean f;
    private int g;

    x(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void i(long j) {
        try {
            if (this.c >= this.b || this.b > this.d) {
                this.c = this.b;
                this.a.mark((int) (j - this.b));
            } else {
                this.a.reset();
                this.a.mark((int) (j - this.c));
                a(this.c, this.b);
            }
            this.d = j;
        } catch (IOException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to mark: ");
            sb.append(e2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public long a(int i) {
        long j = this.b + ((long) i);
        if (this.d < j) {
            i(j);
        }
        return this.b;
    }

    public int available() throws IOException {
        return this.a.available();
    }

    public void close() throws IOException {
        this.a.close();
    }

    public void h(long j) throws IOException {
        if (this.b > this.d || j < this.c) {
            throw new IOException("Cannot reset");
        }
        this.a.reset();
        a(this.c, j);
        this.b = j;
    }

    public void mark(int i) {
        this.e = a(i);
    }

    public boolean markSupported() {
        return this.a.markSupported();
    }

    public int read() throws IOException {
        if (!this.f) {
            long j = this.b + 1;
            long j2 = this.d;
            if (j > j2) {
                i(j2 + ((long) this.g));
            }
        }
        int read = this.a.read();
        if (read != -1) {
            this.b++;
        }
        return read;
    }

    public void reset() throws IOException {
        h(this.e);
    }

    public long skip(long j) throws IOException {
        if (!this.f) {
            long j2 = this.b;
            if (j2 + j > this.d) {
                i(j2 + j + ((long) this.g));
            }
        }
        long skip = this.a.skip(j);
        this.b += skip;
        return skip;
    }

    x(InputStream inputStream, int i) {
        this(inputStream, i, 1024);
    }

    private x(InputStream inputStream, int i, int i2) {
        this.e = -1;
        this.f = true;
        this.g = -1;
        if (!inputStream.markSupported()) {
            inputStream = new BufferedInputStream(inputStream, i);
        }
        this.a = inputStream;
        this.g = i2;
    }

    public void a(boolean z) {
        this.f = z;
    }

    public int read(byte[] bArr) throws IOException {
        if (!this.f) {
            long j = this.b;
            if (((long) bArr.length) + j > this.d) {
                i(j + ((long) bArr.length) + ((long) this.g));
            }
        }
        int read = this.a.read(bArr);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }

    private void a(long j, long j2) throws IOException {
        while (j < j2) {
            long skip = this.a.skip(j2 - j);
            if (skip == 0) {
                if (read() != -1) {
                    skip = 1;
                } else {
                    return;
                }
            }
            j += skip;
        }
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (!this.f) {
            long j = this.b;
            long j2 = (long) i2;
            if (j + j2 > this.d) {
                i(j + j2 + ((long) this.g));
            }
        }
        int read = this.a.read(bArr, i, i2);
        if (read != -1) {
            this.b += (long) read;
        }
        return read;
    }
}
