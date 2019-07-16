package com.google.android.material.behavior;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior.a;

/* compiled from: SwipeDismissBehavior */
class b extends a {
    private int a;
    private int b = -1;
    final /* synthetic */ SwipeDismissBehavior c;

    b(SwipeDismissBehavior swipeDismissBehavior) {
        this.c = swipeDismissBehavior;
    }

    public void a(View view, int i) {
        this.b = i;
        this.a = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public boolean b(View view, int i) {
        return this.b == -1 && this.c.a(view);
    }

    public void c(int i) {
        a aVar = this.c.b;
        if (aVar != null) {
            aVar.a(i);
        }
    }

    public int b(View view, int i, int i2) {
        return view.getTop();
    }

    public void a(View view, float f, float f2) {
        boolean z;
        int i;
        this.b = -1;
        int width = view.getWidth();
        if (a(view, f)) {
            int left = view.getLeft();
            int i2 = this.a;
            i = left < i2 ? i2 - width : i2 + width;
            z = true;
        } else {
            i = this.a;
            z = false;
        }
        if (this.c.a.d(i, view.getTop())) {
            C1778vc.a(view, (Runnable) new b(view, z));
        } else if (z) {
            a aVar = this.c.b;
            if (aVar != null) {
                aVar.a(view);
            }
        }
    }

    private boolean a(View view, float f) {
        boolean z = false;
        int i = (f > 0.0f ? 1 : (f == 0.0f ? 0 : -1));
        if (i != 0) {
            boolean z2 = C1778vc.l(view) == 1;
            int i2 = this.c.f;
            if (i2 == 2) {
                return true;
            }
            if (i2 == 0) {
                return z2 ? z : z;
                z = true;
            }
            if (i2 == 1) {
                if (z2) {
                }
                z = true;
            }
            return z;
        }
        if (Math.abs(view.getLeft() - this.a) >= Math.round(((float) view.getWidth()) * this.c.g)) {
            z = true;
        }
        return z;
    }

    public int a(View view) {
        return view.getWidth();
    }

    public int a(View view, int i, int i2) {
        int i3;
        int i4;
        int width;
        boolean z = C1778vc.l(view) == 1;
        int i5 = this.c.f;
        if (i5 != 0) {
            if (i5 != 1) {
                i3 = this.a - view.getWidth();
                i4 = view.getWidth() + this.a;
            } else if (z) {
                i3 = this.a;
                width = view.getWidth();
            } else {
                i3 = this.a - view.getWidth();
                i4 = this.a;
            }
            return SwipeDismissBehavior.a(i3, i, i4);
        } else if (z) {
            i3 = this.a - view.getWidth();
            i4 = this.a;
            return SwipeDismissBehavior.a(i3, i, i4);
        } else {
            i3 = this.a;
            width = view.getWidth();
        }
        i4 = width + i3;
        return SwipeDismissBehavior.a(i3, i, i4);
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        float width = ((float) this.a) + (((float) view.getWidth()) * this.c.h);
        float width2 = ((float) this.a) + (((float) view.getWidth()) * this.c.i);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(SwipeDismissBehavior.a(0.0f, 1.0f - SwipeDismissBehavior.b(width, width2, f), 1.0f));
        }
    }
}
