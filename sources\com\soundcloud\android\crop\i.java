package com.soundcloud.android.crop;

import android.graphics.Bitmap;

/* compiled from: CropImageActivity */
class i implements Runnable {
    final /* synthetic */ Bitmap a;
    final /* synthetic */ CropImageActivity b;

    i(CropImageActivity cropImageActivity, Bitmap bitmap) {
        this.b = cropImageActivity;
        this.a = bitmap;
    }

    public void run() {
        this.b.m.c();
        this.a.recycle();
    }
}
