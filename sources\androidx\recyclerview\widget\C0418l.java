package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: androidx.recyclerview.widget.l reason: case insensitive filesystem */
/* compiled from: DefaultItemAnimator */
class C0418l implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ r b;

    C0418l(r rVar, ArrayList arrayList) {
        this.b = rVar;
        this.a = arrayList;
    }

    public void run() {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            this.b.t((ViewHolder) it.next());
        }
        this.a.clear();
        this.b.m.remove(this.a);
    }
}
