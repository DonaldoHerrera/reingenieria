package com.soundcloud.android.crop;

/* compiled from: CropImageActivity */
class j implements Runnable {
    final /* synthetic */ a a;

    j(a aVar) {
        this.a = aVar;
    }

    public void run() {
        this.a.b();
        CropImageActivity.this.m.invalidate();
        if (CropImageActivity.this.m.l.size() == 1) {
            CropImageActivity cropImageActivity = CropImageActivity.this;
            cropImageActivity.n = (m) cropImageActivity.m.l.get(0);
            CropImageActivity.this.n.a(true);
        }
    }
}
