package androidx.transition;

import android.graphics.Rect;
import android.view.ViewGroup;

/* renamed from: androidx.transition.s reason: case insensitive filesystem */
/* compiled from: CircularPropagation */
public class C0460s extends Ca {
    private float b = 3.0f;

    public long a(ViewGroup viewGroup, Transition transition, ha haVar, ha haVar2) {
        int i;
        int i2;
        int i3;
        if (haVar == null && haVar2 == null) {
            return 0;
        }
        if (haVar2 == null || b(haVar) == 0) {
            i = -1;
        } else {
            haVar = haVar2;
            i = 1;
        }
        int c = c(haVar);
        int d = d(haVar);
        Rect k = transition.k();
        if (k != null) {
            i3 = k.centerX();
            i2 = k.centerY();
        } else {
            int[] iArr = new int[2];
            viewGroup.getLocationOnScreen(iArr);
            int round = Math.round(((float) (iArr[0] + (viewGroup.getWidth() / 2))) + viewGroup.getTranslationX());
            i2 = Math.round(((float) (iArr[1] + (viewGroup.getHeight() / 2))) + viewGroup.getTranslationY());
            i3 = round;
        }
        float a = a((float) c, (float) d, (float) i3, (float) i2) / a(0.0f, 0.0f, (float) viewGroup.getWidth(), (float) viewGroup.getHeight());
        long j = transition.j();
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / this.b) * a);
    }

    private static float a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        return (float) Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
    }
}
