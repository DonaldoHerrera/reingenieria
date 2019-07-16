package androidx.recyclerview.widget;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.j reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0416j implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ r b;

    C0416j(r rVar, ArrayList arrayList) {
        this.b = rVar;
        this.a = arrayList;
    }

    public void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            this.b.b(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e);
        }
        this.a.clear();
        this.b.n.remove(this.a);
    }
}
