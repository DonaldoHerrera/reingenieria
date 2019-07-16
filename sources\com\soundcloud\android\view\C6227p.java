package com.soundcloud.android.view;

import android.animation.ObjectAnimator;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: com.soundcloud.android.view.p reason: case insensitive filesystem */
/* compiled from: CircularProgressDrawable */
public class C6227p extends Drawable implements Animatable {
    private static final Interpolator a = new LinearInterpolator();
    private static final Interpolator b = new DecelerateInterpolator();
    private final RectF c = new RectF();
    private ObjectAnimator d;
    private ObjectAnimator e;
    private ObjectAnimator f;
    private boolean g;
    private Paint h;
    private float i;
    private float j;
    private float k;
    private float l;
    private boolean m;
    private Property<C6227p, Float> n = new C6224m(this, Float.class, "angle");
    private Property<C6227p, Float> o = new C6225n(this, Float.class, "arc");

    public C6227p(float f2, int i2) {
        this.l = f2;
        this.h = new Paint();
        this.h.setAntiAlias(true);
        this.h.setStyle(Style.STROKE);
        this.h.setStrokeWidth(f2);
        this.h.setColor(i2);
        d();
    }

    private void b(int i2) {
        this.f = ObjectAnimator.ofFloat(this, this.o, new float[]{(((float) i2) * 360.0f) / 100.0f});
        this.f.setInterpolator(b);
        this.f.setDuration(600);
        this.f.setRepeatMode(1);
        this.f.setRepeatCount(0);
        this.f.start();
    }

    private void c() {
        ObjectAnimator objectAnimator = this.f;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    private void d() {
        this.e = ObjectAnimator.ofFloat(this, this.n, new float[]{360.0f});
        this.e.setInterpolator(a);
        this.e.setDuration(2000);
        this.e.setRepeatMode(1);
        this.e.setRepeatCount(-1);
        this.d = ObjectAnimator.ofFloat(this, this.o, new float[]{300.0f});
        this.d.setInterpolator(b);
        this.d.setDuration(600);
        this.d.setRepeatMode(1);
        this.d.setRepeatCount(-1);
        this.d.addListener(new C6226o(this));
    }

    /* access modifiers changed from: private */
    public void e() {
        this.g = !this.g;
        if (this.g) {
            this.i = (this.i + 60.0f) % 360.0f;
        }
    }

    public void draw(Canvas canvas) {
        float f2;
        float f3;
        float f4;
        if (this.m) {
            float f5 = this.j - this.i;
            float f6 = this.k;
            if (!this.g) {
                f5 += f6;
                f4 = (360.0f - f6) - 30.0f;
            } else {
                f4 = f6 + 30.0f;
            }
            f3 = f5;
            f2 = f4;
        } else {
            f2 = this.k;
            f3 = 270.0f;
        }
        canvas.drawArc(this.c, f3, f2, false, this.h);
    }

    public int getOpacity() {
        return -2;
    }

    public boolean isRunning() {
        return this.m;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.c;
        float f2 = (float) rect.left;
        float f3 = this.l;
        rectF.left = f2 + (f3 / 2.0f) + 0.5f;
        rectF.right = (((float) rect.right) - (f3 / 2.0f)) - 0.5f;
        rectF.top = ((float) rect.top) + (f3 / 2.0f) + 0.5f;
        rectF.bottom = (((float) rect.bottom) - (f3 / 2.0f)) - 0.5f;
    }

    public void setAlpha(int i2) {
        this.h.setAlpha(i2);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.h.setColorFilter(colorFilter);
    }

    public void start() {
        if (!isRunning()) {
            this.m = true;
            c();
            this.e.start();
            this.d.start();
            invalidateSelf();
        }
    }

    public void stop() {
        if (isRunning()) {
            this.m = false;
            this.k = 0.0f;
            this.e.cancel();
            this.d.cancel();
            c();
            invalidateSelf();
        }
    }

    public void a(int i2) {
        b(i2);
        invalidateSelf();
    }

    public void a(float f2) {
        this.j = f2;
        invalidateSelf();
    }

    public float a() {
        return this.j;
    }

    public void b(float f2) {
        this.k = f2;
        invalidateSelf();
    }

    public float b() {
        return this.k;
    }
}
