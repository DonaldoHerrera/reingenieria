package androidx.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GhostViewUtils */
class E {
    static D a(View view, ViewGroup viewGroup, Matrix matrix) {
        if (VERSION.SDK_INT >= 21) {
            return C.a(view, viewGroup, matrix);
        }
        return B.a(view, viewGroup);
    }

    static void a(View view) {
        if (VERSION.SDK_INT >= 21) {
            C.a(view);
        } else {
            B.b(view);
        }
    }
}
