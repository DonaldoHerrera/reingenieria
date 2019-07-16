package com.soundcloud.android.view.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class LockableBottomSheetBehavior<V extends View> extends BottomSheetBehavior<V> {
    private boolean A;

    public static class a {
        public <V extends View> LockableBottomSheetBehavior<V> a(V v) {
            BottomSheetBehavior b = BottomSheetBehavior.b(v);
            if (b instanceof LockableBottomSheetBehavior) {
                return (LockableBottomSheetBehavior) b;
            }
            throw new IllegalArgumentException("The view is not associated with LockableBottomSheetBehavior");
        }
    }

    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return !this.A && super.a(coordinatorLayout, v, motionEvent);
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        return !this.A && super.b(coordinatorLayout, v, motionEvent);
    }

    public void d(CoordinatorLayout coordinatorLayout, V v, View view) {
        if (!this.A) {
            super.d(coordinatorLayout, v, view);
        }
    }

    public LockableBottomSheetBehavior() {
    }

    public void a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int[] iArr) {
        if (!this.A) {
            super.a(coordinatorLayout, v, view, i, i2, iArr);
        }
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return !this.A && super.b(coordinatorLayout, v, view, view2, i);
    }

    public void d(boolean z) {
        this.A = z;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, View view, float f, float f2) {
        return !this.A && super.a(coordinatorLayout, v, view, f, f2);
    }
}
