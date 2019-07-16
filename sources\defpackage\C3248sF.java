package defpackage;

import java.util.Arrays;

/* renamed from: sF reason: default package and case insensitive filesystem */
/* compiled from: BitArray */
public final class C3248sF implements Cloneable {
    private int[] a;
    private int b;

    public C3248sF() {
        this.b = 0;
        this.a = new int[1];
    }

    private void b(int i) {
        if (i > (this.a.length << 5)) {
            int[] c = c(i);
            int[] iArr = this.a;
            System.arraycopy(iArr, 0, c, 0, iArr.length);
            this.a = c;
        }
    }

    private static int[] c(int i) {
        return new int[((i + 31) / 32)];
    }

    public boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3248sF)) {
            return false;
        }
        C3248sF sFVar = (C3248sF) obj;
        if (this.b != sFVar.b || !Arrays.equals(this.a, sFVar.a)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public int i() {
        return this.b;
    }

    public int j() {
        return (this.b + 7) / 8;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    public void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public C3248sF clone() {
        return new C3248sF((int[]) this.a.clone(), this.b);
    }

    C3248sF(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public void b(C3248sF sFVar) {
        if (this.b == sFVar.b) {
            int i = 0;
            while (true) {
                int[] iArr = this.a;
                if (i < iArr.length) {
                    iArr[i] = iArr[i] ^ sFVar.a[i];
                    i++;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Sizes don't match");
        }
    }

    public void a(C3248sF sFVar) {
        int i = sFVar.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(sFVar.a(i2));
        }
    }

    public void a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (a(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i2 + i5] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }
}
