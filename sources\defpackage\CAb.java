package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: CAb reason: default package */
/* compiled from: RealBufferedSource */
final class CAb implements C6961nAb {
    public final C6825lAb a = new C6825lAb();
    public final HAb b;
    boolean c;

    CAb(HAb hAb) {
        if (hAb != null) {
            this.b = hAb;
            return;
        }
        throw new NullPointerException("source == null");
    }

    public boolean a(long j) throws IOException {
        C6825lAb lab;
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.c) {
            do {
                lab = this.a;
                if (lab.c >= j) {
                    return true;
                }
            } while (this.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public long b(C6825lAb lab, long j) throws IOException {
        if (lab == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (!this.c) {
            C6825lAb lab2 = this.a;
            if (lab2.c == 0 && this.b.b(lab2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return this.a.b(lab, Math.min(j, this.a.c));
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public String c(long j) throws IOException {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a2 = a(10, 0, j2);
            if (a2 != -1) {
                return this.a.i(a2);
            }
            if (j2 < Long.MAX_VALUE && a(j2) && this.a.g(j2 - 1) == 13 && a(1 + j2) && this.a.g(j2) == 10) {
                return this.a.i(j2);
            }
            C6825lAb lab = new C6825lAb();
            C6825lAb lab2 = this.a;
            lab2.a(lab, 0, Math.min(32, lab2.size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(this.a.size(), j));
            sb.append(" content=");
            sb.append(lab.A().b());
            sb.append(8230);
            throw new EOFException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("limit < 0: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public void close() throws IOException {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.i();
        }
    }

    public byte[] d(long j) throws IOException {
        e(j);
        return this.a.d(j);
    }

    public void e(long j) throws IOException {
        if (!a(j)) {
            throw new EOFException();
        }
    }

    public C7030oAb f(long j) throws IOException {
        e(j);
        return this.a.f(j);
    }

    public C6825lAb getBuffer() {
        return this.a;
    }

    public boolean isOpen() {
        return !this.c;
    }

    public C6825lAb j() {
        return this.a;
    }

    public JAb k() {
        return this.b.k();
    }

    public String m() throws IOException {
        return c(Long.MAX_VALUE);
    }

    public short n() throws IOException {
        e(2);
        return this.a.n();
    }

    public byte[] o() throws IOException {
        this.a.a(this.b);
        return this.a.o();
    }

    public boolean p() throws IOException {
        if (!this.c) {
            return this.a.p() && this.b.b(this.a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
        }
        throw new IllegalStateException("closed");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002b  */
    public long q() throws IOException {
        e(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!a((long) i2)) {
                break;
            }
            byte g = this.a.g((long) i);
            if ((g >= 48 && g <= 57) || (i == 0 && g == 45)) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9] or '-' character but was %#x", new Object[]{Byte.valueOf(g)}));
            }
        }
        if (i == 0) {
        }
        return this.a.q();
    }

    public int r() throws IOException {
        e(4);
        return this.a.r();
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        C6825lAb lab = this.a;
        if (lab.c == 0 && this.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    public byte readByte() throws IOException {
        e(1);
        return this.a.readByte();
    }

    public void readFully(byte[] bArr) throws IOException {
        try {
            e((long) bArr.length);
            this.a.readFully(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                C6825lAb lab = this.a;
                long j = lab.c;
                if (j > 0) {
                    int a2 = lab.a(bArr, i, (int) j);
                    if (a2 != -1) {
                        i += a2;
                    } else {
                        throw new AssertionError();
                    }
                } else {
                    throw e;
                }
            }
        }
    }

    public int readInt() throws IOException {
        e(4);
        return this.a.readInt();
    }

    public short readShort() throws IOException {
        e(2);
        return this.a.readShort();
    }

    public long s() throws IOException {
        e(1);
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (!a((long) i2)) {
                break;
            }
            byte g = this.a.g((long) i);
            if ((g >= 48 && g <= 57) || ((g >= 97 && g <= 102) || (g >= 65 && g <= 70))) {
                i = i2;
            } else if (i == 0) {
                throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", new Object[]{Byte.valueOf(g)}));
            }
        }
        return this.a.s();
    }

    public void skip(long j) throws IOException {
        if (!this.c) {
            while (j > 0) {
                C6825lAb lab = this.a;
                if (lab.c == 0 && this.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.size());
                this.a.skip(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    public InputStream t() {
        return new BAb(this);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("buffer(");
        sb.append(this.b);
        sb.append(")");
        return sb.toString();
    }

    public int a(C7789zAb zab) throws IOException {
        if (!this.c) {
            do {
                int a2 = this.a.a(zab, true);
                if (a2 == -1) {
                    return -1;
                }
                if (a2 != -2) {
                    this.a.skip((long) zab.a[a2].f());
                    return a2;
                }
            } while (this.b.b(this.a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return -1;
        }
        throw new IllegalStateException("closed");
    }

    public String a(Charset charset) throws IOException {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public long a(byte b2) throws IOException {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(j), Long.valueOf(j2)}));
        } else {
            while (j < j2) {
                long a2 = this.a.a(b2, j, j2);
                if (a2 == -1) {
                    C6825lAb lab = this.a;
                    long j3 = lab.c;
                    if (j3 >= j2 || this.b.b(lab, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a2;
                }
            }
            return -1;
        }
    }

    public boolean a(long j, C7030oAb oab) throws IOException {
        return a(j, oab, 0, oab.f());
    }

    public boolean a(long j, C7030oAb oab, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j < 0 || i < 0 || i2 < 0 || oab.f() - i < i2) {
            return false;
        } else {
            for (int i3 = 0; i3 < i2; i3++) {
                long j2 = ((long) i3) + j;
                if (!a(1 + j2) || this.a.g(j2) != oab.a(i + i3)) {
                    return false;
                }
            }
            return true;
        }
    }
}
