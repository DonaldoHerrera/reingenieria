package com.mattprecious.telescope;

import android.graphics.Bitmap;
import android.view.View;

/* compiled from: TelescopeLayout */
class m implements Runnable {
    final /* synthetic */ TelescopeLayout a;

    m(TelescopeLayout telescopeLayout) {
        this.a = telescopeLayout;
    }

    public void run() {
        View g = this.a.getTargetView();
        g.setDrawingCacheEnabled(true);
        Bitmap createBitmap = Bitmap.createBitmap(g.getDrawingCache());
        g.setDrawingCacheEnabled(false);
        this.a.e();
        this.a.g();
        this.a.o.a(createBitmap, new l(this));
    }
}
