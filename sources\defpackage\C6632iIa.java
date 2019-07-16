package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: iIa reason: default package and case insensitive filesystem */
/* compiled from: ViewUtils */
class C6632iIa implements Iterator<View> {
    final /* synthetic */ C6700jIa a;

    C6632iIa(C6700jIa jia) {
        this.a = jia;
        a(this.a.b);
    }

    private void a(ViewGroup viewGroup) {
        for (View push : C6768kIa.c(viewGroup)) {
            this.a.a.push(push);
        }
    }

    public boolean hasNext() {
        return !this.a.a.empty();
    }

    public void remove() {
        throw new UnsupportedOperationException();
    }

    public View next() {
        View view = (View) this.a.a.pop();
        if (view instanceof ViewGroup) {
            a((ViewGroup) view);
        }
        return view;
    }
}
