package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.Stack;

/* renamed from: jIa reason: default package and case insensitive filesystem */
/* compiled from: ViewUtils */
class C6700jIa implements Iterable<View> {
    /* access modifiers changed from: private */
    public Stack<View> a = new Stack<>();
    final /* synthetic */ ViewGroup b;

    C6700jIa(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public Iterator<View> iterator() {
        return new C6632iIa(this);
    }
}
