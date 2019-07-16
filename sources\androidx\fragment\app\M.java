package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: FragmentTransitionImpl */
class M implements Runnable {
    final /* synthetic */ ArrayList a;
    final /* synthetic */ Map b;
    final /* synthetic */ O c;

    M(O o, ArrayList arrayList, Map map) {
        this.c = o;
        this.a = arrayList;
        this.b = map;
    }

    public void run() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            View view = (View) this.a.get(i);
            String r = C1778vc.r(view);
            if (r != null) {
                C1778vc.a(view, O.a(this.b, r));
            }
        }
    }
}
