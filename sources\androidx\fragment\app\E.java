package androidx.fragment.app;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransition */
class E implements Runnable {
    final /* synthetic */ O a;
    final /* synthetic */ T b;
    final /* synthetic */ Object c;
    final /* synthetic */ a d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ View f;
    final /* synthetic */ Fragment g;
    final /* synthetic */ Fragment h;
    final /* synthetic */ boolean i;
    final /* synthetic */ ArrayList j;
    final /* synthetic */ Object k;
    final /* synthetic */ Rect l;

    E(O o, T t, Object obj, a aVar, ArrayList arrayList, View view, Fragment fragment, Fragment fragment2, boolean z, ArrayList arrayList2, Object obj2, Rect rect) {
        this.a = o;
        this.b = t;
        this.c = obj;
        this.d = aVar;
        this.e = arrayList;
        this.f = view;
        this.g = fragment;
        this.h = fragment2;
        this.i = z;
        this.j = arrayList2;
        this.k = obj2;
        this.l = rect;
    }

    public void run() {
        T a2 = F.a(this.a, this.b, this.c, this.d);
        if (a2 != null) {
            this.e.addAll(a2.values());
            this.e.add(this.f);
        }
        F.a(this.g, this.h, this.i, a2, false);
        Object obj = this.c;
        if (obj != null) {
            this.a.b(obj, this.j, this.e);
            View a3 = F.a(a2, this.d, this.k, this.i);
            if (a3 != null) {
                this.a.a(a3, this.l);
            }
        }
    }
}
