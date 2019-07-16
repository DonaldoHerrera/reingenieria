package com.google.firebase.perf.network;

import com.google.android.gms.internal.firebase-perf.C0899v;
import com.google.android.gms.internal.firebase-perf.zzbg;
import java.io.IOException;
import java.io.OutputStream;

public final class c extends OutputStream {
    private OutputStream a;
    private long b = -1;
    private C0899v c;
    private final zzbg d;

    public c(OutputStream outputStream, C0899v vVar, zzbg zzbg) {
        this.a = outputStream;
        this.c = vVar;
        this.d = zzbg;
    }

    public final void close() throws IOException {
        long j = this.b;
        if (j != -1) {
            this.c.a(j);
        }
        this.c.c(this.d.c());
        try {
            this.a.close();
        } catch (IOException e) {
            this.c.e(this.d.c());
            h.a(this.c);
            throw e;
        }
    }

    public final void flush() throws IOException {
        try {
            this.a.flush();
        } catch (IOException e) {
            this.c.e(this.d.c());
            h.a(this.c);
            throw e;
        }
    }

    public final void write(int i) throws IOException {
        try {
            this.a.write(i);
            this.b++;
            this.c.a(this.b);
        } catch (IOException e) {
            this.c.e(this.d.c());
            h.a(this.c);
            throw e;
        }
    }

    public final void write(byte[] bArr) throws IOException {
        try {
            this.a.write(bArr);
            this.b += (long) bArr.length;
            this.c.a(this.b);
        } catch (IOException e) {
            this.c.e(this.d.c());
            h.a(this.c);
            throw e;
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        try {
            this.a.write(bArr, i, i2);
            this.b += (long) i2;
            this.c.a(this.b);
        } catch (IOException e) {
            this.c.e(this.d.c());
            h.a(this.c);
            throw e;
        }
    }
}
