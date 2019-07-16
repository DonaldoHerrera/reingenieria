package defpackage;

import java.util.Arrays;

/* renamed from: tF reason: default package and case insensitive filesystem */
/* compiled from: BitMatrix */
public final class C3268tF implements Cloneable {
    private final int a;
    private final int b;
    private final int c;
    private final int[] d;

    public C3268tF(int i) {
        this(i, i);
    }

    public boolean a(int i, int i2) {
        return ((this.d[(i2 * this.c) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void b(int i, int i2) {
        int i3 = (i2 * this.c) + (i / 32);
        int[] iArr = this.d;
        iArr[i3] = (1 << (i & 31)) | iArr[i3];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C3268tF)) {
            return false;
        }
        C3268tF tFVar = (C3268tF) obj;
        if (this.a == tFVar.a && this.b == tFVar.b && this.c == tFVar.c && Arrays.equals(this.d, tFVar.d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.a;
        return (((((((i * 31) + i) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
    }

    public void i() {
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = 0;
        }
    }

    public int j() {
        return this.b;
    }

    public int k() {
        return this.a;
    }

    public String toString() {
        return a("X ", "  ");
    }

    public C3268tF(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.a = i;
        this.b = i2;
        this.c = (i + 31) / 32;
        this.d = new int[(this.c * i2)];
    }

    public C3268tF clone() {
        return new C3268tF(this.a, this.b, this.c, (int[]) this.d.clone());
    }

    public void a(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        } else if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        } else {
            int i5 = i3 + i;
            int i6 = i4 + i2;
            if (i6 > this.b || i5 > this.a) {
                throw new IllegalArgumentException("The region must fit inside the matrix");
            }
            while (i2 < i6) {
                int i7 = this.c * i2;
                for (int i8 = i; i8 < i5; i8++) {
                    int[] iArr = this.d;
                    int i9 = (i8 / 32) + i7;
                    iArr[i9] = iArr[i9] | (1 << (i8 & 31));
                }
                i2++;
            }
        }
    }

    private C3268tF(int i, int i2, int i3, int[] iArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = iArr;
    }

    public String a(String str, String str2) {
        return a(str, str2, "\n");
    }

    private String a(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.b * (this.a + 1));
        for (int i = 0; i < this.b; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                sb.append(a(i2, i) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }
}
