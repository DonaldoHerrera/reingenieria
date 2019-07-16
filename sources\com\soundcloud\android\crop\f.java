package com.soundcloud.android.crop;

import java.util.concurrent.CountDownLatch;

/* compiled from: CropImageActivity */
class f implements Runnable {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ g b;

    f(g gVar, CountDownLatch countDownLatch) {
        this.b = gVar;
        this.a = countDownLatch;
    }

    public void run() {
        if (this.b.a.m.getScale() == 1.0f) {
            this.b.a.m.b();
        }
        this.a.countDown();
    }
}
