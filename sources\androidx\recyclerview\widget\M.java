package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;
import androidx.recyclerview.widget.RecyclerView.r;
import androidx.recyclerview.widget.RecyclerView.r.a;
import androidx.recyclerview.widget.RecyclerView.s;

/* compiled from: LinearSmoothScroller */
public class M extends r {
    protected final LinearInterpolator i = new LinearInterpolator();
    protected final DecelerateInterpolator j = new DecelerateInterpolator();
    protected PointF k;
    private final float l;
    protected int m = 0;
    protected int n = 0;

    public M(Context context) {
        this.l = a(context.getResources().getDisplayMetrics());
    }

    private int b(int i2, int i3) {
        int i4 = i2 - i3;
        if (i2 * i4 <= 0) {
            return 0;
        }
        return i4;
    }

    /* access modifiers changed from: protected */
    public void a(View view, s sVar, a aVar) {
        int a = a(view, i());
        int b = b(view, j());
        int d = d((int) Math.sqrt((double) ((a * a) + (b * b))));
        if (d > 0) {
            aVar.a(-a, -b, d, this.j);
        }
    }

    public int b(View view, int i2) {
        i b = b();
        if (b == null || !b.b()) {
            return 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return a(b.j(view) - layoutParams.topMargin, b.e(view) + layoutParams.bottomMargin, b.q(), b.h() - b.n(), i2);
    }

    /* access modifiers changed from: protected */
    public int d(int i2) {
        return (int) Math.ceil(((double) e(i2)) / 0.3356d);
    }

    /* access modifiers changed from: protected */
    public int e(int i2) {
        return (int) Math.ceil((double) (((float) Math.abs(i2)) * this.l));
    }

    /* access modifiers changed from: protected */
    public void f() {
    }

    /* access modifiers changed from: protected */
    public void g() {
        this.n = 0;
        this.m = 0;
        this.k = null;
    }

    /* access modifiers changed from: protected */
    public int i() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.x;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int j() {
        PointF pointF = this.k;
        if (pointF != null) {
            float f = pointF.y;
            if (f != 0.0f) {
                return f > 0.0f ? 1 : -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, s sVar, a aVar) {
        if (a() == 0) {
            h();
            return;
        }
        this.m = b(this.m, i2);
        this.n = b(this.n, i3);
        if (this.m == 0 && this.n == 0) {
            a(aVar);
        }
    }

    /* access modifiers changed from: protected */
    public float a(DisplayMetrics displayMetrics) {
        return 25.0f / ((float) displayMetrics.densityDpi);
    }

    /* access modifiers changed from: protected */
    public void a(a aVar) {
        PointF a = a(c());
        if (a == null || (a.x == 0.0f && a.y == 0.0f)) {
            aVar.a(c());
            h();
            return;
        }
        a(a);
        this.k = a;
        this.m = (int) (a.x * 10000.0f);
        this.n = (int) (a.y * 10000.0f);
        aVar.a((int) (((float) this.m) * 1.2f), (int) (((float) this.n) * 1.2f), (int) (((float) e(10000)) * 1.2f), this.i);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        if (i6 == -1) {
            return i4 - i2;
        }
        if (i6 == 0) {
            int i7 = i4 - i2;
            if (i7 > 0) {
                return i7;
            }
            int i8 = i5 - i3;
            if (i8 < 0) {
                return i8;
            }
            return 0;
        } else if (i6 == 1) {
            return i5 - i3;
        } else {
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
    }

    public int a(View view, int i2) {
        i b = b();
        if (b == null || !b.a()) {
            return 0;
        }
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return a(b.f(view) - layoutParams.leftMargin, b.i(view) + layoutParams.rightMargin, b.o(), b.r() - b.p(), i2);
    }
}
