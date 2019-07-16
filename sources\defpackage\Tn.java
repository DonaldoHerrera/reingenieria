package defpackage;

/* renamed from: Tn reason: default package */
/* compiled from: VorbisBitArray */
final class Tn {
    private final byte[] a;
    private final int b;
    private int c;
    private int d;

    public Tn(byte[] bArr) {
        this.a = bArr;
        this.b = bArr.length;
    }

    private void c() {
        boolean z;
        int i = this.c;
        if (i >= 0) {
            int i2 = this.b;
            if (i < i2 || (i == i2 && this.d == 0)) {
                z = true;
                C1852xq.b(z);
            }
        }
        z = false;
        C1852xq.b(z);
    }

    public int a(int i) {
        int i2 = this.c;
        int min = Math.min(i, 8 - this.d);
        int i3 = i2 + 1;
        int i4 = ((this.a[i2] & 255) >> this.d) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.a[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        b(i);
        return i5;
    }

    public boolean b() {
        boolean z = (((this.a[this.c] & 255) >> this.d) & 1) == 1;
        b(1);
        return z;
    }

    public void b(int i) {
        int i2 = i / 8;
        this.c += i2;
        this.d += i - (i2 * 8);
        int i3 = this.d;
        if (i3 > 7) {
            this.c++;
            this.d = i3 - 8;
        }
        c();
    }

    public int a() {
        return (this.c * 8) + this.d;
    }
}
