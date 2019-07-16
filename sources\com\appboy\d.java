package com.appboy;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.RelativeLayout.LayoutParams;

class d implements OnGlobalLayoutListener {
    final /* synthetic */ float a;
    final /* synthetic */ e b;

    d(e eVar, float f) {
        this.b = eVar;
        this.a = f;
    }

    public void onGlobalLayout() {
        int width = this.b.a.b.getWidth();
        this.b.a.b.setLayoutParams(new LayoutParams(width, (int) (((float) width) / this.a)));
        f fVar = this.b.a;
        fVar.d.a(fVar.b.getViewTreeObserver(), (OnGlobalLayoutListener) this);
    }
}
