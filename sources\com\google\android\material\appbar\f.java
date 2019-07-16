package com.google.android.material.appbar;

import android.view.View;

/* compiled from: ViewOffsetHelper */
class f {
    private final View a;
    private int b;
    private int c;
    private int d;
    private int e;

    public f(View view) {
        this.a = view;
    }

    private void d() {
        View view = this.a;
        C1778vc.d(view, this.d - (view.getTop() - this.b));
        View view2 = this.a;
        C1778vc.c(view2, this.e - (view2.getLeft() - this.c));
    }

    public boolean a(int i) {
        if (this.e == i) {
            return false;
        }
        this.e = i;
        d();
        return true;
    }

    public boolean b(int i) {
        if (this.d == i) {
            return false;
        }
        this.d = i;
        d();
        return true;
    }

    public void c() {
        this.b = this.a.getTop();
        this.c = this.a.getLeft();
        d();
    }

    public int a() {
        return this.b;
    }

    public int b() {
        return this.d;
    }
}
