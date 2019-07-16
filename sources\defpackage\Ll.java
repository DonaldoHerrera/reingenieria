package defpackage;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.WindowManager;

/* renamed from: Ll reason: default package */
/* compiled from: TapTargetView */
class Ll implements Runnable {
    final /* synthetic */ Ml a;

    Ll(Ml ml) {
        this.a = ml;
    }

    public void run() {
        int[] iArr = new int[2];
        Ml ml = this.a;
        ml.f.r.set(ml.a.a());
        this.a.f.getLocationOnScreen(iArr);
        this.a.f.r.offset(-iArr[0], -iArr[1]);
        Ml ml2 = this.a;
        if (ml2.b != null) {
            WindowManager windowManager = (WindowManager) ml2.c.getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            Rect rect = new Rect();
            this.a.b.getWindowVisibleDisplayFrame(rect);
            int[] iArr2 = new int[2];
            this.a.b.getLocationInWindow(iArr2);
            if (this.a.d) {
                rect.top = iArr2[1];
            }
            Ml ml3 = this.a;
            if (ml3.e) {
                rect.bottom = iArr2[1] + ml3.b.getHeight();
            }
            this.a.f.ea = Math.max(0, rect.top);
            this.a.f.fa = Math.min(rect.bottom, displayMetrics.heightPixels);
        }
        this.a.f.c();
        this.a.f.requestFocus();
        this.a.f.a();
        this.a.f.f();
    }
}
