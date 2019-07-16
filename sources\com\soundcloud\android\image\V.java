package com.soundcloud.android.image;

import android.graphics.Bitmap;

/* compiled from: ImageProcessor.kt */
public final class V implements S {
    public static final V a = new V();

    private V() {
    }

    public Bitmap a(Bitmap bitmap, Bitmap bitmap2, C4928GKa<Float> gKa) {
        C7471uYa.b(bitmap, "inBitmap");
        C7471uYa.b(bitmap2, "outBitmap");
        C7471uYa.b(gKa, "blurRadius");
        return bitmap;
    }

    public void destroy() {
    }
}
