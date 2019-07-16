package androidx.fragment.app;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.Transition.EpicenterCallback;

/* compiled from: FragmentTransitionCompat21 */
class J extends EpicenterCallback {
    final /* synthetic */ Rect a;
    final /* synthetic */ K b;

    J(K k, Rect rect) {
        this.b = k;
        this.a = rect;
    }

    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.a;
    }
}
