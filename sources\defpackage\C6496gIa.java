package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: gIa reason: default package and case insensitive filesystem */
/* compiled from: ViewUtils */
class C6496gIa implements Iterator<View> {
    int a = 0;
    final /* synthetic */ C6564hIa b;

    C6496gIa(C6564hIa hia) {
        this.b = hia;
    }

    public boolean hasNext() {
        return this.a < this.b.a;
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public View next() {
        ViewGroup viewGroup = this.b.b;
        int i = this.a;
        this.a = i + 1;
        return viewGroup.getChildAt(i);
    }
}
