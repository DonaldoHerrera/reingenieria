package com.soundcloud.android.crop;

/* compiled from: CropUtil */
class k implements Runnable {
    final /* synthetic */ a a;

    k(a aVar) {
        this.a = aVar;
    }

    public void run() {
        this.a.a.b(this.a);
        if (this.a.b.getWindow() != null) {
            this.a.b.dismiss();
        }
    }
}
