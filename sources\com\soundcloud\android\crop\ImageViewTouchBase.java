package com.soundcloud.android.crop;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;

abstract class ImageViewTouchBase extends ImageView {
    protected Matrix a = new Matrix();
    protected Matrix b = new Matrix();
    private final Matrix c = new Matrix();
    private final float[] d = new float[9];
    protected final s e = new s(null, 0);
    int f = -1;
    int g = -1;
    float h;
    private Runnable i;
    protected Handler j = new Handler();
    private a k;

    public interface a {
        void a(Bitmap bitmap);
    }

    public ImageViewTouchBase(Context context) {
        super(context);
        d();
    }

    private void a(Bitmap bitmap, int i2) {
        super.setImageBitmap(bitmap);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setDither(true);
        }
        Bitmap a2 = this.e.a();
        this.e.a(bitmap);
        this.e.a(i2);
        if (a2 != null && a2 != bitmap) {
            a aVar = this.k;
            if (aVar != null) {
                aVar.a(a2);
            }
        }
    }

    private void d() {
        setScaleType(ScaleType.MATRIX);
    }

    /* access modifiers changed from: protected */
    public void b() {
        Bitmap a2 = this.e.a();
        if (a2 != null) {
            Matrix imageViewMatrix = getImageViewMatrix();
            RectF rectF = new RectF(0.0f, 0.0f, (float) a2.getWidth(), (float) a2.getHeight());
            imageViewMatrix.mapRect(rectF);
            float height = rectF.height();
            float width = rectF.width();
            b(a(rectF, width, 0.0f), b(rectF, height, 0.0f));
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void c() {
        a((Bitmap) null, true);
    }

    /* access modifiers changed from: protected */
    public Matrix getImageViewMatrix() {
        this.c.set(this.a);
        this.c.postConcat(this.b);
        return this.c;
    }

    /* access modifiers changed from: protected */
    public float getScale() {
        return a(this.b);
    }

    public Matrix getUnrotatedMatrix() {
        Matrix matrix = new Matrix();
        a(this.e, matrix, false);
        matrix.postConcat(this.b);
        return matrix;
    }

    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || keyEvent.getRepeatCount() != 0) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !keyEvent.isTracking() || keyEvent.isCanceled() || getScale() <= 1.0f) {
            return super.onKeyUp(i2, keyEvent);
        }
        a(1.0f);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        this.f = i4 - i2;
        this.g = i5 - i3;
        Runnable runnable = this.i;
        if (runnable != null) {
            this.i = null;
            runnable.run();
        }
        if (this.e.a() != null) {
            a(this.e, this.a, true);
            setImageMatrix(getImageViewMatrix());
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        a(bitmap, 0);
    }

    public void setRecycler(a aVar) {
        this.k = aVar;
    }

    public void a(Bitmap bitmap, boolean z) {
        a(new s(bitmap, 0), z);
    }

    public void a(s sVar, boolean z) {
        if (getWidth() <= 0) {
            this.i = new n(this, sVar, z);
            return;
        }
        if (sVar.a() != null) {
            a(sVar, this.a, true);
            a(sVar.a(), sVar.d());
        } else {
            this.a.reset();
            setImageBitmap(null);
        }
        if (z) {
            this.b.reset();
        }
        setImageMatrix(getImageViewMatrix());
        this.h = a();
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d();
    }

    private float b(RectF rectF, float f2, float f3) {
        float height = (float) getHeight();
        if (f2 < height) {
            return ((height - f2) / 2.0f) - rectF.top;
        }
        float f4 = rectF.top;
        if (f4 > 0.0f) {
            return -f4;
        }
        return rectF.bottom < height ? ((float) getHeight()) - rectF.bottom : f3;
    }

    /* access modifiers changed from: protected */
    public void b(float f2, float f3) {
        this.b.postTranslate(f2, f3);
    }

    private float a(RectF rectF, float f2, float f3) {
        float f4;
        float width = (float) getWidth();
        if (f2 < width) {
            width = (width - f2) / 2.0f;
            f4 = rectF.left;
        } else {
            float f5 = rectF.left;
            if (f5 > 0.0f) {
                return -f5;
            }
            f4 = rectF.right;
            if (f4 >= width) {
                return f3;
            }
        }
        return width - f4;
    }

    public ImageViewTouchBase(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d();
    }

    /* access modifiers changed from: protected */
    public float a(Matrix matrix, int i2) {
        matrix.getValues(this.d);
        return this.d[i2];
    }

    /* access modifiers changed from: protected */
    public float a(Matrix matrix) {
        return a(matrix, 0);
    }

    private void a(s sVar, Matrix matrix, boolean z) {
        float width = (float) getWidth();
        float height = (float) getHeight();
        float e2 = (float) sVar.e();
        float b2 = (float) sVar.b();
        matrix.reset();
        float min = Math.min(Math.min(width / e2, 3.0f), Math.min(height / b2, 3.0f));
        if (z) {
            matrix.postConcat(sVar.c());
        }
        matrix.postScale(min, min);
        matrix.postTranslate((width - (e2 * min)) / 2.0f, (height - (b2 * min)) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public float a() {
        if (this.e.a() == null) {
            return 1.0f;
        }
        return Math.max(((float) this.e.e()) / ((float) this.f), ((float) this.e.b()) / ((float) this.g)) * 4.0f;
    }

    /* access modifiers changed from: protected */
    public void a(float f2, float f3, float f4) {
        float f5 = this.h;
        if (f2 > f5) {
            f2 = f5;
        }
        float scale = f2 / getScale();
        this.b.postScale(scale, scale, f3, f4);
        setImageMatrix(getImageViewMatrix());
        b();
    }

    /* access modifiers changed from: protected */
    public void a(float f2, float f3, float f4, float f5) {
        float scale = (f2 - getScale()) / f5;
        float scale2 = getScale();
        long currentTimeMillis = System.currentTimeMillis();
        Handler handler = this.j;
        o oVar = new o(this, f5, currentTimeMillis, scale2, scale, f3, f4);
        handler.post(oVar);
    }

    /* access modifiers changed from: protected */
    public void a(float f2) {
        a(f2, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    /* access modifiers changed from: protected */
    public void a(float f2, float f3) {
        b(f2, f3);
        setImageMatrix(getImageViewMatrix());
    }
}
