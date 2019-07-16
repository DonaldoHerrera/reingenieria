package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.d;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    final Rect d = new Rect();
    final Rect e = new Rect();
    private int f = 0;
    private int g;

    public HeaderScrollingViewBehavior() {
    }

    private static int c(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public abstract View a(List<View> list);

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5 = view.getLayoutParams().height;
        if (i5 == -1 || i5 == -2) {
            View a = a(coordinatorLayout.b(view));
            if (a != null) {
                if (!C1778vc.i(a) || C1778vc.i(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C1778vc.a(view, true);
                    if (C1778vc.i(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                coordinatorLayout.a(view, i, i2, MeasureSpec.makeMeasureSpec((size - a.getMeasuredHeight()) + c(a), i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    public float b(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a = a(coordinatorLayout.b(view));
        if (a != null) {
            d dVar = (d) view.getLayoutParams();
            Rect rect = this.d;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, a.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            Ic lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1778vc.i(coordinatorLayout) && !C1778vc.i(view)) {
                rect.left += lastWindowInsets.c();
                rect.right -= lastWindowInsets.d();
            }
            Rect rect2 = this.e;
            C0287Zb.a(c(dVar.c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int a2 = a(a);
            view.layout(rect2.left, rect2.top - a2, rect2.right, rect2.bottom - a2);
            this.f = rect2.top - a.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.f = 0;
    }

    /* access modifiers changed from: 0000 */
    public int c(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    public final int d() {
        return this.f;
    }

    public final int c() {
        return this.g;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: 0000 */
    public final int a(View view) {
        if (this.g == 0) {
            return 0;
        }
        float b = b(view);
        int i = this.g;
        return C1598pb.a((int) (b * ((float) i)), 0, i);
    }

    public final void b(int i) {
        this.g = i;
    }
}
