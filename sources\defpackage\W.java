package defpackage;

/* renamed from: W reason: default package */
/* compiled from: CircularArray */
public final class W<E> {
    private E[] a;
    private int b;
    private int c;
    private int d;

    public W() {
        this(8);
    }

    private void c() {
        E[] eArr = this.a;
        int length = eArr.length;
        int i = this.b;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 >= 0) {
            E[] eArr2 = new Object[i3];
            System.arraycopy(eArr, i, eArr2, 0, i2);
            System.arraycopy(this.a, 0, eArr2, i2, this.b);
            this.a = eArr2;
            this.b = 0;
            this.c = length;
            this.d = i3 - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public void a(E e) {
        E[] eArr = this.a;
        int i = this.c;
        eArr[i] = e;
        this.c = this.d & (i + 1);
        if (this.c == this.b) {
            c();
        }
    }

    public void b(int i) {
        if (i > 0) {
            if (i <= b()) {
                int length = this.a.length;
                int i2 = this.b;
                if (i < length - i2) {
                    length = i2 + i;
                }
                for (int i3 = this.b; i3 < length; i3++) {
                    this.a[i3] = null;
                }
                int i4 = this.b;
                int i5 = length - i4;
                int i6 = i - i5;
                this.b = this.d & (i4 + i5);
                if (i6 > 0) {
                    for (int i7 = 0; i7 < i6; i7++) {
                        this.a[i7] = null;
                    }
                    this.b = i6;
                }
                return;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public W(int i) {
        if (i < 1) {
            throw new IllegalArgumentException("capacity must be >= 1");
        } else if (i <= 1073741824) {
            if (Integer.bitCount(i) != 1) {
                i = Integer.highestOneBit(i - 1) << 1;
            }
            this.d = i - 1;
            this.a = new Object[i];
        } else {
            throw new IllegalArgumentException("capacity must be <= 2^30");
        }
    }

    public void a() {
        b(b());
    }

    public E a(int i) {
        if (i < 0 || i >= b()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return this.a[this.d & (this.b + i)];
    }

    public int b() {
        return (this.c - this.b) & this.d;
    }
}
