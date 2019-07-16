package androidx.transition;

import android.os.Build.VERSION;
import android.view.ViewGroup;

/* compiled from: ViewGroupUtils */
class na {
    static ma a(ViewGroup viewGroup) {
        if (VERSION.SDK_INT >= 18) {
            return new la(viewGroup);
        }
        return ka.a(viewGroup);
    }

    static void a(ViewGroup viewGroup, boolean z) {
        if (VERSION.SDK_INT >= 18) {
            qa.a(viewGroup, z);
        } else {
            pa.a(viewGroup, z);
        }
    }
}
