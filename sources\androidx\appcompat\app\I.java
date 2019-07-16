package androidx.appcompat.app;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* compiled from: WindowDecorActionBar */
class I extends Gc {
    final /* synthetic */ L a;

    I(L l) {
        this.a = l;
    }

    public void b(View view) {
        L l = this.a;
        if (l.w) {
            View view2 = l.k;
            if (view2 != null) {
                view2.setTranslationY(0.0f);
                this.a.h.setTranslationY(0.0f);
            }
        }
        this.a.h.setVisibility(8);
        this.a.h.setTransitioning(false);
        L l2 = this.a;
        l2.B = null;
        l2.l();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a.g;
        if (actionBarOverlayLayout != null) {
            C1778vc.G(actionBarOverlayLayout);
        }
    }
}
