package androidx.transition;

import android.view.View;
import androidx.transition.Transition.c;
import java.util.ArrayList;

/* renamed from: androidx.transition.w reason: case insensitive filesystem */
/* compiled from: FragmentTransitionSupport */
class C0464w implements c {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ C0467z c;

    C0464w(C0467z zVar, View view, ArrayList arrayList) {
        this.c = zVar;
        this.a = view;
        this.b = arrayList;
    }

    public void a(Transition transition) {
    }

    public void b(Transition transition) {
    }

    public void c(Transition transition) {
    }

    public void d(Transition transition) {
        transition.b((c) this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }
}
