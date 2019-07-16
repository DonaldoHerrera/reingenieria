package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Slide */
class S extends b {
    S() {
        super(null);
    }

    public float b(ViewGroup viewGroup, View view) {
        boolean z = true;
        if (C1778vc.l(viewGroup) != 1) {
            z = false;
        }
        if (z) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
        return view.getTranslationX() - ((float) viewGroup.getWidth());
    }
}
