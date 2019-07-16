package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import android.view.View;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21 */
class H implements TransitionListener {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ K c;

    H(K k, View view, ArrayList arrayList) {
        this.c = k;
        this.a = view;
        this.b = arrayList;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.setVisibility(8);
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            ((View) this.b.get(i)).setVisibility(0);
        }
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
    }
}
