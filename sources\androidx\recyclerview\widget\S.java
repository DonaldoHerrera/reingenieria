package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: OrientationHelper */
class S extends T {
    S(i iVar) {
        super(iVar, null);
    }

    public int a() {
        return this.a.h();
    }

    public int b() {
        return this.a.h() - this.a.n();
    }

    public int c(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return this.a.h(view) + layoutParams.leftMargin + layoutParams.rightMargin;
    }

    public int d(View view) {
        return this.a.j(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
    }

    public int e(View view) {
        this.a.a(view, true, this.c);
        return this.c.bottom;
    }

    public int f() {
        return this.a.q();
    }

    public int g() {
        return (this.a.h() - this.a.q()) - this.a.n();
    }

    public void a(int i) {
        this.a.f(i);
    }

    public int b(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        return this.a.g(view) + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public int f(View view) {
        this.a.a(view, true, this.c);
        return this.c.top;
    }

    public int a(View view) {
        return this.a.e(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }

    public int c() {
        return this.a.n();
    }

    public int d() {
        return this.a.i();
    }

    public int e() {
        return this.a.s();
    }
}
