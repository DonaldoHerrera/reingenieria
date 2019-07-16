package androidx.fragment.app;

import java.util.ArrayList;

/* compiled from: FragmentTransition */
class B implements Runnable {
    final /* synthetic */ ArrayList a;

    B(ArrayList arrayList) {
        this.a = arrayList;
    }

    public void run() {
        F.a(this.a, 4);
    }
}
