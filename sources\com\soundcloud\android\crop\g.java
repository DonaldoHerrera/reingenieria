package com.soundcloud.android.crop;

import java.util.concurrent.CountDownLatch;

/* compiled from: CropImageActivity */
class g implements Runnable {
    final /* synthetic */ CropImageActivity a;

    g(CropImageActivity cropImageActivity) {
        this.a = cropImageActivity;
    }

    public void run() {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.a.b.post(new f(this, countDownLatch));
        try {
            countDownLatch.await();
            new a(this.a, null).a();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
