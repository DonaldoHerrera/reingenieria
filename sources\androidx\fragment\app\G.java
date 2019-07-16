package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* compiled from: FragmentTransitionCompat21 */
class G extends EpicenterCallback {
    final /* synthetic */ Rect a;
    final /* synthetic */ K b;

    G(K k, Rect rect) {
        this.b = k;
        this.a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        return this.a;
    }
}
