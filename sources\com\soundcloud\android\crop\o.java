package com.soundcloud.android.crop;

/* compiled from: ImageViewTouchBase */
class o implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ long b;
    final /* synthetic */ float c;
    final /* synthetic */ float d;
    final /* synthetic */ float e;
    final /* synthetic */ float f;
    final /* synthetic */ ImageViewTouchBase g;

    o(ImageViewTouchBase imageViewTouchBase, float f2, long j, float f3, float f4, float f5, float f6) {
        this.g = imageViewTouchBase;
        this.a = f2;
        this.b = j;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public void run() {
        float min = Math.min(this.a, (float) (System.currentTimeMillis() - this.b));
        this.g.a(this.c + (this.d * min), this.e, this.f);
        if (min < this.a) {
            this.g.j.post(this);
        }
    }
}
