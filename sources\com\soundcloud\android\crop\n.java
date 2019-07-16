package com.soundcloud.android.crop;

/* compiled from: ImageViewTouchBase */
class n implements Runnable {
    final /* synthetic */ s a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ImageViewTouchBase c;

    n(ImageViewTouchBase imageViewTouchBase, s sVar, boolean z) {
        this.c = imageViewTouchBase;
        this.a = sVar;
        this.b = z;
    }

    public void run() {
        this.c.a(this.a, this.b);
    }
}
