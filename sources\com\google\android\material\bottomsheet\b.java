package com.google.android.material.bottomsheet;

import android.view.View;
import java.lang.ref.WeakReference;

/* compiled from: BottomSheetBehavior */
class b extends a {
    final /* synthetic */ BottomSheetBehavior a;

    b(BottomSheetBehavior bottomSheetBehavior) {
        this.a = bottomSheetBehavior;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        this.a.a(i2);
    }

    public boolean b(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        int i2 = bottomSheetBehavior.l;
        boolean z = true;
        if (i2 == 1 || bottomSheetBehavior.x) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.v == i) {
            View view2 = (View) bottomSheetBehavior.s.get();
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        WeakReference<V> weakReference = this.a.r;
        if (weakReference == null || weakReference.get() != view) {
            z = false;
        }
        return z;
    }

    public void c(int i) {
        if (i == 1) {
            this.a.d(1);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    public void a(View view, float f, float f2) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = 4;
        if (f2 >= 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.a;
            if (bottomSheetBehavior.j && bottomSheetBehavior.a(view, f2) && (view.getTop() > this.a.i || Math.abs(f) < Math.abs(f2))) {
                i = this.a.q;
                i5 = 5;
                if (!this.a.m.d(view.getLeft(), i)) {
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top = view.getTop();
                if (!this.a.a) {
                    BottomSheetBehavior bottomSheetBehavior2 = this.a;
                    int i6 = bottomSheetBehavior2.h;
                    if (top < i6) {
                        if (top >= Math.abs(top - bottomSheetBehavior2.i)) {
                            i2 = this.a.h;
                        }
                        i = 0;
                    } else if (Math.abs(top - i6) < Math.abs(top - this.a.i)) {
                        i2 = this.a.h;
                    } else {
                        i4 = this.a.i;
                    }
                    i3 = i2;
                    i5 = 6;
                    if (!this.a.m.d(view.getLeft(), i)) {
                    }
                } else if (Math.abs(top - this.a.g) < Math.abs(top - this.a.i)) {
                    i = this.a.g;
                } else {
                    i4 = this.a.i;
                }
                i = i4;
                if (!this.a.m.d(view.getLeft(), i)) {
                }
            } else {
                i = this.a.i;
                if (!this.a.m.d(view.getLeft(), i)) {
                }
            }
        } else if (this.a.a) {
            i = this.a.g;
        } else {
            int top2 = view.getTop();
            int i7 = this.a.h;
            if (top2 > i7) {
                i3 = i7;
                i5 = 6;
                if (!this.a.m.d(view.getLeft(), i)) {
                    this.a.d(2);
                    C1778vc.a(view, (Runnable) new b(view, i5));
                    return;
                }
                this.a.d(i5);
                return;
            }
            i = 0;
        }
        i5 = 3;
        if (!this.a.m.d(view.getLeft(), i)) {
        }
    }

    public int b(View view, int i, int i2) {
        int b = this.a.e();
        BottomSheetBehavior bottomSheetBehavior = this.a;
        return C1598pb.a(i, b, bottomSheetBehavior.j ? bottomSheetBehavior.q : bottomSheetBehavior.i);
    }

    public int b(View view) {
        BottomSheetBehavior bottomSheetBehavior = this.a;
        if (bottomSheetBehavior.j) {
            return bottomSheetBehavior.q;
        }
        return bottomSheetBehavior.i;
    }

    public int a(View view, int i, int i2) {
        return view.getLeft();
    }
}
