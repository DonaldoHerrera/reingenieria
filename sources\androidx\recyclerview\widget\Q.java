package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: OrientationHelper */
class Q extends T {
    Q(i iVar) {
        super(iVar, null);
    }

    public int a() {
        return this.a.r();
    }

    public int b() {
        return this.a.r() - this.a.p();
    }

    public int c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return this.a.g(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int d(View view) {
        return this.a.f(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
    }

    public int e(View view) {
        this.a.a(view, true, this.c);
        return this.c.right;
    }

    public int f() {
        return this.a.o();
    }

    public int g() {
        return (this.a.r() - this.a.o()) - this.a.p();
    }

    public void a(int i) {
        this.a.e(i);
    }

    public int b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return this.a.h(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public int f(View view) {
        this.a.a(view, true, this.c);
        return this.c.left;
    }

    public int a(View view) {
        return this.a.i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
    }

    public int c() {
        return this.a.p();
    }

    public int d() {
        return this.a.s();
    }

    public int e() {
        return this.a.i();
    }
}
