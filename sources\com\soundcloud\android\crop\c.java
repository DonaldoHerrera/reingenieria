package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import com.soundcloud.android.crop.ImageViewTouchBase.a;

/* compiled from: CropImageActivity */
class c implements a {
    final /* synthetic */ CropImageActivity a;

    c(CropImageActivity cropImageActivity) {
        this.a = cropImageActivity;
    }

    public void a(Bitmap bitmap) {
        bitmap.recycle();
        System.gc();
    }
}
