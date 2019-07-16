package androidx.fragment.app;

import android.transition.Transition;
import android.transition.Transition.TransitionListener;
import java.util.ArrayList;

/* compiled from: FragmentTransitionCompat21 */
class I implements TransitionListener {
    final /* synthetic */ Object a;
    final /* synthetic */ ArrayList b;
    final /* synthetic */ Object c;
    final /* synthetic */ ArrayList d;
    final /* synthetic */ Object e;
    final /* synthetic */ ArrayList f;
    final /* synthetic */ K g;

    I(K k, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = k;
        this.a = obj;
        this.b = arrayList;
        this.c = obj2;
        this.d = arrayList2;
        this.e = obj3;
        this.f = arrayList3;
    }

    public void onTransitionCancel(Transition transition) {
    }

    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    public void onTransitionPause(Transition transition) {
    }

    public void onTransitionResume(Transition transition) {
    }

    public void onTransitionStart(Transition transition) {
        Object obj = this.a;
        if (obj != null) {
            this.g.a(obj, this.b, null);
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            this.g.a(obj2, this.d, null);
        }
        Object obj3 = this.e;
        if (obj3 != null) {
            this.g.a(obj3, this.f, null);
        }
    }
}
