package defpackage;

import com.google.android.gms.common.api.Api.BaseClientBuilder;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: Ozb reason: default package */
/* compiled from: Http2Writer */
final class Ozb implements Closeable {
    private static final Logger a = Logger.getLogger(C7856zzb.class.getName());
    private final C6893mAb b;
    private final boolean c;
    private final C6825lAb d = new C6825lAb();
    private int e = 16384;
    private boolean f;
    final b g = new b(this.d);

    Ozb(C6893mAb mab, boolean z) {
        this.b = mab;
        this.c = z;
    }

    private void c(int i, long j) throws IOException {
        while (j > 0) {
            int min = (int) Math.min((long) this.e, j);
            long j2 = (long) min;
            j -= j2;
            a(i, min, 9, j == 0 ? (byte) 4 : 0);
            this.b.a(this.d, j2);
        }
    }

    public synchronized void a() throws IOException {
        if (this.f) {
            throw new IOException("closed");
        } else if (this.c) {
            if (a.isLoggable(Level.FINE)) {
                a.fine(Kyb.a(">> CONNECTION %s", C7856zzb.a.b()));
            }
            this.b.write(C7856zzb.a.u());
            this.b.flush();
        }
    }

    public int b() {
        return this.e;
    }

    public synchronized void close() throws IOException {
        this.f = true;
        this.b.close();
    }

    public synchronized void flush() throws IOException {
        if (!this.f) {
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b(Szb szb) throws IOException {
        if (!this.f) {
            int i = 0;
            a(0, szb.d() * 6, 4, 0);
            while (i < 10) {
                if (szb.d(i)) {
                    int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                    this.b.writeShort(i2);
                    this.b.writeInt(szb.a(i));
                }
                i++;
            }
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(Szb szb) throws IOException {
        if (!this.f) {
            this.e = szb.c(this.e);
            if (szb.b() != -1) {
                this.g.a(szb.b());
            }
            a(0, 0, 4, 1);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void b(int i, long j) throws IOException {
        if (this.f) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            C7856zzb.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
            throw null;
        } else {
            a(i, 4, 8, 0);
            this.b.writeInt((int) j);
            this.b.flush();
        }
    }

    public synchronized void a(int i, int i2, List<C7718xzb> list) throws IOException {
        if (!this.f) {
            this.g.a(list);
            long size = this.d.size();
            int min = (int) Math.min((long) (this.e - 4), size);
            long j = (long) min;
            int i3 = (size > j ? 1 : (size == j ? 0 : -1));
            a(i, min + 4, 5, i3 == 0 ? (byte) 4 : 0);
            this.b.writeInt(i2 & BaseClientBuilder.API_PRIORITY_OTHER);
            this.b.a(this.d, j);
            if (i3 > 0) {
                c(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i, C7649wzb wzb) throws IOException {
        if (this.f) {
            throw new IOException("closed");
        } else if (wzb.m != -1) {
            a(i, 4, 3, 0);
            this.b.writeInt(wzb.m);
            this.b.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public synchronized void a(boolean z, int i, C6825lAb lab, int i2) throws IOException {
        if (!this.f) {
            byte b2 = 0;
            if (z) {
                b2 = (byte) 1;
            }
            a(i, b2, lab, i2);
        } else {
            throw new IOException("closed");
        }
    }

    /* access modifiers changed from: 0000 */
    public void a(int i, byte b2, C6825lAb lab, int i2) throws IOException {
        a(i, i2, 0, b2);
        if (i2 > 0) {
            this.b.a(lab, (long) i2);
        }
    }

    public synchronized void a(boolean z, int i, int i2) throws IOException {
        if (!this.f) {
            a(0, 8, 6, z ? (byte) 1 : 0);
            this.b.writeInt(i);
            this.b.writeInt(i2);
            this.b.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i, C7649wzb wzb, byte[] bArr) throws IOException {
        if (this.f) {
            throw new IOException("closed");
        } else if (wzb.m != -1) {
            a(0, bArr.length + 8, 7, 0);
            this.b.writeInt(i);
            this.b.writeInt(wzb.m);
            if (bArr.length > 0) {
                this.b.write(bArr);
            }
            this.b.flush();
        } else {
            C7856zzb.a("errorCode.httpCode == -1", new Object[0]);
            throw null;
        }
    }

    public void a(int i, int i2, byte b2, byte b3) throws IOException {
        if (a.isLoggable(Level.FINE)) {
            a.fine(C7856zzb.a(false, i, i2, b2, b3));
        }
        int i3 = this.e;
        if (i2 > i3) {
            C7856zzb.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i3), Integer.valueOf(i2));
            throw null;
        } else if ((Integer.MIN_VALUE & i) == 0) {
            a(this.b, i2);
            this.b.writeByte(b2 & 255);
            this.b.writeByte(b3 & 255);
            this.b.writeInt(i & BaseClientBuilder.API_PRIORITY_OTHER);
        } else {
            C7856zzb.a("reserved bit set: %s", Integer.valueOf(i));
            throw null;
        }
    }

    private static void a(C6893mAb mab, int i) throws IOException {
        mab.writeByte((i >>> 16) & 255);
        mab.writeByte((i >>> 8) & 255);
        mab.writeByte(i & 255);
    }

    public synchronized void a(boolean z, int i, List<C7718xzb> list) throws IOException {
        if (!this.f) {
            this.g.a(list);
            long size = this.d.size();
            int min = (int) Math.min((long) this.e, size);
            long j = (long) min;
            int i2 = (size > j ? 1 : (size == j ? 0 : -1));
            byte b2 = i2 == 0 ? (byte) 4 : 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i, min, 1, b2);
            this.b.a(this.d, j);
            if (i2 > 0) {
                c(i, size - j);
            }
        } else {
            throw new IOException("closed");
        }
    }
}
