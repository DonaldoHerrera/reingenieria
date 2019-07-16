package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.h reason: case insensitive filesystem */
/* compiled from: BatchingListUpdateCallback */
public class C0414h implements O {
    final O a;
    int b = 0;
    int c = -1;
    int d = -1;
    Object e = null;

    public C0414h(O o) {
        this.a = o;
    }

    public void a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.a(this.c, this.d);
            } else if (i == 2) {
                this.a.b(this.c, this.d);
            } else if (i == 3) {
                this.a.a(this.c, this.d, this.e);
            }
            this.e = null;
            this.b = 0;
        }
    }

    public void b(int i, int i2) {
        if (this.b == 2) {
            int i3 = this.c;
            if (i3 >= i && i3 <= i + i2) {
                this.d += i2;
                this.c = i;
                return;
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 2;
    }

    public void c(int i, int i2) {
        a();
        this.a.c(i, i2);
    }

    public void a(int i, int i2) {
        if (this.b == 1) {
            int i3 = this.c;
            if (i >= i3) {
                int i4 = this.d;
                if (i <= i3 + i4) {
                    this.d = i4 + i2;
                    this.c = Math.min(i, i3);
                    return;
                }
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.b = 1;
    }

    public void a(int i, int i2, Object obj) {
        if (this.b == 3) {
            int i3 = this.c;
            int i4 = this.d;
            if (i <= i3 + i4) {
                int i5 = i + i2;
                if (i5 >= i3 && this.e == obj) {
                    int i6 = i4 + i3;
                    this.c = Math.min(i, i3);
                    this.d = Math.max(i6, i5) - this.c;
                    return;
                }
            }
        }
        a();
        this.c = i;
        this.d = i2;
        this.e = obj;
        this.b = 3;
    }
}
