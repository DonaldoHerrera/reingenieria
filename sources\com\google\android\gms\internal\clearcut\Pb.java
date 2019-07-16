package com.google.android.gms.internal.clearcut;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ReadOnlyBufferException;

public final class Pb {
    private final ByteBuffer a;
    private M b;
    private int c;

    private Pb(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
        this.a.order(ByteOrder.LITTLE_ENDIAN);
    }

    private Pb(byte[] bArr, int i, int i2) {
        this(ByteBuffer.wrap(bArr, i, i2));
    }

    public static int a(int i) {
        return e(i << 3);
    }

    public static int a(int i, long j) {
        return a(i) + c(j);
    }

    private static int a(CharSequence charSequence) {
        int length = charSequence.length();
        int i = 0;
        int i2 = 0;
        while (i2 < length && charSequence.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i2);
            if (charAt < 2048) {
                i3 += (127 - charAt) >>> 31;
                i2++;
            } else {
                int length2 = charSequence.length();
                while (i2 < length2) {
                    char charAt2 = charSequence.charAt(i2);
                    if (charAt2 < 2048) {
                        i += (127 - charAt2) >>> 31;
                    } else {
                        i += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i2) >= 65536) {
                                i2++;
                            } else {
                                StringBuilder sb = new StringBuilder(39);
                                sb.append("Unpaired surrogate at index ");
                                sb.append(i2);
                                throw new IllegalArgumentException(sb.toString());
                            }
                        }
                    }
                    i2++;
                }
                i3 += i;
            }
        }
        if (i3 >= length) {
            return i3;
        }
        long j = ((long) i3) + 4294967296L;
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int a(String str) {
        int a2 = a((CharSequence) str);
        return e(a2) + a2;
    }

    public static long a(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static Pb a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static Pb a(byte[] bArr, int i, int i2) {
        return new Pb(bArr, 0, i2);
    }

    private static void a(CharSequence charSequence, ByteBuffer byteBuffer) {
        int i;
        int i2;
        int i3;
        if (!byteBuffer.isReadOnly()) {
            String str = "Unpaired surrogate at index ";
            int i4 = 0;
            if (byteBuffer.hasArray()) {
                try {
                    byte[] array = byteBuffer.array();
                    int arrayOffset = byteBuffer.arrayOffset() + byteBuffer.position();
                    int remaining = byteBuffer.remaining();
                    int length = charSequence.length();
                    int i5 = remaining + arrayOffset;
                    while (i4 < length) {
                        int i6 = i4 + arrayOffset;
                        if (i6 >= i5) {
                            break;
                        }
                        char charAt = charSequence.charAt(i4);
                        if (charAt >= 128) {
                            break;
                        }
                        array[i6] = (byte) charAt;
                        i4++;
                    }
                    if (i4 == length) {
                        i2 = arrayOffset + length;
                    } else {
                        i2 = arrayOffset + i4;
                        while (i4 < length) {
                            char charAt2 = charSequence.charAt(i4);
                            if (charAt2 < 128 && i2 < i5) {
                                i3 = i2 + 1;
                                array[i2] = (byte) charAt2;
                            } else if (charAt2 < 2048 && i2 <= i5 - 2) {
                                int i7 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 6) | 960);
                                i2 = i7 + 1;
                                array[i7] = (byte) ((charAt2 & '?') | 128);
                                i4++;
                            } else if ((charAt2 < 55296 || 57343 < charAt2) && i2 <= i5 - 3) {
                                int i8 = i2 + 1;
                                array[i2] = (byte) ((charAt2 >>> 12) | 480);
                                int i9 = i8 + 1;
                                array[i8] = (byte) (((charAt2 >>> 6) & 63) | 128);
                                i3 = i9 + 1;
                                array[i9] = (byte) ((charAt2 & '?') | 128);
                            } else if (i2 <= i5 - 4) {
                                int i10 = i4 + 1;
                                if (i10 != charSequence.length()) {
                                    char charAt3 = charSequence.charAt(i10);
                                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                                        int i11 = i2 + 1;
                                        array[i2] = (byte) ((codePoint >>> 18) | 240);
                                        int i12 = i11 + 1;
                                        array[i11] = (byte) (((codePoint >>> 12) & 63) | 128);
                                        int i13 = i12 + 1;
                                        array[i12] = (byte) (((codePoint >>> 6) & 63) | 128);
                                        i2 = i13 + 1;
                                        array[i13] = (byte) ((codePoint & 63) | 128);
                                        i4 = i10;
                                        i4++;
                                    } else {
                                        i4 = i10;
                                    }
                                }
                                int i14 = i4 - 1;
                                StringBuilder sb = new StringBuilder(39);
                                sb.append(str);
                                sb.append(i14);
                                throw new IllegalArgumentException(sb.toString());
                            } else {
                                StringBuilder sb2 = new StringBuilder(37);
                                sb2.append("Failed writing ");
                                sb2.append(charAt2);
                                sb2.append(" at index ");
                                sb2.append(i2);
                                throw new ArrayIndexOutOfBoundsException(sb2.toString());
                            }
                            i2 = i3;
                            i4++;
                        }
                    }
                    byteBuffer.position(i2 - byteBuffer.arrayOffset());
                } catch (ArrayIndexOutOfBoundsException e) {
                    BufferOverflowException bufferOverflowException = new BufferOverflowException();
                    bufferOverflowException.initCause(e);
                    throw bufferOverflowException;
                }
            } else {
                int length2 = charSequence.length();
                while (i4 < length2) {
                    char charAt4 = charSequence.charAt(i4);
                    if (charAt4 >= 128) {
                        if (charAt4 < 2048) {
                            i = (charAt4 >>> 6) | 960;
                        } else if (charAt4 < 55296 || 57343 < charAt4) {
                            byteBuffer.put((byte) ((charAt4 >>> 12) | 480));
                            i = ((charAt4 >>> 6) & 63) | 128;
                        } else {
                            int i15 = i4 + 1;
                            if (i15 != charSequence.length()) {
                                char charAt5 = charSequence.charAt(i15);
                                if (Character.isSurrogatePair(charAt4, charAt5)) {
                                    int codePoint2 = Character.toCodePoint(charAt4, charAt5);
                                    byteBuffer.put((byte) ((codePoint2 >>> 18) | 240));
                                    byteBuffer.put((byte) (((codePoint2 >>> 12) & 63) | 128));
                                    byteBuffer.put((byte) (((codePoint2 >>> 6) & 63) | 128));
                                    byteBuffer.put((byte) ((codePoint2 & 63) | 128));
                                    i4 = i15;
                                    i4++;
                                } else {
                                    i4 = i15;
                                }
                            }
                            int i16 = i4 - 1;
                            StringBuilder sb3 = new StringBuilder(39);
                            sb3.append(str);
                            sb3.append(i16);
                            throw new IllegalArgumentException(sb3.toString());
                        }
                        byteBuffer.put((byte) i);
                        charAt4 = (charAt4 & '?') | 128;
                    }
                    byteBuffer.put((byte) charAt4);
                    i4++;
                }
            }
        } else {
            throw new ReadOnlyBufferException();
        }
    }

    public static int b(int i) {
        if (i >= 0) {
            return e(i);
        }
        return 10;
    }

    public static int b(int i, Wb wb) {
        int a2 = a(i);
        int i2 = wb.i();
        return a2 + e(i2) + i2;
    }

    public static int b(int i, String str) {
        return a(i) + a(str);
    }

    public static int b(int i, byte[] bArr) {
        return a(i) + b(bArr);
    }

    public static int b(byte[] bArr) {
        return e(bArr.length) + bArr.length;
    }

    public static int c(long j) {
        if ((-128 & j) == 0) {
            return 1;
        }
        if ((-16384 & j) == 0) {
            return 2;
        }
        if ((-2097152 & j) == 0) {
            return 3;
        }
        if ((-268435456 & j) == 0) {
            return 4;
        }
        if ((-34359738368L & j) == 0) {
            return 5;
        }
        if ((-4398046511104L & j) == 0) {
            return 6;
        }
        if ((-562949953421312L & j) == 0) {
            return 7;
        }
        if ((-72057594037927936L & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    private final void c(int i) throws IOException {
        byte b2 = (byte) i;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new Qb(this.a.position(), this.a.limit());
    }

    private final void d(int i) throws IOException {
        while ((i & -128) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }

    private static int e(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) == 0) {
            return 3;
        }
        return (i & -268435456) == 0 ? 4 : 5;
    }

    public final void a() {
        if (this.a.remaining() != 0) {
            throw new IllegalStateException(String.format("Did not write as much data as expected, %s bytes remaining.", new Object[]{Integer.valueOf(this.a.remaining())}));
        }
    }

    public final void a(int i, int i2) throws IOException {
        d((i << 3) | i2);
    }

    public final void a(int i, La la) throws IOException {
        if (this.b == null) {
            this.b = M.a(this.a);
        } else {
            if (this.c != this.a.position()) {
                this.b.b(this.a.array(), this.c, this.a.position() - this.c);
            }
            M m = this.b;
            m.a(i, la);
            m.a();
            this.c = this.a.position();
        }
        this.c = this.a.position();
        M m2 = this.b;
        m2.a(i, la);
        m2.a();
        this.c = this.a.position();
    }

    public final void a(int i, Wb wb) throws IOException {
        a(i, 2);
        if (wb.a < 0) {
            wb.i();
        }
        d(wb.a);
        wb.a(this);
    }

    public final void a(int i, String str) throws IOException {
        a(i, 2);
        try {
            int e = e(str.length());
            if (e == e(str.length() * 3)) {
                int position = this.a.position();
                if (this.a.remaining() >= e) {
                    this.a.position(position + e);
                    a((CharSequence) str, this.a);
                    int position2 = this.a.position();
                    this.a.position(position);
                    d((position2 - position) - e);
                    this.a.position(position2);
                    return;
                }
                throw new Qb(position + e, this.a.limit());
            }
            d(a((CharSequence) str));
            a((CharSequence) str, this.a);
        } catch (BufferOverflowException e2) {
            Qb qb = new Qb(this.a.position(), this.a.limit());
            qb.initCause(e2);
            throw qb;
        }
    }

    public final void a(int i, boolean z) throws IOException {
        a(25, 0);
        byte b2 = z ? (byte) 1 : 0;
        if (this.a.hasRemaining()) {
            this.a.put(b2);
            return;
        }
        throw new Qb(this.a.position(), this.a.limit());
    }

    public final void a(int i, byte[] bArr) throws IOException {
        a(i, 2);
        d(bArr.length);
        int length = bArr.length;
        if (this.a.remaining() >= length) {
            this.a.put(bArr, 0, length);
            return;
        }
        throw new Qb(this.a.position(), this.a.limit());
    }

    public final void b(int i, int i2) throws IOException {
        a(i, 0);
        if (i2 >= 0) {
            d(i2);
        } else {
            b((long) i2);
        }
    }

    public final void b(int i, long j) throws IOException {
        a(i, 0);
        b(j);
    }

    public final void b(long j) throws IOException {
        while ((-128 & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }
}
