package defpackage;

import android.text.Layout.Alignment;

/* renamed from: Ap reason: default package */
/* compiled from: TtmlStyle */
final class Ap {
    private String a;
    private int b;
    private boolean c;
    private int d;
    private boolean e;
    private int f = -1;
    private int g = -1;
    private int h = -1;
    private int i = -1;
    private int j = -1;
    private float k;
    private String l;
    private Ap m;
    private Alignment n;

    public Ap a(boolean z) {
        C1852xq.b(this.m == null);
        this.h = z ? 1 : 0;
        return this;
    }

    public Ap b(boolean z) {
        C1852xq.b(this.m == null);
        this.i = z ? 1 : 0;
        return this;
    }

    public Ap c(boolean z) {
        C1852xq.b(this.m == null);
        this.f = z ? 1 : 0;
        return this;
    }

    public Ap d(boolean z) {
        C1852xq.b(this.m == null);
        this.g = z ? 1 : 0;
        return this;
    }

    public int e() {
        return this.j;
    }

    public String f() {
        return this.l;
    }

    public int g() {
        if (this.h == -1 && this.i == -1) {
            return -1;
        }
        int i2 = 0;
        int i3 = this.h == 1 ? 1 : 0;
        if (this.i == 1) {
            i2 = 2;
        }
        return i3 | i2;
    }

    public Alignment h() {
        return this.n;
    }

    public boolean i() {
        return this.e;
    }

    public boolean j() {
        return this.c;
    }

    public boolean k() {
        return this.f == 1;
    }

    public boolean l() {
        return this.g == 1;
    }

    public Ap a(String str) {
        C1852xq.b(this.m == null);
        this.a = str;
        return this;
    }

    public int b() {
        if (this.c) {
            return this.b;
        }
        throw new IllegalStateException("Font color has not been defined.");
    }

    public String c() {
        return this.a;
    }

    public float d() {
        return this.k;
    }

    public Ap c(int i2) {
        this.j = i2;
        return this;
    }

    public int a() {
        if (this.e) {
            return this.d;
        }
        throw new IllegalStateException("Background color has not been defined.");
    }

    public Ap b(int i2) {
        C1852xq.b(this.m == null);
        this.b = i2;
        this.c = true;
        return this;
    }

    public Ap a(int i2) {
        this.d = i2;
        this.e = true;
        return this;
    }

    public Ap b(String str) {
        this.l = str;
        return this;
    }

    public Ap a(Ap ap) {
        a(ap, true);
        return this;
    }

    private Ap a(Ap ap, boolean z) {
        if (ap != null) {
            if (!this.c && ap.c) {
                b(ap.b);
            }
            if (this.h == -1) {
                this.h = ap.h;
            }
            if (this.i == -1) {
                this.i = ap.i;
            }
            if (this.a == null) {
                this.a = ap.a;
            }
            if (this.f == -1) {
                this.f = ap.f;
            }
            if (this.g == -1) {
                this.g = ap.g;
            }
            if (this.n == null) {
                this.n = ap.n;
            }
            if (this.j == -1) {
                this.j = ap.j;
                this.k = ap.k;
            }
            if (z && !this.e && ap.e) {
                a(ap.d);
            }
        }
        return this;
    }

    public Ap a(Alignment alignment) {
        this.n = alignment;
        return this;
    }

    public Ap a(float f2) {
        this.k = f2;
        return this;
    }
}
