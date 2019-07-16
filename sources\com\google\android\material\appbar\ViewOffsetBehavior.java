package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

class ViewOffsetBehavior<V extends View> extends Behavior<V> {
    private f a;
    private int b = 0;
    private int c = 0;

    public ViewOffsetBehavior() {
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, int i) {
        b(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new f(v);
        }
        this.a.c();
        int i2 = this.b;
        if (i2 != 0) {
            this.a.b(i2);
            this.b = 0;
        }
        int i3 = this.c;
        if (i3 != 0) {
            this.a.a(i3);
            this.c = 0;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.c((View) v, i);
    }

    public int b() {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(int i) {
        f fVar = this.a;
        if (fVar != null) {
            return fVar.b(i);
        }
        this.b = i;
        return false;
    }
}
