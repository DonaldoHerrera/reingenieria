package com.soundcloud.android.crop;

import android.graphics.Bitmap;

/* compiled from: CropImageActivity */
class h implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ CropImageActivity b;

    h(CropImageActivity cropImageActivity, Bitmap bitmap) {
        this.b = cropImageActivity;
        this.a = bitmap;
    }

    public void run() {
        this.b.b(this.a);
    }
}
