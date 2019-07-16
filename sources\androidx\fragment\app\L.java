package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionImpl */
class L implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ ArrayList c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ ArrayList e;
    final /* synthetic */ O f;

    L(O o, int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
        this.f = o;
        this.a = i;
        this.b = arrayList;
        this.c = arrayList2;
        this.d = arrayList3;
        this.e = arrayList4;
    }

    public void run() {
        for (int i = 0; i < this.a; i++) {
            C1778vc.a((View) this.b.get(i), (String) this.c.get(i));
            C1778vc.a((View) this.d.get(i), (String) this.e.get(i));
        }
    }
}
