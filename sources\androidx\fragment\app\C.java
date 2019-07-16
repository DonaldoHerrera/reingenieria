package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
class C implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ O b;
    final /* synthetic */ View c;
    final /* synthetic */ Fragment d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ ArrayList g;
    final /* synthetic */ Object h;

    C(Object obj, O o, View view, Fragment fragment, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, Object obj2) {
        this.a = obj;
        this.b = o;
        this.c = view;
        this.d = fragment;
        this.e = arrayList;
        this.f = arrayList2;
        this.g = arrayList3;
        this.h = obj2;
    }

    public void run() {
        Object obj = this.a;
        if (obj != null) {
            this.b.b(obj, this.c);
            this.f.addAll(F.a(this.b, this.a, this.d, this.e, this.c));
        }
        if (this.g != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.c);
                this.b.a(this.h, this.g, arrayList);
            }
            this.g.clear();
            this.g.add(this.c);
        }
    }
}
