package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Slide */
class U extends b {
    U() {
        super(null);
    }

    public float b(ViewGroup viewGroup, View view) {
        return view.getTranslationX() + ((float) viewGroup.getWidth());
    }
}
