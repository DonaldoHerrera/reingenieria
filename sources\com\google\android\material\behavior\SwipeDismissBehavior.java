package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior;

public class SwipeDismissBehavior<V extends View> extends Behavior<V> {
    Zc a;
    a b;
    private boolean c;
    private float d = 0.0f;
    private boolean e;
    int f = 2;
    float g = 0.5f;
    float h = 0.0f;
    float i = 0.5f;
    private final defpackage.Zc.a j = new b(this);

    public interface a {
        void a(int i);

        void a(View view);
    }

    private class b implements Runnable {
        private final View a;
        private final boolean b;

        b(View view, boolean z) {
            this.a = view;
            this.b = z;
        }

        public void run() {
            Zc zc = SwipeDismissBehavior.this.a;
            if (zc != null && zc.a(true)) {
                C1778vc.a(this.a, (Runnable) this);
            } else if (this.b) {
                a aVar = SwipeDismissBehavior.this.b;
                if (aVar != null) {
                    aVar.a(this.a);
                }
            }
        }
    }

    static float b(float f2, float f3, float f4) {
        return (f4 - f2) / (f3 - f2);
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public boolean a(View view) {
        return true;
    }

    public void b(float f2) {
        this.h = a(0.0f, f2, 1.0f);
    }

    public void a(int i2) {
        this.f = i2;
    }

    public boolean b(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        Zc zc = this.a;
        if (zc == null) {
            return false;
        }
        zc.a(motionEvent);
        return true;
    }

    public void a(float f2) {
        this.i = a(0.0f, f2, 1.0f);
    }

    public boolean a(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.c = coordinatorLayout.a((View) v, (int) motionEvent.getX(), (int) motionEvent.getY());
            z = this.c;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.c = false;
        }
        if (!z) {
            return false;
        }
        a((ViewGroup) coordinatorLayout);
        return this.a.b(motionEvent);
    }

    private void a(ViewGroup viewGroup) {
        Zc zc;
        if (this.a == null) {
            if (this.e) {
                zc = Zc.a(viewGroup, this.d, this.j);
            } else {
                zc = Zc.a(viewGroup, this.j);
            }
            this.a = zc;
        }
    }

    static float a(float f2, float f3, float f4) {
        return Math.min(Math.max(f2, f3), f4);
    }

    static int a(int i2, int i3, int i4) {
        return Math.min(Math.max(i2, i3), i4);
    }
}
