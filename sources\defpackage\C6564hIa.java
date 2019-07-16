package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* renamed from: hIa reason: default package and case insensitive filesystem */
/* compiled from: ViewUtils */
class C6564hIa implements Iterable<View> {
    /* access modifiers changed from: private */
    public final int a = this.b.getChildCount();
    final /* synthetic */ ViewGroup b;

    C6564hIa(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    public Iterator<View> iterator() {
        return new C6496gIa(this);
    }
}
