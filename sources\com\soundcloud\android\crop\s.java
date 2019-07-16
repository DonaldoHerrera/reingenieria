package com.soundcloud.android.crop;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* compiled from: RotateBitmap */
class s {
    private Bitmap a;
    private int b;

    public s(Bitmap bitmap, int i) {
        this.a = bitmap;
        this.b = i % 360;
    }

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        if (this.a == null) {
            return 0;
        }
        if (f()) {
            return this.a.getWidth();
        }
        return this.a.getHeight();
    }

    public Matrix c() {
        Matrix matrix = new Matrix();
        Bitmap bitmap = this.a;
        if (!(bitmap == null || this.b == 0)) {
            matrix.preTranslate((float) (-(bitmap.getWidth() / 2)), (float) (-(this.a.getHeight() / 2)));
            matrix.postRotate((float) this.b);
            matrix.postTranslate((float) (e() / 2), (float) (b() / 2));
        }
        return matrix;
    }

    public int d() {
        return this.b;
    }

    public int e() {
        if (this.a == null) {
            return 0;
        }
        if (f()) {
            return this.a.getHeight();
        }
        return this.a.getWidth();
    }

    public boolean f() {
        return (this.b / 90) % 2 != 0;
    }

    public void g() {
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            bitmap.recycle();
            this.a = null;
        }
    }

    public Bitmap a() {
        return this.a;
    }

    public void a(Bitmap bitmap) {
        this.a = bitmap;
    }
}
