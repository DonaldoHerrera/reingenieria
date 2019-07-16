package androidx.transition;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* compiled from: GhostViewApi14 */
class A implements OnPreDrawListener {
    final /* synthetic */ B a;

    A(B b) {
        this.a = b;
    }

    public boolean onPreDraw() {
        B b = this.a;
        b.g = b.a.getMatrix();
        C1778vc.F(this.a);
        B b2 = this.a;
        ViewGroup viewGroup = b2.b;
        if (viewGroup != null) {
            View view = b2.c;
            if (view != null) {
                viewGroup.endViewTransition(view);
                C1778vc.F(this.a.b);
                B b3 = this.a;
                b3.b = null;
                b3.c = null;
            }
        }
        return true;
    }
}
