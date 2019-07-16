package com.google.android.material.internal;

import android.graphics.Rect;
import android.view.View;

/* compiled from: ScrimInsetsFrameLayout */
class m implements C1506mc {
    final /* synthetic */ ScrimInsetsFrameLayout a;

    m(ScrimInsetsFrameLayout scrimInsetsFrameLayout) {
        this.a = scrimInsetsFrameLayout;
    }

    public Ic a(View view, Ic ic) {
        ScrimInsetsFrameLayout scrimInsetsFrameLayout = this.a;
        if (scrimInsetsFrameLayout.b == null) {
            scrimInsetsFrameLayout.b = new Rect();
        }
        this.a.b.set(ic.c(), ic.e(), ic.d(), ic.b());
        this.a.a(ic);
        this.a.setWillNotDraw(!ic.f() || this.a.a == null);
        C1778vc.F(this.a);
        return ic.a();
    }
}
