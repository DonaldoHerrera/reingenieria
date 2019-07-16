package androidx.transition;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: SidePropagation */
public class P extends Ca {
    private float b = 3.0f;
    private int c = 80;

    public void a(int i) {
        this.c = i;
    }

    public long a(ViewGroup viewGroup, Transition transition, ha haVar, ha haVar2) {
        int i;
        int i2;
        int i3;
        ha haVar3 = haVar;
        if (haVar3 == null && haVar2 == null) {
            return 0;
        }
        Rect k = transition.k();
        if (haVar2 == null || b(haVar3) == 0) {
            i = -1;
        } else {
            haVar3 = haVar2;
            i = 1;
        }
        int c2 = c(haVar3);
        int d = d(haVar3);
        int[] iArr = new int[2];
        viewGroup.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(viewGroup.getTranslationX());
        int round2 = iArr[1] + Math.round(viewGroup.getTranslationY());
        int width = round + viewGroup.getWidth();
        int height = round2 + viewGroup.getHeight();
        if (k != null) {
            i3 = k.centerX();
            i2 = k.centerY();
        } else {
            i3 = (round + width) / 2;
            i2 = (round2 + height) / 2;
        }
        float a = ((float) a(viewGroup, c2, d, i3, i2, round, round2, width, height)) / ((float) a(viewGroup));
        long j = transition.j();
        if (j < 0) {
            j = 300;
        }
        return (long) Math.round((((float) (j * ((long) i))) / this.b) * a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r4 != false) goto L_0x0017;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0013, code lost:
        if (r4 != false) goto L_0x0015;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r0 = 3;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0051  */
    private int a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.c;
        boolean z = true;
        if (i9 != 8388611) {
            if (i9 == 8388613) {
                if (C1778vc.l(view) != 1) {
                    z = false;
                }
            }
            if (i9 != 3) {
                return (i7 - i) + Math.abs(i4 - i2);
            }
            if (i9 == 5) {
                return (i - i5) + Math.abs(i4 - i2);
            }
            if (i9 == 48) {
                return (i8 - i2) + Math.abs(i3 - i);
            }
            if (i9 != 80) {
                return 0;
            }
            return (i2 - i6) + Math.abs(i3 - i);
        } else if (C1778vc.l(view) != 1) {
            z = false;
        }
        i9 = 5;
        if (i9 != 3) {
        }
    }

    private int a(ViewGroup viewGroup) {
        int i = this.c;
        if (i == 3 || i == 5 || i == 8388611 || i == 8388613) {
            return viewGroup.getWidth();
        }
        return viewGroup.getHeight();
    }
}
