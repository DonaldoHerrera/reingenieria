package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.d;

/* compiled from: ItemTouchHelper */
class D implements d {
    final /* synthetic */ G a;

    D(G g) {
        this.a = g;
    }

    public int a(int i, int i2) {
        G g = this.a;
        View view = g.x;
        if (view == null) {
            return i2;
        }
        int i3 = g.y;
        if (i3 == -1) {
            i3 = g.r.indexOfChild(view);
            this.a.y = i3;
        }
        if (i2 == i - 1) {
            return i3;
        }
        if (i2 >= i3) {
            i2++;
        }
        return i2;
    }
}
