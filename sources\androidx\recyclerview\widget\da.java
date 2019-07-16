package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.i;

/* compiled from: RecyclerView */
class da implements b {
    final /* synthetic */ i a;

    da(i iVar) {
        this.a = iVar;
    }

    public View a(int i) {
        return this.a.d(i);
    }

    public int b() {
        return this.a.h() - this.a.n();
    }

    public int a() {
        return this.a.q();
    }

    public int a(View view) {
        return this.a.j(view) - ((LayoutParams) view.getLayoutParams()).topMargin;
    }

    public int b(View view) {
        return this.a.e(view) + ((LayoutParams) view.getLayoutParams()).bottomMargin;
    }
}
