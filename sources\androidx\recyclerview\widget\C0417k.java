package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.k reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0417k implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ r b;

    C0417k(r rVar, ArrayList arrayList) {
        this.b = rVar;
        this.a = arrayList;
    }

    public void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.a((a) it.next());
        }
        this.a.clear();
        this.b.o.remove(this.a);
    }
}
