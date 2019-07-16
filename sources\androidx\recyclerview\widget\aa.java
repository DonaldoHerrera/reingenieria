package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;

/* compiled from: RecyclerView */
class aa implements b {
    final /* synthetic */ RecyclerView a;

    aa(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public int a() {
        return this.a.getChildCount();
    }

    public void b() {
        int a2 = a();
        for (int i = 0; i < a2; i++) {
            View a3 = a(i);
            this.a.b(a3);
            a3.clearAnimation();
        }
        this.a.removeAllViews();
    }

    public int c(View view) {
        return this.a.indexOfChild(view);
    }

    public void d(View view) {
        ViewHolder i = RecyclerView.i(view);
        if (i != null) {
            i.onLeftHiddenState(this.a);
        }
    }

    public void a(View view, int i) {
        this.a.addView(view, i);
        this.a.a(view);
    }

    public void c(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.b(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public View a(int i) {
        return this.a.getChildAt(i);
    }

    public void a(View view, int i, LayoutParams layoutParams) {
        ViewHolder i2 = RecyclerView.i(view);
        if (i2 != null) {
            if (i2.isTmpDetached() || i2.shouldIgnore()) {
                i2.clearTmpDetachFlag();
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(i2);
                sb.append(this.a.i());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.a.attachViewToParent(view, i, layoutParams);
    }

    public ViewHolder b(View view) {
        return RecyclerView.i(view);
    }

    public void b(int i) {
        View a2 = a(i);
        if (a2 != null) {
            ViewHolder i2 = RecyclerView.i(a2);
            if (i2 != null) {
                if (!i2.isTmpDetached() || i2.shouldIgnore()) {
                    i2.addFlags(256);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("called detach on an already detached child ");
                    sb.append(i2);
                    sb.append(this.a.i());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        this.a.detachViewFromParent(i);
    }

    public void a(View view) {
        ViewHolder i = RecyclerView.i(view);
        if (i != null) {
            i.onEnteredHiddenState(this.a);
        }
    }
}
