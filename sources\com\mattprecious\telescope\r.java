package com.mattprecious.telescope;

import android.media.ImageReader;
import android.media.projection.MediaProjection;
import android.util.DisplayMetrics;

/* compiled from: TelescopeLayout */
class r implements Runnable {
    final /* synthetic */ MediaProjection a;
    final /* synthetic */ TelescopeLayout b;

    r(TelescopeLayout telescopeLayout, MediaProjection mediaProjection) {
        this.b = telescopeLayout;
        this.a = mediaProjection;
    }

    public void run() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.b.d.getDefaultDisplay().getRealMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        ImageReader newInstance = ImageReader.newInstance(i, i2, 1, 2);
        String str = "telescope";
        int i3 = i;
        int i4 = i2;
        newInstance.setOnImageAvailableListener(new q(this, i, i2, this.a.createVirtualDisplay(str, i3, i4, displayMetrics.densityDpi, 2, newInstance.getSurface(), null, null)), TelescopeLayout.getBackgroundHandler());
    }
}
