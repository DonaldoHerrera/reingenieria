package defpackage;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* renamed from: Hm reason: default package */
/* compiled from: Sonic */
final class Hm {
    private final int a;
    private final int b;
    private final float c;
    private final float d;
    private final float e;
    private final int f;
    private final int g;
    private final int h = (this.g * 2);
    private final short[] i;
    private short[] j;
    private int k;
    private short[] l;
    private int m;
    private short[] n;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public Hm(int i2, int i3, float f2, float f3, int i4) {
        this.a = i2;
        this.b = i3;
        this.c = f2;
        this.d = f3;
        this.e = ((float) i2) / ((float) i4);
        this.f = i2 / 400;
        this.g = i2 / 65;
        int i5 = this.h;
        this.i = new short[i5];
        this.j = new short[(i5 * i3)];
        this.l = new short[(i5 * i3)];
        this.n = new short[(i5 * i3)];
    }

    private void d(int i2) {
        int i3 = this.k - i2;
        short[] sArr = this.j;
        int i4 = this.b;
        System.arraycopy(sArr, i2 * i4, sArr, 0, i4 * i3);
        this.k = i3;
    }

    public void a(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.b, this.m);
        shortBuffer.put(this.l, 0, this.b * min);
        this.m -= min;
        short[] sArr = this.l;
        int i2 = this.b;
        System.arraycopy(sArr, min * i2, sArr, 0, this.m * i2);
    }

    public void b(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i2 = this.b;
        int i3 = remaining / i2;
        int i4 = i2 * i3 * 2;
        this.j = c(this.j, this.k, i3);
        shortBuffer.get(this.j, this.k * this.b, i4 / 2);
        this.k += i3;
        d();
    }

    public void c() {
        int i2;
        int i3 = this.k;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = this.e * f3;
        int i4 = this.m + ((int) ((((((float) i3) / (f2 / f3)) + ((float) this.o)) / f4) + 0.5f));
        this.j = c(this.j, i3, (this.h * 2) + i3);
        int i5 = 0;
        while (true) {
            i2 = this.h;
            int i6 = i2 * 2;
            int i7 = this.b;
            if (i5 >= i6 * i7) {
                break;
            }
            this.j[(i7 * i3) + i5] = 0;
            i5++;
        }
        this.k += i2 * 2;
        d();
        if (this.m > i4) {
            this.m = i4;
        }
        this.k = 0;
        this.r = 0;
        this.o = 0;
    }

    private void d() {
        int i2 = this.m;
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 / f3;
        float f5 = this.e * f3;
        double d2 = (double) f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            a(f4);
        } else {
            a(this.j, 0, this.k);
            this.k = 0;
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }

    public void a() {
        this.k = 0;
        this.m = 0;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    public int b() {
        return this.m;
    }

    private void b(short[] sArr, int i2, int i3) {
        int i4 = this.h / i3;
        int i5 = this.b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.i[i8] = (short) (i9 / i6);
        }
    }

    private void b(int i2) {
        int i3 = this.m - i2;
        this.n = c(this.n, this.o, i3);
        short[] sArr = this.l;
        int i4 = this.b;
        System.arraycopy(sArr, i2 * i4, this.n, this.o * i4, i4 * i3);
        this.m = i2;
        this.o += i3;
    }

    private void a(short[] sArr, int i2, int i3) {
        this.l = c(this.l, this.m, i3);
        int i4 = this.b;
        System.arraycopy(sArr, i2 * i4, this.l, this.m * i4, i4 * i3);
        this.m += i3;
    }

    private short[] c(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.b;
        int i5 = length / i4;
        if (i2 + i3 <= i5) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    private short b(short[] sArr, int i2, int i3, int i4) {
        short s2 = sArr[i2];
        short s3 = sArr[i2 + this.b];
        int i5 = this.q * i3;
        int i6 = this.p;
        int i7 = i6 * i4;
        int i8 = (i6 + 1) * i4;
        int i9 = i8 - i5;
        int i10 = i8 - i7;
        return (short) (((s2 * i9) + ((i10 - i9) * s3)) / i10);
    }

    private int a(int i2) {
        int min = Math.min(this.h, this.r);
        a(this.j, i2, min);
        this.r -= min;
        return min;
    }

    private void c(int i2) {
        if (i2 != 0) {
            short[] sArr = this.n;
            int i3 = this.b;
            System.arraycopy(sArr, i2 * i3, sArr, 0, (this.o - i2) * i3);
            this.o -= i2;
        }
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.b;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i7 < i6 * i3) {
                i7 = i3;
                i6 = i10;
            }
            if (i10 * i9 > i8 * i3) {
                i9 = i3;
                i8 = i10;
            }
            i3++;
        }
        this.u = i6 / i7;
        this.v = i8 / i9;
        return i7;
    }

    private int b(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 >= 2.0f) {
            i4 = (int) (((float) i3) / (f2 - 1.0f));
        } else {
            this.r = (int) ((((float) i3) * (2.0f - f2)) / (f2 - 1.0f));
            i4 = i3;
        }
        this.l = c(this.l, this.m, i4);
        a(i4, this.b, this.l, this.m, sArr, i2, sArr, i2 + i3);
        this.m += i4;
        return i4;
    }

    private boolean a(int i2, int i3) {
        if (i2 == 0 || this.s == 0 || i3 > i2 * 3 || i2 * 2 <= this.t * 3) {
            return false;
        }
        return true;
    }

    private int a(short[] sArr, int i2) {
        int i3;
        int i4 = this.a;
        int i5 = i4 > 4000 ? i4 / 4000 : 1;
        if (this.b == 1 && i5 == 1) {
            i3 = a(sArr, i2, this.f, this.g);
        } else {
            b(sArr, i2, i5);
            int a2 = a(this.i, 0, this.f / i5, this.g / i5);
            if (i5 != 1) {
                int i6 = a2 * i5;
                int i7 = i5 * 4;
                int i8 = i6 - i7;
                int i9 = i6 + i7;
                int i10 = this.f;
                if (i8 >= i10) {
                    i10 = i8;
                }
                int i11 = this.g;
                if (i9 > i11) {
                    i9 = i11;
                }
                if (this.b == 1) {
                    i3 = a(sArr, i2, i10, i9);
                } else {
                    b(sArr, i2, 1);
                    i3 = a(this.i, 0, i10, i9);
                }
            } else {
                i3 = a2;
            }
        }
        int i12 = a(this.u, this.v) ? this.s : i3;
        this.t = this.u;
        this.s = i3;
        return i12;
    }

    private void a(float f2, int i2) {
        int i3;
        int i4;
        if (this.m != i2) {
            int i5 = this.a;
            int i6 = (int) (((float) i5) / f2);
            while (true) {
                if (i6 <= 16384 && i5 <= 16384) {
                    break;
                }
                i6 /= 2;
                i5 /= 2;
            }
            b(i2);
            int i7 = 0;
            while (true) {
                int i8 = this.o;
                boolean z = true;
                if (i7 < i8 - 1) {
                    while (true) {
                        i3 = this.p;
                        int i9 = (i3 + 1) * i6;
                        i4 = this.q;
                        if (i9 <= i4 * i5) {
                            break;
                        }
                        this.l = c(this.l, this.m, 1);
                        int i10 = 0;
                        while (true) {
                            int i11 = this.b;
                            if (i10 >= i11) {
                                break;
                            }
                            this.l[(this.m * i11) + i10] = b(this.n, (i11 * i7) + i10, i5, i6);
                            i10++;
                        }
                        this.q++;
                        this.m++;
                    }
                    this.p = i3 + 1;
                    if (this.p == i5) {
                        this.p = 0;
                        if (i4 != i6) {
                            z = false;
                        }
                        C1852xq.b(z);
                        this.q = 0;
                    }
                    i7++;
                } else {
                    c(i8 - 1);
                    return;
                }
            }
        }
    }

    private int a(short[] sArr, int i2, float f2, int i3) {
        int i4;
        if (f2 < 0.5f) {
            i4 = (int) ((((float) i3) * f2) / (1.0f - f2));
        } else {
            this.r = (int) ((((float) i3) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
            i4 = i3;
        }
        int i5 = i3 + i4;
        this.l = c(this.l, this.m, i5);
        int i6 = this.b;
        System.arraycopy(sArr, i2 * i6, this.l, this.m * i6, i6 * i3);
        a(i4, this.b, this.l, this.m + i3, sArr, i2 + i3, sArr, i2);
        this.m += i5;
        return i4;
    }

    private void a(float f2) {
        int a2;
        int i2 = this.k;
        if (i2 >= this.h) {
            int i3 = 0;
            do {
                if (this.r > 0) {
                    a2 = a(i3);
                } else {
                    int a3 = a(this.j, i3);
                    if (((double) f2) > 1.0d) {
                        a2 = a3 + b(this.j, i3, f2, a3);
                    } else {
                        a2 = a(this.j, i3, f2, a3);
                    }
                }
                i3 += a2;
            } while (this.h + i3 <= i2);
            d(i3);
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }
}
