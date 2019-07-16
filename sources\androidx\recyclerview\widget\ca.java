package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: RecyclerView */
class ca implements b {
    final /* synthetic */ i a;

    ca(i iVar) {
        this.a = iVar;
    }

    public View a(int i) {
        return this.a.d(i);
    }

    public int b() {
        return this.a.r() - this.a.p();
    }

    public int a() {
        return this.a.o();
    }

    public int b(View view) {
        return this.a.i(view) + ((LayoutParams) view.getLayoutParams()).rightMargin;
    }

    public int a(View view) {
        return this.a.f(view) - ((LayoutParams) view.getLayoutParams()).leftMargin;
    }
}
