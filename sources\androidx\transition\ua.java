package androidx.transition;

import android.util.Property;
import android.view.View;

/* compiled from: ViewUtils */
class ua extends Property<View, Float> {
    ua(Class cls, String str) {
        super(cls, str);
    }

    /* renamed from: a */
    public Float get(View view) {
        return Float.valueOf(wa.c(view));
    }

    /* renamed from: a */
    public void set(View view, Float f) {
        wa.a(view, f.floatValue());
    }
}
