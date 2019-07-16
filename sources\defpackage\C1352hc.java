package defpackage;

import android.view.View;
import android.view.ViewParent;

/* renamed from: hc reason: default package and case insensitive filesystem */
/* compiled from: NestedScrollingChildHelper */
public class C1352hc {
    private ViewParent a;
    private ViewParent b;
    private final View c;
    private boolean d;
    private int[] e;

    public C1352hc(View view) {
        this.c = view;
    }

    private ViewParent d(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public void a(boolean z) {
        if (this.d) {
            C1778vc.H(this.c);
        }
        this.d = z;
    }

    public boolean b() {
        return this.d;
    }

    public void c() {
        c(0);
    }

    public boolean b(int i) {
        return a(i, 0);
    }

    public void c(int i) {
        ViewParent d2 = d(i);
        if (d2 != null) {
            Bc.a(d2, this.c, i);
            a(i, (ViewParent) null);
        }
    }

    private boolean b(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (b()) {
            ViewParent d2 = d(i5);
            if (d2 == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr4 != null) {
                    this.c.getLocationInWindow(iArr4);
                    i7 = iArr4[0];
                    i6 = iArr4[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                if (iArr2 == null) {
                    int[] d3 = d();
                    d3[0] = 0;
                    d3[1] = 0;
                    iArr3 = d3;
                } else {
                    iArr3 = iArr2;
                }
                Bc.a(d2, this.c, i, i2, i3, i4, i5, iArr3);
                if (iArr4 != null) {
                    this.c.getLocationInWindow(iArr4);
                    iArr4[0] = iArr4[0] - i7;
                    iArr4[1] = iArr4[1] - i6;
                }
                return true;
            } else if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
        }
        return false;
    }

    private int[] d() {
        if (this.e == null) {
            this.e = new int[2];
        }
        return this.e;
    }

    public boolean a() {
        return a(0);
    }

    public boolean a(int i) {
        return d(i) != null;
    }

    public boolean a(int i, int i2) {
        if (a(i2)) {
            return true;
        }
        if (b()) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                if (Bc.b(parent, view, this.c, i, i2)) {
                    a(i2, parent);
                    Bc.a(parent, view, this.c, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr) {
        return b(i, i2, i3, i4, iArr, 0, null);
    }

    public boolean a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        return b(i, i2, i3, i4, iArr, i5, null);
    }

    public void a(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        b(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2) {
        return a(i, i2, iArr, iArr2, 0);
    }

    public boolean a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (b()) {
            ViewParent d2 = d(i3);
            if (d2 == null) {
                return false;
            }
            boolean z = true;
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.c.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    iArr = d();
                }
                iArr[0] = 0;
                iArr[1] = 0;
                Bc.a(d2, this.c, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.c.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    z = false;
                }
                return z;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    public boolean a(float f, float f2, boolean z) {
        if (b()) {
            ViewParent d2 = d(0);
            if (d2 != null) {
                return Bc.a(d2, this.c, f, f2, z);
            }
        }
        return false;
    }

    public boolean a(float f, float f2) {
        if (b()) {
            ViewParent d2 = d(0);
            if (d2 != null) {
                return Bc.a(d2, this.c, f, f2);
            }
        }
        return false;
    }

    private void a(int i, ViewParent viewParent) {
        if (i == 0) {
            this.a = viewParent;
        } else if (i == 1) {
            this.b = viewParent;
        }
    }
}
