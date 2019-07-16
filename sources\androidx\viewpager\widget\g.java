package androidx.viewpager.widget;

import android.graphics.Rect;
import android.view.View;

/* compiled from: ViewPager */
class g implements C1506mc {
    private final Rect a = new Rect();
    final /* synthetic */ ViewPager b;

    g(ViewPager viewPager) {
        this.b = viewPager;
    }

    public Ic a(View view, Ic ic) {
        Ic b2 = C1778vc.b(view, ic);
        if (b2.g()) {
            return b2;
        }
        Rect rect = this.a;
        rect.left = b2.c();
        rect.top = b2.e();
        rect.right = b2.d();
        rect.bottom = b2.b();
        int childCount = this.b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            Ic a2 = C1778vc.a(this.b.getChildAt(i), b2);
            rect.left = Math.min(a2.c(), rect.left);
            rect.top = Math.min(a2.e(), rect.top);
            rect.right = Math.min(a2.d(), rect.right);
            rect.bottom = Math.min(a2.b(), rect.bottom);
        }
        return b2.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
