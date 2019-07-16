package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.base.Ascii;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* renamed from: lAb reason: default package and case insensitive filesystem */
/* compiled from: Buffer */
public final class C6825lAb implements C6961nAb, C6893mAb, Cloneable, ByteChannel {
    private static final byte[] a = {48, Framer.STDOUT_FRAME_PREFIX, Framer.STDERR_FRAME_PREFIX, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};
    DAb b;
    long c;

    public C7030oAb A() {
        return new C7030oAb(o());
    }

    public String B() {
        try {
            return a(this.c, KAb.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final C7030oAb C() {
        long j = this.c;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size > Integer.MAX_VALUE: ");
        sb.append(this.c);
        throw new IllegalArgumentException(sb.toString());
    }

    public String c(long j) throws EOFException {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a2 = a(10, 0, j2);
            if (a2 != -1) {
                return i(a2);
            }
            if (j2 < size() && g(j2 - 1) == 13 && g(j2) == 10) {
                return i(j2);
            }
            C6825lAb lab = new C6825lAb();
            a(lab, 0, Math.min(32, size()));
            StringBuilder sb = new StringBuilder();
            sb.append("\\n not found: limit=");
            sb.append(Math.min(size(), j));
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

    public void close() {
    }

    public byte[] d(long j) throws EOFException {
        KAb.a(this.c, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            readFully(bArr);
            return bArr;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("byteCount > Integer.MAX_VALUE: ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    public void e(long j) throws EOFException {
        if (this.c < j) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6825lAb)) {
            return false;
        }
        C6825lAb lab = (C6825lAb) obj;
        long j = this.c;
        if (j != lab.c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        DAb dAb = this.b;
        DAb dAb2 = lab.b;
        int i = dAb.b;
        int i2 = dAb2.b;
        while (j2 < this.c) {
            long min = (long) Math.min(dAb.c - i, dAb2.c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (((long) i5) < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (dAb.a[i4] != dAb2.a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == dAb.c) {
                dAb = dAb.f;
                i = dAb.b;
            } else {
                i = i4;
            }
            if (i3 == dAb2.c) {
                dAb2 = dAb2.f;
                i2 = dAb2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public void flush() {
    }

    public final byte g(long j) {
        int i;
        KAb.a(this.c, j, 1);
        long j2 = this.c;
        if (j2 - j > j) {
            DAb dAb = this.b;
            while (true) {
                int i2 = dAb.c;
                int i3 = dAb.b;
                long j3 = (long) (i2 - i3);
                if (j < j3) {
                    return dAb.a[i3 + ((int) j)];
                }
                j -= j3;
                dAb = dAb.f;
            }
        } else {
            long j4 = j - j2;
            DAb dAb2 = this.b;
            do {
                dAb2 = dAb2.g;
                int i4 = dAb2.c;
                i = dAb2.b;
                j4 += (long) (i4 - i);
            } while (j4 < 0);
            return dAb2.a[i + ((int) j4)];
        }
    }

    public C6825lAb getBuffer() {
        return this;
    }

    public String h(long j) throws EOFException {
        return a(j, KAb.a);
    }

    public int hashCode() {
        DAb dAb = this.b;
        if (dAb == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = dAb.b; i2 < dAb.c; i2++) {
                i = (i * 31) + dAb.a[i2];
            }
            dAb = dAb.f;
        } while (dAb != this.b);
        return i;
    }

    /* access modifiers changed from: 0000 */
    public String i(long j) throws EOFException {
        if (j > 0) {
            long j2 = j - 1;
            if (g(j2) == 13) {
                String h = h(j2);
                skip(2);
                return h;
            }
        }
        String h2 = h(j);
        skip(1);
        return h2;
    }

    public boolean isOpen() {
        return true;
    }

    public C6825lAb j() {
        return this;
    }

    public JAb k() {
        return JAb.a;
    }

    public C6825lAb l() {
        return this;
    }

    public String m() throws EOFException {
        return c(Long.MAX_VALUE);
    }

    public short n() {
        return KAb.a(readShort());
    }

    public byte[] o() {
        try {
            return d(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public boolean p() {
        return this.c == 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r5 != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1.readByte();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        r3 = new java.lang.StringBuilder();
        r3.append("Number too large: ");
        r3.append(r1.B());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0067, code lost:
        throw new java.lang.NumberFormatException(r3.toString());
     */
    public long q() {
        long j = 0;
        if (this.c != 0) {
            int i = 0;
            long j2 = -7;
            boolean z = false;
            boolean z2 = false;
            loop0:
            do {
                DAb dAb = this.b;
                byte[] bArr = dAb.a;
                int i2 = dAb.b;
                int i3 = dAb.c;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    byte b2 = bArr[i2];
                    if (b2 >= 48 && b2 <= 57) {
                        int i4 = 48 - b2;
                        int i5 = (j > -922337203685477580L ? 1 : (j == -922337203685477580L ? 0 : -1));
                        if (i5 < 0 || (i5 == 0 && ((long) i4) < j2)) {
                            C6825lAb lab = new C6825lAb();
                            lab.a(j);
                            lab.writeByte((int) b2);
                        } else {
                            j = (j * 10) + ((long) i4);
                        }
                    } else if (b2 == 45 && i == 0) {
                        j2--;
                        z = true;
                    } else if (i != 0) {
                        z2 = true;
                    } else {
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected leading [0-9] or '-' character but was 0x");
                        sb.append(Integer.toHexString(b2));
                        throw new NumberFormatException(sb.toString());
                    }
                    i2++;
                    i++;
                }
                if (i2 == i3) {
                    this.b = dAb.b();
                    EAb.a(dAb);
                } else {
                    dAb.b = i2;
                }
                if (z2) {
                    break;
                }
            } while (this.b != null);
            this.c -= (long) i;
            return z ? j : -j;
        }
        throw new IllegalStateException("size == 0");
    }

    public int r() {
        return KAb.a(readInt());
    }

    public int read(ByteBuffer byteBuffer) throws IOException {
        DAb dAb = this.b;
        if (dAb == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), dAb.c - dAb.b);
        byteBuffer.put(dAb.a, dAb.b, min);
        dAb.b += min;
        this.c -= (long) min;
        if (dAb.b == dAb.c) {
            this.b = dAb.b();
            EAb.a(dAb);
        }
        return min;
    }

    public byte readByte() {
        long j = this.c;
        if (j != 0) {
            DAb dAb = this.b;
            int i = dAb.b;
            int i2 = dAb.c;
            int i3 = i + 1;
            byte b2 = dAb.a[i];
            this.c = j - 1;
            if (i3 == i2) {
                this.b = dAb.b();
                EAb.a(dAb);
            } else {
                dAb.b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    public void readFully(byte[] bArr) throws EOFException {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 != -1) {
                i += a2;
            } else {
                throw new EOFException();
            }
        }
    }

    public int readInt() {
        long j = this.c;
        if (j >= 4) {
            DAb dAb = this.b;
            int i = dAb.b;
            int i2 = dAb.c;
            if (i2 - i < 4) {
                return ((readByte() & 255) << Ascii.CAN) | ((readByte() & 255) << Ascii.DLE) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = dAb.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i3] & 255) << Ascii.DLE);
            int i5 = i4 + 1;
            byte b3 = b2 | ((bArr[i4] & 255) << 8);
            int i6 = i5 + 1;
            byte b4 = b3 | (bArr[i5] & 255);
            this.c = j - 4;
            if (i6 == i2) {
                this.b = dAb.b();
                EAb.a(dAb);
            } else {
                dAb.b = i6;
            }
            return b4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 4: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString());
    }

    public short readShort() {
        long j = this.c;
        if (j >= 2) {
            DAb dAb = this.b;
            int i = dAb.b;
            int i2 = dAb.c;
            if (i2 - i < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = dAb.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            byte b2 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.c = j - 2;
            if (i4 == i2) {
                this.b = dAb.b();
                EAb.a(dAb);
            } else {
                dAb.b = i4;
            }
            return (short) b2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("size < 2: ");
        sb.append(this.c);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        if (r8 != r9) goto L_0x009b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r15.b = r6.b();
        defpackage.EAb.a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009b, code lost:
        r6.b = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        if (r0 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0074 A[SYNTHETIC] */
    public long s() {
        int i;
        int i2;
        if (this.c != 0) {
            boolean z = false;
            long j = 0;
            int i3 = 0;
            do {
                DAb dAb = this.b;
                byte[] bArr = dAb.a;
                int i4 = dAb.b;
                int i5 = dAb.c;
                while (true) {
                    if (i4 >= i5) {
                        break;
                    }
                    byte b2 = bArr[i4];
                    if (b2 < 48 || b2 > 57) {
                        if (b2 >= 97 && b2 <= 102) {
                            i2 = b2 - 97;
                        } else if (b2 >= 65 && b2 <= 70) {
                            i2 = b2 - 65;
                        } else if (i3 == 0) {
                            z = true;
                        } else {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Expected leading [0-9a-fA-F] character but was 0x");
                            sb.append(Integer.toHexString(b2));
                            throw new NumberFormatException(sb.toString());
                        }
                        i = i2 + 10;
                    } else {
                        i = b2 - 48;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i);
                        i4++;
                        i3++;
                    } else {
                        C6825lAb lab = new C6825lAb();
                        lab.b(j);
                        lab.writeByte((int) b2);
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Number too large: ");
                        sb2.append(lab.B());
                        throw new NumberFormatException(sb2.toString());
                    }
                }
                if (i3 == 0) {
                }
            } while (this.b != null);
            this.c -= (long) i3;
            return j;
        }
        throw new IllegalStateException("size == 0");
    }

    public final long size() {
        return this.c;
    }

    public void skip(long j) throws EOFException {
        while (j > 0) {
            DAb dAb = this.b;
            if (dAb != null) {
                int min = (int) Math.min(j, (long) (dAb.c - dAb.b));
                long j2 = (long) min;
                this.c -= j2;
                j -= j2;
                DAb dAb2 = this.b;
                dAb2.b += min;
                if (dAb2.b == dAb2.c) {
                    this.b = dAb2.b();
                    EAb.a(dAb2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public InputStream t() {
        return new C6757kAb(this);
    }

    public String toString() {
        return C().toString();
    }

    public final long z() {
        long j = this.c;
        if (j == 0) {
            return 0;
        }
        DAb dAb = this.b.g;
        int i = dAb.c;
        if (i < 8192 && dAb.e) {
            j -= (long) (i - dAb.b);
        }
        return j;
    }

    public C6825lAb b(long j) {
        if (j == 0) {
            writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        DAb b2 = b(numberOfTrailingZeros);
        byte[] bArr = b2.a;
        int i = b2.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = a[(int) (15 & j)];
            j >>>= 4;
        }
        b2.c += numberOfTrailingZeros;
        this.c += (long) numberOfTrailingZeros;
        return this;
    }

    public C6825lAb clone() {
        C6825lAb lab = new C6825lAb();
        if (this.c == 0) {
            return lab;
        }
        lab.b = this.b.c();
        DAb dAb = lab.b;
        dAb.g = dAb;
        dAb.f = dAb;
        DAb dAb2 = this.b;
        while (true) {
            dAb2 = dAb2.f;
            if (dAb2 != this.b) {
                lab.b.g.a(dAb2.c());
            } else {
                lab.c = this.c;
                return lab;
            }
        }
    }

    public C7030oAb f(long j) throws EOFException {
        return new C7030oAb(d(j));
    }

    public C6825lAb writeByte(int i) {
        DAb b2 = b(1);
        byte[] bArr = b2.a;
        int i2 = b2.c;
        b2.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.c++;
        return this;
    }

    public C6825lAb writeInt(int i) {
        DAb b2 = b(4);
        byte[] bArr = b2.a;
        int i2 = b2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (i & 255);
        b2.c = i6;
        this.c += 4;
        return this;
    }

    public C6825lAb writeShort(int i) {
        DAb b2 = b(2);
        byte[] bArr = b2.a;
        int i2 = b2.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        b2.c = i4;
        this.c += 2;
        return this;
    }

    public final C6825lAb a(C6825lAb lab, long j, long j2) {
        if (lab != null) {
            KAb.a(this.c, j, j2);
            if (j2 == 0) {
                return this;
            }
            lab.c += j2;
            DAb dAb = this.b;
            while (true) {
                int i = dAb.c;
                int i2 = dAb.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                dAb = dAb.f;
            }
            while (j2 > 0) {
                DAb c2 = dAb.c();
                c2.b = (int) (((long) c2.b) + j);
                c2.c = Math.min(c2.b + ((int) j2), c2.c);
                DAb dAb2 = lab.b;
                if (dAb2 == null) {
                    c2.g = c2;
                    c2.f = c2;
                    lab.b = c2;
                } else {
                    dAb2.g.a(c2);
                }
                j2 -= (long) (c2.c - c2.b);
                dAb = dAb.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public C6825lAb f(String str) {
        a(str, 0, str.length());
        return this;
    }

    public C6825lAb write(byte[] bArr) {
        if (bArr != null) {
            write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public C6825lAb write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            KAb.a((long) bArr.length, (long) i, j);
            int i3 = i2 + i;
            while (i < i3) {
                DAb b2 = b(1);
                int min = Math.min(i3 - i, 8192 - b2.c);
                System.arraycopy(bArr, i, b2.a, b2.c, min);
                i += min;
                b2.c += min;
            }
            this.c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final void i() {
        try {
            skip(this.c);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    /* access modifiers changed from: 0000 */
    public DAb b(int i) {
        DAb dAb;
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        DAb dAb2 = this.b;
        if (dAb2 == null) {
            this.b = EAb.a();
            DAb dAb3 = this.b;
            dAb3.g = dAb3;
            dAb3.f = dAb3;
            return dAb3;
        }
        DAb dAb4 = dAb2.g;
        if (dAb4.c + i > 8192 || !dAb4.e) {
            dAb = EAb.a();
            dAb4.a(dAb);
        } else {
            dAb = dAb4;
        }
        return dAb;
    }

    public C6825lAb c(int i) {
        if (i < 128) {
            writeByte(i);
        } else if (i < 2048) {
            writeByte((i >> 6) | 192);
            writeByte((i & 63) | 128);
        } else if (i < 65536) {
            if (i < 55296 || i > 57343) {
                writeByte((i >> 12) | 224);
                writeByte(((i >> 6) & 63) | 128);
                writeByte((i & 63) | 128);
            } else {
                writeByte(63);
            }
        } else if (i <= 1114111) {
            writeByte((i >> 18) | 240);
            writeByte(((i >> 12) & 63) | 128);
            writeByte(((i >> 6) & 63) | 128);
            writeByte((i & 63) | 128);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected code point: ");
            sb.append(Integer.toHexString(i));
            throw new IllegalArgumentException(sb.toString());
        }
        return this;
    }

    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                DAb b2 = b(1);
                int min = Math.min(i, 8192 - b2.c);
                byteBuffer.get(b2.a, b2.c, min);
                i -= min;
                b2.c += min;
            }
            this.c += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    public int a(C7789zAb zab) {
        int a2 = a(zab, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            skip((long) zab.a[a2].f());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    public long b(C6825lAb lab, long j) {
        if (lab == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.c;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            lab.a(this, j);
            return j;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount < 0: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    public int a(C7789zAb zab, boolean z) {
        int i;
        int i2;
        C7789zAb zab2 = zab;
        DAb dAb = this.b;
        int i3 = -2;
        if (dAb != null) {
            byte[] bArr = dAb.a;
            int i4 = dAb.b;
            int i5 = dAb.c;
            int[] iArr = zab2.b;
            int i6 = i4;
            int i7 = i5;
            int i8 = -1;
            DAb dAb2 = dAb;
            byte[] bArr2 = bArr;
            int i9 = 0;
            loop0:
            while (true) {
                int i10 = i9 + 1;
                int i11 = iArr[i9];
                int i12 = i10 + 1;
                int i13 = iArr[i10];
                if (i13 != -1) {
                    i8 = i13;
                }
                if (dAb2 == null) {
                    break;
                }
                if (i11 < 0) {
                    int i14 = i12 + (i11 * -1);
                    while (true) {
                        i2 = i6 + 1;
                        int i15 = i12 + 1;
                        if ((bArr2[i6] & 255) != iArr[i12]) {
                            return i8;
                        }
                        boolean z2 = i15 == i14;
                        if (i2 == i7) {
                            DAb dAb3 = dAb2.f;
                            int i16 = dAb3.b;
                            bArr2 = dAb3.a;
                            i7 = dAb3.c;
                            if (dAb3 != dAb) {
                                int i17 = i16;
                                dAb2 = dAb3;
                                i2 = i17;
                            } else if (!z2) {
                                break loop0;
                            } else {
                                i2 = i16;
                                dAb2 = null;
                            }
                        }
                        if (z2) {
                            i = iArr[i15];
                            break;
                        }
                        i6 = i2;
                        i12 = i15;
                    }
                } else {
                    int i18 = i6 + 1;
                    byte b2 = bArr2[i6] & 255;
                    int i19 = i12 + i11;
                    while (i12 != i19) {
                        if (b2 == iArr[i12]) {
                            i = iArr[i12 + i11];
                            if (i18 == i7) {
                                DAb dAb4 = dAb2.f;
                                i2 = dAb4.b;
                                byte[] bArr3 = dAb4.a;
                                int i20 = dAb4.c;
                                if (dAb4 == dAb) {
                                    i7 = i20;
                                    bArr2 = bArr3;
                                    dAb2 = null;
                                } else {
                                    i7 = i20;
                                    bArr2 = bArr3;
                                    dAb2 = dAb4;
                                }
                            } else {
                                i2 = i18;
                            }
                        } else {
                            i12++;
                        }
                    }
                    return i8;
                }
                if (i >= 0) {
                    return i;
                }
                int i21 = -i;
                i6 = i2;
                i9 = i21;
                i3 = -2;
            }
            return z ? i3 : i8;
        } else if (z) {
            return -2;
        } else {
            return zab2.indexOf(C7030oAb.b);
        }
    }

    public String a(Charset charset) {
        try {
            return a(this.c, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String a(long j, Charset charset) throws EOFException {
        KAb.a(this.c, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            StringBuilder sb = new StringBuilder();
            sb.append("byteCount > Integer.MAX_VALUE: ");
            sb.append(j);
            throw new IllegalArgumentException(sb.toString());
        } else if (j == 0) {
            return "";
        } else {
            DAb dAb = this.b;
            int i = dAb.b;
            if (((long) i) + j > ((long) dAb.c)) {
                return new String(d(j), charset);
            }
            String str = new String(dAb.a, i, (int) j, charset);
            dAb.b = (int) (((long) dAb.b) + j);
            this.c -= j;
            if (dAb.b == dAb.c) {
                this.b = dAb.b();
                EAb.a(dAb);
            }
            return str;
        }
    }

    public int a(byte[] bArr, int i, int i2) {
        KAb.a((long) bArr.length, (long) i, (long) i2);
        DAb dAb = this.b;
        if (dAb == null) {
            return -1;
        }
        int min = Math.min(i2, dAb.c - dAb.b);
        System.arraycopy(dAb.a, dAb.b, bArr, i, min);
        dAb.b += min;
        this.c -= (long) min;
        if (dAb.b == dAb.c) {
            this.b = dAb.b();
            EAb.a(dAb);
        }
        return min;
    }

    public C6825lAb a(C7030oAb oab) {
        if (oab != null) {
            oab.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public C6825lAb a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    DAb b2 = b(1);
                    byte[] bArr = b2.a;
                    int i3 = b2.c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        int i5 = i4 + 1;
                        bArr[i4 + i3] = (byte) charAt2;
                        i4 = i5;
                    }
                    int i6 = i3 + i4;
                    int i7 = b2.c;
                    int i8 = i6 - i7;
                    b2.c = i7 + i8;
                    this.c += (long) i8;
                    i = i4;
                } else {
                    if (charAt < 2048) {
                        writeByte((charAt >> 6) | 192);
                        writeByte((int) (charAt & '?') | 128);
                    } else if (charAt < 55296 || charAt > 57343) {
                        writeByte((charAt >> 12) | 224);
                        writeByte(((charAt >> 6) & 63) | 128);
                        writeByte((int) (charAt & '?') | 128);
                    } else {
                        int i9 = i + 1;
                        char charAt3 = i9 < i2 ? str.charAt(i9) : 0;
                        if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                            writeByte(63);
                            i = i9;
                        } else {
                            int i10 = (((charAt & 10239) << 10) | (9215 & charAt3)) + Ascii.MIN;
                            writeByte((i10 >> 18) | 240);
                            writeByte(((i10 >> 12) & 63) | 128);
                            writeByte(((i10 >> 6) & 63) | 128);
                            writeByte((i10 & 63) | 128);
                            i += 2;
                        }
                    }
                    i++;
                }
            }
            return this;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    public C6825lAb a(String str, Charset charset) {
        a(str, 0, str.length(), charset);
        return this;
    }

    public C6825lAb a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append("beginIndex < 0: ");
            sb.append(i);
            throw new IllegalAccessError(sb.toString());
        } else if (i2 < i) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("endIndex < beginIndex: ");
            sb2.append(i2);
            sb2.append(" < ");
            sb2.append(i);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i2 > str.length()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("endIndex > string.length: ");
            sb3.append(i2);
            sb3.append(" > ");
            sb3.append(str.length());
            throw new IllegalArgumentException(sb3.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(KAb.a)) {
            a(str, i, i2);
            return this;
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            write(bytes, 0, bytes.length);
            return this;
        }
    }

    public long a(HAb hAb) throws IOException {
        if (hAb != null) {
            long j = 0;
            while (true) {
                long b2 = hAb.b(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
                if (b2 == -1) {
                    return j;
                }
                j += b2;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public C6825lAb a(long j) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i == 0) {
            writeByte(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                f("-9223372036854775808");
                return this;
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        DAb b2 = b(i2);
        byte[] bArr = b2.a;
        int i3 = b2.c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = a[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = Framer.STDIN_FRAME_PREFIX;
        }
        b2.c += i2;
        this.c += (long) i2;
        return this;
    }

    public void a(C6825lAb lab, long j) {
        int i;
        if (lab == null) {
            throw new IllegalArgumentException("source == null");
        } else if (lab != this) {
            KAb.a(lab.c, 0, j);
            while (j > 0) {
                DAb dAb = lab.b;
                if (j < ((long) (dAb.c - dAb.b))) {
                    DAb dAb2 = this.b;
                    DAb dAb3 = dAb2 != null ? dAb2.g : null;
                    if (dAb3 != null && dAb3.e) {
                        long j2 = ((long) dAb3.c) + j;
                        if (dAb3.d) {
                            i = 0;
                        } else {
                            i = dAb3.b;
                        }
                        if (j2 - ((long) i) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            lab.b.a(dAb3, (int) j);
                            lab.c -= j;
                            this.c += j;
                            return;
                        }
                    }
                    lab.b = lab.b.a((int) j);
                }
                DAb dAb4 = lab.b;
                long j3 = (long) (dAb4.c - dAb4.b);
                lab.b = dAb4.b();
                DAb dAb5 = this.b;
                if (dAb5 == null) {
                    this.b = dAb4;
                    DAb dAb6 = this.b;
                    dAb6.g = dAb6;
                    dAb6.f = dAb6;
                } else {
                    dAb5.g.a(dAb4);
                    dAb4.a();
                }
                lab.c -= j3;
                this.c += j3;
                j -= j3;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public long a(byte b2) {
        return a(b2, 0, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(this.c), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = this.c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4) {
            return -1;
        }
        DAb dAb = this.b;
        if (dAb == null) {
            return -1;
        }
        long j5 = this.c;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = ((long) (dAb.c - dAb.b)) + j5;
                if (j3 >= j) {
                    break;
                }
                dAb = dAb.f;
            }
        } else {
            while (j5 > j) {
                dAb = dAb.g;
                j5 -= (long) (dAb.c - dAb.b);
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = dAb.a;
            int min = (int) Math.min((long) dAb.c, (((long) dAb.b) + j4) - j5);
            for (int i = (int) ((((long) dAb.b) + j6) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return ((long) (i - dAb.b)) + j5;
                }
            }
            byte b3 = b2;
            j6 = ((long) (dAb.c - dAb.b)) + j5;
            dAb = dAb.f;
            j5 = j6;
        }
        return -1;
    }

    public boolean a(long j, C7030oAb oab) {
        return a(j, oab, 0, oab.f());
    }

    public boolean a(long j, C7030oAb oab, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.c - j < ((long) i2) || oab.f() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (g(((long) i3) + j) != oab.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final C7030oAb a(int i) {
        if (i == 0) {
            return C7030oAb.b;
        }
        return new FAb(this, i);
    }
}
