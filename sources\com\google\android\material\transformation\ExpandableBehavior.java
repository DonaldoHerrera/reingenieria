package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {
    /* access modifiers changed from: private */
    public int a = 0;

    public ExpandableBehavior() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(View view, View view2, boolean z, boolean z2);

    public boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Rz rz = (Rz) view2;
        if (!a(rz.a())) {
            return false;
        }
        this.a = rz.a() ? 1 : 2;
        return a((View) rz, view, rz.a(), true);
    }

    /* access modifiers changed from: protected */
    public Rz e(CoordinatorLayout coordinatorLayout, View view) {
        List b = coordinatorLayout.b(view);
        int size = b.size();
        for (int i = 0; i < size; i++) {
            View view2 = (View) b.get(i);
            if (a(coordinatorLayout, view, view2)) {
                return (Rz) view2;
            }
        }
        return null;
    }

    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        if (!C1778vc.B(view)) {
            Rz e = e(coordinatorLayout, view);
            if (e != null && a(e.a())) {
                this.a = e.a() ? 1 : 2;
                view.getViewTreeObserver().addOnPreDrawListener(new a(this, view, this.a, e));
            }
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private boolean a(boolean z) {
        boolean z2 = false;
        if (z) {
            int i = this.a;
            if (i == 0 || i == 2) {
                z2 = true;
            }
            return z2;
        }
        if (this.a == 1) {
            z2 = true;
        }
        return z2;
    }
}
