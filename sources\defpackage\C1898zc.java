package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: zc reason: default package and case insensitive filesystem */
/* compiled from: ViewGroup.kt */
public final class C1898zc implements Iterator<View>, PYa {
    private int a;
    final /* synthetic */ ViewGroup b;

    C1898zc(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public boolean hasNext() {
        return this.a < this.b.getChildCount();
    }

    public void remove() {
        ViewGroup viewGroup = this.b;
        this.a--;
        viewGroup.removeViewAt(this.a);
    }

    public View next() {
        ViewGroup viewGroup = this.b;
        int i = this.a;
        this.a = i + 1;
        View childAt = viewGroup.getChildAt(i);
        if (childAt != null) {
            return childAt;
        }
        throw new IndexOutOfBoundsException();
    }
}
