package androidx.transition;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: Slide */
class W extends c {
    W() {
        super(null);
    }

    public float a(ViewGroup viewGroup, View view) {
        return view.getTranslationY() + ((float) viewGroup.getHeight());
    }
}
