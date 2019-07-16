package com.facebook;

import android.os.Handler;
import com.facebook.K.a;
import com.facebook.K.b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* compiled from: ProgressOutputStream */
class W extends FilterOutputStream implements X {
    private final Map<GraphRequest, Z> a;
    /* access modifiers changed from: private */
    public final K b;
    private final long c = B.p();
    /* access modifiers changed from: private */
    public long d;
    private long e;
    /* access modifiers changed from: private */
    public long f;
    private Z g;

    W(OutputStream outputStream, K k, Map<GraphRequest, Z> map, long j) {
        super(outputStream);
        this.b = k;
        this.a = map;
        this.f = j;
    }

    private void h(long j) {
        Z z = this.g;
        if (z != null) {
            z.a(j);
        }
        this.d += j;
        long j2 = this.d;
        if (j2 >= this.e + this.c || j2 >= this.f) {
            a();
        }
    }

    public void close() throws IOException {
        super.close();
        for (Z a2 : this.a.values()) {
            a2.a();
        }
        a();
    }

    public void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        h((long) bArr.length);
    }

    private void a() {
        if (this.d > this.e) {
            for (a aVar : this.b.j()) {
                if (aVar instanceof b) {
                    Handler i = this.b.i();
                    b bVar = (b) aVar;
                    if (i == null) {
                        bVar.a(this.b, this.d, this.f);
                    } else {
                        i.post(new V(this, bVar));
                    }
                }
            }
            this.e = this.d;
        }
    }

    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        h((long) i2);
    }

    public void write(int i) throws IOException {
        this.out.write(i);
        h(1);
    }

    public void a(GraphRequest graphRequest) {
        this.g = graphRequest != null ? (Z) this.a.get(graphRequest) : null;
    }
}
