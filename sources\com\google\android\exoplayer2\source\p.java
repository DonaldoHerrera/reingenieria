package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* compiled from: IcyDataSource */
final class p implements Zp {
    private final Zp a;
    private final int b;
    private final a c;
    private final byte[] d;
    private int e;

    /* compiled from: IcyDataSource */
    public interface a {
        void a(Pq pq);
    }

    public p(Zp zp, int i, a aVar) {
        C1852xq.a(i > 0);
        this.a = zp;
        this.b = i;
        this.c = aVar;
        this.d = new byte[1];
        this.e = i;
    }

    private boolean b() throws IOException {
        if (this.a.read(this.d, 0, 1) == -1) {
            return false;
        }
        int i = (this.d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int read = this.a.read(bArr, i3, i2);
            if (read == -1) {
                return false;
            }
            i3 += read;
            i2 -= read;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.c.a(new Pq(bArr, i));
        }
        return true;
    }

    public void a(C1702sq sqVar) {
        this.a.a(sqVar);
    }

    public void close() throws IOException {
        throw new UnsupportedOperationException();
    }

    public Uri getUri() {
        return this.a.getUri();
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.e == 0) {
            if (!b()) {
                return -1;
            }
            this.e = this.b;
        }
        int read = this.a.read(bArr, i, Math.min(this.e, i2));
        if (read != -1) {
            this.e -= read;
        }
        return read;
    }

    public long a(C0470aq aqVar) throws IOException {
        throw new UnsupportedOperationException();
    }

    public Map<String, List<String>> a() {
        return this.a.a();
    }
}
