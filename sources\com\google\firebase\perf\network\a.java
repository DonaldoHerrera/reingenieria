package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.io.IOException;
import java.io.InputStream;

public final class a extends InputStream {
    private final InputStream a;
    private final C0899v b;
    private final zzbg c;
    private long d = -1;
    private long e;
    private long f = -1;

    public a(InputStream inputStream, C0899v vVar, zzbg zzbg) {
        this.c = zzbg;
        this.a = inputStream;
        this.b = vVar;
        this.e = this.b.b();
    }

    public final int available() throws IOException {
        try {
            return this.a.available();
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void close() throws IOException {
        long c2 = this.c.c();
        if (this.f == -1) {
            this.f = c2;
        }
        try {
            this.a.close();
            if (this.d != -1) {
                this.b.f(this.d);
            }
            if (this.e != -1) {
                this.b.d(this.e);
            }
            this.b.e(this.f);
            this.b.d();
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void mark(int i) {
        this.a.mark(i);
    }

    public final boolean markSupported() {
        return this.a.markSupported();
    }

    public final int read() throws IOException {
        try {
            int read = this.a.read();
            long c2 = this.c.c();
            if (this.e == -1) {
                this.e = c2;
            }
            if (read == -1 && this.f == -1) {
                this.f = c2;
                this.b.e(this.f);
                this.b.d();
            } else {
                this.d++;
                this.b.f(this.d);
            }
            return read;
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final void reset() throws IOException {
        try {
            this.a.reset();
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final long skip(long j) throws IOException {
        try {
            long skip = this.a.skip(j);
            long c2 = this.c.c();
            if (this.e == -1) {
                this.e = c2;
            }
            if (skip == -1 && this.f == -1) {
                this.f = c2;
                this.b.e(this.f);
            } else {
                this.d += skip;
                this.b.f(this.d);
            }
            return skip;
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final int read(byte[] bArr, int i, int i2) throws IOException {
        try {
            int read = this.a.read(bArr, i, i2);
            long c2 = this.c.c();
            if (this.e == -1) {
                this.e = c2;
            }
            if (read == -1 && this.f == -1) {
                this.f = c2;
                this.b.e(this.f);
                this.b.d();
            } else {
                this.d += (long) read;
                this.b.f(this.d);
            }
            return read;
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }

    public final int read(byte[] bArr) throws IOException {
        try {
            int read = this.a.read(bArr);
            long c2 = this.c.c();
            if (this.e == -1) {
                this.e = c2;
            }
            if (read == -1 && this.f == -1) {
                this.f = c2;
                this.b.e(this.f);
                this.b.d();
            } else {
                this.d += (long) read;
                this.b.f(this.d);
            }
            return read;
        } catch (IOException e2) {
            this.b.e(this.c.c());
            h.a(this.b);
            throw e2;
        }
    }
}
