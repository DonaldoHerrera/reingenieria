package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView.o;
import androidx.recyclerview.widget.RecyclerView.s;

/* compiled from: LayoutState */
class K {
    boolean a = true;
    int b;
    int c;
    int d;
    int e;
    int f = 0;
    int g = 0;
    boolean h;
    boolean i;

    K() {
    }

    /* access modifiers changed from: 0000 */
    public boolean a(s sVar) {
        int i2 = this.c;
        return i2 >= 0 && i2 < sVar.a();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LayoutState{mAvailable=");
        sb.append(this.b);
        sb.append(", mCurrentPosition=");
        sb.append(this.c);
        sb.append(", mItemDirection=");
        sb.append(this.d);
        sb.append(", mLayoutDirection=");
        sb.append(this.e);
        sb.append(", mStartLine=");
        sb.append(this.f);
        sb.append(", mEndLine=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    public View a(o oVar) {
        View d2 = oVar.d(this.c);
        this.c += this.d;
        return d2;
    }
}
